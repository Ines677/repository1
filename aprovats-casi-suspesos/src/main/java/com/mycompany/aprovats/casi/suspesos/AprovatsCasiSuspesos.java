/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aprovats.casi.suspesos;

import java.util.Scanner;

/**
 *
 * @author ammas
 */
public class AprovatsCasiSuspesos {

    public static void main(String[] args) {
        
        int nAprovats=0;
        int nCasi =0;
        int nSuspesos=0;
        
        for (int nNota = 1; nNota <= 6; nNota++){
            System.out.println("Introduir nota:");
            Scanner sc = new Scanner (System.in);
            int nota = sc.nextInt();
            
            if (nota < 4){
                nSuspesos = nSuspesos +1;
            } else if (nota >=4 && nota <5){
                nCasi = nCasi +1;
            } else if (nota >= 5){
                nAprovats= nAprovats +1;
            }}
        
        System.out.println("Aprovats: "+nAprovats);
        System.out.println("Persones que poden aprovar: "+nCasi);
        System.out.println("Suspesos: "+nSuspesos);
    }
        
}
