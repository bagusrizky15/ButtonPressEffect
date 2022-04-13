package com.rivvana.buttonpresseffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        imageButton = (Button) findViewById(R.id.imageButtonSelector);
        imageButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Image was Selected", Toast.LENGTH_SHORT).show();
        });

    }
}