package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        Button blowOut = findViewById(R.id.Extinguish);
        CompoundButton candleSwitch = findViewById(R.id.candleSwitch);
        SeekBar candleSeekBar = findViewById(R.id.candleSeekBar);
        CakeView cakeview = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cakeview);

        blowOut.setOnClickListener(controller);
        candleSwitch.setOnCheckedChangeListener(controller);
        candleSeekBar.setOnSeekBarChangeListener(controller);
        cakeview.setOnTouchListener(controller);

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
