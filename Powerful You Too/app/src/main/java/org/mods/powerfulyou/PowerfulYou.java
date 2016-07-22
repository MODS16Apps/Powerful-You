/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.mods.powerfulyou;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.mods.powerfulyou.R;

public class PowerfulYou extends Activity implements OnClickListener {
   private static final String TAG = "powerfulyou";

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      //remove gray bar
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
      setContentView(R.layout.main);
      // Set up click listeners for all the buttons
      View health = findViewById(R.id.health);
      health.setOnClickListener(this);
      View medical = findViewById(R.id.medical);
      medical.setOnClickListener(this);
      View emergency = findViewById(R.id.emergency);
      emergency.setOnClickListener(this);
      View strength = findViewById(R.id.strength);
      strength.setOnClickListener(this);
      //View hygiene = findViewById(R.id.hygiene);
      //hygiene.setOnClickListener(this);
      View credits = findViewById(R.id.credits);
      credits.setOnClickListener(this);
      View map = findViewById(R.id.map);
      map.setOnClickListener(this);

      //font stuff
      String negativeSpace = "fonts/NegativeSpace.ttf";
      String printClearly = "fonts/printclearly.otf";
      TextView credit = (TextView) findViewById(R.id.credits);
      //TextView title = (TextView) findViewById(R.id.title);
      Typeface tfNS = Typeface.createFromAsset(getAssets(), negativeSpace);
      Typeface tfPC = Typeface.createFromAsset(getAssets(), printClearly);
      //title.setTypeface(tfNS);
      credit.setTypeface(tfPC);
   }

   // ...
   
   public void onClick(View v) {
      switch (v.getId()) {
         case R.id.health:
            Intent healthInt = new Intent(this, Health.class);
            startActivity(healthInt);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            Log.d(TAG, "clicked on Health");
            break;
      // More buttons go here (if any) ...
         case R.id.medical:
            Intent medicalInt = new Intent(this, Medical.class);
            startActivity(medicalInt);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            Log.d(TAG, "clicked on Medical");
            break;
         case R.id.strength:
            Intent strengthInt = new Intent(this, Strength.class);
            startActivity(strengthInt);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            Log.d(TAG, "clicked on Strength");
            break;
         case R.id.emergency:
            Intent emergencyInt = new Intent(this, Emergency.class);
            startActivity(emergencyInt);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            Log.d(TAG, "clicked on Emergency");
            break;


         case R.id.credits:
            Intent creditsInt = new Intent(this, Credits.class);
            startActivity(creditsInt);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            Log.d(TAG, "clicked on Credits");
            break;
         case R.id.map:
            Intent intent = new Intent();
            intent.setAction("com.example.modsexplorer");
            sendBroadcast(intent);
            Log.d(TAG, "clicked on Map");
            break;
      }
   }

   //HEALTH BUTTON ACT
   public void health(View view){
      Intent intent = new Intent(this, Health.class);
      startActivity(intent);
   }

   //MEDICAL BUTTON ACT
   public void medical(View view){
      Intent intent = new Intent(this, Medical.class);
      startActivity(intent);
   }

   //STRENGTH BUTTON ACT
   public void strength(View view){
      Intent intent = new Intent(this, Strength.class);
      startActivity(intent);
   }

   //EMERGENCY BUTTON ACT
   public void emergency(View view){
      Intent intent = new Intent(this, Emergency.class);
      startActivity(intent);
   }



   //CREDITS BUTTON ACT
   public void credits(View view){
      Intent intent = new Intent(this, Credits.class);
      startActivity(intent);
   }

   //MAP BUTTON ACT
   public void map(View view){
      Intent intent = new Intent();
      intent.setAction("com.example.modsexplorer");
      sendBroadcast(intent);
   }

}
