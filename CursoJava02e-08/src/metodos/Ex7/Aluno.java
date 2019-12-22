/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex7;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = sc.next();
        System.out.println("digite a sau 1nota");
        double a = sc.nextDouble();
        System.out.println("digite a sau 2nota");
        double b = sc.nextDouble();
        System.out.println("digite a sau 3nota");
        double c = sc.nextDouble();
        
        System.out.println("A media do aluno "+ nome + " e de "+(a+b+c)/3+"Valores");
    }
   
}
