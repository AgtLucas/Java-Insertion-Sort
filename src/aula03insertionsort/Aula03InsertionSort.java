/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03insertionsort;

import java.util.Scanner;

/**
 *
 * @author AgtLucas
 */
public class Aula03InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int x[] = new int[5];
        int i, j, eleito;
 
        for (i = 0; i <= 4; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            x[i] = in.nextInt();
        }
 
        for (i = 1; i <= 4; i++) {
            eleito = x[i];
            j = i - 1;
            while (j >= 0 && x[j] > eleito) {
                x[j + 1] = x[j];
                j = j - 1;
            }
            x[j + 1] = eleito;
        }
 
        for (i = 0; i <= 4; i++) {
            System.out.println((i + 1) + "° número: " + x[i]);
        }
        
        int location = 0;
        int result = 1;
        
        for (int count = 0; count < 16; count++) {
            if (x[location] == x[location + 1]) {
                result++;
                location++;
            } else {
                count = 16;
            }
        }
        
        System.out.println("Menor número é: " + x[0] + ", e teve " + result + " aparição(ões) no vetor.");
    }
}
