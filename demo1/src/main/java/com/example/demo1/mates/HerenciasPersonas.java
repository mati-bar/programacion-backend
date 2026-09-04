package com.example.demo1.mates;

public class HerenciasPersonas {
    public static void main(String[] args){
        Empleado emp1 = new Empleado("marcos",26,"Quintana 200",120000,"Administracion");
        emp1.trabajar();
        //emp1.getSalario();
        emp1.getNombre();
        emp1.getDireccion();
    }
}
