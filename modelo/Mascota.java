package modelo;
public class Mascota{
    private String nombre;
    private String nombreDueño;
    private String tipo;
    private String sexo;
    private String raza;
    private boolean estatus;

    public Mascota(){
        nombre = "pupy";
        nombreDueño = "fulanito";
        tipo = "perro";
        sexo = "macho";
        raza = "pastor aleman";
        estatus = true;
    }

    public Mascota(String nombre, String nombreDueño, String tipo,String sexo,String raza, boolean estatus){
        this.nombre = nombre;
        this.nombreDueño = nombreDueño;
        this.tipo = tipo;
        this.sexo = sexo;
        this.raza = raza;
        this.estatus = estatus;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombreDueño(String nombreDueño){
        this.nombreDueño = nombreDueño;
    }
    public String getNombreDueño(){
        return nombreDueño;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setEstatus(boolean estatus){
        this.estatus = estatus;
    }
    public boolean getEstatus(){
        return estatus;
    }
    @Override 
    
    public String toString(){
        return "Mascota\n"+
        "Nombre: " + nombre+"\n"+ 
        "Nombre del dueño: " + nombreDueño + "\n"+ 
        "Tipo de Mascota: " + tipo + "\n" + 
        "Sexo de la mascota: " + sexo + "\n"+ 
        "Raza de la mascota: " + raza +"\n"+ 
        "Estatus: " + (estatus ? "Activo" : "Inactivo") +"\n";
    }
}