
package stefanini.cartona.com.br.cartolastefanini.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.adapter.PartidaAdapter;
import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;
import stefanini.cartona.com.br.cartolastefanini.interfaces.CartolaService;
import stefanini.cartona.com.br.cartolastefanini.services.ServicePartidas;

/**
 * Created by josemarcosramosteixeira on 11/1/17.
 */


public class PartidaActivity extends AppCompatActivity { //FragmentActivity

    private static final String TAG = "PartidaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patidas);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CartolaService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CartolaService service = retrofit.create(CartolaService.class);
        Call<CartolaCatalog> requestClubes = service.listCartola();
        requestClubes.enqueue(new Callback<CartolaCatalog>() {
            @Override
            public void onResponse(Call<CartolaCatalog> call, Response<CartolaCatalog> response) {

                if (response.isSuccessful()) {
                    CartolaCatalog catalog = response.body();

                    ServicePartidas servicePartidas = ServicePartidas.getInstancia();                               // SINGLETON SERVICOS PARTIDAS
                    Map<String, ClubeEntity> mapClube = servicePartidas.popularMapClubles(catalog);                 // POPULAR MAPA COM CODIGO E CLUBE
                    List<PartidaEntity> listaPartidas = servicePartidas.popularListPartidas(catalog, mapClube);     // POPULA LISTA DE PARTIDAS
                    listaPartidas = servicePartidas.ordenaListPartidas(listaPartidas);                              // ORDENA AS PARTIDAS PELO CRITÉRIO DE DATA HORA

                    //ListView listaDePartidas = (ListView) findViewById(R.id.listaPartidas);
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerPartidas); // CHAMA O RECYCLE PARA EXIBICAO
                    recyclerView.setAdapter(new PartidaAdapter(listaPartidas,PartidaActivity.this));
                    RecyclerView.LayoutManager layout = new LinearLayoutManager(PartidaActivity.this, LinearLayoutManager.VERTICAL, false);
                    recyclerView.setLayoutManager(layout);

                } else {
                    Log.e(TAG, "----------------------ERRO EM IMPRIMIR: -------------------------");
                    Log.e(TAG, "Erro:" + response.code());
                }
            }
            @Override
            public void onFailure(Call<CartolaCatalog> call, Throwable t) {
                Log.e(TAG, "Erro:" + t.getMessage());
            }
        });

    }

}
