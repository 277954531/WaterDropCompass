package com.huangshikun.waterdropcompass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.huangshikun.library.WaterDropCompassDrawable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image;
    private int[] colors;
    private WaterDropCompassDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        image = (ImageView) findViewById(R.id.image);
        findViewById(R.id.green).setOnClickListener(this);
        findViewById(R.id.blue).setOnClickListener(this);
        findViewById(R.id.yellow).setOnClickListener(this);
        findViewById(R.id.red).setOnClickListener(this);

        colors = new int[]{getResources().getColor(R.color.green), getResources().getColor(R.color.blue), getResources().getColor(R.color.yellow), getResources().getColor(R.color.red)};
        drawable = new WaterDropCompassDrawable(colors);
        image.setImageDrawable(drawable);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.green:
                drawable.setCurrentColor(0, "health");
                break;
            case R.id.blue:
                drawable.setCurrentColor(1, "normal");
                break;
            case R.id.yellow:
                drawable.setCurrentColor(2, "warn");
                break;
            case R.id.red:
                drawable.setCurrentColor(3, "worse");
                break;
        }
    }
}
