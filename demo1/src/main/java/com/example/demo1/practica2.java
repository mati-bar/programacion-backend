package com.example.demo1;

public class practica2 {
    public static boolean esMayordeEdad(int edad) {
        return edad >= 18;
    }


    public static void main(String[] args) {
        System.out.println(String.valueOf(esMayordeEdad(18)));
        System.out.println("es mayor? "+ esMayordeEdad(18));


    }
}