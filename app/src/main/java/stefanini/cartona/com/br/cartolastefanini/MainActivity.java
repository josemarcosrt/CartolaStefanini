package stefanini.cartona.com.br.cartolastefanini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.adapter.AdapterClube;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.resources.BuscarClubesAsync;

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
/*

//        List teste = new ArrayList();
//        ClubeEntity clube1 = new ClubeEntity();
//        clube1.setNomeClube("Vasco");
//        clube1.setPosicao("7");
//        ClubeEntity clube2 = new ClubeEntity();
//        clube2.setNomeClube("Palmeiras");
//        clube2.setPosicao("8");
//
//        teste.add(clube1);
//        teste.add(clube2);
//
//
//        //List<ClubeEntity> clubes = todosOsCursos();
//        List<ClubeEntity> clubes = teste;
//        listaDeCursos = (ListView) findViewById(R.id.listViewMain);
//        //chamada da nossa implementação
//        AdapterClube adapter = new AdapterClube(clubes, this);
//        listaDeCursos.setAdapter(adapter);


//        BuscarClubesAsync async = new BuscarClubesAsync(this, new BuscarClubesAsync.onResponseRetofitListenner()
//                @Override
//                public void responseBuscarClubes(List<ClubeEntity> responseBuscarClubes){
//                    for(ClubeEntity c:responseBuscarClubes){
//                        Log.i(BuscarClubesAsync.TAG,c.getNomeClube());
//                    }
//                }
//        });
//        async.execute();

//        Log.e(TAG,"---------------------- SINCRONA : -------------------------");
//        BuscarClubesAsync async = new BuscarClubesAsync(this);
//        async.execute();
//        Log.e(TAG,"---------------------- FIM SINCRONA : -------------------------");


public class MainActivity extends AppCompatActivity {
    Button button;

    String json_url = "http://api.cartolafc.globo.com/partidas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.bn);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, json_url ,(String) null,
                       new Response.Listener<JSONObject>(){

                           @Override
                           public void onResponse(JSONObject response){
                               Toast.makeText(MainActivity.this,"all alright", Toast.LENGTH_SHORT).show();
            //                         try{
            //                            Name.setText(response.getString("Name"))
            //                            Name.setText(response.getString("Email"))
            //                            Name.setText(response.getString("Mobile"))
            //                        }catch (JSONException e){
            //                            e.printStackTrace();
            //                        }

                           }
                       },new Response.ErrorListener(){

                           @Override
                           public void onErrorResponse(VolleyError error){
                               Toast.makeText(MainActivity.this,"something went wrong", Toast.LENGTH_SHORT).show();
                           }

               });
               MySinglenton.getInstance(MainActivity.this).addToRequestque(jsonObjectRequest);

           }

        });

    }
}

 */