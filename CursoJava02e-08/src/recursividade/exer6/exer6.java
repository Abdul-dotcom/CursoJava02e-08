/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer6;

/**
 *
 * @author _AlyyRazack
 */
public class exer6 {
    int pot(int b,int p){
        if (p ==0) return 1;
        return (b * pot(b,p-1));
    }
    
}
