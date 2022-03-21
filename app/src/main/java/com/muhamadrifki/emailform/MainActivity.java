package com.muhamadrifki.emailform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKirim = (Button) findViewById(R.id.btnKirim);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textKepada = (EditText) findViewById(R.id.textKepada);
                String kepada = textKepada.getText().toString();
                EditText textSubjek = (EditText) findViewById(R.id.textSubjek);
                String subjek = textSubjek.getText().toString();
                EditText textPesan = (EditText) findViewById(R.id.textPesan);
                String pesan = textPesan.getText().toString();
            }
        });
    }
}