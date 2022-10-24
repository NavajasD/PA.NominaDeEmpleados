package herencia.polimorfismo;

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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
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
