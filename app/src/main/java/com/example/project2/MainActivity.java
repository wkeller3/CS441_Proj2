package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{


    private Button circle = null;//findViewById(R.id.circle);
    private Button square = null;//findViewById(R.id.square);
    private Button triangle = null;//findViewById(R.id.triangle);
    private int flag; //0 circle, 1 square, 2 triangle
    private LinearLayout canvasLayout = findViewById(R.id.customViewLayout);
    MySurface surfaceView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle = findViewById(R.id.circle);
        square = findViewById(R.id.square);
        triangle = findViewById(R.id.triangle);

        // Hide the app title bar.
        getSupportActionBar().hide();

        // Make app full screen to hide top status bar.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        surfaceView = new MySurface(getApplicationContext());
        surfaceView.setOnTouchListener(this);
        canvasLayout.addView(surfaceView);


        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = 0;
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = 1;
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = 2;
            }
        });
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent){
        if(view instanceof SurfaceView){
            view.invalidate();

            if(0 == flag){
                surfaceView.drawCircle();
            } else if(1 == flag){
                surfaceView.drawSqaure();
            } else{
                surfaceView.drawTriangle();
            }
            return true;
        } else{
            return false;
        }
    }

}