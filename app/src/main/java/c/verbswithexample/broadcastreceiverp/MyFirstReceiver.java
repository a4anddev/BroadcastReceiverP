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

        Log.i(TAG, "HELLO FROM 1ST RECEIVER");
        Toast.makeText(context, "HELLO FROM 1ST RECEIVER", Toast.LENGTH_SHORT).show();

    }
}
