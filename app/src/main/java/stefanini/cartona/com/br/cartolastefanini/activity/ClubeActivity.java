package stefanini.cartona.com.br.cartolastefanini.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.CartolaService;
import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class ClubeActivity  extends AppCompatActivity { //FragmentActivity

    private static final String TAG = "ClubeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {//protected
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patidas);

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
                    Log.e(TAG, "CATALOGO CLUBE  " + String.format("%s ",catalog.clubes));
                    Log.e(TAG, "CATALOGO RODADA  " + String.format("%s: ",catalog.rodada));

                    //for(Clube cd : catalog.clubes.numero) {

                    //}
                    for(PartidaEntity c : catalog.partidas) {
                        Log.e(TAG, "clube_casa_posicao" + String.format("%s: ", c));
                        Log.e(TAG, "clube_casa_posicao" + String.format("%s: ", c.clube_casa_posicao));
                    }
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


