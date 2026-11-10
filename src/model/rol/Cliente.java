package model.rol;

import model.datos.Direccion;
import model.datos.Rut;

public class Cliente extends Persona {

    private String codigoReserva;
    private String fechaTour;
    private String tour;

    public Cliente(String nombre, Rut rut, String telefono, Direccion direccion, String codigoReserva, String fechaTour, String tour) {
        super(nombre, rut, telefono, direccion);
        this.codigoReserva = codigoReserva;
        this.fechaTour = fechaTour;
        this.tour = tour;
    }

    public String getCodigoReserva() {return codigoReserva;}
    public void setCodigoReserva(String codigoReserva) {this.codigoReserva = codigoReserva;}
    public String getFechaTour() {return fechaTour;}
    public void setFechaTour(String fechaTour) {this.fechaTour = fechaTour;}
    public String getTour() {return tour;}
    public void setTour(String tour) {this.tour = tour;}


    @Override
    public String toString() {
        return super.toString() +
                "\nCliente {" +
                "codigo Reserva = '" + codigoReserva + '\'' +
                ", Fecha Tour = '" + fechaTour + '\'' +
                ", Tour = '" + tour + '\'' +
                '}';
    }
}
