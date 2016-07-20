package org.mods.powerfulyou;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;

public class Hygiene extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.hygiene);

        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView hygieneTitle = (TextView) findViewById(R.id.hygiene);
        TextView hygieneDesc = (TextView) findViewById(R.id.hygienedesc);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        hygieneTitle.setTypeface(tfNS);
        hygieneDesc.setTypeface(tfPC);

    }

}

