package herencia.interfaces;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado{
    private double sueldo;
    private int piezas;
    private TipoContrato tipoContrato;

    public EmpleadoContratado(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direEmpleado, double sueldo, int piezas, TipoContrato tipoContrato) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial, fechaDeNacimiento, direEmpleado);
        establecerSueldo(sueldo);
        establecerPiezas(piezas);
        this.tipoContrato = tipoContrato;
    }

    public void establecerSueldo(double sueldo) {
        if(sueldo >= 0.0){
            this.sueldo = sueldo;
        }
        else {
            throw new IllegalArgumentException("El sueldo debe ser >= 0");
        }
    }

    public void establecerPiezas(int piezas) {
        if(piezas >= 0){
            this.piezas = piezas;
        }
        else {
            throw new IllegalArgumentException("La cantidad de piezas debe ser >= 0");
        }
    }

    public void establecerTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerPiezas() {
        return piezas;
    }

    public TipoContrato obtenerTipoContrato() {
        return tipoContrato;
    }

    @Override
    public double calcularSalario() {
        return sueldo*piezas;
    }

    @Override
    public String controlar(String tarea) {
        return "Este empleado no esta autorizado para controlar la tarea: "+tarea;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Empleado contratado: ").append(super.toString());
        sb.append("sueldo por pieza: ").append(sueldo).append("; piezas producidas: ").append(piezas).append("\n");
        return sb.toString();
    }
}
