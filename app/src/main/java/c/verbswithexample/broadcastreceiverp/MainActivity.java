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

    public void BroadCastReceiverDemo(View view) {

        Intent intent = new Intent(this, MyFirstReceiver.class);
        sendBroadcast(intent);

    }

    public void ThirdReceiverInnerClassMethod(View view) {
        Intent intent = new Intent(this, MyThirdReceiverInnerClass.class);
        sendBroadcast(intent);


    }

    public static class MyThirdReceiverInnerClass extends BroadcastReceiver{

        private static final String TAG = MyThirdReceiverInnerClass.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {


            Log.i(TAG, "My Third Receiver Class");
            Toast.makeText(context, "My Third Receiver Class", Toast.LENGTH_SHORT).show();

        }
    }

}
