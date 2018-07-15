package com.example.user.mydictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        final EditText word= findViewById(R.id.word);
        Button bt= findViewById(R.id.bt1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wor =word.getText().toString();
                if(word.getText().toString().length() == 0 )
                    word.setError( "first enter a word" );
                else {
                    Intent j = new Intent(homeactivity.this, display.class);
                    startActivity(j);
                }
            }
        });
    }
}
