package com.willzinho.pedra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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


    public void opcaoSelecionada(String escolhaUsuario ){
        ImageView imgresposta = findViewById(R.id.imgresposta);
        TextView txtResultado = findViewById(R.id.txtResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra","papel", "tesoura" };
        String escolhaApp = opcoes [numero];

        switch (escolhaApp){
            case "pedra":
                imgresposta.setImageResource(R.drawable.pedra);
            break;

            case "papel":
                imgresposta.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgresposta.setImageResource(R.drawable.tesoura);
                break;
        }
        if(
             (escolhaApp.equals("tesoura") && escolhaUsuario.equals("papel")) ||
             (escolhaApp.equals("papel") && escolhaUsuario.equals("pedra"))   ||
             (escolhaApp.equals("pedra") && escolhaUsuario.equals("tesoura"))
        ){
             txtResultado.setText("Você Perdeu :(");

        }else if(

             (escolhaUsuario.equals("tesoura") && escolhaApp.equals("papel")) ||
             (escolhaUsuario.equals("papel") && escolhaApp.equals("pedra"))   ||
             (escolhaUsuario.equals("pedra") && escolhaApp.equals("tesoura"))
        ){
            txtResultado.setText("Você Ganhou ;)");

        }else{
            txtResultado.setText("Empatamos :)");
        }

        System.out.println("Item clicado " + escolhaApp );





    }


}