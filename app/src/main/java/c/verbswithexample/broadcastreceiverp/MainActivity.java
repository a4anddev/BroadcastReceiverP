package c.verbswithexample.broadcastreceiverp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void methodOne(View view) {

           IntentFilter intentFilter = new IntentFilter();
           intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);


           Intent intent = registerReceiver(null, intentFilter);

           int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
           if (status == BatteryManager.BATTERY_STATUS_CHARGING){

               Toast.makeText(this, "Bettery Getting Charged", Toast.LENGTH_SHORT).show();
           }

        if (status == BatteryManager.BATTERY_STATUS_DISCHARGING){

            Toast.makeText(this, "Bettery Getting Discharged", Toast.LENGTH_SHORT).show();
        }

        if (status == BatteryManager.BATTERY_STATUS_FULL){

            Toast.makeText(this, "Bettery Fully Charged", Toast.LENGTH_SHORT).show();
        }

    }
}
