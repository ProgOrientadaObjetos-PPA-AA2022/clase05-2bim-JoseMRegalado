
package paquete10;
import java.io.*;
import java.util.ArrayList;
public class ArchivoEscritura {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> generadoresP;
    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        establecerListaGeneradores();

        try {

            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerGeneradores().size() > 0) {
                for (int i = 0; i < obtenerGeneradores().size(); i++) {
                    establecerRegistro(obtenerGeneradores().get(i));
                    establecerSalida();
                }
            }

        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistro(GeneradorPeliculas g) {
        registro = g;
    }
        public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }
    
        public void establecerListaGeneradores() {
        ArchivoLectura l =  new ArchivoLectura(obtenerNombreArchivo());
        l.establecerGeneradores();
        generadoresP = l.obtenerGeneradores();
    }



    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerGeneradores() {
        return generadoresP;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
    
}
