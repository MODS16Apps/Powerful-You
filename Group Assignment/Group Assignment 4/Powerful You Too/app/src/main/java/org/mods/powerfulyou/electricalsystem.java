package org.mods.powerfulyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by bjoseph on 7/22/2016.
 */
public class electricalsystem extends Activity implements View.OnClickListener {

    private static final String TAG = "electricalsystem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.electricalsystem);

        View previousposeButton = findViewById(R.id.previouspose);
        previousposeButton.setOnClickListener(this);

        String printClearly = "fonts/printclearly.otf";
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.previouspose:
                Intent previousposeInt = new Intent(this, YogaPose3.class);
                startActivity(previousposeInt);
                overridePendingTransition(R.anim.left_in, R.anim.right_out);
                Log.d(TAG, "clicked on Previous Pose");
                break;
            case R.id.home:
                Intent homeInt = new Intent(this, PowerfulYou.class);
                startActivity(homeInt);
            case R.id.nextpose:
                Intent nextposeInt = new Intent(this,careers.class);
                startActivity(nextposeInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Next");
                break;
        }
    }
    public void nextpose(View view) {
        Intent intent = new Intent(this, careers.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(this, PowerfulYou.class);
        startActivity(intent);


    }
}