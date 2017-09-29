/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S15ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1 = (int)(Math.random() * 10);
        int numero2 = (int)(Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> respuestas = new ArrayList<Integer>();
        
        System.out.println("¿Cuanto es " + numero1 + " + " + numero2 + "?");
        
        int respuesta = input.nextInt();
        
        while (numero1 + numero2 != respuesta) {
            if (respuestas.contains(respuesta)) {
                System.out.println("Ya ingresaste anteriormente " + respuesta);                
                System.out.println("¿Cuanto es " + numero1 + " + " + numero2 + "?");
            }
            else {
                System.out.println("Respuesta incorrecta, intentalo de nuevo...");
                System.out.println("¿Cuanto es " + numero1 + " + " + numero2 + "?");
                respuestas.add(respuesta);
            }
            respuesta = input.nextInt();
        }
        
    }
    
}
