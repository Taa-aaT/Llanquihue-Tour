package model.datos;

//Rut para validar persona

public class Rut {

    private String numero;

public Rut(String numeroRUT) {
    if (!numeroRUT.matches("[0-9]+-[0-9kK]")){
        throw new IllegalArgumentException("Rut invalido, ingrese uno numero RUT valido.");
    }
    this.numero = numeroRUT;
}
 public String getNumero() {
    return numero;}

    @Override
    public String toString() {
        return "Rut {" +
                "Numero RUT = '" + numero + '\'' +
                '}';
    }
}
