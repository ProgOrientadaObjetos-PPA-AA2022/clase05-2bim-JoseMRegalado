
package paquete10;

public class Principal2 {
    public static void main(String[] args) {
        String nombreArchivo = "datos/generadores.dat";
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.printf("%s%s\n",gp.obtenerUrl(), api);
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2);
        
        System.out.println("---------------------------");
        
        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("123455");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.printf("%s%s\n",gp.obtenerUrl(), api3);
        
        System.out.println("---------------------------");
        
        APIDirectvGo api4 = new APIDirectvGo();
        api4.establecerApiKey("123455");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerRegistro(gp);
        archivo.establecerRegistro(gp2);
        archivo.establecerRegistro(gp3);
        archivo.establecerRegistro(gp4);
        
    }
}
