package com.example.seekbarcolors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
SeekBar red,green,blue;
Integer r=0,g=0,b=0;
TextView rt,gt,bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout rl = findViewById(R.id.root);
        red = findViewById(R.id.red);
        rt=findViewById(R.id.redText);
        green= findViewById(R.id.green);
        gt=findViewById(R.id.greenText);
        blue = findViewById(R.id.blue);
        bt=findViewById(R.id.blueText);
        red.setMax(255);
        red.setProgress(0);
        blue.setMax(255);
        green.setProgress(0);
        green.setMax(255);
        blue.setProgress(0);
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                rt.setText(String.valueOf(progress));
                Log.d("red progress int ",progress+"");
                Log.d("bg",""+g+" "+b);
                r=progress;
                rl.setBackgroundColor(0xff000000 + r * 0x10000 + g * 0x100 + b);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("blue progress int ",progress+"");
                gt.setText(String.valueOf(progress));
                Log.d("rb",""+r+" "+b);
                g=progress;
                rl.setBackgroundColor(0xff000000 + r * 0x10000 + g * 0x100 + b);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }@Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bt.setText(String.valueOf(progress));
                b=progress;
                Log.d("green progress int ",progress+"");
                Log.d("rg",""+r+" "+g);
                rl.setBackgroundColor(0xff000000 + r * 0x10000 + g * 0x100 + b);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
