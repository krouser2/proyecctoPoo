package servicio;

import modelo.Empleado;
import modelo.Persona;

public class EmpleadoServicio {
    public static double generarBono(Empleado empl){
        double porcentajeBono = 0.0;
        if(empl.getHoras() > 48){
            porcentajeBono = 0.2;
        }else{
            porcentajeBono = 0.0;
        }
        return porcentajeBono;
    }

    public static double generarSueldo(Empleado emp,String puesto){
        double sueldo = 0.0;
        switch (puesto.toLowerCase()) {
            case "junior":
                sueldo = 32.45;
                break;
            case "middle":
                sueldo = 40.5;
                break;
            case "senior":
                sueldo = 74.5;
                break;
            case "administrador":
                sueldo = 41.63;
                break;
            default:
                sueldo = 0.0;
                break;
        }
        return sueldo;
    }

    public static String consultarEmpleado(Persona[] arr, String nombre){
        String nombreaBuscar = "";
        for (Persona persona : arr) {
            if(persona instanceof Empleado){
                Empleado empleado = (Empleado) persona;
                if(empleado.getNombre().equalsIgnoreCase(nombre)){
                    nombreaBuscar = empleado.toString();
                    break;
                }else{
                    System.out.println("Empleado inexistente\n");
                }
            }
        }
        return nombreaBuscar;
    }
}
