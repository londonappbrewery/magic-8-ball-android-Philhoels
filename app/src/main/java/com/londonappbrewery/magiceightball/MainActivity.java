package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;
        askbutton = (Button) findViewById(R.id.button);

        final ImageView ball = (ImageView) findViewById(R.id.imageView);

        final int[] answerArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic Eight Ball", "The button has been pressed!");

                Random ranNum = new Random();
                int number = ranNum.nextInt(5);

                ball.setImageResource(answerArray[number]);
            }
        });

    }
}
