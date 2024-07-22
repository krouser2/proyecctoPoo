package vista;

import java.util.Scanner;

public class VistaRegistro {

    private Scanner sc;

    public VistaRegistro() {
        sc = new Scanner(System.in);
    }

    // Métodos de entrada de datos
    public String solicitarString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine(); // Leer toda la línea de entrada
    }

    public char solicitarChar(String msg) {
        System.out.println(msg);
        String input = sc.nextLine().toLowerCase(); // Leer toda la línea y convertir a minúsculas
        return input.isEmpty() ? ' ' : input.charAt(0); // Manejar posibles entradas vacías
    }

    public String solicitarSexo() {
        char op;
        do {
            op = solicitarChar("Opciones: a) Macho, b) Hembra");
            if (op != 'a' && op != 'b') {
                System.out.println("Error: opción no válida. Inténtalo de nuevo.");
            }
        } while (op != 'a' && op != 'b');

        return (op == 'a') ? "Macho" : "Hembra";
    }

    public int solicitarInt(String msg) {
        System.out.println(msg);
        int entero = sc.nextInt();
        sc.nextLine();
        return entero;
    }

    public long solicitarLong(String msg) {
        System.out.println(msg);
        long numero =  sc.nextLong();
        sc.nextLine();
        return numero;
    }

    public double solicitarDouble(String msg) {
        System.out.println(msg);
        double numero = sc.nextDouble();
        sc.nextLine();
        return numero;
    }

    public boolean solicitarEstatus() {
        char op;
        do {
            op = solicitarChar("Estado de la mascota? \n a) Activo \n b) Inactivo");
            if (op != 'a' && op != 'b') {
                System.out.println("Error: opción no válida. Inténtalo de nuevo.");
            }
        } while (op != 'a' && op != 'b');

        return (op == 'a');
    }

    public String solicitarAreaTrabajo() {
        String[] opciones = { "Informatica", "Administracion" };
        System.out.println("Opciones de área de trabajo:");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ") " + opciones[i]);
        }

        int op = solicitarInt("Selecciona una opción:");
        if (op < 1 || op > opciones.length) {
            return "Default";
        }
        return opciones[op - 1];
    }

    public String solicitarCurp(String msg) {
        String curp;
        do {
            curp = solicitarString(msg);
            if (curp.length() != 18) {
                System.out.println("CURP inválido. Inténtalo de nuevo...");
            }
        } while (curp.length() != 18);
        return curp;
    }

    public String solicitarPuesto(String area) {
        int op = 0;
        String puesto = " ";
        if (area.equalsIgnoreCase("informatica")) {
            op = solicitarInt("1)Junior\n2)Middle\n3)Senior");
            switch (op) {
                case 1:
                    puesto = "junior";
                    break;
                case 2:
                    puesto = "middle";
                    break;
                case 3:
                    puesto = "senior";
                    break;
            }
        }else{
            puesto = "administrador";
        }
        return puesto;
    }

    // Métodos para la salida de datos
    public void mostrarReporte(String reporte) {
        System.out.println(reporte);
    }

    

}
