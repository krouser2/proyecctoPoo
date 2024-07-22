package modelo;

public class Cliente extends Persona {

    private int numCliente;
    private int mesRegistro;
    private int añoRegistro;

    public Cliente() {

    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            Contacto contacto, String curp, int numCliente, int mesRegistro, int añoRegistro) {
        super(nombre, apellidoPaterno, apellidoMaterno, direccion, contacto, curp);
        this.añoRegistro = añoRegistro;
        this.mesRegistro = mesRegistro;
        this.numCliente = numCliente;
    }

    

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getMesRegistro() {
        return mesRegistro;
    }

    public void setMesRegistro(int mesRegistro) {
        this.mesRegistro = mesRegistro;
    }

    public int getAñoRegistro() {
        return añoRegistro;
    }

    public void setAñoRegistro(int añoRegistro) {
        this.añoRegistro = añoRegistro;
    }
    /* GenerarId */
    public void generaID() {
        // Formatear los números para tener siempre dos dígitos para mes y año
        String mesFormateado = String.format("%02d", mesRegistro);
        String añoFormateado = String.format("%04d", añoRegistro);
    
        // Crear el ID concatenando los valores y separando con guiones
        this.id = numCliente + "-" + mesFormateado + "-" + añoFormateado;
    }

    @Override
    public String toString() {
        return "\n" + super.toString();
    }

}
