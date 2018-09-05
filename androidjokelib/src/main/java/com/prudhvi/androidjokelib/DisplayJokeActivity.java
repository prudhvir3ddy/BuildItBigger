package com.prudhvi.androidjokelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView textview =  findViewById(R.id.joke_text);

        String JokeResult = null;

        Intent intent = getIntent();
        JokeResult = intent.getStringExtra(getString(R.string.jokeEnvelope));

        if (JokeResult != null) {

            Log.d("jokeman",JokeResult);
            textview.setText(JokeResult);
        } else {
            textview.setText("Dig deeped, we gotta find the joke!");
        }
    }
}
