package com.miguelrisquelme.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
    }

    public void voltar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
