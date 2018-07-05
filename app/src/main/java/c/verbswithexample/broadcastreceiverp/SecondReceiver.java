package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondReceiver extends BroadcastReceiver{
    private static final String TAG = SecondReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        // there is highest priority second run this and we modify data here with set method
        // we check this is orderbraocast or not with if condition
        if (isOrderedBroadcast()) {
            int initCode = getResultCode();
            String initData = getResultData();
            Bundle initBundle = getResultExtras(true);
            String title = initBundle.getString("title");

            Log.i(TAG, "Code" + initCode + " Data " + initData + " Bundle " + title);
            Toast.makeText(context, "Code : ", Toast.LENGTH_SHORT).show();

            // there is highest priority first run this and we modify data here with set method
            setResultCode(15);
            setResultData("ios new");
            initBundle.putString("title", " Nisha dhiman Developer");

        }

        Toast.makeText(context, "Second Receiver, Threat name current -> " + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();
        
    }
}
