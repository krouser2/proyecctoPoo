import java.util.Scanner;

import controlador.ControladorPersonas;
import controlador.ControladorMascota;

import vista.VistaRegistro;

public class Main {
    public static void main(String[] args) {
        
        VistaRegistro vista = new VistaRegistro();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la opción: 1. Registro de Empleados/Cliente, 2. Registro de Mascota");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            ControladorPersonas controladorCliente = new ControladorPersonas(vista);
            controladorCliente.ejecutar();
            
        } else if (opcion == 2) {
            ControladorMascota controlador = new ControladorMascota(vista);
            controlador.ejecutar();
        } else if(opcion == 3) {
            System.out.println("Opción no válida");
        }
        sc.close();
    }
}
