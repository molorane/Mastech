/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Mothusi Molorane
 */
public class Mastech {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] nums = {0,9,1,8,2,10,5,3};
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        
        
        Collections.sort(list);
        
        list.forEach((Integer num) -> {
            System.out.println(num);
        });
    }
    
}
