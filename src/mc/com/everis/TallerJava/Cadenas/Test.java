/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.com.everis.TallerJava.Cadenas;

/**
 *
 * @author Berserker
 */
public class Test {
    public static void main(String[] args) {
        String nombre = "Gera";
        String nombre2 = new String("Gera");
        
        if (nombre == nombre2) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        if (nombre.equals(nombre2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        String nombreCompleto = "Gerardo Gudiño García";
        String [] nombres = nombreCompleto.split("");
        
        for (String parte : nombres) {
            System.out.println(parte);
        }
        
        System.out.println(nombreCompleto.valueOf(2));
    }
}
