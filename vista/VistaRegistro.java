package vista;
import java.util.Scanner;

public class VistaRegistro {

    private Scanner sc;

    public VistaRegistro() {
        sc = new Scanner(System.in);
    }

    // Los metodos de la vista son para entradas de datos

    public String solicitarString(String mensaje) {
        System.out.println(mensaje);
        return sc.next().toLowerCase();

    }
    public char solicitarChar(String msg){
        System.out.println(msg);
        return sc.next().toLowerCase().charAt(0);
    }

    public int solicitarInt(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public long solicitarLong(String msg){
        System.out.println(msg);
        return sc.nextLong();
    }

    public double solicitarDouble(String msg){
        System.out.println(msg);
        return sc.nextDouble();
    }

    public boolean solicitarEstatus() {
        System.out.println("Estado de la mascota? \n");
        System.out.println("a)Activo");
        System.out.println("b)Inactivo");
        
        char op = sc.next().toLowerCase().charAt(0);
        do {
            if(op != 'a' && op != 'b'){
                System.out.println("Error opcion no definida intentalo de nuevo");
                System.out.println("Estado de la mascota? \n");
                System.out.println("a)Activo\n");
                System.out.println("b)Inactivo\n");
                op = sc.next().toLowerCase().charAt(0);
            }
        } while (op != 'a' && op != 'b');

        if (op == 'a') {
            return true;
        } else {
            return false;
        }
    }
    public void liberarBuffer(){
        sc.nextLine();
    }
    /*Metodos para la salida de datos*/
    public void mostrarReporte(String reporte) {
        System.out.println(reporte);
    }
}
