package model.rol;

import model.datos.Direccion;
import model.datos.Rut;

public class Proveedor {

    private Rut rut;
    private String razonSocial;
    private String telefonoProveedor;
    private Direccion direccion;

    public Proveedor(Rut rut, String razonSocial, String telefonoProveedor, Direccion direccion) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefonoProveedor = telefonoProveedor;
        this.direccion = direccion;
    }

    public Rut getRut() {return rut;}
    public void setRut(Rut rut) {this.rut = rut;}
    public String getRazonSocial() {return razonSocial;}
    public void setRazonSocial(String razonSocial) {this.razonSocial = razonSocial;}
    public String getTelefonoProveedor() {return telefonoProveedor;}
    public void setTelefonoProveedor(String telefonoProveedor) {this.telefonoProveedor = telefonoProveedor;}
    public Direccion getDireccion() {return direccion;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}

    @Override
    public String toString() {
        return "\nProveedor{" +
                "rut=" + rut +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefonoProveedor='" + telefonoProveedor + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

