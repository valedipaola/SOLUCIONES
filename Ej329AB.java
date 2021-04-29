/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej329ab;
import java.util.Scanner;
/**
 *
 * @author pc05
 */
public class Ej329AB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un número y le mostraré los múltiplos de 5 dicho número");
        int num = teclado.nextInt();
        int i;
        int a =1;
        do {
    if (a% 5==0)
    System.out.println(a);
    a++;
    }
    while (a<=num);
        
    }
    
}
