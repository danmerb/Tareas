/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1apli;

/**
 *
 * @author Jeniffer
 */
class Datos {

    String nombre;
    int edad;
    int diacumpleanhio;
    int mescumpleanhio;
    int anhiocumpleanhio;
    String carrera;
    String correo;
    int telefono;

    public Datos(String nombre, int edad, int diacumpleanhio, int mescumpleanhio, int anhiocumpleanhio, String carrera, String correo, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.diacumpleanhio = diacumpleanhio;
        this.mescumpleanhio = mescumpleanhio;
        this.anhiocumpleanhio = anhiocumpleanhio;
        this.carrera = carrera;
        this.correo = correo;
        this.telefono = telefono;
    }

    
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Fecha de nacimiento: " + diacumpleanhio + "/" + mescumpleanhio + "/" + anhiocumpleanhio);
            System.out.println("Carrera: " + carrera);
            System.out.println("Correo: " + correo);
            System.out.println("Telefono: " + telefono);

    }
}

