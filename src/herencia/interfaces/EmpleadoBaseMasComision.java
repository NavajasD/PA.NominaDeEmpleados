package herencia.interfaces;

import java.time.LocalDate;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion, double tarifaComision, double ventasBrutas, double salarioBase) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial,fechaDeNacimiento, direccion, tarifaComision, ventasBrutas);
        establecerSalarioBase(salarioBase);
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) {
        if(salarioBase >= 0.0){
            this.salarioBase = salarioBase;
        }
        else {
            throw new IllegalArgumentException("El salario base debe ser >= 0");
        }
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+salarioBase;
    }

    @Override
    public String controlar(String tarea) {
        return "El empleado: "+obtenerPrimerNombre()+" "+obtenerApellidoPaterno()+"\n"
                +"Controla la tarea: "+tarea;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Empleado por comision con salario base: ").append(super.baseToString());
        sb.append("salario base: ").append(salarioBase).append("\n");
        return sb.toString();
    }
}
