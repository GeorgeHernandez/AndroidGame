package com.georgehernandez.mathgamechapter2;

//import android.support.v7.app.AppCompatActivity;
// Warning:(8, 35) ActionBarActivity is deprecated; use `AppCompatActivity` instead
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
public class GameActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}
