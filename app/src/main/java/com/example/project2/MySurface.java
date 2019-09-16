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
    private float xCoor = 0;
    private float yCoor = 0;

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
        canvas.drawCircle(xCoor, yCoor, 100, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    public void drawSqaure(){
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.YELLOW);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), background);
        canvas.drawRect(xCoor, yCoor, xCoor+200, yCoor+200, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    public void drawTriangle(){
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.WHITE);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), background);

        Point a = new Point((int)xCoor,(int)yCoor);
        Point b = new Point((int)xCoor+150, (int)yCoor+150);
        Point c = new Point((int)xCoor-150,(int)yCoor+150);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(5);

        Path path = new Path();
        //path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        //path.moveTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        //path.moveTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();

        canvas.drawPath(path, paint);

        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    public float getXCoor(){
        return xCoor;
    }

    public void setXCoor(float xIn){
        xCoor = xIn;
    }

    public float getYCoor(){
        return yCoor;
    }

    public void setYCoor(float yIn){
        yCoor = yIn;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }
}