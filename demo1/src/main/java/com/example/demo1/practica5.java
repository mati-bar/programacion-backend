package com.example.demo1;

import java.util.ArrayList;

public class practica5 {


    public static double promedio(ArrayList<Double> notas) {
        if (notas.isEmpty()) return 0.0;

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public static int aprobados(ArrayList<Double> notas) {
        int contador = 0;
        for (double nota : notas) {
            if (nota >= 6.0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(4.0);
        notas.add(6.0);
        notas.add(2.5);
        notas.add(9.0);
        notas.add(7.5);

        System.out.println("--- Detalle de Notas ---");
        for (int i = 0; i < notas.size(); i++) {
            double nota = notas.get(i);
            String estado = (nota >= 6.0) ? "aprobado" : "desaprobado";
            System.out.println("Nota " + (i + 1) + ": " + nota + " - " + estado);
        }

        System.out.println("\n--- Resumen Final ---");
        System.out.println("Promedio general: " + promedio(notas));
        System.out.println("Total de aprobados: " + aprobados(notas));
    }
}
