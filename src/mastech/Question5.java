/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastech;

import java.util.Scanner;

/**
 *
 * @author Mothusi Molorane
 */
public class Question5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to start with: ");
        int n = input.nextInt();
        int original = n;
        
        boolean check = true;
        
        int counter = 1;
        
        while(check){
            counter++;
            if(n%2 == 1){
                n = (n*3)+1;
            }
            if(n%2 == 0){
                n = n -(n/2);
            }
            
            if(n == 1){
                System.out.println(original+" becomes wondrous after "+ counter +" repetitions.");
                check = false;
            }
            if(n < 1){
                System.out.print(original+" becomes unwondrous after "+ counter +" repetitions.");
                check = false;
            }
        }
        
        System.out.println();
    }
}
