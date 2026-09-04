package com.example.demo1.mates;

import java.util.Scanner;

public class TomarMate {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int _cebadas = 0;
        System.out.println("Ingrese el numero de cebadas: "+"\n");
        _cebadas = entrada.nextInt();

        Mate m1 = new Mate(_cebadas, false);
        int salir = 1;

        while (salir!=0) {
            System.out.println("ingrese una opc: "+ "\n"+"1.cebar"+"\n"+"2.tomar"+"\n"+"3.salir"+"\n");
            salir = entrada.nextInt();
            switch(salir) {
                case 1:
                    m1.cebar();
                    break;
                case 2:
                    m1.beber();
                    break;
                case 3:
                    System.out.print("salio del programa");
                    salir = 0;
                    break;
                default :
                    System.out.print("la opc ingrs no existe "+"\n");
                    break;
        }





        }
    }
}
