package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.txtTitle);
        txt.setText(R.string.title);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.image);

        final Context context = this;

        Button button = (Button) findViewById(R.id.btnDisplay);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DisplayImage.class);
                startActivity(intent);
            }
        });
    }
}