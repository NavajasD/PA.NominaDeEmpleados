package tests;

import herencia.polimorfismo.*;


import java.time.LocalDate;


public class testPolimorfismo {

    public static void main(String[] args) {
        var direccionTest = new Direccion("calle test", "ciudad test", "pais test", 1234, 1234);

        var ebmc = new EmpleadoBaseMasComision(
                "Raul",
                "Gomez",
                123456,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                0.25,
                20000.0,
                10000.0);


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
                30
        );

        var tpp = new TrabajadorPorPiezas(
                "Test 3",
                "Apellido 3",
                11111113,
                LocalDate.parse("1991-10-15"),
                direccionTest,
                5000,
                10
        );

        Empleado[] empleados =  {ebmc, epc, ea, eph, tpp};

        for (Empleado empleado:
             empleados) {
            System.out.println(empleado);
            System.out.println("sueldo: "+empleado.calcularSalario()+"\n");
        }

        System.out.println("Despues de aumentar un 10% el salario base a los empleados base mas comisiones");
        for (Empleado empleado:
                empleados) {

            if(empleado instanceof EmpleadoBaseMasComision)
            {
                var empleadoComision = (EmpleadoBaseMasComision) empleado;
                empleadoComision.establecerSalarioBase(1.1 * empleadoComision.obtenerSalarioBase());
                System.out.println(empleadoComision);
                System.out.println("sueldo: "+empleadoComision.calcularSalario()+"\n");
            }
            else
            {
                System.out.println(empleado);
                System.out.println("sueldo: "+empleado.calcularSalario()+"\n");
            }

        }

        System.out.println("Nombre de todos los objetos");
        for (int j = 0; j<empleados.length; j++)
        {
            System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
        }

        try {
            epc.establecerVentasBrutas(-20);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}
