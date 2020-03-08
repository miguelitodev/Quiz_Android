package com.miguelrisquelme.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Questao2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questao2);
    }

    public void proxima(View v){
        Intent intent = new Intent(this, Questao3.class);
        startActivity(intent);
    }

}
