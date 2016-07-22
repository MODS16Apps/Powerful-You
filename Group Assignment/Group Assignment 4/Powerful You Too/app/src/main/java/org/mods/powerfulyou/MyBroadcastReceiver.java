package org.mods.powerfulyou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Dita on 7/24/2015.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equals("org.mods.powerfulyou")) {
            Intent i = new Intent(context, PowerfulYou.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }

}
