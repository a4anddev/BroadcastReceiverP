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

        // send data by order intent tip this data send first priority after that you can modify if you need send set data
        Bundle b = new Bundle();
        b.putString("title", "Developer");
        Intent intent = new Intent("my.first.receiver");
        sendOrderedBroadcast(intent,null,null,null,-1,"Android", b);


    }

    public static class MyThirdReceiverInnerClass extends BroadcastReceiver{

        private static final String TAG = MyThirdReceiverInnerClass.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {


                int initCode = getResultCode();
                String initData = getResultData();
                Bundle initBundle = getResultExtras(true);
                String title = initBundle.getString("title");

                Log.i(TAG, "My Third Receiver Class " + title);
                Toast.makeText(context, "My Third Receiver Class, Threat name current -> " + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();
                


        }
    }

}
