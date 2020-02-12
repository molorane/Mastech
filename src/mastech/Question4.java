 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Mothusi Molorane
 */
public class Question4 {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str,",");
        
        ArrayList<Integer> list;
        list = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        Collections.sort(list);
        
        StringBuilder sorted = new StringBuilder();
        
        list.forEach( num -> {
            sorted.append(num).append(",");
        });
        
        String out = sorted.substring(0,sorted.length()-1);
        System.out.println(out);
    }
}
