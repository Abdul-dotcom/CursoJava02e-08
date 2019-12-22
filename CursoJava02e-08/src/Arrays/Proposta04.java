  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta04 {
    //Faça um programa que copie o conteúdo de um array para um segundo array.

   public static void main(String[] args) {
        char [] copyFrom = {'t','a','l','e','n','t','o','s','s','a','t','e','d'};
        
        char [] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 6);
        System.out.println(new String(copyTo));
    }
}

