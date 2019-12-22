/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex2;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class CalculoUnidadeDeTempo {
      public static void main(String[] args) {
        double seg = pedirSegundos();
        double minuto =calcMin(seg);
        double hora = hora(minuto);
        System.out.println(hora);
        System.out.println(minuto);
        System.out.println(seg);
    }
    
    public static double pedirSegundos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira os segundos : ");
        int segundos = teclado.nextInt();
        return segundos;
    }
    public static double calcMin(double minuto) {
        return (minuto/60);
    }
    public static double hora(double minutos){
        return(minutos/60);
    }
  
}
