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
public class Question2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 2 and 30:");
        int n = input.nextInt();
        while(n < 2 || n >30){
            System.out.print("Enter number between 2 and 30:");
            n = input.nextInt();
        }
        
        int count = 0;
        int firstPrime = 2;
        
        StringBuilder primes = new StringBuilder();
        
        while(count < n){
            if(IsPrime(firstPrime)){
              primes.append(firstPrime).append(", ");
              count++;
            }
            firstPrime++;
        }
        String out = primes.substring(0,primes.length()-2);
        System.out.println(out);
    }
    
    public static boolean IsPrime(int num){
        for(int i=2; i<num;i++){
            if(num % i == 0){
                return false;
            }
        }            
        return true;
    }
}
