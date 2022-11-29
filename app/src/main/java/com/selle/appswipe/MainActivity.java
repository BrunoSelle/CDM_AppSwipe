package com.selle.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//2
    private ConstraintLayout tela;
    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//2
        tela = findViewById(R.id.tela);
        texto = findViewById(R.id.tvTexto);

// 3
        tela.setOnTouchListener( new OnSwipeTouchListener(MainActivity.this) {

// 4
            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tela.setBackgroundColor(Color.BLUE);
                texto.setText("Pra cima");
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tela.setBackgroundColor(Color.GREEN);
                texto.setText("Pra baixo");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tela.setBackgroundColor(Color.RED);
                texto.setText("Pra esquerda");
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tela.setBackgroundColor(Color.GRAY);
                texto.setText("Pra direita");
            }

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tela.setBackgroundColor(Color.YELLOW);
                texto.setText("Arraste para algum lado");
                return super.onTouch(v, event);
            }

        });
    }

}