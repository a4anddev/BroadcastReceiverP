package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

            Toast.makeText(context,  "Hello from dynamic receiver", Toast.LENGTH_SHORT).show();

    }
}
