/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer3;

/**
 *
 * @author _AlyyRazack
 */
public class Soma {
    public static void somarArray(int [] arrayInt){
        int iterator = arrayInt.length;
        int soma = 0;
        for(int i = 0; i<arrayInt.length; i++){
            soma += arrayInt[i];
        }
         System.out.println(soma);
    } 
    public static void main(String[] args) {
        
    }
 
    
}
