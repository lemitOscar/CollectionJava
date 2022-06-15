package org.kranki.section2LasListas.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CapOchoArraylist {

    public static void main(String[] args) {
        //crear una arraylist
        List<String> listaColores = new ArrayList<>();

        //creacion mediante la clase arrays
        String[] nombres = {"oscar", "karla", "raul", "mario"};
        List<String> listaDeNombres = Arrays.asList(nombres);

        //agregar elementos al array
        listaColores.add("amar");
        listaColores.add("verde");
        listaColores.add("azul");
        listaColores.add("naranja");

        //construir una lista apartir de otra lista
        List<String> otherList = new ArrayList<>(listaColores);

        //agregar element de otra collection
        otherList.addAll(listaDeNombres);

        //imprimir todas las listas
        System.out.println("lista de nombres -------");
        listaDeNombres.forEach(System.out::println);
        System.out.println("lista colores ----------");
        listaColores.forEach(System.out::println);
        System.out.println("lista que le add otra lista -----------");
        otherList.forEach(System.out::println);

        //iterar a partir de un iterator
        ListIterator<String> iterator = listaColores.listIterator();

        System.out.println("iterando con wh ------");
        while (iterator.hasNext()) {
            System.out.println("color " + iterator.next());
        }

        System.out.println("lo voy a recorrer alreves ----");
        while (iterator.hasPrevious()) {
            System.out.println("color " + iterator.previous());
        }

        //eliminar un element of list
        System.out.println("eliminando un elemento -----");
        while (iterator.hasNext()) {
            if (iterator.next().equals("amar")) {
                iterator.remove();
            }
        }

        /*ESTO ES MUY IMPORTANTE AQUI HAY UNA ESPECIE DE BUG
         * SI VUELVO A USAR UN WHILE PARA RECORRER LA LISTA QUE YA SE MODIFICO
         * DARA SIEMPRE UN FALSO Y NO ENTRARA EN LA CONDICION PORQUE EL CICLO
         * SABE QUE YA NO TIENE NADA POR LO TANTO DE UN FALSE
         *
         * HAY QUE USAR UNA ALTERNATIVA COMO LO ES UN FOR
         * */
        System.out.println("recorriendo la lista sin el amarillo");
        for (ListIterator<String> i = listaColores.listIterator(); i.hasNext(); ) {
            System.out.println("color " + i.next());
        }

    }
}
