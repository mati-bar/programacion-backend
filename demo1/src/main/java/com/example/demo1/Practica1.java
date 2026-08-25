package com.example.demo1;

public class Practica1 {
    public static void main(String[] args) {
    String nombre = "Mati";
    int edad = 23;
    double altura = 1.74;
    boolean inscripto = true;

    double peso = 90;

    double imc = peso / (altura * altura);
    System.out.printf("IMC: %.2f%n", imc);

    String edadTexto = String.valueOf(edad);
    System.out.println("Tengo " + edadTexto + " años");

    }
}

