package stefanini.cartona.com.br.cartolastefanini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.adapter.AdapterClube;
import stefanini.cartona.com.br.cartolastefanini.adapter.AdapterPartida;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.ExemploEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;
import stefanini.cartona.com.br.cartolastefanini.utils.ClubeDes;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Formatar a data
import java.text.SimpleDateFormat;
import android.provider.ContactsContract.Contacts.Data;
import java.util.HashMap;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import android.widget.Toast;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import java.lang.reflect.Type;

import java.io.IOException;

import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

import java.util.Iterator;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */


public class PartidaActivity extends AppCompatActivity { //FragmentActivity

    private static final String TAG = "PartidaActivity";
    ListView listaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//protected
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patidas);



        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl("https://api.cartolafc.globo.com/") //.baseUrl(CartolaService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CartolaService service = retrofit.create(CartolaService.class);
        Call<CartolaCatalog> requestClubes =  service.listCartola();
        requestClubes.enqueue(new Callback<CartolaCatalog>() {
            @Override
            public  void onResponse(Call<CartolaCatalog> call, Response<CartolaCatalog> response){

                if(response.isSuccessful()){
                    Log.e(TAG,"---SUCESSO EM IMPRIMIR: ---");

                    CartolaCatalog catalog = response.body();


                    Log.e(TAG,"--- TESTANDO JSON: ---");
                    //Log.e(TAG, "CATALOGO CLUBE  " + String.format(": %s ",catalog.toString()));
                    Log.e(TAG, "CATALOGO PARTIDAS  " + String.format(": %s ",catalog.partidas));
                    Log.e(TAG, "CATALOGO CLUBE  " + String.format(": %s ",catalog.clubes.getVasco()));
                    Log.e(TAG, "CATALOGO RODADA  " + String.format(": %s ",catalog.rodada));
                    Log.e(TAG,"--- TESTANDO JSON: ---");



                    Map<String, Object> mapClube = new HashMap<String, Object>();
                    System.out.println("============ MAP TIME   ================");
                    mapClube.put("362",catalog.clubes.getFlamengo());
                    mapClube.put("263",catalog.clubes.getBotafogo());
                    mapClube.put("264",catalog.clubes.getCorinthians());
                    mapClube.put("265",catalog.clubes.getBahia());
                    mapClube.put("266",catalog.clubes.getFluminense());
                    mapClube.put("267",catalog.clubes.getVasco());
                    mapClube.put("275",catalog.clubes.getPalmeiras());
                    mapClube.put("363",catalog.clubes.getSaoPaulo());
                    mapClube.put("282",catalog.clubes.getAtleticoMg());
                    mapClube.put("283",catalog.clubes.getCruzeiro());
                    mapClube.put("284",catalog.clubes.getGremio());
                    mapClube.put("287",catalog.clubes.getVitoria());
                    mapClube.put("292",catalog.clubes.getSport());
                    mapClube.put("293",catalog.clubes.getAtleticoPR());
                    mapClube.put("294",catalog.clubes.getCoritiba());
                    mapClube.put("303",catalog.clubes.getPontePreta());
                    mapClube.put("314",catalog.clubes.getAvai());
                    mapClube.put("315",catalog.clubes.getChapecoense());
                    mapClube.put("373",catalog.clubes.getAtleticoGO());
                    System.out.println(mapClube.get("363"));
                    System.out.println("========================================");
                    ClubeEntity clubeEntity = new ClubeEntity();
                    clubeEntity = (ClubeEntity) mapClube.get("363");
                    System.out.println(clubeEntity.nome);
                    System.out.println("========================================");
                    //ClubeEntity clubeEntity = new ClubeEntity();
                    clubeEntity = (ClubeEntity) mapClube.get("362");
                    System.out.println(clubeEntity.nome);
                    System.out.println("========================================");



                    List<PartidaEntity> listaPartidas = new ArrayList();
                    ClubeEntity clube = new ClubeEntity();

                    for(PartidaEntity p : catalog.partidas) {
                        PartidaEntity partida = new PartidaEntity();

                        /*
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        String dataString = p.getPartida_data(); //  <= sua data no formato de String;
                        try {
                            Date date = formatter.parse(dataString); //Data
                            SimpleDateFormat out = new SimpleDateFormat("dd-MM-yyyy");
                            String result = out.format(date);
                            partida.setPartida_data(result);

                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        */

                        partida.setPartida_data(p.getPartida_data());
                        partida.setLocal(p.getLocal());

                        partida.setClube_casa_id(p.getClube_casa_id()); //clubeEntity.getAbreviacao()
                        partida.setClube_visitante_id(p.getClube_visitante_id());



                        listaPartidas.add(partida);
                        Log.e(TAG, "CLUBE CASA X VISITANTE " + String.format(" %s X %s ",p.getClube_casa_id(),p.getClube_visitante_id()));

                        String id;
                        id = (String) p.getClube_casa_id();


                        Log.e(TAG, "partida.getClube_casa_id()   %s " +partida.getClube_casa_id());


                        clube = (ClubeEntity) mapClube.get(partida.getClube_casa_id());
                        Log.e(TAG, "CLUBE "+clube);

                        /*
                        clubeEntity = (ClubeEntity) mapClube.get(partida.getClube_casa_id()); //clubeEntity = (ClubeEntity) mapClube.get("362");
                        Log.e(TAG, "CLUBE "+clubeEntity);
                        clubeEntity = (ClubeEntity) mapClube.get("363");
                        Log.e(TAG, "CLUBE " + String.format(" %s %s",clubeEntity.nome,clubeEntity.getAbreviacao()));
                        */
                    }




                    ListView listaDePartidas = (ListView) findViewById(R.id.listaPartidas);
                    //chamada da nossa implementação
                    AdapterPartida adapter1 = new AdapterPartida(listaPartidas,PartidaActivity.this);
                    listaDePartidas.setAdapter(adapter1);


                    Log.e(TAG,"--SUCESSO EM IMPRIMIR: ---");
                }else{
                    Log.e(TAG,"----------------------ERRO EM IMPRIMIR: -------------------------");
                    Log.e(TAG,"Erro:"+response.code());
                }

            }

            @Override
            public  void onFailure(Call<CartolaCatalog> call, Throwable t){
                Log.e(TAG,"Erro:"+t.getMessage());
            }
        });

    }

}



















/*

 Gson gsonConverter = new GsonBuilder().registerTypeAdapter(ClubeEntity.class, new ClubeDes())
                .create();


                    //String jsonString = {"id": 1, "nome": Raphael, "sexo": M}{"id": 2, "nome": teste, "sexo": M};

                    String resposta1 = "{'Codigo': 2,'Descricao': 'Sem dados no perÃ­odo'}";
                    System.out.println(resposta1);
                    try {
                        JSONObject jsonObj = new JSONObject(resposta1);
                        JSONArray parentArray = jsonObj.getJSONArray("clubes");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    //JSONObject jsonObject = new JSONObject();
                    //jsonObject.keys();
                    //JSONObject jsonObject = new JSONObject();
                    */


//JSONObject parentObject = new JSONObject(catalog);

//ArrayList<ExemploEntity> exampleList = new ArrayList<>();
//JSONObject jsonObject = new JSONObject(catalog);
                    /*


                    Log.e(TAG,"--- TESTANDO JSON: ---");
                    Log.e(TAG, "PARTIDAS " + String.format(" =  %s: ",catalog.partidas));
                    for(Partida c : catalog.partidas) {
                        Log.e(TAG, "partida clube_casa_posicao " + String.format(" =  %s: ", c.clube_casa_posicao));
                    }
                    Log.e(TAG, "CLUBES " + String.format(" =  %s: ",catalog.clubes));
                    Log.e(TAG, "RODADA " + String.format(" =  %s: ",catalog.rodada));

                    Log.e(TAG,"--- TESTANDO JSON: ---");


                    */




/*

 //final CartolaService services =  retrofit.create(CartolaService.class);
        //           Map<String, Object> map = new TreeMap<String, Object>();
         //           Object obj = map.get("262");
//                    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//                    logging.setLevel(Level.BASIC);
//                    OkHttpClient client = new OkHttpClient.Builder()
//                            .addInterceptor(logging)
//                            .build();
                    //Log.e(TAG, "CATALOGO CLUBE TreeMap  " + String.format("%s :",obj));




                if(response.isSuccessful()){
                        Log.e(TAG,"---SUCESSO EM IMPRIMIR: ---");

                        CartolaCatalog catalog = response.body();



//                    Type type = new TypeToken<Map<String, ClubeEntity>>(){}.getType();
//                    Map<String, ClubeEntity> myMap = new Gson().fromJson(catalog.toString(), type);

//                    if(response.body()!=null{
//
//                          JsonObject jsonObject =response.body();
//                          if(response.code() == 200){
//                                  if(jsonObject.has("clubes"){
//                                    JsonArray dataArray = jsonObject.getAsJsonArray();
//                                    if (dataArray.size() > 0) {
//                                        Toast.makeText(getApplicationContext(), "Response Called", Toast.LENGTH_LONG);
//                                    }
//                                  }
//                          }
//                      }


//                    if(response.body()!=null{
//                        JsonObject jsonObject= response.body();
//                        if(response.code() == 200){
//                            if(jsonObject.has("payload"){
//                                JsonArray dataArray = jsonObject.getAsJsonArray(HAS_DATA);
//                                if (dataArray.size() > 0) {
//                                    Toast.makeText(getApplicationContext(),"Response Called", Toast.LENGTH_LONG);
//
//                                    //your further code
//
//                                }
//                            }
//                        }
//                    }

                        //Log.e(TAG, "CLUBE  " + String.format("%s :",myMap.toString()));

                        Log.e(TAG,"--SUCESSO EM IMPRIMIR: ---");
                        }else{
                        Log.e(TAG,"----------------------ERRO EM IMPRIMIR: -------------------------");
                        Log.e(TAG,"Erro:"+response.code());
                        }

*/

//        abrNomeMandante.setText(partida.getClube_casa_id());
//        abrNomeVisitante.setText(partida.getClube_visitante_id());
//        datahorario.setText(partida.getPartida_data());
//        local.setText(partida.getLocal());
//startActivity(new Intent(MainActivity.this,LoginActivity.class));

    /*
        List<PartidaEntity> listaPartidas = new ArrayList();
        PartidaEntity partida1 = new PartidaEntity();
        partida1.setClube_casa_id("1");
        partida1.setClube_visitante_id("10");
        partida1.setLocal("Maracanã");
        partida1.setPartida_data("12/05/2017");

        PartidaEntity partida2 = new PartidaEntity();
        partida2.setClube_casa_id("1");
        partida2.setClube_visitante_id("10");
        partida2.setLocal("Maracanã");
        partida2.setPartida_data("13/05/2017");

        PartidaEntity partida3 = new PartidaEntity();
        partida3.setClube_casa_id("1");
        partida3.setClube_visitante_id("10");
        partida3.setLocal("Maracanã");
        partida3.setPartida_data("11/05/2017");


        listaPartidas.add(partida1);
        listaPartidas.add(partida2);
        listaPartidas.add(partida3);



        List<PartidaEntity> clubesEntity = listaPartidas;
        ListView listaDePartidas = (ListView) findViewById(R.id.listaPartidas);
        //chamada da nossa implementação
        AdapterPartida adapter = new AdapterPartida(listaPartidas,this);
        listaDePartidas.setAdapter(adapter);
 */