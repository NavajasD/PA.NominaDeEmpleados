package tests;

import herencia.interfaces.*;

import java.time.LocalDate;

public class testInterfaces {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[3];
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

        System.out.println("Facturas y elementos por pagar:");

        for (PorPagar objetoPorPagar :
                objetosPorPagar) {
            System.out.println("Valor total: " + objetoPorPagar.obtenerMontoPago());

        }
    }
}
