/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer2;

/**
 *
 * @author _AlyyRazack
 */
public class Pontencia {
    public static double potencia(int x,int y){
        if (y == 0)
            return 1;
        else
            return x*potencia(x, y -1);
    }
    public static void main(String[] args) {
        
    }
    
}
