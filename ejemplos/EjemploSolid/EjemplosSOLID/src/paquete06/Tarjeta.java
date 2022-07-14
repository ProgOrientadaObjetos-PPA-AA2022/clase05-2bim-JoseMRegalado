
package paquete06;

public class Tarjeta {
    private String nombre;
    private double cupoMaximo;

    public Tarjeta(String n, double cm) {
        nombre = n;
        cupoMaximo = cm;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerCupoMaximo(double n) {
        cupoMaximo = n;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }
    
}
