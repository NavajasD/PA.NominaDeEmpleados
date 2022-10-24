package tests;

import herencia.interfaces.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class testInterfaces {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];
        var direccionTest = new Direccion("calle test", "ciudad test", "pais test", 1234, 1234);

        objetosPorPagar[0] = new Factura("2314", "testDescripcion", 2, 500.0);
        objetosPorPagar[1] = new Factura("2314", "testDescripcion", 3, 1000.0);
        objetosPorPagar[2] = new EmpleadoAsalariado(
                "Test 1",
                "Apellido 1",
                11111111,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                10000);
        objetosPorPagar[3] = new EmpleadoContratado(
                "Test 1",
                "Apellido 1",
                11111111,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                500,
                20,
                TipoContrato.Permanente);


        System.out.println("Facturas y elementos por pagar:");

        for (PorPagar objetoPorPagar :
                objetosPorPagar) {
            System.out.println("Valor total: " + objetoPorPagar.obtenerMontoPago());

        }

        var epc = new EmpleadoPorComision(
                "Javier",
                "Martinez",
                1234567,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                0.50,
                30000);

        var ea = new EmpleadoAsalariado(
                "Test 1",
                "Apellido 1",
                11111111,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                10000
        );

        var eph = new EmpleadoPorHoras(
                "Test 2",
                "Apellido 2",
                11111112,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                1000,
                6
        );

        var empleados = new ArrayList<Empleado>();
        empleados.add(epc);
        empleados.add(ea);
        empleados.add(eph);

        System.out.println("Las horas promedio trabajadas por estos empleados es: " + Empleado.calcularHorasPromedio(empleados));

    }
}
