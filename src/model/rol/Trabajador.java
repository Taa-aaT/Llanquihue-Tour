package model.rol;

import model.datos.Direccion;
import model.datos.Rut;

public class Trabajador extends Persona{

    private String rol;
    private double sueldoLiquido;

    public Trabajador(String nombre, Rut rut, String telefono, Direccion direccion, String rol, double sueldoLiquido) {
        super(nombre, rut, telefono, direccion);
        this.rol = rol;
        this.sueldoLiquido = sueldoLiquido;}
    public String getRol() {return rol;}
    public void setRol(String rol) {this.rol = rol;}
    public double getSueldoLiquido() {return sueldoLiquido;}
    public void setSueldoLiquido(double sueldoLiquido) {this.sueldoLiquido = sueldoLiquido;}


    @Override
    public String toString() {
        return super.toString() +
                "\nTrabajador: {" +
                "Rol = '" + rol + '\'' +
                ", Sueldo Liquido = " + sueldoLiquido +
                '}';
    }
}
