package stefanini.cartona.com.br.cartolastefanini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;
import android.widget.ListView;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

import stefanini.cartona.com.br.cartolastefanini.adapter.AdapterClube;
import stefanini.cartona.com.br.cartolastefanini.entity.ExemploEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.Example;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class ClubeActivity extends AppCompatActivity { //FragmentActivity

    private static final String TAG = "ClubeActivity";
    ListView listaDeClubes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//protected
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubes);


        //startActivity(new Intent(MainActivity.this,LoginActivity.class));
        List<ClubeEntity> listaClubes = new ArrayList();
        ClubeEntity clube7 = new ClubeEntity();
        clube7.setNomeClube("Corinthians");
        clube7.setPosicao("1");
        ClubeEntity clube1 = new ClubeEntity();
        clube1.setNomeClube("Gremio");
        clube1.setPosicao("2");
        ClubeEntity clube3 = new ClubeEntity();
        clube3.setNomeClube("santos");
        clube3.setPosicao("3");
        ClubeEntity clube4 = new ClubeEntity();
        clube4.setNomeClube("palmeiras");
        clube4.setPosicao("4");
        ClubeEntity clube5 = new ClubeEntity();
        clube5.setNomeClube("fluminense");
        clube5.setPosicao("5");
        ClubeEntity clube6 = new ClubeEntity();
        clube6.setNomeClube("santos");
        clube6.setPosicao("6");
        ClubeEntity clube2 = new ClubeEntity();
        clube2.setNomeClube("Flamengo");
        clube2.setPosicao("7");
        ClubeEntity clube8 = new ClubeEntity();
        clube8.setNomeClube("Vasco");
        clube8.setPosicao("8");
        ClubeEntity clube9 = new ClubeEntity();
        clube9.setNomeClube("atletico");
        clube9.setPosicao("9");
        ClubeEntity clube10 = new ClubeEntity();
        clube10.setNomeClube("botafogo");
        clube10.setPosicao("10");


        listaClubes.add(clube1);
        listaClubes.add(clube2);
        listaClubes.add(clube3);
        listaClubes.add(clube4);
        listaClubes.add(clube5);
        listaClubes.add(clube6);
        listaClubes.add(clube7);
        listaClubes.add(clube8);
        listaClubes.add(clube9);
        listaClubes.add(clube10);


        Log.e(TAG,"---------------------- 10 PRIMEIROS CLUBES : -------------------------");
        Comparator crescente1 = new ComparatorClubeEntity();
        Comparator decrescente1 = Collections.reverseOrder(crescente1);
        // Em ordem crescente do início do mandato
        Collections.sort(listaClubes,crescente1);
        System.out.println(listaClubes);
        // Em ordem decrescente do fim do mandato
        Collections.sort(listaClubes, decrescente1);
        System.out.println(listaClubes);
        Log.e(TAG,"---------------------- 10 PRIMEIROS CLUBES : -------------------------");

        List<ClubeEntity> clubesEntity = listaClubes;
        ListView listaDeClubes = (ListView) findViewById(R.id.listaViewClubes);
        //chamada da nossa implementação

        AdapterClube adapter = new AdapterClube(listaClubes,this);
        listaDeClubes.setAdapter(adapter);

        //startActivity(new Intent(MainActivity.this,LoginActivity.class));

        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(CartolaService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        CartolaService service = retrofit.create(CartolaService.class);
        Call<CartolaCatalog> requestCartola =  service.listCartola();

        requestCartola.enqueue(new Callback<CartolaCatalog>() {
            @Override
            public  void onResponse(Call<CartolaCatalog> call, Response<CartolaCatalog> response){

                if(response.isSuccessful()){
                    Log.e(TAG,"---SUCESSO EM IMPRIMIR: ---");

                    CartolaCatalog catalog = response.body();
                    //Log.e(TAG, "CATALOGO CLUBE  " + String.format(": %s ",catalog.clubes));
                    //Log.e(TAG, "CATALOGO RODADA  " + String.format(": %s ",catalog.rodada));
//                    String json = "{\n" +
//                            "   \"1\": \"name\",\n" +
//                            "   \"2\": \"example\",\n" +
//                            "   \"3\": \"loremipsum\",\n" +
//                            "   \"4\": \"etc\"\n" +
//                            "}";

                    //ArrayList<ExemploEntity> exampleList = new ArrayList<>();
//                    JSONObject jsonObject = new JSONObject(json);
//                    Iterator<String> iterator = jsonObject.keys();
//                    while(iterator.hasNext()) {
//                        Example example = new Example();
//                        String id = iterator.next();
//                        //example.id = Integer.parseInt(id);
//                        //example.value = jsonObject.getString(id);
//
//                        //exampleList.add(example);
//                    }


                    //for(Partida c : catalog.partidas) {
                    //    Log.e(TAG, "partida clube_casa_posicao " + String.format(" =  %s: ", c.clube_casa_posicao));
                    //}
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

    protected ArrayList<ExemploEntity> parseJson() throws JSONException {
        String json = "{\n" +
                "   \"1\": \"name\",\n" +
                "   \"2\": \"example\",\n" +
                "   \"3\": \"loremipsum\",\n" +
                "   \"4\": \"etc\"\n" +
                "}";

        ArrayList<ExemploEntity> exampleList = new ArrayList<>();
        JSONObject jsonObject = new JSONObject(json);
        Iterator<String> iterator = jsonObject.keys();
        while(iterator.hasNext()) {
            Example example = new Example();
            String id = iterator.next();
            //example.id = Integer.parseInt(id);
            //example.value = jsonObject.getString(id);

            //exampleList.add(example);
        }
        return exampleList;
    }




    class ComparatorClubeEntity implements Comparator<ClubeEntity> {
        public int compare(ClubeEntity p1,ClubeEntity p2) {
            return  Integer.valueOf(p1.getPosicao()) <  Integer.valueOf(p2.getPosicao()) ? -1 : ( Integer.valueOf(p1.getPosicao()) >  Integer.valueOf(p2.getPosicao()) ? +1 : 0);
        }
    }





}

































/*
 Log.e(TAG,"---------------------- PRESIDENTES ORDENADOS: -------------------------");
        List teste = new ArrayList();
        teste.add (new Presidente ("Luis Inacio", 2002, 2005));
        teste.add (new Presidente ("Fernando Henrique", 1998, 2001));
        teste.add (new Presidente ("Fernando Henrique", 1994, 1997));
        Comparator crescente = new ComparatorPresidente();
        Comparator decrescente = Collections.reverseOrder(crescente);
        // Em ordem crescente do início do mandato
        Collections.sort(teste,crescente);
        System.out.println(teste);
        // Em ordem decrescente do fim do mandato
        Collections.sort(teste, decrescente);
        System.out.println(teste);
        Log.e(TAG,"---------------------- PRESIDENTES ORDENADOS: -------------------------");

 */

 /*
    class Test126 {
        public static void main(String[] args) {
            List teste = new ArrayList();
            teste.add (new Presidente ("Luis Inacio", 2002, 2005));
            teste.add (new Presidente ("Fernando Henrique", 1998, 2001));
            teste.add (new Presidente ("Fernando Henrique", 1994, 1997));
            Comparator crescente = new ComparatorPresidente();
            Comparator decrescente = Collections.reverseOrder(crescente);
            // Em ordem crescente do início do mandato
            Collections.sort (teste, crescente);
            System.out.println (teste);
            // Em ordem decrescente do fim do mandato
            Collections.sort (teste, decrescente);
            System.out.println (teste);
        }
    }

      class Presidente {
        String nome;
        int inicio, fim;
        public Presidente(String n, int i, int f) {
            nome = n; inicio = i; fim = f;
        }
        public String toString() {
            return nome + ": de " + inicio + " até " + fim;
        }
    }

    class ComparatorPresidente implements Comparator<Presidente> {
        public int compare(Presidente p1,Presidente p2) {
            return p1.inicio < p2.inicio ? -1 : (p1.inicio > p2.inicio ? +1 : 0);
        }
    }
*/