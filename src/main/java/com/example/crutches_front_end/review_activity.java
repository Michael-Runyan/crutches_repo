package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class review_activity extends AppCompatActivity {

    private static SeekBar seek_bar;
    private static TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        seek_bar();
    }
    public void seek_bar( ){
        seek_bar = (SeekBar)findViewById(R.id.rate_bar_id);
        text_view =(TextView)findViewById(R.id.rate_view_id);
        text_view.setText("0");

        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText( Integer.toString(progress));
                        //Toast.makeText(review_activity.this,"SeekBar in progress",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                       // Toast.makeText(review_activity.this,"SeekBar in StartTracking",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText(Integer.toString(progress_value));
                        //Toast.makeText(review_activity.this,"SeekBar in StopTracking",Toast.LENGTH_LONG).show();
                    }
                }
        );

//        public void seek_bar(){
//        rate_bar = (SeekBar) findViewById(R.id.rate_bar_id);
//        num_progress = (TextView) findViewById((R.id.rate_view_id));
//
//        rate_bar.setOnSeekBarChangeListener(
//                new SeekBar.OnSeekBarChangeListener() {
//                    int progress_value;
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                       progress_value = i;
//                       num_progress.setText(rate_bar.getProgress());
//                //        Toast.makeText(review_activity.this,"SeekBar in progress".Toast.L)
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar) {
//                        num_progress.setText(rate_bar.getProgress());
//                    }
//                }
//        );
    }
}
