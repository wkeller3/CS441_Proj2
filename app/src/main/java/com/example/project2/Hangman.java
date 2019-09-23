package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Hangman extends AppCompatActivity implements View.OnTouchListener {

    private Button change = null;
    HangmanSurface surfaceView = null;
    private LinearLayout canvasLayout = null;
    private Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    private TextView text;
    private TextView gameover;
    private String answer;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);

        // Hide the app title bar.
        getSupportActionBar().hide();

        // Make app full screen to hide top status bar.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        String[] arr = {"computer", "chair", "door", "embezzle", "pneumonia", "blizzard"};

        Random rand = new Random();

        gameover = findViewById(R.id.gameover);
        text = findViewById(R.id.text);
        answer = arr[rand.nextInt(6)];
        str = "";
        for(int i = 0; i < answer.length(); i++){
            str = str + "_";
        }
        text.setText(str);

        change = findViewById(R.id.change);
        canvasLayout = findViewById(R.id.customViewLayout);

        surfaceView = new HangmanSurface(getApplicationContext());
        surfaceView.setOnTouchListener(this);
        canvasLayout.addView(surfaceView);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        i = findViewById(R.id.i);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        m = findViewById(R.id.m);
        n = findViewById(R.id.n);
        o = findViewById(R.id.o);
        p = findViewById(R.id.p);
        q = findViewById(R.id.q);
        r = findViewById(R.id.r);
        s = findViewById(R.id.s);
        t = findViewById(R.id.t);
        u = findViewById(R.id.u);
        v = findViewById(R.id.v);
        w = findViewById(R.id.w);
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        z = findViewById(R.id.z);


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Hangman.this, MainActivity.class));
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('a');
                a.setEnabled(false);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('b');
                b.setEnabled(false);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('c');
                c.setEnabled(false);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('d');
                d.setEnabled(false);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('e');
                e.setEnabled(false);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('f');
                f.setEnabled(false);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('g');
                g.setEnabled(false);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('h');
                h.setEnabled(false);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('i');
                i.setEnabled(false);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('j');
                j.setEnabled(false);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('k');
                k.setEnabled(false);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('l');
                l.setEnabled(false);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('m');
                m.setEnabled(false);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('n');
                n.setEnabled(false);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('o');
                o.setEnabled(false);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('p');
                p.setEnabled(false);
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('q');
                q.setEnabled(false);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('r');
                r.setEnabled(false);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('s');
                s.setEnabled(false);
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('t');
                t.setEnabled(false);
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('u');
                u.setEnabled(false);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('v');
                v.setEnabled(false);
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('w');
                w.setEnabled(false);
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('x');
                x.setEnabled(false);
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('y');
                y.setEnabled(false);
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check('z');
                z.setEnabled(false);
            }
        });
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(view instanceof SurfaceView) {
            view.invalidate();

            //surfaceView.drawHangman();

            return true;
        } else{
            return false;
        }
    }

    private void check(char letter){
        boolean flag = true;
        boolean hangman = true;
        for(int i = 0; i < answer.length(); i++){
            if(answer.charAt(i) == letter){
                StringBuilder s = new StringBuilder(str);
                s.setCharAt(i, letter);
                str = s.toString();
                flag = false;
            }
        }
        if(flag){
            hangman = surfaceView.drawHangman();
        }
        text.setText(str);
        if(answer.equals(str)){
            gameover.setTextColor(Color.RED);
            gameover.setText("YOU WIN");
        }

        if(!hangman){
            gameover.setTextColor(Color.RED);
            gameover.setText("YOU LOSE");
        }

    }
}
