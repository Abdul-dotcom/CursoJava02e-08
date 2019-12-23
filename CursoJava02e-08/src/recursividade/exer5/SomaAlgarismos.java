/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer5;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class SomaAlgarismos {
    public static int soma(int num){
        if(num <10)
            return num;
        else return soma(num/10)+num%0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nr");
        int num = sc.nextInt();
        num = soma(num);
        System.out.println(num);
    }
}
