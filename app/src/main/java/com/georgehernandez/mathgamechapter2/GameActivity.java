package com.georgehernandez.mathgamechapter2;

// Warning:(8, 35) ActionBarActivity is deprecated; use `AppCompatActivity` instead
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//public class MainActivity extends AppCompatActivity {
public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}
