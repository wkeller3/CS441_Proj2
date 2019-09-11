package com.example.project2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

public class MySurface extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder = null;
    private  Paint paint = null;

    public MySurface(Context context){
        super(context);
        surfaceHolder = getHolder();
        paint = new Paint();
        paint.setColor(Color.CYAN);

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder){
        drawCircle();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        paint = null;

    }

    public void drawCircle(){
        surfaceHolder = getHolder();
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.LTGRAY);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), background);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50, 50, 100, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    public void drawSqaure(){
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.BLACK);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), background);
        canvas.drawRect(0, 0, 200, 200, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    public void drawTriangle(){
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.WHITE);

        Point a = new Point(40,40);
        Point b = new Point(55,55);
        Point c = new Point(25,25);

        Path path = new Path();
        path.lineTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.close();

        canvas.drawPath(path, paint);

        surfaceHolder.unlockCanvasAndPost(canvas);
    }


}