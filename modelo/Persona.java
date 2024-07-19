package modelo;
public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Direccion direccion;
    protected Contacto contacto;
    private String curp;

    public abstract void generaID();

    public Persona() {
        id= " ";
        nombre = "fulanito";
        apellidoPaterno="Vargas";
        apellidoMaterno="Torres";
        direccion = new Direccion();
        contacto = new Contacto();
        curp = "";
    }
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            Contacto contacto, String curp) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.contacto = contacto;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Contacto getContacto() {
        return contacto;
    }
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    public String getID(){
        return id;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }
    public String getCurp(){
        return curp;
    }
    
    public void validaCurp(String curp){
        if(curp.length() == 18){
            System.out.println("\n....Curp Verificado....\n");
        }
        this.curp = curp;
    }

    @Override
    public String toString() {
        return 
        "---Datos Generales---"+"\n"+
        "Nombre: " + nombre + "\n"+
        "Apellido Paterno: " + apellidoPaterno + "\n"+ 
        "Apellido Materno: "+ apellidoMaterno + "\n"+ 
        "Curp: " + curp + "\n" +
        direccion + "\n"+ 
        contacto + "\n";
    }

    
}
