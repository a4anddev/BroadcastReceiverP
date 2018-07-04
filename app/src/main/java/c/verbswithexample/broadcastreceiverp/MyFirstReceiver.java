package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 10);

        Log.i(TAG, "HELLO FROM 1ST RECEIVER" + name + " age " + age);
        Toast.makeText(context, "HELLO FROM 1ST RECEIVER, Threat name current -> " + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();

    }
}
