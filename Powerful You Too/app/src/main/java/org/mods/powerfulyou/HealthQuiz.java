package org.mods.powerfulyou;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import org.mods.powerfulyou.R;

/**
 * Created by Dita on 7/15/2015.
 */


public class HealthQuiz extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.healthquiz);

        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView healthquizTitle = (TextView) findViewById(R.id.healthquiztitle);
        TextView healthquizQ1 = (TextView) findViewById(R.id.q1);
        TextView healthquizQ2 = (TextView) findViewById(R.id.q2);
        TextView healthquizQ3 = (TextView) findViewById(R.id.q3);
        TextView healthquizQ4 = (TextView) findViewById(R.id.q4);
        TextView healthquizQ5 = (TextView) findViewById(R.id.q5);

        TextView button1 = (TextView) findViewById(R.id.openhealthpopup1);
        TextView button2 = (TextView) findViewById(R.id.openhealthpopup2);
        TextView button3 = (TextView) findViewById(R.id.openhealthpopup3);
        TextView button4 = (TextView) findViewById(R.id.openhealthpopup4);
        TextView button5 = (TextView) findViewById(R.id.openhealthpopup5);

        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        healthquizTitle.setTypeface(tfNS);
        healthquizQ1.setTypeface(tfPC);
        healthquizQ2.setTypeface(tfPC);
        healthquizQ3.setTypeface(tfPC);
        healthquizQ4.setTypeface(tfPC);
        healthquizQ5.setTypeface(tfPC);

        button1.setTypeface(tfPC);
        button2.setTypeface(tfPC);
        button3.setTypeface(tfPC);
        button4.setTypeface(tfPC);
        button5.setTypeface(tfPC);

        //QUESTION 1 BUTTON FUNC
        final Button btnOpenPopup = (Button)findViewById(R.id.openhealthpopup1);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.healthpopup1, null); //individual popup
                final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

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

        //QUESTION 2 BUTTON FUNC
        final Button btnOpenPopup2 = (Button)findViewById(R.id.openhealthpopup2);
        btnOpenPopup2.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.healthpopup2, null); //individual popup - fix for new
                final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup2, Gravity.CENTER, 0, 0);

            }});

        //QUESTION 3 BUTTON FUNC
        final Button btnOpenPopup3 = (Button)findViewById(R.id.openhealthpopup3);
        btnOpenPopup3.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.healthpopup3, null); //individual popup - fix for new
                final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup3, Gravity.CENTER, 0, 0);

            }});

        //QUESTION 4 BUTTON FUNC
        final Button btnOpenPopup4 = (Button)findViewById(R.id.openhealthpopup4);
        btnOpenPopup4.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.healthpopup4, null); //individual popup - fix for new
                final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup4, Gravity.CENTER, 0, 0);

            }});

        //QUESTION 5 BUTTON FUNC
        final Button btnOpenPopup5 = (Button)findViewById(R.id.openhealthpopup5);
        btnOpenPopup5.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.healthpopup5, null); //individual popup - fix for new
                final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup5, Gravity.CENTER, 0, 0);

            }});
    }
}