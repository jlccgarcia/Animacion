package com.example.animacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
        AnimationDrawable animacion;

        @Override public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            animacion = (AnimationDrawable)ContextCompat.getDrawable(this,R.drawable.animacion);
            ImageView vista = new ImageView(this);
            vista.setBackgroundColor(Color.WHITE);
            vista.setImageDrawable(animacion);
            vista.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    animacion.start();
                }
            });
            setContentView(vista);
        }
    }
