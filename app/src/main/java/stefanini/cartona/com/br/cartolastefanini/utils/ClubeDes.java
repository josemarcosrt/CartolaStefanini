package stefanini.cartona.com.br.cartolastefanini.utils;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class ClubeDes implements JsonDeserializer{


    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement clube = json.getAsJsonObject();

        if(json.getAsJsonObject().get("ClubeEntity") != null){
            clube = json.getAsJsonObject();
        }

        return (new Gson().fromJson(clube,ClubeEntity.class));
    }
}
