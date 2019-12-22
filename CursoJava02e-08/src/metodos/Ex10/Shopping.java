/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ex10;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double b = 5;
        System.out.println("Digite o valor do produto a comprar : ");
        double a = sc.nextDouble();
        double prestacao = a/b;
        System.out.println("O vcalor a pagar em prestacoes e de : " +prestacao+"Mzn");
    }
    
}
