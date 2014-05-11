package com.example.geeostudies.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.geeostudies.app.lesson01.Lesson01MainActivity;
import com.example.geeostudies.app.lesson02.Lesson02MainActivity;
import com.example.geeostudies.app.testes.TestsMainActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openLesson01(View view) {
        Intent intent = new Intent(this, Lesson01MainActivity.class);
        Log.w("LOGS", "Abriu tela 1");
        startActivity(intent);
    }

    public void openLesson02(View view) {
        Intent intent = new Intent(this, Lesson02MainActivity.class);
        startActivity(intent);
    }
    public void openTests(View view){
        Intent intent  = new Intent(this, TestsMainActivity.class);
        startActivity(intent);

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
