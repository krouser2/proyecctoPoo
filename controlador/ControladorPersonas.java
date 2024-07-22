package controlador;

import modelo.Cliente;
import modelo.Contacto;
import modelo.Direccion;
import modelo.Empleado;
import modelo.Persona;
import servicio.ClienteServicio;
import servicio.EmpleadoServicio;
import servicio.PersonaServicio;
import vista.VistaRegistro;

public class ControladorPersonas {
    private VistaRegistro vista;

    public ControladorPersonas(VistaRegistro vista) {
        this.vista = vista;
    }

    /* Metodo principal del controlador */
    public void ejecutar() {
        Persona[] personas = registrarPersonas();
        int op = 0;
        do {
            op = vista.solicitarInt("Que quieres hacer?\n1)Actualizar\n2)Mostrar\n3)Buscar\n4)Salir");
            switch (op) {
                case 1:
                    actualizarPersona(personas);
                    break;
                case 2:
                    mostrarReporte(personas);
                    break;
                case 3:
                    buscarPersona(personas);
                    break;
                default:
                    System.out.println("Saliendo");
                    break;
            }
        } while (op != 4);
    }

    /* Metodo para registrar clientes y empleados en un areglo de personas */
    private Persona[] registrarPersonas() {
        int cantidadRegistros = vista.solicitarInt("¿Cuántos registros?");
        Persona[] personas = new Persona[cantidadRegistros];
        for (int i = 0; i < cantidadRegistros; i++) {
            char opcion = vista.solicitarChar("a) Empleado\nb) Cliente");
            personas[i] = (opcion == 'a') ? leerEmpleado() : leerCliente();
        }
        return personas;
    }

    /* Metodo para Buscar una persona ya sea cliente y empleado */
    private void buscarPersona(Persona[] personas) {
        int opcionBusqueda = vista.solicitarInt("¿A quién vas a buscar?\n1) Cliente\n2) Empleado");
        if (opcionBusqueda == 1) {
            String nombre = vista.solicitarString("Nombre del cliente:");
            String reporte = ClienteServicio.busquedaCliente(personas, nombre);
            vista.mostrarReporte(reporte);
        } else if (opcionBusqueda == 2) {
            String nombre = vista.solicitarString("Nombre del empleado:");
            String reporte = EmpleadoServicio.consultarEmpleado(personas, nombre);
            vista.mostrarReporte(reporte);
        } else {
            System.out.println("Opción no válida");
        }
    }

    /* Metodo para Mostrar la lista de clientes y Empleados */
    private void mostrarReporte(Persona[] personas) {
        String reporte = PersonaServicio.generarReporte(personas);
        vista.mostrarReporte(reporte);
    }

    /* Metodo para rdcogrt que se va a actualizar */

    private void actualizarPersona(Persona[] personas) {
        int opPersona = vista.solicitarInt("¿Qué vas a actualizar?\n1) Cliente\n2) Empleado");
        if (opPersona == 1) {
            actualizarCliente(personas);
        } else if (opPersona == 2) {
            actualizarEmpleado(personas);
        } else {
            System.out.println("Error: no existe esta opción");
        }
    }

    /* Metodo para actualizar el empleado */
    private Empleado actualizarEmpleado(Persona[] personas) {
        Empleado nuevoEmpleado = new Empleado();
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                
                Empleado empleado = (Empleado) persona;
                vista.mostrarReporte(empleado.toString());
                char op = vista.solicitarChar("deseas actualizar este Empleado? si/no");
                if (op == 's') {
                    nuevoEmpleado = leerCambiosEmpleado(empleado);
                    break;
                }  
            }
        }
        return nuevoEmpleado;
    }

    /* Metodo para actualizar el cliente */
    private Cliente actualizarCliente(Persona[] personas) {
        Cliente nuevoCliente = new Cliente();
        for (Persona persona : personas) {
            if (persona instanceof Cliente) {
                Cliente cliente = (Cliente) persona;
                System.out.println(cliente.toString());
                char op = vista.solicitarChar("deseas actualizar este cliente? si/no");
                if (op == 's') {
                    nuevoCliente = leerCambiosCliente(cliente);
                    break;
                }  
            }
        }
        return nuevoCliente;
    }

    /* Metodo para leer los datos del cliente */

    private Cliente leerCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre(vista.solicitarString("Nombre: "));
        cliente.setApellidoPaterno(vista.solicitarString("Apellido Paterno: "));
        cliente.setApellidoMaterno(vista.solicitarString("Apellido Materno: "));
        cliente.setCurp(vista.solicitarCurp("Curp del Cliente: "));
        // Contacto
        cliente.setContacto(leerContacto());
        // Direccion
        cliente.setDireccion(leerDireccion());
        // ID Cliente
        cliente.setNumCliente(vista.solicitarInt("Numero de Cliente"));
        cliente.setAñoRegistro(vista.solicitarInt("Año de Registro: "));
        cliente.setMesRegistro(vista.solicitarInt("Mes de Registro: "));
        return cliente;
    }

    private Cliente leerCambiosCliente(Cliente cliente) {
        System.out.println("---Actualizar Cliente---\n");
        char actualizarContacto = vista.solicitarChar("¿Deseas actualizar los datos de contacto? si/no");
        if (actualizarContacto == 's') {
            cliente.setContacto(leerContacto());
        }
    
        char actualizarDireccion = vista.solicitarChar("¿Deseas actualizar los datos de dirección? si/no");
        if (actualizarDireccion == 's') {
            cliente.setDireccion(leerDireccion());
        }
    
        return cliente;
    }

    /* Metodo para leer los datos del empleado */
    private Empleado leerEmpleado() {
        Empleado empleado = new Empleado();
        empleado.setNombre(vista.solicitarString("Nombre: "));
        empleado.setApellidoPaterno(vista.solicitarString("Apellido Paterno: "));
        empleado.setApellidoMaterno(vista.solicitarString("Apellido Materno: "));
        empleado.setCurp(vista.solicitarCurp("Ingresa el curp: "));
        empleado.setContacto(leerContacto());
        empleado.setDireccion(leerDireccion());
        empleado.setHoras(vista.solicitarInt("Horas Trabajadas: "));
        empleado.setPorcentajeBono(EmpleadoServicio.generarBono(empleado));
        empleado.setNumEmpleado(vista.solicitarInt("Numero de Empleado: "));
        empleado.setAreaTrabajo(vista.solicitarAreaTrabajo());
        empleado.setPuesto(vista.solicitarPuesto(empleado.getAreaTrabajo()));
        empleado.setSueldoBase(EmpleadoServicio.generarSueldo(empleado, empleado.getPuesto()));
        return empleado;
    }

    /* Metodo para leer los datos editables del empleado */
    private Empleado leerCambiosEmpleado(Empleado empleado) {
        System.out.println("\n--- Actualizar Empleado ---");
    
        char actualizarContacto = vista.solicitarChar("¿Deseas actualizar los datos de contacto? si/no");
        if (actualizarContacto == 's') {
            empleado.setContacto(leerContacto());
        }
    
        char actualizarDireccion = vista.solicitarChar("¿Deseas actualizar los datos de dirección? si/no");
        if (actualizarDireccion == 's') {
            empleado.setDireccion(leerDireccion());
        }
    
        char actualizarPuesto = vista.solicitarChar("¿Deseas actualizar el puesto del empleado? si/no");
        if (actualizarPuesto == 's') {
            System.out.println("puesto:");
            String nuevoPuesto = vista.solicitarPuesto(empleado.getAreaTrabajo());
            empleado.setPuesto(nuevoPuesto);
            double nuevoSueldoBase = EmpleadoServicio.generarSueldo(empleado, nuevoPuesto);
            empleado.setSueldoBase(nuevoSueldoBase);
        }
    
        return empleado;
    }
    
    /* Metodo para leer los datos de contacto */
    private Contacto leerContacto() {
        Contacto contacto = new Contacto();
        contacto.setCorreoElectronico(vista.solicitarString("Correo Electronico: "));
        contacto.setTelefonoFijo(vista.solicitarLong("Telefono Fijo: "));
        contacto.setTelefonoMovil(vista.solicitarLong("Telefono Movil: "));
        return contacto;
    }

    /* Metodo para leer los datos de direccion */
    private Direccion leerDireccion() {
        Direccion direccion = new Direccion();
        direccion.setNoCasa(vista.solicitarInt("Numero de casa: "));
        direccion.setCalle(vista.solicitarString("Calle: "));
        direccion.setCodigoPostal(vista.solicitarInt("Codigo Postal: "));
        direccion.setColonia(vista.solicitarString("Colonia: "));
        direccion.setMunicipio(vista.solicitarString("Municipio: "));
        direccion.setCiudad(vista.solicitarString("Ciudad: "));
        return direccion;
    }
}
