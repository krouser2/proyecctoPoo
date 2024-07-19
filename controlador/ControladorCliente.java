package controlador;

import modelo.Contacto;
import modelo.Direccion;
import modelo.Empleado;
import modelo.Persona;
import servicio.EmpleadoServicio;
import servicio.PersonaServicio;
import vista.VistaRegistro;

public class ControladorCliente {
    private VistaRegistro vista;

    public ControladorCliente(VistaRegistro vista) {
        this.vista = vista;
    }

    public void ejecutar(){
        int cantidadRegistros = vista.solicitarInt("Cuantos registros: ");
        Persona[] personas = new Persona[cantidadRegistros];
        for (int i = 0; i< personas.length;i++){
            
            char opcion = vista.solicitarChar("a)Empleado\nb)Cliente");
            switch (opcion) {
                case 'a':
                    Empleado empleado = new Empleado();
                    empleado.setNombre(vista.solicitarString("Nombre: "));
                    empleado.setApellidoPaterno(vista.solicitarString("Apellido Paterno: "));
                    empleado.setApellidoMaterno(vista.solicitarString("Apellido Materno: "));
                    //Inicializamos un objeto de la clase contacto
                    Contacto contacto = new Contacto();
                    contacto.setTelefonoFijo(vista.solicitarLong("Telefono Fijo: "));
                    contacto.setTelefonoMovil(vista.solicitarLong("Telefono Movil: "));
                    contacto.setCorreoElectronico(vista.solicitarString("Correo Electronico: "));
                    empleado.setContacto(contacto);
                    //Inicializamos el objeto de la clase direccion
                    Direccion direccion = new Direccion();
                    direccion.setNoCalle(vista.solicitarInt("Numero de Casa: "));
                    direccion.setCalle(vista.solicitarString("Calle: "));
                    direccion.setColonia(vista.solicitarString("Colonia: "));
                    direccion.setCodigoPostal(vista.solicitarInt("Codigo Postal: "));
                    direccion.setMunicipio(vista.solicitarString("Municipio: "));
                    direccion.setCiudad(vista.solicitarString("Ciudad: "));
                    empleado.setDireccion(direccion);
                    //Atributos del empleado
                    vista.liberarBuffer();
                    empleado.setHoras(vista.solicitarInt("Horas Trabajadas: "));
                    empleado.setSueldoBase(vista.solicitarDouble("Sueldo Base: "));
                    empleado.setPorcentajeBono(EmpleadoServicio.generarBono(empleado));
                    //Agregamos el objeto al arreglo
                    personas[i] = empleado;

                    break;
                case 'b':

                    break;
                default:
                    break;
            }
            String reporte = PersonaServicio.generarReporte(personas);
            System.out.println();
            vista.mostrarReporte(reporte);
        }

    }
}
