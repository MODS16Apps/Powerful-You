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


public class Emergency extends Activity implements View.OnClickListener {

    private static final String TAG = "emergency";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.emergency);
        //button
        View emergencys = findViewById(R.id.emergencystatistics);
        emergencys.setOnClickListener(this);
        View skeleton = findViewById(R.id.skeleton);
        skeleton.setOnClickListener(this);
        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView emergencyTitle = (TextView) findViewById(R.id.emergencytitle);
        TextView emergencyDesc = (TextView) findViewById(R.id.emergencydesc);
        TextView emergencyStats = (TextView) findViewById(R.id.emergencystatistics);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        emergencyTitle.setTypeface(tfNS);
        emergencyDesc.setTypeface(tfPC);
        emergencyStats.setTypeface(tfPC);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.emergencystatistics:
                Intent statsInt = new Intent(this, EmergencyStats.class);
                startActivity(statsInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Emergency Statistics");
                break;
            case R.id.skeleton:
                Intent skeletonInt = new Intent(this, Skeleton.class);
                startActivity(skeletonInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Emergency Statistics");
                break;
        }
    }

    //EMERGENCY STATS BUTTON ACT
    public void emergencystatistics(View view){
        Intent intent = new Intent(this, EmergencyStats.class);
        startActivity(intent);
    }

    //SKELETON BUTTON ACT
    public void skeleton(View view){
        Intent intent = new Intent(this, Skeleton.class);
        startActivity(intent);
    }

}
