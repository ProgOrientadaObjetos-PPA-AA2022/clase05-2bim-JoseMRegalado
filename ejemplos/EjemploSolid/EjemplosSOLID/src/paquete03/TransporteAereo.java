/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteAereo {
    private String Aerolinea;
    private double tarifa;
    
    public void establecerAerolinea(String n){
        Aerolinea = n;
    }
    
    public void establecerTarifa(){
        tarifa = 100.00 + (80*0.05);
    }
    
    public String obtenerAerolinea(){
        return Aerolinea;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
