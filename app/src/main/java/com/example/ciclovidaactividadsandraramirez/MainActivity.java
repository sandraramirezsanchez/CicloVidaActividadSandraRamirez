package com.example.ciclovidaactividadsandraramirez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText{this, "onCreate",Toast.LENGTH_SHORT).show()};
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText{this, "onStart",Toast.LENGTH_SHORT).show()};
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText{this, "onStop",Toast.LENGTH_SHORT).show()};
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText{this, "onDestroy",Toast.LENGTH_SHORT).show()};
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText{this, "onPause",Toast.LENGTH_SHORT).show()};
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText{this, "onResume",Toast.LENGTH_SHORT).show()};
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText{this, "onRestart",Toast.LENGTH_SHORT).show()};
    }
}