package com.miguelrisquelme.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Questao3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questao3);
    }

    public void proxima(View v){
        Intent intent = new Intent(this, Questao4.class);
        startActivity(intent);
    }

}
