package org.mods.powerfulyou;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Dita on 7/22/2015.
 */
public class Skeleton extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.skeleton);

        String printClearly = "fonts/printclearly.otf";
        TextView cranium = (TextView)findViewById(R.id.cranium);
        TextView humerus = (TextView)findViewById(R.id.humerus);
        TextView ribcage = (TextView)findViewById(R.id.ribcage);
        TextView radiusandulna = (TextView)findViewById(R.id.radiusandulna);
        TextView pelvis = (TextView)findViewById(R.id.pelvis);
        TextView metanphalange = (TextView)findViewById(R.id.metanphalange);
        TextView femur = (TextView)findViewById(R.id.femur);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        cranium.setTypeface(tfPC);
        humerus.setTypeface(tfPC);
        ribcage.setTypeface(tfPC);
        radiusandulna.setTypeface(tfPC);
        pelvis.setTypeface(tfPC);
        metanphalange.setTypeface(tfPC);
        femur.setTypeface(tfPC);


    }
}
