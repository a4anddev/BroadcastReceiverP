package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void priorityMethod(View view) {

        Intent intent = new Intent("my.first.receiver");
        sendOrderedBroadcast(intent, null);

    }

    public static class MyThirdReceiverInnerClass extends BroadcastReceiver{

        private static final String TAG = MyThirdReceiverInnerClass.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {

            Log.i(TAG, "My Third Receiver Class ");
            Toast.makeText(context, "My Third Receiver Class, Threat name current -> " + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();

        }
    }

}
