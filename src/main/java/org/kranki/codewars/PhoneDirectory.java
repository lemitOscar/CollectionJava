package org.kranki.codewars;

import java.util.regex.Pattern;

public class PhoneDirectory {
    public static void main(String[] args) {

    }

    public static  String phone(String strng, String num) {
        String[] personas = strng.split("\n");//para separa a las personas
        int c = 0;
        String regCadena = "";
        for (String person : personas) {
            if(person.contains("+" + num)){
                c++;
            }
        }

        //si hay muchas
        if(c > 1){
            regCadena = "Error => Too many people: " + num;
            return regCadena;
        }
        //si no lo encontre
        if(c == 0){
            regCadena = "Error => Not found: " + num;
            return regCadena;
        }
        for (String person : personas) {
            if(person.contains(num)){

                person = person.replace("+" + num, "");
                String[] name = person.split(".*<|>.*");
                String nameCon ="";
                for (String s : name) {
                    nameCon += s;
                }
                person = person.replace("<" + nameCon + ">", "");

                person = person.replace(",", "").replace(";", "").replace("/", "").
                        replace(".\s", ".").replace("$\s", "").replace("*\s", "").
                        replace(":\s", "").replace("!", "").replace("?", "");

                person = person.replace("   ", " ").replace("  ", " ");

                person = person.replace("_", " ");
                person = person.trim();

                regCadena = "Phone => " + num + ", Name => " + nameCon + ", Address => " + person;
                System.out.println(regCadena);
            }

        }
        return regCadena;
    }
}
