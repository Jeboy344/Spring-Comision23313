package com.example.comision23313.clases;

public class Animal {
    protected String nombre; //protected permite verlo desde las clases extendidas
    protected String raza;
    protected int edad;
    protected String color;
    protected String tipo; //Modificador de visibilñidad package: se puede ver  desde cualquier parte del package

    public Animal() {}

    public Animal(String nombre, String raza, int edad, String color, String tipo){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.tipo = tipo;
    }

public String moverse(){

    return switch (this.tipo) {
        /*case "Ave" -> "El animal vuela";
        case "Mamifero" -> "El animal camina";
        case "Reptil" -> "El animal se arrastra";
        case "Pez" -> "El animal nada";*/
        default -> "El animal se mueve";
    };

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
