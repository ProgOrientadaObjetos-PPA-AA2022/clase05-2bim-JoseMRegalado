/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private ArrayList<Transporte> transportes; // puedo tener muchos tipos de Transporte
    
    
    public void establecerTransportes(ArrayList<Transporte> t){
        transportes = t;
    }
    
    public ArrayList<Transporte> obtenerTransportes(){
        return transportes;
    }
    
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Reporte de Transportes\n");

        for (int i = 0; i < obtenerTransportes().size(); i++) {
            cadena = String.format("%s\n%s",
                    cadena,
                    transportes);
        }
        cadena = String.format("%s\nPromedio Tarifas: %.2f\n",
                cadena, promedioTarifas);
        return cadena;
    }
    
}
