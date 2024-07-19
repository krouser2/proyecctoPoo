import java.util.Scanner;

import controlador.ControladorCliente;
import controlador.ControladorResgistro;
import vista.VistaRegistro;

public class Main {
    public static void main(String[] args) {
        
        VistaRegistro vista = new VistaRegistro();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la opción: 1. Registro de Empleados, 2. Registro de Clientes");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            ControladorCliente controladorCliente = new ControladorCliente(vista);
            controladorCliente.ejecutar();
            
        } else if (opcion == 2) {
            ControladorResgistro controlador = new ControladorResgistro(vista);
            controlador.ejecutar();
        } else {
            System.out.println("Opción no válida");
        }
        sc.close();
    }
}
