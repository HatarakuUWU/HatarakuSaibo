/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maranan_inf183;

/**
 *
 * @author Student
 */
public class TesT {
    public static void main (String [] args){
        int numberOne = 10;
        int numberTwo = 5;
        int temp = 3;
        
        temp = ++numberOne- numberTwo/5;
        numberOne = numberTwo + 2 * 3;
        numberTwo = ++temp +numberOne--;
        
        System.out.println(temp);
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
    
}
