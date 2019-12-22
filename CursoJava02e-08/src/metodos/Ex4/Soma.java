/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex4;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digito o primneiro nume");
        int a = sc.nextInt();
        System.out.println("Digite o segundo");
        int b = sc.nextInt();
        
        System.out.println("a soma e "+ (a+b));
        System.out.println("a divisao e "+ (a/b));
        System.out.println("a multiplicaoe "+ (a*b));
        System.out.println("a subtracao e "+ (a-b));
    }
    
}
