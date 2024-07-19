package servicio;

import modelo.Empleado;

public class EmpleadoServicio {
    public static double generarBono(Empleado empl){
        Empleado emp = empl;
        double porcentajeBono = 0.0;
        if(emp.getHoras() > 48){
            porcentajeBono = 0.2;
        }else{
            porcentajeBono = 0.0;
        }
        return porcentajeBono;
    }
}
