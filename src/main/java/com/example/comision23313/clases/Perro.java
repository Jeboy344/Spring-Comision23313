package com.example.comision23313.clases;

public class Perro extends Animal{

    public Perro(){
        this.tipo = "Perro";
    }

    public Perro(String nombre, String raza, int edad, String color, String tipo) {
        super(nombre, raza, edad, color, tipo);
    }

    @Override //Anoación
    public String moverse(){
        return "El perro comienza a correr";
    }

    //UN METODO O FUNCION SE DIVIDE EN DOS PARTES:
    //1 firma (va desde el modificador del metodo hasta los parametros)
    //2 cuerpo( es lo que esta entre llaves {})

    // Sobrecarga del método moverse (tener 2 metodos con el mismo nombre,
    // pero diferente firma)
    public String moverse(int cantPatas){
        return "";
    }

}
