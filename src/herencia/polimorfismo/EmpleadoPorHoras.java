package herencia.polimorfismo;

import java.time.LocalDate;

public class EmpleadoPorHoras extends Empleado {

    private double sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, int nroSeguroSocial, LocalDate fechaDeNacimiento, Direccion direccion, double sueldoPorHora, int horasTrabajadas) {
        super(primerNombre, apellidoPaterno, nroSeguroSocial, fechaDeNacimiento, direccion);
        establecerSueldoPorHora(sueldoPorHora);
        establecerHorasTrabajadas(horasTrabajadas);
    }

    public double obtenerSueldoPorHora() {
        return sueldoPorHora;
    }

    public void establecerSueldoPorHora(double sueldoPorHora) {
        if(sueldoPorHora >= 0.0){
            this.sueldoPorHora = sueldoPorHora;
        }
        else {
            throw new IllegalArgumentException("El sueldo por hora debe ser >= 0");
        }

    }

    public int obtenerHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void establecerHorasTrabajadas(int horasTrabajadas) {
        if(horasTrabajadas >= 0){
            this.horasTrabajadas = horasTrabajadas;
        }
        else {
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0");
        }
    }

    @Override
    public double calcularSalario() {
        if(horasTrabajadas <= 40){
            return sueldoPorHora*horasTrabajadas;
        }
        else{
            return 40*sueldoPorHora + ((horasTrabajadas-40)*(sueldoPorHora*1.5));
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Empleado por horas: ").append(super.toString());
        sb.append("sueldo por horas: ").append(sueldoPorHora).append("; horas trabajadas: ").append(horasTrabajadas).append("\n");
        return sb.toString();
    }
}
