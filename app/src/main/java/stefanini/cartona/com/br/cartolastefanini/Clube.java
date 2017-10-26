package stefanini.cartona.com.br.cartolastefanini;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



import retrofit2.http.GET;
import retrofit2.http.Path;
/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        //"clubes",
        "clubes"
})
public class Clube {

    @JsonProperty("id")
    public String id;
    @JsonProperty("262")
    public String time262;
    @JsonProperty("263")
    public String time263;

    public Clube(String time262, String time263) {
        this.time262 = time262;
        this.time263 = time263;
    }

    public String getTime262() {
        return time262;
    }

    public void setTime262(String time262) {
        this.time262 = time262;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "time262=" + time262 +
                ", time263=" + time263 +
                '}';
    }

//    @JsonProperty("262")
//    public Time time262;
//    @JsonProperty("263")
//    public Time time263;
//
//    public Clube(Time time262, Time time263) {
//        this.time262 = time262;
//        this.time263 = time263;
//    }
//
//    public Time getTime262() {
//        return time262;
//    }
//
//    public void setTime262(Time time262) {
//        this.time262 = time262;
//    }
//
//    @Override
//    public String toString() {
//        return "Clube{" +
//                "time262=" + time262 +
//                ", time263=" + time263 +
//                '}';
//    }



    //@JsonProperty("clubes")
    //public List<String> 262;

    //@JsonProperty("nome")
    //public List<String> nome;

//    @JsonProperty("id")
//    public List<String> id;
//    @JsonProperty("nome")
//    public List<String> nome;

    //@JsonProperty("descricao")
    //public List<Descricao> descricao;

//    @JsonProperty("codico")
//    public String getCodico() {
//        return codico;
//    }
//    @JsonProperty("codico")
//    public void setCodico(String codico) {
//        this.codico = codico;
//    }
//
//    @JsonProperty("descricao")
//    public List<Descricao> getDescricao() {
//        return descricao;
//    }
//    @JsonProperty("descricao")
//    public void setDescricao(List<Descricao> descricao) {
//        this.descricao = descricao;
//    }
}
//Call<Endereço> getEndereco(@Path("cep") String cep);