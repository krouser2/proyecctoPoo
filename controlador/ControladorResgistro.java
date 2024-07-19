package controlador;

import modelo.Mascota;
import servicio.MascotaServicio;
import vista.VistaRegistro;

public class ControladorResgistro {
    VistaRegistro vista; 

    public ControladorResgistro(VistaRegistro vista){
        this.vista = vista;
    }

    /*Metodo para ejecutar el controlador*/
    public void ejecutar(){
        /*Solicita la cantidad de registros*/
        int cantidadRegistros = vista.solicitarInt("Cuantas Mascotas Registraras");
        /*Declara el arreglo con los espacios necesarios*/
        Mascota[] mascotas = new Mascota[cantidadRegistros];
        /*llenamos el arreglo de las mascotas*/
        for(int i = 0; i < mascotas.length;i++){
            Mascota mascota = new Mascota();
            mascota.setNombre(vista.solicitarString("Nombre de la mascota? : "));
            mascota.setNombreDueño(vista.solicitarString("Nombre del dueño? : "));
            mascota.setTipo(vista.solicitarString("Tipo de mascota? : "));
            mascota.setRaza(vista.solicitarString("Raza de la mascota? : "));
            mascota.setSexo(vista.solicitarString("Sexo de la mascota? : "));
            mascota.setEstatus(vista.solicitarEstatus());
            mascotas[i] = mascota;
        }
        String reporte = MascotaServicio.generarReporte(mascotas);
        System.out.println();
        vista.mostrarReporte(reporte);
    }
}
