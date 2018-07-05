package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MyFirstReceiver myFirstReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFirstReceiver = new MyFirstReceiver();

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
}
