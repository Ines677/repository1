/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex4github;

import java.util.Scanner;

/**
 *
 * @author mrgeb
 */
public class Ex4github {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduir nombre d'elements del costat d'un triangle:");
        int n = sc.nextInt();
        
        for (int i =1; i<=n;i++){
            for (int j = 1; j<= i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
        sc.close();
        
        
        
        
        
    }
}
