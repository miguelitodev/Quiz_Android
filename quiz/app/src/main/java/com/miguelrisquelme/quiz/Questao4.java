package com.miguelrisquelme.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Questao4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questao4);
    }

    public void proxima(View v){
        Intent intent = new Intent(this, Questao5.class);
        startActivity(intent);
    }

}
