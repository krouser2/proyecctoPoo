package modelo;
public class Direccion {
    private int noCasa;
    private int codigoPostal;
    private String calle;
    private String colonia;
    private String municipio;
    private String ciudad;

    public Direccion() {
        noCasa = 0;
        codigoPostal = 0;
        calle = "calle";
        colonia = "colonia";
        municipio = "municipio";
        ciudad = "ciudad";
    }
    
    public int getNoCasa() {
        return noCasa;
    }
    public void setNoCasa(int noCasa) {
        this.noCasa = noCasa;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return 
        "\n---Datos de Direccion---"+"\n"+
        "Numero de Casa: " + noCasa + "\n"+
        "Calle: " + calle + "\n"+ 
        "Colonia : "+ colonia + "\n"+
        "Codigo Postal : "+ codigoPostal + "\n"+
        "Municipio: " + municipio + "\n"+
        "Ciudad: " + ciudad + "\n";
    }

    
}
