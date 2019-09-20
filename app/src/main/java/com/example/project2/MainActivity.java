package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{


    private Button circle = null;//findViewById(R.id.circle);
    private Button square = null;//findViewById(R.id.square);
    private Button triangle = null;//findViewById(R.id.triangle);
    private Button coordinates = null;
    private Button resize = null;
    private Button color = null;
    private Button change = null;
    private TextView text = null;
    private int flag = -1; //0 circle, 1 square, 2 triangle
    //private int flag2 = -1; //0 coordinates, 1 resize, 2 color
    private Paint paint = new Paint();
    private int size;
    private boolean coordinateFlag = false;
    private boolean colorFlag = false;
    private LinearLayout canvasLayout = null;//findViewById(R.id.customViewLayout);
    MySurface surfaceView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle = findViewById(R.id.circle);
        square = findViewById(R.id.square);
        triangle = findViewById(R.id.triangle);
        coordinates = findViewById(R.id.coordinates);
        resize = findViewById(R.id.resize);
        color = findViewById(R.id.color);
        canvasLayout = findViewById(R.id.customViewLayout);
        text = findViewById(R.id.textView);
        paint.setColor(Color.BLACK);
        change = findViewById(R.id.change);

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

        coordinates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coordinateFlag = !coordinateFlag;
            }
        });

        resize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                size = rand.nextInt(300);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorFlag = !colorFlag;
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Hangman.class));
            }
        });

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent){
        if(view instanceof SurfaceView){
            view.invalidate();

            float x = motionEvent.getX();
            float y = motionEvent.getY();

            surfaceView.setXCoor(x);
            surfaceView.setYCoor(y);

            if(0 == flag){
                setCoordinates(x,y);
                changeColor();
                surfaceView.drawCircle(size);
            } else if(1 == flag){
                setCoordinates(x,y);
                changeColor();
                surfaceView.drawSquare(size);
            } else{
                setCoordinates(x,y);
                changeColor();
                surfaceView.drawTriangle(size);
            }
            return true;
        } else{
            return false;
        }
    }

    private void changeColor(){
        if(colorFlag){
            Random rand = new Random();
            paint.setARGB(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            colorFlag = false;
        }
        surfaceView.setPaint(paint);

    }


    private void setCoordinates(float x, float y){
        if(coordinateFlag){//coordinates

            String set = "Coordinates   x: " + x + "  y: " + y;
            text.setText(set);

        } else{
            text.setText("");
        }
    }



}