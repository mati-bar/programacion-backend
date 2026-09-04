package com.example.demo1.mates;

public class Empleado  extends Persona {
    private String cargo;
    protected double salario;

    public Empleado(String nombre, int edad, String direccion, double salario, String cargo){
        super(nombre, edad, direccion);
        this.salario = salario;
        this.cargo = cargo;
    }
    public void trabajar(){
        System.out.println(nombre + " esta trabajando. ");
    }
}