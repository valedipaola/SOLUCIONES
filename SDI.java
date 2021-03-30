/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Valentna
 */
public class SDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese las horas trabajadas en el mes y sus costos");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int salM = a*b;
        int salA = salM*12;
        System.out.println("El salario mensual es $" +salM);
        System.out.println("El salario anual es $" +salA);
    }
    
    
}
