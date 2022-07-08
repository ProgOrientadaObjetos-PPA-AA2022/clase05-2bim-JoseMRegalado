/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteMaritimo extends Transporte{
    private String nombre;
    private double tarifa;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTarifa(){
        tarifa = 1000.00 + (20*0.05);
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Transporte Maritimo\n"
                + "Valor Tarifa: %.2f", tarifa);

        return cadena;
    }
}
