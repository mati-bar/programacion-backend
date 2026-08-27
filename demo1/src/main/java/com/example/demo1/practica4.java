package com.example.demo1;

import java.util.ArrayList;

public class practica4 {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Matias");
        nombres.add("Daniel");
        nombres.add("Tami");
        nombres.add("Marti");
        nombres.add("Ana");
        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre.toUpperCase());
        }

        boolean contieneAna = nombres.contains("Ana");
        System.out.println("¿La lista contiene a Ana?: " + contieneAna);

        nombres.remove(1);
        System.out.println(nombres);


    }

}
