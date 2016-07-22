package org.mods.powerfulyou;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import org.mods.powerfulyou.R;

/**
 * Created by Dita on 7/20/2015.
 */
public class Brainteasers extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.brainteasers);

        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView brainteaserstitle = (TextView) findViewById(R.id.brainteaserstitle);
        TextView brainteasersdesc = (TextView) findViewById(R.id.brainteasersdesc);

        TextView obt1 = (TextView) findViewById(R.id.openbrainteasers1);
        TextView obt2 = (TextView) findViewById(R.id.openbrainteasers2);
        TextView obt3 = (TextView) findViewById(R.id.openbrainteasers3);


        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);

        brainteaserstitle.setTypeface(tfNS);
        brainteasersdesc.setTypeface(tfPC);


        obt1.setTypeface(tfPC);
        obt2.setTypeface(tfPC);
        obt3.setTypeface(tfPC);

        //BRAINTEASERS 1 BUTTON FUNC
        final Button btnOpenPopup = (Button)findViewById(R.id.openbrainteasers1);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.brainteasers1, null); //individual popup
                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

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

        //BRAINTEASERS 2 BUTTON FUNC
        final Button btnOpenPopup2 = (Button)findViewById(R.id.openbrainteasers2);
        btnOpenPopup2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.brainteasers2, null); //individual popup
                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup2, Gravity.CENTER, 0, 0);

            }
        });

        //BRAINTEASERS 3 BUTTON FUNC
        final Button btnOpenPopup3 = (Button)findViewById(R.id.openbrainteasers3);
        btnOpenPopup3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.brainteasers3, null); //individual popup
                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup3, Gravity.CENTER, 0, 0);

            }
        });

        //BRAINTEASERS 4 BUTTON FUNC
        final Button btnOpenPopup4 = (Button)findViewById(R.id.openbrainteasers4);
        btnOpenPopup4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.brainteasers4, null); //individual popup
                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                //popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
                popupWindow.showAtLocation(btnOpenPopup4, Gravity.CENTER, 0, 0);

            }
        });
    }
}
