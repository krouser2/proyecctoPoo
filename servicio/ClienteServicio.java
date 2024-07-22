package servicio;

import modelo.Cliente;

import modelo.Persona;

public class ClienteServicio {
    public static String busquedaCliente(Persona[] arr, String nombre) {
        String clienteBuscado = "";
        for (Persona persona : arr) {

            if (persona instanceof Cliente) {
                Cliente cli = (Cliente) persona;
                if (nombre.equalsIgnoreCase(cli.getNombre())) {
                    clienteBuscado = cli.toString();
                    break;
                } else {
                    clienteBuscado = "Cliente inexistente";
                }
            }
        }
        return clienteBuscado;
    }

}
