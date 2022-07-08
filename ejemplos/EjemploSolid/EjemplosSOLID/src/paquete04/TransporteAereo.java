/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteAereo extends Transporte{
    private String aerolinea;
    
    
    public void establecerAerolinea(String n){
        aerolinea = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 100 + (80*0.05);
    }
    
    
    public String obtenerAerolinea(){
        return aerolinea;
    }
    @Override
    public String toString() {
        String cadena = String.format("Transporte Aereo\n"
                + "Valor Tarifa: %.2f", tarifa);

        return cadena;
    }
}
