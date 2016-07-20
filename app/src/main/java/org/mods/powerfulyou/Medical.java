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

public class Medical extends Activity implements View.OnClickListener {
    private static final String TAG = "medical";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.medical);
        //font stuff
        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView medicalTitle = (TextView) findViewById(R.id.medical);
        TextView medicalDesc = (TextView) findViewById(R.id.medicaldesc);
        TextView medicalTools = (TextView) findViewById(R.id.medicaltools);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        medicalTitle.setTypeface(tfNS);
        medicalDesc.setTypeface(tfPC);
        medicalTools.setTypeface(tfPC);
        // Set up click listeners for all the buttons
        View medicaltools = findViewById(R.id.medicaltools);
        medicaltools.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.medicaltools:
                Intent medicaltoolsInt = new Intent(this, MedicalTools.class);
                startActivity(medicaltoolsInt);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                Log.d(TAG, "clicked on Medical Tools");
                break;
        }
    }

    //STRENGTH BUTTON ACT
    public void medicaltools(View view){
        Intent intent = new Intent(this, MedicalTools.class);
        startActivity(intent);
    }

}
