package stefanini.cartona.com.br.cartolastefanini.controllers;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.adapter.ClubeAdapter;
import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.interfaces.CartolaService;
import stefanini.cartona.com.br.cartolastefanini.services.ServiceClubes;

public class ClubeActivity extends AppCompatActivity {

    private static final String TAG = "ClubeActivity";
    ServiceClubes serviceClubes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubes);


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

                    CartolaCatalog catalog = response.body();

                    ServiceClubes serviceClubes = ServiceClubes.getInstancia();                     //Singleton Service Clubes
                    List<ClubeEntity> listaClubes = serviceClubes.popularListClubles(catalog);      // POPULA LISTA DE CLUBES
                    listaClubes = serviceClubes.ordenaListClubles(listaClubes);                     // ORDENA CLUBES SEGUNDO SUA POSICAO NO CAMPEONATO

                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);         // CHAMA RECICLER
                    recyclerView.setAdapter(new ClubeAdapter(listaClubes,ClubeActivity.this));
                    RecyclerView.LayoutManager layout = new LinearLayoutManager(ClubeActivity.this,LinearLayoutManager.VERTICAL,false);
                    recyclerView.setLayoutManager(layout);

                }else{
                    Log.e(TAG,"----------------------ERRO EM IMPRIMIR: -------------------------");
                    Log.e(TAG,"Erro:"+response.code());
                    //Toast.makeText(ClubeActivity.this,response.code(), Toast.LENGTH_SHORT).show();
                }

            }
            @Override
            public  void onFailure(Call<CartolaCatalog> call, Throwable t){
                Log.e(TAG,"Erro:"+t.getMessage());
                //Toast.makeText(ClubeActivity.this,"Erro ao carregar os dados", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
//startActivity(new Intent(MainActivity.this,LoginActivity.class));