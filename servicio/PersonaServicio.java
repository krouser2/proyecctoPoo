package servicio;
import modelo.Empleado;
import modelo.Persona;

public class PersonaServicio {
    public static String generarReporte(Persona[] arr){
        String listaEmpleado = "Lista de Empleados\n\n";
        for(Persona persona : arr){
            if(persona instanceof Empleado){
                Empleado emp = (Empleado) persona;
                listaEmpleado += emp+"\n";
            }
        }
        return listaEmpleado;
    }

  
}

