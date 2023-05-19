/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taulesmultiplicar2;

import java.util.Scanner;

/**
 *
 * @author ammas
 */
public class TaulesMultiplicar2 {

    public static void main(String[] args) {
        for (int nombre = 1; nombre <=10; nombre++){
        
        System.out.println("La taula de multiplicar del "+ nombre);
        for (int mult = 1; mult <=10; mult++){
            int res = nombre*mult;
            System.out.println(nombre+"*"+mult +"="+res);
        }    }}}
