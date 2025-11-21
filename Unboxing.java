/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice03112025;

import java.util.ArrayList;

/**
 *
 * @author THADAKAMALLA
 */
public class Unboxing {
     public static void main(String[] args) 
     {
     // wrapper class for same object
       // conversation
       Character ch = 'a';
       // primitive data type
       char a = ch;
       // collectons using for to store the multiple values
        ArrayList<Integer>  auto = new ArrayList<>();
        // adding the values
        auto.add(25);
        auto.add(30);
                
         System.out.println(auto);
          System.out.println(a);
    }
}
