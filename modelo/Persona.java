package modelo;
public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Direccion direccion;
    protected Contacto contacto;
    protected String curp;
    protected boolean estatus;        

    public abstract void generaID();

    public Persona() {
        id= " ";
        nombre = "fulanito";
        apellidoPaterno="Vargas";
        apellidoMaterno="Torres";
        direccion = new Direccion();
        contacto = new Contacto();
        curp = "";
        estatus = true;
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
    
    public String getCurp(){
        return curp;
    }
    
    
    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    


    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        String esta = estatus ? "Activo":"Inactivo";
        return 
        "---Datos Generales---"+"\n"+
        "Nombre: " + nombre.toUpperCase() + "\n"+
        "Apellido Paterno: " + apellidoPaterno.toUpperCase() + "\n"+ 
        "Apellido Materno: "+ apellidoMaterno.toUpperCase() + "\n"+ 
        "Curp: " + curp.toUpperCase() + "\n" +
        direccion + "\n"+ 
        contacto + "\n"+
        "Estatus: "+ esta + "\n" + "\n" ;
    }

    

    
}
