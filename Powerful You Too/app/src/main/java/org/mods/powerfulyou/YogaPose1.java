package org.mods.powerfulyou;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;
/**
 * Created by Dita on 7/15/2015.
 */
public class YogaPose1 extends Activity implements View.OnClickListener{

    private static final String TAG = "yogapose1";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.yogapose1);

        //button
        View nextpose = findViewById(R.id.nextpose);
        nextpose.setOnClickListener(this);

        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView yogaposesTitle = (TextView) findViewById(R.id.yogapose1);
        TextView yogaposesDesc = (TextView) findViewById(R.id.yogaposedesc);
        TextView mountainPose = (TextView) findViewById(R.id.mountainpose);
        TextView mountainposeTitle = (TextView) findViewById(R.id.mountainposetitle);
        TextView nextPose = (TextView) findViewById(R.id.nextpose);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        yogaposesTitle.setTypeface(tfNS);
        yogaposesDesc.setTypeface(tfPC);
        mountainPose.setTypeface(tfPC);
        mountainposeTitle.setTypeface(tfPC);
        nextPose.setTypeface(tfPC);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nextpose:
                Intent statsInt = new Intent(this, YogaPose2.class);
                startActivity(statsInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Next Pose");
                break;
            case R.id.home:
                Intent homeInt = new Intent(this, PowerfulYou.class);
                startActivity(homeInt);
        }
    }

    //NEXT POSE BUTTON ACT
    public void nextpose(View view){
        Intent intent = new Intent(this, YogaPose2.class);
        startActivity(intent);
    }
    public void home(View view){
        Intent intent = new Intent(this, PowerfulYou.class);
        startActivity(intent);
    }
}
