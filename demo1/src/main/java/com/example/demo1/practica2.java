package com.example.demo1;


import java.util.Scanner;

public class practica2 {
    public static boolean esMayordeEdad(int edad) {
        return edad >= 18;
    }
    public static double calcularDescuento(double precio, double porcentaje) {
        return precio = precio - (precio * porcentaje / 100);
    }

    public static Categoria categoria(int edad) {
    if  (edad < 13) {
        return Categoria.NIÑO;
    }
    else if (edad < 18) {
        return  Categoria.ADOLESCENTE;
    }
    else {
        return Categoria.ADULTO;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese su edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Es mayor de edad? " + esMayordeEdad(edad));
            System.out.println("Categoria: " + categoria(edad));
            System.out.println("Ingrese el precio: ");
            double precio = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese porcentaje: ");
            double porcentaje = Integer.parseInt(sc.nextLine());
            System.out.println("El Precio con descuento es: " + calcularDescuento(precio, porcentaje) );



//        System.out.println("es mayor? "+ esMayorEdad(18));
//        System.out.println(calcularDescuento(1000 , 20));
//        System.out.println(categoria(12));
//        System.out.println(categoria(17));
//        System.out.println(categoria(18));

    }

}

