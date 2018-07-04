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

       //  Intent intent = new Intent(this, MyFirstReceiver.class);
        Intent intent = new Intent("my.custome.third.receiver");

        // custom way send
        sendBroadcast(intent);

    }

    public void ThirdReceiverInnerClassMethod(View view) {
       // Intent intent = new Intent(this, MyThirdReceiverInnerClass.class);

        // custom way send

        Intent intent = new Intent("my.custome.first.receiver");
        sendBroadcast(intent);
        
        // Broadcast receiver background (asynchronously) request
        Toast.makeText(this, "First This metod Call after that all call mean asynchronously reqeust", Toast.LENGTH_SHORT).show();


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
