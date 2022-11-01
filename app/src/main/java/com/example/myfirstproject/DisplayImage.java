package com.example.myfirstproject;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        ImageView img = (ImageView) findViewById(R.id.imageOnlyView);
        img.setImageResource(R.drawable.zugpsitze_mountain);
    }
}
