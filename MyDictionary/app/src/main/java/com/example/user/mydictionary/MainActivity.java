package com.example.user.mydictionary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int time_splash=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1= findViewById(R.id.texts);
        TextView text2=findViewById(R.id.textView);
        ProgressBar progressBar= findViewById(R.id.progressBar);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i1= new Intent(MainActivity.this, homeactivity.class);
                startActivity(i1);
                finish();
            }
        },time_splash);
    }
}
