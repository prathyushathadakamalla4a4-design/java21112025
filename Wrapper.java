/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice03112025;

/**
 *
 * @author THADAKAMALLA
 */
public class Wrapper
{
    public static void main(String[] args)
    {
        // wrapper class:-A Wrapper class in Java is one whose object wraps or contains primitive data types.
        //When we create an object in a wrapper class, it contains a field and in this field, we can store primitive data types.
        
        // primitive data type
        int b;
        // wrapper class
        Integer a;
        // assigining the values for primitive data type
        b=200;
        // auto-boxing 
        a=b;
        System.out.println("primitive data type value is:"+b);  
        System.out.println("wrapper class value is:" +a);
    }
}
