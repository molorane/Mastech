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
public class Question3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 2 and 1000:");
        int n = input.nextInt();
        while(n < 2 || n >1000){
            System.out.print("Enter number between 2 and 1000:");
            n = input.nextInt();
        }
        
        StringBuilder sb = new StringBuilder();
        
        int nextPrime = 2;
        
        while(!IsPrime(n)){
            if(n%2 == 0){
                n = n / 2;
                sb.append(2).append(" x ");
            }else{
                nextPrime++;
                while(!IsPrime(nextPrime)){
                    nextPrime++;
                }
                if(n%nextPrime == 0){
                    n = n / nextPrime;
                    sb.append(nextPrime).append(" x ");
                }
            }
        }
        sb.append(n);
        
        System.out.println(sb);
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
