package servicio;
import modelo.Mascota;

public class MascotaServicio {
    public static String generarReporte(Mascota[] arr) {  
        String listaPerros = "Listado Perros\n";  
        String listaGatos = "Listado Gatos:\n";          
        String listaOtros = "Listado otros:\n";          

        for(Mascota mas : arr) {  
            if(mas instanceof Mascota) {  
                Mascota ma = (Mascota)mas;  
                if(ma.getTipo().equalsIgnoreCase("perro")){
                    listaPerros += ma + "\n";
                }else if(ma.getTipo().equalsIgnoreCase("gato")){
                    listaGatos += ma + "\n";
                }else{
                    listaOtros += ma + "\n";
                }

            } 
        }  
        return listaPerros + "\n" + listaGatos + "\n" + listaOtros;  
    }  

    public static String consultarMascota(Mascota[] arr, String mascota){
        String nuevaMascota = "";
        for (Mascota mascot : arr) {
            if(mascot.getNombre().equalsIgnoreCase(mascota)){
                nuevaMascota = mascot.toString();
                break;
            }
        }
        return nuevaMascota;
    }
}
