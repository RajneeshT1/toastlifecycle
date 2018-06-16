package com.acadview.acadview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.LoggingMXBean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "this is my first toast",Toast.LENGTH_SHORT).show();

        Toast centerToast = Toast.makeText(this," i am in center",Toast.LENGTH_SHORT);
        centerToast.setGravity(Gravity.CENTER,0,0);
        centerToast.show();



    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "this is my first toast on onstart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "this is my first toast on onresume",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "this is my first toast on onpause",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "this is my first toast on onstop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "this is my first toast on ondestroy",Toast.LENGTH_SHORT).show();
    }


}
