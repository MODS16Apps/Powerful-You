package org.mods.powerfulyou;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;

public class Strength extends Activity implements View.OnClickListener {
    private static final String TAG = "strength";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.strength);
        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView strengthTitle = (TextView) findViewById(R.id.strength);
        TextView strengthDesc = (TextView) findViewById(R.id.strengthdesc);
        TextView yogaPoses = (TextView) findViewById(R.id.yogapose1);
        TextView brainTeasers = (TextView) findViewById(R.id.brainteasers);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        strengthTitle.setTypeface(tfNS);
        strengthDesc.setTypeface(tfPC);
        yogaPoses.setTypeface(tfPC);
        brainTeasers.setTypeface(tfPC);

        // Set up click listeners for all the buttons
        View yogapose1 = findViewById(R.id.yogapose1);
        yogapose1.setOnClickListener(this);
        View brainteasers = findViewById(R.id.brainteasers);
        brainteasers.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yogapose1:
                Intent yogapose1Int = new Intent(this, YogaPose1.class);
                startActivity(yogapose1Int);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Yoga Poses");
                break;
            case R.id.brainteasers:
                Intent brainteasersInt = new Intent(this, Brainteasers.class);
                startActivity(brainteasersInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Brainteasers");
                break;
        }
    }

    //YOGA POSE BUTTON ACT
    public void yogapose1(View view){
        Intent intent = new Intent(this, YogaPose1.class);
        startActivity(intent);
    }

    //YOGA POSE BUTTON ACT
    public void brainteasers(View view){
        Intent intent = new Intent(this, Brainteasers.class);
        startActivity(intent);
    }
}
