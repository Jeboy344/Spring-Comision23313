package com.example.comision23313.clases;

import java.util.Date;

public class Persona {
    //Caracteristicas de la clase persona
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;

    // private Date fechaNacimiento; // Constantres en java final Date FECHA_Nacimiento = new Date(Date.parse("2000-02-11 "));

    //Comportamientos - Métodos

    //Método constructor

    public Persona(){} //Constructor por defecto

    public Persona(String nombre, String apellido, int edad, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + " " + apellido);
    }

    //Getters(Devuelve el valor que se le dio a una var) || Setters(Guarda el valor que se le asigna a una var)

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
