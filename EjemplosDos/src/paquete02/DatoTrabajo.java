/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    public static String obtenerNombreEmpresa(){
        Scanner entrada = new Scanner(System.in);
    
        String  name;
        System.out.println("Nombre de la empresa");
            name = entrada.nextLine();
            return name;
    }
    public static String obtenerDireccionEmpresa(){
        Scanner entrada = new Scanner(System.in);
    
        String dir;
        System.out.println("Dirección de la empresa");
            dir = entrada.nextLine();
            return dir;
    }
    // método que permita preguntar al usuario el nombre de la empresa
    
    // método que permita preguntar al usuario la dirección de la empresa
}
