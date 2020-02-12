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
public class Question1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 1 and 100:");
        int n = input.nextInt();
        while(n < 1 || n >100){
            System.out.print("Enter number between 1 and 100:");
            n = input.nextInt();
        }
        FrisBee(n);
    }
    
    public static void FrisBee(int n){
       for(int i=1;i<=n;i++){
            boolean fris = false;
            boolean bee = false;
            if(i%3 == 0){
                System.out.println("fris");
                fris = true;
            }
            if(i%5 == 0){
                System.out.println("bee");
                bee = true;
            }
            if(!fris && !bee){ // this is to check whether a number is both fris and bee
                System.out.println(i);
            }
            fris = false;
            bee = false;
        }
    } 
}
