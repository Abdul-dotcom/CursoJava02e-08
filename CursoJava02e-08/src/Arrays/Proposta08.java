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
public class Proposta08 {
    /*Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
escreva a soma de todos os elementos armazenados neste array.
*/
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int soma = 0;
        for (int i = 0 ; i<a.length ;i++){
            soma += a[i];
           
        }
        System.out.println("a soma sos elemntos no array e "+soma);
    }
}
