/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplogit;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Principal {
    public static void mostrarTabuado(int num){
        for(int i =0;i<11;i++)
            System.out.println("" + num + " X " + i+ "=" + (i*num));
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("tabuada do :");
        int num = sc.nextInt();
        
        mostrarTabuado(num);
        System.out.println("teste");
        System.out.println("teste2");
    }
    
    
}
