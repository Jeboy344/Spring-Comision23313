package com.example.comision23313.clases;

public class Prueba {
    public static void main(String[] args) {
        //Todas las clases en java heredan de la Clase Object
        //System.out.println("Hola mundo");

        //|Instanciar una claae: dar forma a un molde
        /*
        Persona ruben = new Persona();
        //Construimos un objeto con valores iniciales
        Persona maria = new Persona("Maria", "Rosa", 23, 95992659);
        //Modificar la edad de maria a traves del metodo setter
        maria.setEdad(24);

        System.out.println(maria.getNombre() + " tiene "+ maria.getEdad()+ " años");
        //Le damos los valores al objeto
        ruben.setNombre("Ruben");

        ruben.saludar();

        //Generamos animales

        Animal perro1 = new Animal();
        perro1.setTipo("perro");

        Perro perro2 = new Perro("lolo", "chihuaha", 25, "marron", "perro");
        Gato gato1 = new Gato("Cleo", "lolo", 25);
        Pez pez = new Pez();

        System.out.println(perro2.moverse());
        System.out.println(gato1.moverse());
        System.out.println(pez.moverse());
        */

        Tamagotchi tama = new Tamagotchi(); //Crea tamagotchi
        tama.setNombre("Tom");
        tama.setEstado("Hambriento");
        //consulta estado
        System.out.println(tama.getEstado());
        //le damos de comer
        tama.comer();
        //después de comer
        System.out.println("Luego de comer, Tom está " + tama.getEstado());

    }
}
