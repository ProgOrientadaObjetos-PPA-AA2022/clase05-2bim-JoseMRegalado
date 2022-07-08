/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Persona est1 = new Persona("Jose", 20);
        Persona est2 = new Persona("Sebastián", 21);
        Persona est3 = new Persona("Sofía", 22);

        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(est1);
        listado.add(est2);
        listado.add(est3);

        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
        operaciones.establecerPromedioEdadesCualitativo();
        System.out.println(operaciones);
    }
}
