
package paquete10;
import java.io.*;
import java.util.ArrayList;
public class ArchivoLectura {
    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> generadoresP;
    private String nombreArchivo;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerGeneradores() {
        generadoresP = new ArrayList<>();
        File f = new File(nombreArchivo);
        if (f.exists()) {

            while (true) {
                try {
                    GeneradorPeliculas generador = (GeneradorPeliculas) entrada.readObject();
                    generadoresP.add(generador);

                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                }
            }
        }

    }
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    public ArrayList<GeneradorPeliculas> obtenerGeneradores() {
        return generadoresP;
    }
    
     @Override
    public String toString() {
        String cadena = "Lista de Generadores de Peliculas\n";
        for (int i = 0; i < obtenerGeneradores().size(); i++) {
            GeneradorPeliculas p = obtenerGeneradores().get(i);
            cadena = String.format("%s(%d) %s\n", cadena,
                    i + 1,
                    p);
        }

        return cadena;
    }



    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
}
