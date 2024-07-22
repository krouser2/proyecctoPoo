package modelo;

public class Empleado extends Persona{
    private double sueldoBase;
    private int horas;
    private double porcentajeBono;
    private int numEmpleado;
    private String areaTrabajo;
    private String puesto;

    public Empleado() {
        horas = 0;
        porcentajeBono = 0.0;
        sueldoBase = 200;
        numEmpleado = 0;
        areaTrabajo = "Informatica";
        estatus = true;
        puesto = "En proceso";
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            Contacto contacto, double sueldoBase, int horas, String curp, int numEmpleado,String puesto) {
        super(nombre, apellidoPaterno, apellidoMaterno, direccion, contacto,curp);
        this.sueldoBase = sueldoBase;
        this.horas = horas;
        this.numEmpleado = numEmpleado;
        this.puesto = puesto;
    }

    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public void setPorcentajeBono(double porcentajeBono){
        this.porcentajeBono = porcentajeBono;
    }
    public double getPorcentajeBono(){
        return porcentajeBono;
    }
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    public double generarSueldo(){
        return (sueldoBase * horas) + (sueldoBase * horas * porcentajeBono);
    }

    public void generaID() {
        String areaAbrev = areaTrabajo.length() >= 3 ? areaTrabajo.substring(0, 3) : areaTrabajo;
        this.id = areaAbrev.toUpperCase() + numEmpleado;
    }
    
    @Override
    public String toString() {
        return super.toString() +
        "\n----Datos del Empleado----"+"\n"+
        "Sueldo Base: "+ sueldoBase + "\n"+
        "Porcentaje Bono: " + porcentajeBono+"\n"+
        "Sueldo:"+this.generarSueldo()+"\n";
    }

    
}
