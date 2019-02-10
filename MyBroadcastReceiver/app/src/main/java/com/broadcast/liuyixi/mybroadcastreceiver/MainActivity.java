package com.broadcast.liuyixi.mybroadcastreceiver;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendButton = (Button)findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.broadcast.liuyixi.mybroadcastreceiver.My_Broadcast");
                //在AndroidO上动态注册广播接收器或者静态注册广播接收器并添加ComponentName用于发送显示广播
                //在AndroidManifest中注册广播是静态注册,在代码中注册广播是动态注册
                intent.setComponent(new ComponentName("com.broadcast.liuyixi.mybroadcastreceiver","com.broadcast.liuyixi.mybroadcastreceiver.MyBroadcastReceiver"));
                Log.d("liuyixi","onclicked !");
                sendBroadcast(intent);
            }
        });
    }
}
