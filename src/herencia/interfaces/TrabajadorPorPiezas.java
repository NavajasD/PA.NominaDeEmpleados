package herencia.interfaces;

import java.time.LocalDate;

public class TrabajadorPorPiezas extends Empleado {
    private double sueldo;
    private int piezas;

    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion, double sueldo, int piezas) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial, fechaDeNacimiento, direccion);
        establecerSueldo(sueldo);
        establecerPiezas(piezas);
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double sueldo) {
        if(sueldo >= 0.0){
            this.sueldo = sueldo;
        }
        else {
            throw new IllegalArgumentException("El sueldo debe ser >= 0");
        }
    }

    public int obtenerPiezas() {
        return piezas;
    }

    public void establecerPiezas(int piezas) {
        if(piezas >= 0){
            this.piezas = piezas;
        }
        else {
            throw new IllegalArgumentException("Las piezas deben ser debe ser >= 0");
        }
    }

    @Override
    public double calcularSalario() {
        return sueldo*piezas;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Trabajador por piezas: ").append(super.toString());
        sb.append("sueldo: ").append(sueldo).append("; piezas producidas: ").append(piezas).append("\n");
        return sb.toString();
    }
}
