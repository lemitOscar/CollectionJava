package org.kranki.codewars;

import java.util.*;
import java.util.stream.StreamSupport;

public class PairOfGloves {
    public static void main(String[] args) {
        //String[] gloves = {"red", "green", "red", "blue", "blue"};
        String[] gloves = {"red", "green", "blue", "blue", "orange", "black"};
        //llamar con un sout siempre
        System.out.println(PairOfGloves.numberOfPairs(gloves));
    }

    public static int numberOfPairs(String[] gloves) {
        // Sort the original array
        Arrays.sort(gloves);
        System.out.println("lista ordenada");
        for (String g : gloves) {
            System.out.print(g + " ");
        }
        int count = 0;
        for (int i = 0; i < gloves.length; i++) {
            for (int j = i + 1; j < gloves.length; j++) {
                //contar duplicados
                String guante = gloves[j];
                if (gloves[i].equals(guante)) {
                    count++;
                    if (i == 0) {
                        i = i + 2;
                        j++;
                    } else {
                        i = i + 2;
                        j++;
                    }
                }
            }
        }
        return count;

    }

}
