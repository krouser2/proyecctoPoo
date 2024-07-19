package modelo;


public class Cliente extends Persona {
    
    private int numCliente;
    private int mesRegistro;
    private int añoRegistro;

    public Cliente(){
        
    }
    
    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            Contacto contacto, String curp, int numCliente, int mesRegistro, int añoRegistro) {
        super(nombre, apellidoPaterno, apellidoMaterno, direccion, contacto,curp);
        this.añoRegistro = añoRegistro;
        this.mesRegistro = mesRegistro;
        this.numCliente = numCliente;
    }

    /* GenerarId*/
    public void generaID(){
        this.id = numCliente + mesRegistro + añoRegistro + " ";
    }
    @Override
    public String toString(){
        return super.toString();
    }

}
