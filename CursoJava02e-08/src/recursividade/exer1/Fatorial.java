/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer1;
import java.util.Scanner;
/**
 *
 * @author _AlyyRazack
 */
public class Fatorial {
    
    public int fatorialRecursivo(int num){
        
        if(num ==0)
            return 1;
            
            return num*fatorialRecursivo(num-1);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num =s.nextInt();
        Fatorial b = new Fatorial();
        num =b.fatorialRecursivo(num);
        System.out.println(num);
        
    }
    
}
