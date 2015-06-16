package com.example.utsav.taskcleartest;

import android.content.Intent;
import android.os.Bundle;


public class Activity2 extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeUI();
        Logger.d("Act2-C taskid:"+getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Logger.d("AcT2 -newintent taskid:"+getTaskId());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act2-D taskid:"+getTaskId());

    }

}
