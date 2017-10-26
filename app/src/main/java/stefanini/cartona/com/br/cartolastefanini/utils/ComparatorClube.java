package stefanini.cartona.com.br.cartolastefanini.utils;

import java.util.Comparator;

import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */


public class ComparatorClube implements Comparator {
    boolean crescente = true;
    public ComparatorClube(boolean crescente) {
        this.crescente = crescente;
    }
    public int compare(Object o1, Object o2) {
        PartidaEntity p1 = (PartidaEntity) o1;
        PartidaEntity p2 = (PartidaEntity) o2;
        if (crescente) {
            //return p1.getPartida_data() < p2.getPartida_data() ? -1 : (p1.getPartida_data() > p2.getPartida_data() ? +1 : 0);
            return 0;
        } else {
            //return p1.getPartida_data() < p2.getPartida_data() ? +1 : (p1.getPartida_data() > p2.getPartida_data() ? -1 : 0);
            return 1;
        }
    }
}
