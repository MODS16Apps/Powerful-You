package org.mods.powerfulyou;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;
/**
 * Created by Dita on 7/15/2015.
 */
public class MedicalTools extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //remove gray bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.medicaltool1);

        String negativeSpace = "fonts/NegativeSpace.ttf";
        String printClearly = "fonts/printclearly.otf";
        TextView stethoscope = (TextView) findViewById(R.id.stethoscope);
        TextView forceps = (TextView) findViewById(R.id.forceps);
        TextView scalpel = (TextView) findViewById(R.id.scalpel);
        TextView stethoscopeDesc = (TextView) findViewById(R.id.stethoscopetext);
        TextView forcepsDesc = (TextView) findViewById(R.id.forcepsdesc);
        TextView scalpelDesc = (TextView) findViewById(R.id.scalpeldesc);
        Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
        Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
        stethoscope.setTypeface(tfNS);
        forceps.setTypeface(tfNS);
        scalpel.setTypeface(tfNS);
        stethoscopeDesc.setTypeface(tfPC);
        forcepsDesc.setTypeface(tfPC);
        scalpelDesc.setTypeface(tfPC);

    }
}
