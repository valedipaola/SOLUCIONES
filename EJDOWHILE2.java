/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejdowhile2;
import java.util.Scanner;
/**
 *
 * @author pc05
 */
public class EJDOWHILE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingrese el número máximo a incrementar");
        Scanner teclado= new Scanner (System.in);
        int a;
        a= teclado.nextInt();
       int i =1;
       do { System.out.println(i);
       i++;
      }
       while (i<=a);
       
       
       }
    
    }
    

