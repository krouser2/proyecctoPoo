package modelo;
public class Contacto {
    private long telefonoFijo;
    private long telefonoMovil;
    private String correoElectronico;
    public Contacto() {
        telefonoFijo = 555555555;
        telefonoMovil = 555555555;
        correoElectronico = "coreo@correo.com";
    }
    public long getTelefonoFijo() {
        return telefonoFijo;
    }
    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    public long getTelefonoMovil() {
        return telefonoMovil;
    }
    public void setTelefonoMovil(long telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    @Override
    public String toString() {
        
        return 
        "\n---Datos de Contacto---"+"\n"+
        "Telefono Fijo: " + telefonoFijo + "\n"+
        "Telefono Movil: " + telefonoMovil + "\n"+ 
        "Correo Electronico: "+ correoElectronico + "\n";
    }
    
}
