package org.mods.powerfulyou;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;


public class EmergencyStats extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.emergencystats);

        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView emergencyStats = (TextView) findViewById(R.id.emergencystatistics);
        TextView drunkdriving = (TextView) findViewById(R.id.drunkdriving);
        TextView lightning = (TextView) findViewById(R.id.lightning);
        TextView biking = (TextView) findViewById(R.id.biking);
        TextView ddstats = (TextView) findViewById(R.id.ddstats);
        TextView lightstats = (TextView) findViewById(R.id.lightstat);
        TextView bikestats = (TextView) findViewById(R.id.bikestats);
        TextView sharkattacks = (TextView) findViewById(R.id.sharkattacks);
        TextView sharkstats = (TextView) findViewById(R.id.sharkstats);

        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        emergencyStats.setTypeface(tfNS);
        drunkdriving.setTypeface(tfPC);
        lightning.setTypeface(tfPC);
        biking.setTypeface(tfPC);
        sharkattacks.setTypeface(tfPC);
        ddstats.setTypeface(tfPC);
        lightstats.setTypeface(tfPC);
        bikestats.setTypeface(tfPC);
        sharkattacks.setTypeface(tfPC);
        sharkstats.setTypeface(tfPC);
    }

}


