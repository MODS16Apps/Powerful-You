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


public class Health extends Activity implements View.OnClickListener {

    private static final String TAG = "health";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.health);
        //button setup
        View caloriecounter = findViewById(R.id.caloriecounter);
        caloriecounter.setOnClickListener(this);
        View healthquiz = findViewById(R.id.healthquiz);
        healthquiz.setOnClickListener(this);
        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView healthTitle = (TextView) findViewById(R.id.health);
        TextView healthDesc = (TextView) findViewById(R.id.healthdesc);
        TextView calorieCounter = (TextView) findViewById(R.id.caloriecounter);
        TextView healthQuiz = (TextView) findViewById(R.id.healthquiz);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        healthTitle.setTypeface(tfNS);
        healthDesc.setTypeface(tfPC);
        calorieCounter.setTypeface(tfPC);
        healthQuiz.setTypeface(tfPC);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.caloriecounter:
                Intent caloriecounterInt = new Intent(this, CalorieCounter.class);
                startActivity(caloriecounterInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Calorie Counter");
                break;
            case R.id.healthquiz:
                Intent healthquizInt = new Intent(this, HealthQuiz.class);
                startActivity(healthquizInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Health Quiz");

                break;
        }
    }

    //HEALTH BUTTON ACT
    public void caloriecounter(View view){
        Intent intent = new Intent(this, CalorieCounter.class);
        startActivity(intent);
    }

    public void healthquiz(View view){
        Intent intent = new Intent(this, HealthQuiz.class);
        startActivity(intent);
    }

}
