package stefanini.cartona.com.br.cartolastefanini.resources;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stefanini.cartona.com.br.cartolastefanini.CartolaService;
import stefanini.cartona.com.br.cartolastefanini.Clube;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.interfaces.ClubeServices;

import retrofit2.Call;
import stefanini.cartona.com.br.cartolastefanini.utils.ClubeDes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */


public class BuscarClubesAsync extends AsyncTask<Void,Void,List<ClubeEntity>>{
    private Context context;
    public static  final String TAG = "RETROFIT";
    public ProgressDialog dialog;

    public onResponseRetofitListenner listenner;

    public BuscarClubesAsync(Context context, onResponseRetofitListenner listenner){
        this.context = context;
        this.listenner = listenner;
    }

    //@Override

    protected void onPreExecute(){
        //Codigo
        dialog = ProgressDialog.show(context,"Consumindo WebService","Aguarde uns segundo", true, true);
    }
    @Override

    protected List<ClubeEntity> doInBackground(Void... params) {
        //Codigo
        String baseurl = "https://api.cartolafc.globo.com/partidas";

        Gson gsonConverter = new GsonBuilder().registerTypeAdapter(ClubeEntity.class, new ClubeDes())
                .create();

        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(CartolaService.BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create(gsonConverter))
                .build();

        final ClubeServices services =  retrofit.create(ClubeServices.class);


        Call<List<ClubeEntity>> listaClubeServices = services.buscarTodos();

        try{
            List<ClubeEntity> listaClubeResponse = listaClubeServices.execute().body();
            return listaClubeResponse;
        }catch (IOException e){
            e.printStackTrace();
        }

//
//        listaClubeServices.enqueue(new Callback<List<ClubeEntity>>() {
//            @Override
//            public void onResponse(Call<List<ClubeEntity>> call, Response<List<ClubeEntity>> response) {
//
//                List<ClubeEntity> clubes = response.body();
//               //for(ClubeEntity p :clubes){
////                    Log.i(String.valueOf(TAG),p.getNomeClube());
//               //}
//
//            }
//
//            @Override
//            public void onFailure(Call<List<ClubeEntity>> call, Throwable t) {
//
//            }
//        });
       return null;
    }

    protected void onPostExecute(List<ClubeEntity> listaClubes){
        //Codigo
        listenner.responseClubes(listaClubes);
        dialog.dismiss();
    }
    protected void onProgressUpdate(Integer params){
        //Codigo
    }

    public interface onResponseRetofitListenner{
        public void responseClubes(List<ClubeEntity> response);
    }

}

/*
public class BuscarClubesAsync extends AsyncTask<Void,Void,Void >{
    private Context context;
    public static  final String TAG = "RETROFIT";

    public BuscarClubesAsync(Context context){
        this.context = context;
    }

    //@Override

    protected void onPreExecute(){
        //Codigo
    }
    @Override

    protected Void doInBackground(Void... params) {
        //Codigo
        String baseurl = "https://api.cartolafc.globo.com/partidas";

        Gson gsonConverter = new GsonBuilder().registerTypeAdapter(ClubeEntity.class, new ClubeDes())
                .create();

        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(CartolaService.BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create(gsonConverter))
                .build();

        ClubeServices services =  retrofit.create(ClubeServices.class);
        services.buscarTodos();

        Call<List<ClubeEntity>> listaClubeServices = services.buscarTodos();



        listaClubeServices.enqueue(new Callback<List<ClubeEntity>>() {
            @Override
            public void onResponse(Call<List<ClubeEntity>> call, Response<List<ClubeEntity>> response) {

                List<ClubeEntity> clubes = response.body();
               //for(ClubeEntity p :clubes){
//                    Log.i(String.valueOf(TAG),p.getNomeClube());
               //}

            }

            @Override
            public void onFailure(Call<List<ClubeEntity>> call, Throwable t) {

            }
        });


       return null;
    }

    protected void onPostExecute(Integer numero){
        //Codigo
    }
    protected void onProgressUpdate(Integer params){
        //Codigo
    }

}
 */
