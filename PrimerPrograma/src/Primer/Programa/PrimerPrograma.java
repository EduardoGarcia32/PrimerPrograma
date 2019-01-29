/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primer.Programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class PrimerPrograma {

   public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int c;
        System.out.println("Indique el valor numerico");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = "+ a);
        System.out.println("--------------");
        System.out.println("Indique el valor numerico b");
        b = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = "+ b);
        System.out.println("--------------");
        System.out.println("Indique el valor numerico c");
        c = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = "+ c);
        System.out.println("La suma de tres numeros para un resultado");
    }
    
}
