package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MyFirstReceiver myFirstReceiver;
    private TextView tv;
    private int ctr = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFirstReceiver = new MyFirstReceiver();
        tv = findViewById(R.id.tv);

    }

    @Override
    protected void onResume() {
        super.onResume();

        // this application on running state that time work receiver
        IntentFilter intentFilter = new IntentFilter();
    // both are similar use one
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");

        registerReceiver(myFirstReceiver, intentFilter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        // we  have to unregister when we close app otherwise will get error
        unregisterReceiver(myFirstReceiver);
    }

    public void myRegisterBroadcast(View view) {

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_TIME_TICK);
        registerReceiver(timeTickReceive, intentFilter);
    }

    public void myUnRegisterBroadcast(View view) {

        unregisterReceiver(timeTickReceive);
    }


    private BroadcastReceiver timeTickReceive = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            int minute = ctr;
            tv.setText(minute + " minute Over ");
            ctr++;
            Toast.makeText(context, "Receive Broadcast", Toast.LENGTH_SHORT).show();

        }
    };
}
