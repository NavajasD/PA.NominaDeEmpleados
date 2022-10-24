package herencia.interfaces;

public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;


    public Factura(String pieza, String descripcion, int cantidad, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precio);

    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }
    public void establecerCantidad(int cuenta) {
        if (cuenta >= 0)
            cantidad = cuenta;
        else
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
    }
    public void establecerPrecioPorArticulo(double precio) {
        if (precio >= 0.0)
            precioPorArticulo = precio;

        else
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
    }

    @Override
    public String toString() {
        return "Factura" + "\nnumero de pieza:" + numeroPieza + "\ndescripcien:" + descripcionPieza
                + "\ncantidad:" + cantidad + "\nprecio por articulo:" + precioPorArticulo;
    }
    @Override
    public double obtenerMontoPago()
    {
        return cantidad * precioPorArticulo;
    }
}
