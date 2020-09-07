package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView numeroSelecionado = findViewById(R.id.numeroSelecionado);
        int numeroSorteado = (int)(Math.random()*10) +1;
        numeroSelecionado.setText("Número selecionado: "+numeroSorteado);
    }
}