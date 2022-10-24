package herencia.interfaces;

import java.time.LocalDate;

public class EmpleadoAsalariado  extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial, fechaDeNacimiento, direccion);
        establecerSalarioSemanal(salarioSemanal);
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal>=0.0) {
            this.salarioSemanal = salarioSemanal;
        }
        else {
            throw new IllegalArgumentException("El salario semanal debe ser >= 0");
        }
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }

    @Override
    public String controlar(String tarea) {
        return "Este empleado no esta autorizado para controlar la tarea: "+tarea;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Empleado asalariado: ").append(super.toString());
        sb.append("salario semanal: ").append(salarioSemanal).append("\n");
        return sb.toString();
    }
}
