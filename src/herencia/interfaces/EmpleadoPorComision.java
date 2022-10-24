package herencia.interfaces;

import java.time.LocalDate;

public class EmpleadoPorComision extends Empleado{

    private double tarifaComision;
    private double ventasBrutas;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion, double tarifaComision, double ventasBrutas) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial, fechaDeNacimiento, direccion);
        establecerTarifaComision(tarifaComision);
        establecerVentasBrutas(ventasBrutas);
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public void establecerTarifaComision(double tarifaComision) {
        if(tarifaComision >= 0.0){
            this.tarifaComision = tarifaComision;
        }
        else {
            throw new IllegalArgumentException("La tarifa de las comisiones debe ser >= 0");
        }
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public void establecerVentasBrutas(double ventasBrutas) {
        if(ventasBrutas >= 0.0){
            this.ventasBrutas = ventasBrutas;
        }
        else {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0");
        }
    }

    @Override
    public double calcularSalario() {
        return tarifaComision*ventasBrutas;
    }

    protected String baseToString() {
        var sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ventas brutas: ").append(ventasBrutas).append("\n");
        sb.append("tarifa de comision: ").append(tarifaComision).append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Empleado por comision: ").append(baseToString());
        return sb.toString();
    }
}
