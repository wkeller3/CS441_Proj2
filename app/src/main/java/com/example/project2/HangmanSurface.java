package com.example.project2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;

public class HangmanSurface extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder surfaceHolder = null;
    private  Paint paint = null;
    private int count;

    public HangmanSurface(Context context){
        super(context);
        surfaceHolder = getHolder();
        paint = new Paint();
        paint.setColor(Color.BLACK);

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder){
        //drawHangman();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        paint = null;

    }

    public boolean drawHangman(){

        surfaceHolder = getHolder();
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint background = new Paint();
        background.setColor(Color.WHITE);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), background);
        paint.setColor(Color.BLACK);
        canvas.drawRect(120,30,150,850,paint);
        canvas.drawRect(30,850,240,880,paint);
        canvas.drawRect(120,30,420,60,paint);
        canvas.drawRect(390,30,420,100,paint);

        if(0 == count){ //draw head

            canvas.drawCircle(405, 180, 80, paint);
            count++;

        } else if(1 == count){  //draw body

            canvas.drawCircle(405, 180, 80, paint);
            canvas.drawRect(390,260,420,540, paint);
            count++;

        } else if(2 == count){  //draw right arm

            canvas.drawCircle(405, 180, 80, paint);
            canvas.drawRect(390,260,420,540, paint);

            Point a = new Point(420,340);
            Point b = new Point(420, 370);
            Point c = new Point(500, 400);
            Point d = new Point(520, 380);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(5);
            Path path = new Path();
            path.moveTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(a.x, a.y);
            path.close();
            canvas.drawPath(path, paint);
            count++;

        } else if(3 == count){  //draw left arm

            canvas.drawCircle(405, 180, 80, paint);
            canvas.drawRect(390,260,420,540, paint);

            Point a = new Point(420,340);
            Point b = new Point(420, 370);
            Point c = new Point(500, 400);
            Point d = new Point(520, 380);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(5);
            Path path = new Path();
            path.moveTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(a.x, a.y);
            path.close();
            canvas.drawPath(path, paint);

            Point e = new Point(390, 340);
            Point f = new Point(390, 370);
            Point g = new Point(310, 400);
            Point h = new Point(290, 380);
            path.moveTo(e.x, e.y);
            path.lineTo(f.x, f.y);
            path.lineTo(g.x, g.y);
            path.lineTo(h.x, h.y);
            path.lineTo(e.x, e.y);
            path.close();
            canvas.drawPath(path, paint);
            count++;

        } else if(4 == count){  //draw right leg

            canvas.drawCircle(405, 180, 80, paint);
            canvas.drawRect(390,260,420,540, paint);

            Point a = new Point(420,340);
            Point b = new Point(420, 370);
            Point c = new Point(500, 400);
            Point d = new Point(520, 380);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(5);
            Path path = new Path();
            path.moveTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(a.x, a.y);
            path.close();
            canvas.drawPath(path, paint);

            Point e = new Point(390, 340);
            Point f = new Point(390, 370);
            Point g = new Point(310, 400);
            Point h = new Point(290, 380);
            path.moveTo(e.x, e.y);
            path.lineTo(f.x, f.y);
            path.lineTo(g.x, g.y);
            path.lineTo(h.x, h.y);
            path.lineTo(e.x, e.y);
            path.close();
            canvas.drawPath(path, paint);

            Point i = new Point(405, 510);
            Point j = new Point(405, 540);
            Point k = new Point(500, 570);
            Point l = new Point(520, 550);
            path.moveTo(i.x, i.y);
            path.lineTo(j.x, j.y);
            path.lineTo(k.x, k.y);
            path.lineTo(l.x, l.y);
            path.lineTo(i.x, i.y);
            path.close();
            canvas.drawPath(path, paint);
            count++;

        } else{  //draw left leg

            canvas.drawCircle(405, 180, 80, paint);
            canvas.drawRect(390,260,420,540, paint);

            Point a = new Point(420,340);
            Point b = new Point(420, 370);
            Point c = new Point(500, 400);
            Point d = new Point(520, 380);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(5);
            Path path = new Path();
            path.moveTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(a.x, a.y);
            path.close();
            canvas.drawPath(path, paint);

            Point e = new Point(390, 340);
            Point f = new Point(390, 370);
            Point g = new Point(310, 400);
            Point h = new Point(290, 380);
            path.moveTo(e.x, e.y);
            path.lineTo(f.x, f.y);
            path.lineTo(g.x, g.y);
            path.lineTo(h.x, h.y);
            path.lineTo(e.x, e.y);
            path.close();
            canvas.drawPath(path, paint);

            Point i = new Point(405, 510);
            Point j = new Point(405, 540);
            Point k = new Point(500, 570);
            Point l = new Point(520, 550);
            path.moveTo(i.x, i.y);
            path.lineTo(j.x, j.y);
            path.lineTo(k.x, k.y);
            path.lineTo(l.x, l.y);
            path.lineTo(i.x, i.y);
            path.close();
            canvas.drawPath(path, paint);

            Point m = new Point(405, 510);
            Point n = new Point(405, 540);
            Point o = new Point(310, 570);
            Point p = new Point(290, 550);
            path.moveTo(m.x, m.y);
            path.lineTo(n.x, n.y);
            path.lineTo(o.x, o.y);
            path.lineTo(p.x, p.y);
            path.lineTo(m.x, m.y);
            path.close();
            canvas.drawPath(path, paint);
            count++;
            surfaceHolder.unlockCanvasAndPost(canvas);
            return false;
        }

        surfaceHolder.unlockCanvasAndPost(canvas);
        return true;
    }
}
