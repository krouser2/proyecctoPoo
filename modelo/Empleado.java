package modelo;

public class Empleado extends Persona{
    private double sueldoBase;
    private int horas;
    private double porcentajeBono;
    private int numEmpleado;
    private String areaTrabajo;

    public Empleado() {
        horas = 0;
        porcentajeBono = 0.0;
        sueldoBase = 200;
        numEmpleado = 0;
        areaTrabajo = "Informatica";
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            Contacto contacto, double sueldoBase, int horas, String curp, int numEmpleado) {
        super(nombre, apellidoPaterno, apellidoMaterno, direccion, contacto,curp);
        this.sueldoBase = sueldoBase;
        this.horas = horas;
        this.numEmpleado = numEmpleado;
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
    public double generarSueldo(){
        return (sueldoBase * horas + sueldoBase * porcentajeBono);
    }
    public void generaID(){
        this.id = areaTrabajo.charAt(0)+areaTrabajo.charAt(1)+areaTrabajo.charAt(2)+numEmpleado+"";        
    }
    @Override
    public String toString() {
        return super.toString() +
        "----Datos del Empleado----"+"\n"+
        "Sueldo Base: "+ sueldoBase + "\n"+
        "Sueldo:"+this.generarSueldo()+"\n";
    }
}
