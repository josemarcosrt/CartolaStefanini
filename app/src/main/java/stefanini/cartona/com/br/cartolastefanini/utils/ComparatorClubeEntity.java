package stefanini.cartona.com.br.cartolastefanini.utils;

import java.util.Comparator;

import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class ComparatorClubeEntity implements Comparator<ClubeEntity> {
    public int compare(ClubeEntity p1,ClubeEntity p2) {
        return  Integer.valueOf(p1.getPosicao()) <  Integer.valueOf(p2.getPosicao()) ? -1 : ( Integer.valueOf(p1.getPosicao()) >  Integer.valueOf(p2.getPosicao()) ? +1 : 0);
    }
}

