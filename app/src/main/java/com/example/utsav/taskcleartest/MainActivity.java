package com.example.utsav.taskcleartest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivity extends MyActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeUI();
        Logger.d("MainAct-C taskid:"+getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Logger.d("MainAct-N taskid:"+getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("MainAct-D taskid:"+getTaskId());
    }
}
