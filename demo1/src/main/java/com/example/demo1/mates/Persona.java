package com.example.demo1.mates;

public class Persona {


    public String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad,String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;

    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void caminar() {
        
    }
}