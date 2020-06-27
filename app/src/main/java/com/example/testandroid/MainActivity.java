package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * rock     = ぐー
         * scissors = ちょき
         * paper    = ぱー
         */
        Button rockButton = findViewById(R.id.rock);
        rockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), RpsResult.class);
                intent.putExtra("rsp", 0);
                startActivity(intent);
            }
        });
        Button scissorsButton = findViewById(R.id.scissors);
        scissorsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), RpsResult.class);
                intent.putExtra("rsp", 1);
                startActivity(intent);
            }
        });
        Button paperButton = findViewById(R.id.paper);
        paperButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), RpsResult.class);
                intent.putExtra("rsp", 2);
                startActivity(intent);
            }
        });
    }
}