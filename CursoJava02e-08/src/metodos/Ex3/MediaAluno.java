/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex3;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class MediaAluno {
   
    public static double calculoMedia(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Digitee 1");
        double a =sc.nextDouble();
        System.out.println("Digitee 2");
        double b = sc.nextDouble();
        System.out.println("Digitee 3");
        double c = sc.nextDouble();
        double soma = (a+b+c)/3;
        return soma;
    }
   /* public static void statusDoAluno(){
        if (soma == 6) {
            System.out.println("Aprovado");
            
        } else {
        }
  
    }*/
    
    public static void main(String[] args) {
        System.out.println(calculoMedia());
        
        
    }
    
}
