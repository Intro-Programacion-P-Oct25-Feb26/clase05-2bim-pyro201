/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import paquete02.DatoTrabajo;

/**
 *
 * @author A S U S
 */
public class Informe {

    public static void imprimir(String a, String b, String c,
            double p, double[] nota) {
        String name_empre = DatoTrabajo.obtenerNombreEmpresa();
        String dir_empre = DatoTrabajo.obtenerDireccionEmpresa();
        String report = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s\n"
                + "Direccion Empresa: %s\n"
                + "Promedio: %.2f\n"
                + "Notas:\n",
                a,
                b,
                c,
                name_empre,
                dir_empre,p);
        for (int f=0;f<nota.length;f++){
            report+= String.format("%.2f\n",nota[f]);
            
        }
        System.out.printf(report);
    }
}
