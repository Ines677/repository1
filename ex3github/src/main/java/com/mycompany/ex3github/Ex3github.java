/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex3github;

/**
 *
 * @author mrgeb
 */

import java.util.Scanner;

public class Ex3github {

    public static void main(String[] args) {
        
        int neAprovats=0;
        int neCasi=0;
        int neSuspesos=0;
        
        for (int nNota = 1; nNota <=6; nNota++){
            System.out.println("Introduir nota");
            Scanner sc = new Scanner (System.in);
            int nota = sc.nextInt();
            
            if (nota < 4){
                neSuspesos = neSuspesos +1;
            } else if (nota >= 4 && nota <5){
                neCasi = neCasi +1;
            } else if (nota >=5){
                neAprovats= neAprovats +1;
            }
            }
         System.out.println("Aprovats:"+ neAprovats);
         System.out.println("Persones que poden aprovar;" + neCasi);
         System.out.println("Suspesos:"+neSuspesos);
         
    }
}
