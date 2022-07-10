/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.*;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        // 1. Agragar por teclado n numeros de transportes
        //el usuario decide cuando termina
        //Bus, Taxi, Aereo, Maritimo
        //crear Tipos Transporte 
        //Presentar Reporte de transportes
        //Transporte bus: valor
        //Transporte maritimo: valor
        //Transporte bus: valor
        //promedio tarifas: valor
        int op;
        String continuar;
        ArrayList<Transporte> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerAerolinea("Avianca");
        aereo.establecerTarifa();

        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerNombre("ballenita");
        mar.establecerTarifa();

        do {

            System.out.println("Tipo de Transporte a ingresar\n"
                    + "Ingrese (1) para Transporte Aereo\n"
                    + "Ingrese (2) para Transporte Bus\n"
                    + "Ingrese (3) para Transporte Taxi\n"
                    + "Ingrese (4) para Transporte Maritimo\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    lista.add(aereo);
                    break;
                case 2:
                    lista.add(bus);
                    break;
                case 3:
                    lista.add(taxi);
                    break;
                case 4:
                    lista.add(mar);
                    break;
                default:
                    System.out.println("Error de opción, digite un"
                            + "número entre 1 y 4");
            }

            sc.nextLine();

            System.out.println("Desea ingresar más transportes. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");

            continuar = sc.nextLine();

        } while (continuar.equals("S"));

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.println("Reporte transportes: ");

        for (int i = 0; i < lista.size(); i++) {

            System.out.printf("\n"
                    + "%s\n",
                    lista.get(i));

        }
        System.out.printf("Promedio de tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());

    }
}
