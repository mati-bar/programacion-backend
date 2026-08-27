package com.example.demo1;

public class practica3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    int contador = 1;
    int total = 0;
    while (contador <= 100) {
        total += contador;
        contador++ ;
    }
    System.out.println("El total es: " + total);
    for(int edad = 1; edad <= 20; edad ++){
        String categoria;
        if (edad < 12) {
            categoria = "Niño/a";
        } else if (edad < 18) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto/a";
        }

        System.out.println("Edad " + edad + ": " + categoria);
    }
}
}
