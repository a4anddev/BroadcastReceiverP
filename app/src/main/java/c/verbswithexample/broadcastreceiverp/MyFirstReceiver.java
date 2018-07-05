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

        if (isOrderedBroadcast()) {

            // we get data here
            // we check this is orderbraocast or not with if condition
            int initCode = getResultCode();
            String initData = getResultData();
            Bundle initBundle = getResultExtras(true);
            String title = initBundle.getString("title");

            Log.i(TAG, "Code" + initCode + " Data " + initData + " Bundle " + title);
            Toast.makeText(context, "Code : ", Toast.LENGTH_SHORT).show();


        }
        Toast.makeText(context, "HELLO FROM 1ST RECEIVER, Threat name current -> " + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();

    }
}
