package com.example.cetakfoto;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoHelper<katalogFoto> {
    private static int[] ridArray = {
            R.drawable.doraemon1,
            R.drawable.crossing,
    };

    private static String[] filenameArray = {
            "doraemon1",
            "crossing"

    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for (int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i],filenameArray[i]));
        }

    }

    public static List<KatalogFoto> getKatalogFotoList() {

        return katalogFotoList;
    }
    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}
