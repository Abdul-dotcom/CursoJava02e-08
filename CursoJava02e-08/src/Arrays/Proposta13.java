/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta13 {
    /* Ler um array A com 10 elementos inteiros correspondentes as idades de um grupo de 
    pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que
    possuem idade superior a 35 anos.
 */
    public static void main(String[] args) {
        int soma = 0;
        int [] idade = {35,51,45,50,12,12,47,8,32,15};
        ArrayList<Integer> qntd = new ArrayList<>();
        for (int i = 0; i < idade.length; i++) {
            int k = idade[i];
            
            if (k > 35) {
               qntd.add(k);
                
            }
        }
        int lista = qntd.size();
        System.out.println("a quantidade de pessoas que possuem idade superior a 35 anos e de : " + lista+ " pessoas ");
        
            
        }
    }

