package herencia.interfaces;

import java.time.LocalDate;

public abstract class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;
    private int nroSeguroSocial;
    private LocalDate fechaDeNacimiento;

    private Direccion direccion;

    public Empleado(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion) {
        establecerPrimerNombre(primerNombre);
        establecerApellidoPaterno(apellidoPaterno);
        establecerNroSeguroSocial(nroSeguroSocial);
        establecerFechaDeNacimiento(fechaDeNacimiento);
        this.direccion = direccion;
    }

    public abstract double calcularSalario();

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int obtenerNroSeguroSocial() {
        return nroSeguroSocial;
    }

    public LocalDate obtenerFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void establecerFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void establecerNroSeguroSocial(int nroSeguroSocial) {
        this.nroSeguroSocial = nroSeguroSocial;
    }

    @Override
    public double obtenerMontoPago() {
        return calcularSalario();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(primerNombre).append(" ").append(apellidoPaterno).append("\n");
        sb.append("numero de seguro social: ").append(nroSeguroSocial).append("\n");
        sb.append("fecha de nacimiento: ").append(fechaDeNacimiento).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        return sb.toString();
    }
}
