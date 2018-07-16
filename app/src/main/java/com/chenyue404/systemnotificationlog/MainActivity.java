package com.chenyue404.systemnotificationlog;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$NotificationStationActivity"));
        startActivity(intent);
        finish();

    }
}
