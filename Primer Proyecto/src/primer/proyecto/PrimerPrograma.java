/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class PrimerProyecto {

   public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("Indique el valor numerico");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = "+ a);
        System.out.println("--------------");
    }
    
}
