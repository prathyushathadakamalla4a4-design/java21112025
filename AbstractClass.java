/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srikanth
 */
abstract class AbstractClass {
          void eat1(){
        System.out.println("Every animals can eat");
    }
          abstract void sound();
}       
          
class dog extends AbstractClass{
    @Override
    void sound(){
        System.out.println("Dog can bark");
    }
    
    public static void main(String[] args) {
        dog d = new dog();
        d.eat1();
        d.sound();
    }
}

 

