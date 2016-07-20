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
public class YogaPose3 extends Activity implements View.OnClickListener {

    private static final String TAG = "yogapose3";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.yogapose3);

        View previousposeButton = findViewById(R.id.previouspose);
        previousposeButton.setOnClickListener(this);

        //font stuff
        String printClearly = "fonts/printclearly.otf";
        TextView downwardfacingdogTitle = (TextView) findViewById(R.id.downwardfacingdogposetitle);
        TextView downwardfacingdogDesc = (TextView) findViewById(R.id.downwardfacingdogepose);
        TextView previousPose = (TextView) findViewById(R.id.previouspose);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        downwardfacingdogTitle.setTypeface(tfPC);
        downwardfacingdogDesc.setTypeface(tfPC);
        previousPose.setTypeface(tfPC);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.previouspose:
                Intent previousposeInt = new Intent(this, YogaPose2.class);
                startActivity(previousposeInt);
                overridePendingTransition(R.anim.left_in, R.anim.right_out);
                Log.d(TAG, "clicked on Previous Pose");
                break;
        }
    }

    //PREVIOUS POSE BUTTON ACT
    public void previouspose(View view){
        Intent intent = new Intent(this, YogaPose2.class);
        startActivity(intent);
    }
}

