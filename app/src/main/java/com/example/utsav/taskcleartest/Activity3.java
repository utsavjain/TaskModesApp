package com.example.utsav.taskcleartest;

import android.content.Intent;
import android.os.Bundle;


public class Activity3 extends MyActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeUI();
        Logger.d("Act3-C taskid:"+getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Logger.d("Act3-N tasid:"+getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act3-D taskid:"+getTaskId());
    }

}
