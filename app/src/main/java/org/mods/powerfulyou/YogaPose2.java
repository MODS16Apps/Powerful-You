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
public class YogaPose2 extends Activity implements View.OnClickListener {

    private static final String TAG = "yogapose2";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.yogapose2);

        View previousposeButton = findViewById(R.id.previouspose);
        previousposeButton.setOnClickListener(this);
        View nextposeButton = findViewById(R.id.nextpose);
        nextposeButton.setOnClickListener(this);

        //font stuff
        String printClearly = "fonts/printclearly.otf";
        TextView deeplungeposeTitle = (TextView) findViewById(R.id.deeplungeposetitle);
        TextView deeplungeposeDesc = (TextView) findViewById(R.id.deeplungepose);
        TextView previousPose = (TextView) findViewById(R.id.previouspose);
        TextView nextpose = (TextView) findViewById(R.id.nextpose);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        deeplungeposeTitle.setTypeface(tfPC);
        deeplungeposeDesc.setTypeface(tfPC);
        previousPose.setTypeface(tfPC);
        nextpose.setTypeface(tfPC);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nextpose:
                Intent nextposeInt = new Intent(this, YogaPose3.class);
                startActivity(nextposeInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Next Pose");
                break;
            case R.id.previouspose:
                Intent previousposeInt = new Intent(this, YogaPose1.class);
                startActivity(previousposeInt);
                overridePendingTransition(R.anim.left_in, R.anim.right_out);
                Log.d(TAG, "clicked on Previous Pose");
                break;
        }
    }

    //NEXT POSE BUTTON ACT
    public void nextpose(View view){
        Intent intent = new Intent(this, YogaPose3.class);
        startActivity(intent);
    }

    //PREVIOUS POSE BUTTON ACT
    public void previouspose(View view){
        Intent intent = new Intent(this, YogaPose1.class);
        startActivity(intent);
    }
}
