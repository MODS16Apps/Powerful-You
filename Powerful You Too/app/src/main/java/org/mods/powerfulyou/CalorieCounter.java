package org.mods.powerfulyou;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.widget.TextView;

import org.mods.powerfulyou.R;

/**
 * Created by Dita on 7/13/2015.
 */
public class CalorieCounter extends Activity implements OnTouchListener, OnDragListener{

    Food pizza, cookie, carrot, icecream, apple, blueberries;
    static TextView counter;
    static int caltotal;
    LinearLayout top_container;
    static int mins;
    //USER STATS FOR COUNTER
    String gender = "male";
    EditText age;
    EditText weight;
    Button reset;
    int userAge;
    int userWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.caloriecounter);

        //fonts
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";

        TextView title = (TextView) findViewById(R.id.caloriecountertitle);
        TextView desc = (TextView) findViewById(R.id.calcounterdesc);
        TextView counterText = (TextView) findViewById(R.id.counter);
        Button calculate = (Button) findViewById(R.id.calculate);
        Button reset = (Button) findViewById(R.id.reset);
        RadioButton male = (RadioButton) findViewById(R.id.male);
        RadioButton female = (RadioButton) findViewById(R.id.female);
        TextView age = (TextView) findViewById(R.id.age);
        EditText userage = (EditText) findViewById(R.id.userage);
        TextView weight = (TextView) findViewById(R.id.weight);
        EditText userweight = (EditText) findViewById(R.id.userweight);

        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);

        title.setTypeface(tfNS);
        desc.setTypeface(tfPC);
        counterText.setTypeface(tfPC);
        calculate.setTypeface(tfPC);
        reset.setTypeface(tfPC);
        male.setTypeface(tfPC);
        female.setTypeface(tfPC);
        age.setTypeface(tfPC);
        userage.setTypeface(tfPC);
        weight.setTypeface(tfPC);
        userweight.setTypeface(tfPC);

        //food
        pizza = (Food)findViewById(R.id.pizza);
        pizza.setOnTouchListener(this);
        pizza.setCal(300);
        cookie = (Food)findViewById(R.id.cookie);
        cookie.setOnTouchListener(this);
        cookie.setCal(100);
        carrot = (Food)findViewById(R.id.carrot);
        carrot.setOnTouchListener(this);
        carrot.setCal(15);
        icecream = (Food)findViewById(R.id.icecream);
        icecream.setOnTouchListener(this);
        icecream.setCal(200);
        apple = (Food)findViewById(R.id.apple);
        apple.setOnTouchListener(this);
        apple.setCal(100);
        blueberries = (Food)findViewById(R.id.blueberries);
        blueberries.setOnTouchListener(this);
        blueberries.setCal(10);

        counter = (TextView)findViewById(R.id.counter);

        //containers
        findViewById(R.id.top_container).setOnDragListener(this);
        findViewById(R.id.bottom_container).setOnDragListener(this);

        top_container = (LinearLayout)findViewById(R.id.top_container);

        age = (EditText)findViewById(R.id.userage);
        weight = (EditText)findViewById(R.id.userweight);

        reset = (Button)findViewById(R.id.reset);

        //READY TO EAT BUTTON POPUP
        final Button btnOpenPopup = (Button)findViewById(R.id.calculate);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.caltotal, null); //individual popup

                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                ((TextView)popupWindow.getContentView().findViewById(R.id.cal)).setText("You would need to run for " + calculateStats() + " minutes to burn off the food on your plate!");

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup, Gravity.CENTER, 0, 0);

            }
        });

    }

    @Override
    public boolean onTouch(View v, MotionEvent e) {
        if (e.getAction() == MotionEvent.ACTION_DOWN) {
            DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(null, shadowBuilder, v, 0);
            v.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean onDrag(View v, DragEvent e) {
        LinearLayout to = (LinearLayout)findViewById(R.id.bottom_container);
        View view = (View) e.getLocalState();
        ViewGroup from = (ViewGroup) view.getParent();

        if (!e.getResult() && e.getAction()==DragEvent.ACTION_DRAG_EXITED) {
            from.removeView(view);
            top_container.addView(view);
            view.setVisibility(View.VISIBLE);
            if (from.getId() == R.id.bottom_container) {
                //6 if statements to subtract cal + food
                if (caltotal != 0) { //no neg cal value
                    if (view.getId() == R.id.pizza)
                        caltotal -= pizza.getCal();
                    if (view.getId() == R.id.cookie)
                        caltotal -= cookie.getCal();
                    if (view.getId() == R.id.carrot)
                        caltotal -= carrot.getCal();
                    if (view.getId() == R.id.icecream)
                        caltotal -= icecream.getCal();
                    if (view.getId() == R.id.apple)
                        caltotal -= apple.getCal();
                    if (view.getId() == R.id.blueberries)
                        caltotal -= blueberries.getCal();
                }
                counter.setText("CALORIES: " + caltotal);
            }
        }

        if (e.getAction()==DragEvent.ACTION_DROP) {
            from.removeView(view);
            view.setVisibility(View.VISIBLE);

            //FOOD CALCULATIONS ETC
            if(from.getId()==R.id.top_container){
                //6 if statements to add cal + food
                    if(view.getId()==R.id.pizza)
                        caltotal+=pizza.getCal();
                    if(view.getId()==R.id.cookie)
                        caltotal+=cookie.getCal();
                    if(view.getId()==R.id.carrot)
                        caltotal+=carrot.getCal();
                    if(view.getId()==R.id.icecream)
                        caltotal+=icecream.getCal();
                    if(view.getId()==R.id.apple)
                        caltotal+=apple.getCal();
                    if(view.getId()==R.id.blueberries)
                        caltotal+=blueberries.getCal();
                counter.setText("CALORIES: " + caltotal);
                to.addView(view);

            }
            else if(from.getId()==R.id.bottom_container){
                //6 if statements to subtract cal + food
                if(caltotal!=0) { //no neg cal value
                    if (view.getId() == R.id.pizza)
                        caltotal -= pizza.getCal();
                    if (view.getId() == R.id.cookie)
                        caltotal -= cookie.getCal();
                    if (view.getId() == R.id.carrot)
                        caltotal -= carrot.getCal();
                    if (view.getId() == R.id.icecream)
                        caltotal -= icecream.getCal();
                    if (view.getId() == R.id.apple)
                        caltotal -= apple.getCal();
                    if (view.getId() == R.id.blueberries)
                        caltotal -= blueberries.getCal();
                }
                counter.setText("CALORIES: " + caltotal);
                top_container.addView(view);
            }
        }
        return true;
    }

    public int calculateStats(){
        String tempAge = "30";
        String tempWeight = "180";
        if(age!=null && weight!=null) {
            tempAge = age.getText().toString();
            tempWeight = weight.getText().toString();
        }

        userAge = Integer.parseInt(tempAge);
        userWeight = Integer.parseInt(tempWeight);

        int burned;

        if(gender.equals("female")){
            double temp = (((userAge*0.074)+(userWeight*0.05741)+(140*.4472))-20.4022)/4.184;
            burned = (int)Math.round(caltotal/temp);
        }
        else {
            double temp = (((userAge*0.2017)+(userWeight*0.09036)+(140*.6309))-55.0969)/4.184;
            burned = (int)Math.round(caltotal/temp);
        }
        //RESET
        mins = 0;
        return burned;
    }

    public void setGender(View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch(v.getId()){
            case R.id.male:
                if(checked)
                    gender = "male";
            case R.id.female:
                if(checked)
                    gender = "female";

        }
    }

    public void reset(View v){
        LinearLayout bottom = (LinearLayout)findViewById(R.id.bottom_container);
        bottom.removeAllViews();

        top_container.addView(pizza);
        top_container.addView(cookie);
        top_container.addView(carrot);
        top_container.addView(icecream);
        top_container.addView(apple);
        top_container.addView(blueberries);
        caltotal=0;
        mins=0;
        counter.setText("CALORIES: 0");
    }

}