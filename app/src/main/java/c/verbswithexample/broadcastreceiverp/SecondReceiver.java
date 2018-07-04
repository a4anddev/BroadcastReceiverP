package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SecondReceiver extends BroadcastReceiver{
    private static final String TAG = SecondReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG,"Second receiver");
        Toast.makeText(context, "Second Receiver", Toast.LENGTH_SHORT).show();
        
    }
}
