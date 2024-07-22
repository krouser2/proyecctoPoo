package controlador;

import modelo.Mascota;
import servicio.MascotaServicio;
import vista.VistaRegistro;

public class ControladorMascota {
    VistaRegistro vista;

    public ControladorMascota(VistaRegistro vista) {
        this.vista = vista;
    }

    public void ejecutar() {

        Mascota[] mascotas = registrarMascota();

        // Solicitamos las opciones que tenemos
        
        char opc = ' ';
        do{
            int op = vista.solicitarInt("Que quieres hacer?\n1)Actualizar\n2)Mostrar\n3)Buscar");
            switch (op) {
                case 1:
                    actualizarMascota(mascotas);
                    break;
                case 2:
                    mostrarMascotas(mascotas);
                    break;
                case 3:
                    buscarMascota(mascotas);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            opc = vista.solicitarChar("Continuar? Si/No");
        }while( opc == 's');
        
    }

    private void buscarMascota(Mascota[] mascotas) {
        String nombreMascota = vista.solicitarString("Nombre de la mascota:");
        String reporte = MascotaServicio.consultarMascota(mascotas, nombreMascota);
        vista.mostrarReporte(reporte);
    }

    private void mostrarMascotas(Mascota[] mascotas) {
        String reporte = MascotaServicio.generarReporte(mascotas);
        System.out.println();
        vista.mostrarReporte(reporte);
    }

    private Mascota[] registrarMascota() {
        int cantidadRegistros = vista.solicitarInt("Cuantas Mascotas Registraras");
        Mascota[] mascotas = new Mascota[cantidadRegistros];
        /* llenamos el arreglo de las mascotas */
        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i] = leerMascota(i);
        }
        return mascotas;
    }

    private Mascota actualizarMascota(Mascota[] mascotas) {
        Mascota nuevaMascota = new Mascota();
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
            char op = vista.solicitarChar("deseas actualizar este objeto? si/no");
            if (op == 's') {
                nuevaMascota = leerCambiosMascota(mascota);
                break;
            }
        }
        return nuevaMascota;
    }

    private Mascota leerMascota(int i) {
        Mascota mascota = new Mascota();
        mascota.setNombre(vista.solicitarString("Nombre de la mascota "+(i+1)+"?  "));
        mascota.setNombreDueño(vista.solicitarString("Nombre del dueño?  "));
        mascota.setTipo(vista.solicitarString("Tipo de mascota?  "));
        mascota.setRaza(vista.solicitarString("Raza de la mascota?  "));
        mascota.setSexo(vista.solicitarSexo());
        mascota.setColor(vista.solicitarString("Color de la mascota?  "));
        mascota.setTalla(vista.solicitarDouble("Talla de la mascota en cm?  "));
        mascota.setPeso(vista.solicitarDouble("Peso de la mascota?"));
        System.out.printf("\n");
        return mascota;
    }

    private Mascota leerCambiosMascota(Mascota mascota) {
        mascota.setTalla(vista.solicitarDouble("Talla de la mascota?  "));
        mascota.setPeso(vista.solicitarDouble("Peso de la mascota?  "));
        return mascota;
    }

}
