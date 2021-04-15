/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfor2;
import java.util.Scanner;
/**
 *
 * @author pc05
 */
public class EJFOR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el número máximo a incrementar");
        int a = teclado.nextInt();
        System.out.println("");
        for (int i=0; i<a ; i++);
        System.out.println(i);
    }
    
}
