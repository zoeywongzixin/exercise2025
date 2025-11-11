/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w05e02b;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class W05E02b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Scanner sc = new Scanner(System.in);
        
                int input = 1;
                int sum = 0;
                
                do {
                    System.out.print("Enter a number(0 to stop):");
                    input = sc.nextInt();
                    sum += input;
            
                
                }while (input !=0);

                System.out.printf("The total sum is:%d\n",sum);
    }
    
}
