package stefanini.cartona.com.br.cartolastefanini.controllers;

import stefanini.cartona.com.br.cartolastefanini.R;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity   { //FragmentActivity

    private static final String TAG = "MainActivity";
    Button buttonPartida;
    Button buttonClubes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//protected
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonPartida = (Button) findViewById(R.id.btnPartidas);
        buttonClubes = (Button) findViewById(R.id.btnClubes);
        buttonClubes.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                     startActivity(new Intent(MainActivity.this,ClubeActivity.class));
                };

            }
        );
        buttonPartida.setOnClickListener(new View.OnClickListener(){
                 @Override
                 public void onClick(View v){
                     startActivity(new Intent(MainActivity.this,PartidaActivity.class));
                 };

             }
        );

    }
}
