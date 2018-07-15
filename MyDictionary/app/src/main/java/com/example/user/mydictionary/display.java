package com.example.user.mydictionary;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
       TextView text= findViewById(R.id.textk);
       ImageButton next= findViewById(R.id.next);
       ImageButton prev= findViewById(R.id.prev);
    }
}
