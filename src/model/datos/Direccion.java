package model.datos;

public class Direccion {

    private String calle;
    private int numeroCalle;
    private String ciudad;
    private String region;

    public Direccion(String calle, int numeroCalle, String ciudad, String region) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.ciudad = ciudad;
        this.region = region;
    }


    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }
    public int getNumeroCalle() { return numeroCalle; }
    public void setNumeroCalle(int numeroCalle) { this.numeroCalle = numeroCalle; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }


    @Override
    public String toString() {
        return "Direccion: {" +
                "Calle = '" + calle + '\'' +
                ", Número Calle =" + numeroCalle +
                ", Ciudad = '" + ciudad + '\'' +
                ", Region = '" + region + '\'' +
                '}';
    }
}
