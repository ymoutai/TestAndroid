package com.example.testandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;


public class RpsResult extends AppCompatActivity {

    private int selectedRps;
    private int randomRps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.result_rps);

        TextView result = findViewById(R.id.result);
        TextView cResult = findViewById(R.id.cResult);
        TextView uResult = findViewById(R.id.uResult);

        Random random = new Random();
        randomRps = random.nextInt(3);

        Intent intent = getIntent();
        selectedRps = intent.getIntExtra("rsp", 3);

        if ((selectedRps - randomRps + 3)%3 == 0) {
            result.setText("あいこ");
        }
        else if ((selectedRps - randomRps + 3)%3 == 1) {
            result.setText("まけ・・・");
        }
        else {
            result.setText("かち！！");
        }

        if (randomRps == 0) {
            cResult.setText("ぐー");
        }
        else if (randomRps == 1) {
            cResult.setText("ちょき");
        }
        else if (randomRps == 2) {
            cResult.setText("ぱー");
        }

        if (selectedRps == 0) {
            uResult.setText("ぐー");
        }
        else if (selectedRps == 1) {
            uResult.setText("ちょき");
        }
        else if (selectedRps == 2) {
            uResult.setText("ぱー");
        }

        Button resultEnd = findViewById(R.id.returnEnd);
        resultEnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
