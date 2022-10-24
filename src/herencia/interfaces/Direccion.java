package herencia.interfaces;

public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;
    private int altura;
    private int codigoPostal;

    public Direccion(String calle, String ciudad, String pais, int altura, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
        this.altura = altura;
        this.codigoPostal = codigoPostal;
    }

    public String obtenerCalle() {
        return calle;
    }

    public void establecerCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String obtenerPais() {
        return pais;
    }

    public void establecerPais(String pais) {
        this.pais = pais;
    }

    public int obtenerAltura() {
        return altura;
    }

    public void establecerAltura(int altura) {
        this.altura = altura;
    }

    public int obtenerCodigoPostal() {
        return codigoPostal;
    }

    public void establecerCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", altura=" + altura +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
