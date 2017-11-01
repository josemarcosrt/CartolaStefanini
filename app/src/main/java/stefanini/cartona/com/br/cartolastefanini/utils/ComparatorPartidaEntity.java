package stefanini.cartona.com.br.cartolastefanini.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;


/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class ComparatorPartidaEntity implements Comparator<PartidaEntity> {

    // Comparator para ordenacao de datas
    public int compare(PartidaEntity p1, PartidaEntity p2) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        java.util.Date data1 = null;
        java.util.Date data2 = null;
        try {
            data1 = sdf.parse(p1.getPartida_data());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            data2 = sdf.parse(p2.getPartida_data());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return verificaDatas(data1,data2);
    }
    // Auxiliar o Comparator para ordenacao de datas
    public int verificaDatas(java.util.Date data1, java.util.Date data2) {
        int valor;
        if (data1.before(data2)) {
            valor = -1;
        } else if (data2.after(data1)) //data1.after(data2)
            valor = 1;
        else
            valor = 0;
        return valor;
    }
}