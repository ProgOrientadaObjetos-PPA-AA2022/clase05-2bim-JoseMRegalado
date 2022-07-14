
package paquete10;


public class Principal3 {
    public static void main(String[] args) {
        String nombreArchivo = "datos/generadores.dat";
        ArchivoLectura archivol = new ArchivoLectura(nombreArchivo);
        archivol.establecerGeneradores();
        System.out.printf("%s",archivol.toString());
        archivol.cerrarArchivo();
    }
}
