/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cond29ab;

/**
 *
 * @author pc05
 */
public class Cond29ab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a =1;
    for (a=0; a<=100; a++) {
        if (a% 2==0 && a% 3==0)
            System.out.println(a);
    }
    a++;
}}
