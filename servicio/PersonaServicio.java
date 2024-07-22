package servicio;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Persona;

public class PersonaServicio {
    public static String generarReporte(Persona[] arr){
        String listaEmpleado = "Lista de Empleados: \n\n";
        String listaCliente = "Lista clientes: \n\n";
        for(Persona persona : arr){
            if(persona instanceof Empleado){
                Empleado emp = (Empleado) persona;
                listaEmpleado += emp+"\n";
            }
            if(persona instanceof Cliente){
                Cliente cli = (Cliente) persona;
                listaCliente += cli+"\n";
            }
        }
        return listaEmpleado + "\n" + listaCliente;
    }
}

