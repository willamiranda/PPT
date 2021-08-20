package com.willzinho.pedra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionadoPedra(View view){

        this.opcaoSelecionada("pedra");
    }
    public void selecionadoPapel(View view){

        this.opcaoSelecionada("papel");
    }
    public void selecionadoTesoura(View view){

        this.opcaoSelecionada("tesoura");
    }


    public void opcaoSelecionada(String opcaoSelecionada ){
        System.out.println("Item clicado " + opcaoSelecionada );

        int numero = new Random().nextInt(3);



    }


}