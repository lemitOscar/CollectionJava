package org.kranki.Mapas;

import java.util.HashMap;
import java.util.Map;

public class MapJugadores {
    public static void main(String[] args) {
        //k,v
        Map<String, String> map = new HashMap<>();
        map.put("nami", "one piece");
        map.put("Chopper", "one piece");
        map.put("Goku", "dragon");
        map.put("picoro", "dragon");
        map.put("gohan", null);

        //a;adir un valor ausente
        //solo funciona si esta nulo y nomas se puede hacer una vez
        map.putIfAbsent("gohan", "dragon");
        System.out.println("el team gohan es usando get: "+map.get("gohan"));
        //obtener un valor que no esta
        String person = map.getOrDefault("zoro","no esta usando default");
        System.out.println(person);
        //saber si hay una key en el mapa
        if (map.containsKey("nami")) {
            System.out.println("si esta usando contains key");
        }else{
            System.out.println("no esta");
        }

        int c=0;
        if (map.containsValue("one piece")){
            c++; //no funciona solo encuentra el primero
            System.out.println(c + " usando containsvalue");
        }

        //obtener todas las llaves
        System.out.println(map.keySet() + " usando keyset");
        System.out.println(map.values() + " usando values");

        //remplazar valores de un mapa
        map.replace("picoro", "dragon ball");
        System.out.println(map.values() + " usando replace y luego values");

        //eliminar k y vw
        map.remove("picoro");
        System.out.println(map.values() + " usando remove");

        //aglunas formas de iteracion

    }
}
