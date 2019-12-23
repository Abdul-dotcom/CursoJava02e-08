/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex9;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Rendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor depositado");
        float deposito = sc.nextFloat();
        float montante = (float) (deposito*0.70);
        System.out.println(montante);
    }
    
}
