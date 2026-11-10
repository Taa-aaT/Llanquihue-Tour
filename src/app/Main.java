package app;

import model.datos.Direccion;
import model.datos.Rut;
import model.rol.Cliente;
import model.rol.Proveedor;
import model.rol.Trabajador;

public class Main {

    public static void main(String[] args){

//Creacion de cliente
        System.out.println("***** LLanquihue Tour *****");

        Direccion direccionCliente = new Direccion(
                "Av. Siempreviva",
                2324,
                "Valparaiso",
                "Valparaiso");
        Rut rutCliente = new Rut("11987654-1");

        Cliente cliente = new Cliente(
                "Mario Broski",
                rutCliente,
                "+56 9 74605403",
                direccionCliente,
                "2026nov",
                "25 Enero 2027",
                "Llanquihue Recorrido simple"
                );

        //creacion de trabajador

        Direccion direccionTrabajador = new Direccion(
                "Av. 18 de Septiembre",
                2123,
                "Llanquihue",
                "Los Lagos");

        Rut rutTrabajador = new Rut("16846982-2");

        Trabajador trabajador = new Trabajador(
                "Alicia Contreras",
                rutTrabajador,
                "+56 9 74851425",
                direccionTrabajador,
                "Guia Turistico",
                750.000);

        //Creacion Proveedor

         Direccion direccionProveedor = new Direccion(
                 "Las americas",
                 404,
                 "Llanquihue",
                 "Los Lagos");

         Rut rutProveedor = new Rut("77800500-7");

        Proveedor proveedor = new Proveedor(
                rutProveedor,
                "Sebastian y Ramirez Ltda.",
                "+56 9 78007800",
                direccionProveedor
        );

        System.out.println(cliente);
        System.out.println(trabajador);
        System.out.println(proveedor);
    }
}