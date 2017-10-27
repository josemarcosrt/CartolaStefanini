package stefanini.cartona.com.br.cartolastefanini;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
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
import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

public class ClubeActivity extends AppCompatActivity { //FragmentActivity

    private static final String TAG = "ClubeActivity";
    ListView listaDeClubes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//protected
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubes);


        //startActivity(new Intent(MainActivity.this,LoginActivity.class));
        /*
        List<ClubeEntity> listaClubes = new ArrayList();
        ClubeEntity clube7 = new ClubeEntity();
        clube7.setNome("Corinthians");
        clube7.setPosicao("1");
        ClubeEntity clube1 = new ClubeEntity();
        clube1.setNome("Gremio");
        clube1.setPosicao("2");
        ClubeEntity clube3 = new ClubeEntity();
        clube3.setNome("santos");
        clube3.setPosicao("3");
        ClubeEntity clube4 = new ClubeEntity();
        clube4.setNome("palmeiras");
        clube4.setPosicao("4");
        ClubeEntity clube5 = new ClubeEntity();
        clube5.setNome("fluminense");
        clube5.setPosicao("5");
        ClubeEntity clube6 = new ClubeEntity();
        clube6.setNome("santos");
        clube6.setPosicao("6");
        ClubeEntity clube2 = new ClubeEntity();
        clube2.setNome("Flamengo");
        clube2.setPosicao("7");
        ClubeEntity clube8 = new ClubeEntity();
        clube8.setNome("Vasco");
        clube8.setPosicao("8");
        ClubeEntity clube9 = new ClubeEntity();
        clube9.setNome("atletico");
        clube9.setPosicao("9");
        ClubeEntity clube10 = new ClubeEntity();
        clube10.setNome("botafogo");
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
        //System.out.println(listaClubes);
        Log.e(TAG,"---------------------- 10 PRIMEIROS CLUBES : -------------------------");

        List<ClubeEntity> clubesEntity = listaClubes;
        ListView listaDeClubes = (ListView) findViewById(R.id.listaViewClubes);
        //chamada da nossa implementação

        AdapterClube adapter = new AdapterClube(listaClubes,this);
        listaDeClubes.setAdapter(adapter);

         */

        //startActivity(new Intent(MainActivity.this,LoginActivity.class));

        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(CartolaService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        CartolaService service = retrofit.create(CartolaService.class);
        Call<CartolaCatalog> requestCartola =  service.listCartola(); //listCartola    service.listClubes();
        requestCartola.enqueue(new Callback<CartolaCatalog>() {
            @Override
            public  void onResponse(Call<CartolaCatalog> call, Response<CartolaCatalog> response){

                if(response.isSuccessful()){
                    Log.e(TAG,"---SUCESSO EM IMPRIMIR: ---");

                    CartolaCatalog catalog = response.body();


                    Map<Object, Object> mapClube = new HashMap<Object, Object>();
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


                    List<ClubeEntity> listaClubes = new ArrayList();


                    listaClubes.add(catalog.clubes.getFlamengo());
                    listaClubes.add(catalog.clubes.getBotafogo());
                    listaClubes.add(catalog.clubes.getCorinthians());
                    listaClubes.add(catalog.clubes.getBahia());
                    listaClubes.add(catalog.clubes.getFluminense());
                    listaClubes.add(catalog.clubes.getVasco());
                    listaClubes.add(catalog.clubes.getPalmeiras());
                    listaClubes.add(catalog.clubes.getSaoPaulo());
                    listaClubes.add(catalog.clubes.getAtleticoMg());
                    listaClubes.add(catalog.clubes.getCruzeiro());
                    listaClubes.add(catalog.clubes.getGremio());
                    listaClubes.add(catalog.clubes.getVitoria());
                    listaClubes.add(catalog.clubes.getSport());
                    listaClubes.add(catalog.clubes.getAtleticoPR());
                    listaClubes.add(catalog.clubes.getCoritiba());
                    listaClubes.add(catalog.clubes.getPontePreta());
                    listaClubes.add(catalog.clubes.getAvai());
                    listaClubes.add(catalog.clubes.getChapecoense());
                    listaClubes.add(catalog.clubes.getAtleticoGO());


                    Log.e(TAG,"---------------------- 10 PRIMEIROS CLUBES : -------------------------");
                    Comparator crescente1 = new ComparatorClubeEntity();
                    Comparator decrescente1 = Collections.reverseOrder(crescente1);
                    // Em ordem crescente do início do mandato
                    Collections.sort(listaClubes,crescente1);
                    System.out.println(listaClubes);
                    // Em ordem decrescente do fim do mandato
                    //Collections.sort(listaClubes, decrescente1);
                    //System.out.println(listaClubes);
                    Log.e(TAG,"---------------------- 10 PRIMEIROS CLUBES : -------------------------");




                    List<ClubeEntity> clubesEntity = listaClubes;
                    ListView listaDeClubes = (ListView) findViewById(R.id.listaViewClubes);
                    //chamada da nossa implementação

                    AdapterClube adapter = new AdapterClube(listaClubes,ClubeActivity.this);
                    listaDeClubes.setAdapter(adapter);




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

    public class TesteUsuario{
        private int id;
        private String nome;
        private String sexo;

        public TesteUsuario(int id, String nome, String sexo) {
            this.id = id;
            this.nome = nome;
            this.sexo = sexo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
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