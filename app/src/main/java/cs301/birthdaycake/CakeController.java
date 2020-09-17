package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener  {

    private CakeView cake;
    private CakeModel model;

    public CakeController (CakeView view)
    {
        this.cake = view;
        model = this.cake.getModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("button", "works");
        cake.invalidate();
        model.lit = false;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cake.invalidate();
        model.candles = b;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
        if(user) {
            cake.invalidate();
            model.numCandles = progress;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //nothing
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
