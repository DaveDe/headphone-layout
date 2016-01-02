package com.symbol.uisample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class BootReceiver extends BroadcastReceiver {

    @Override public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, ListenForHeadphones.class));
    }
}
