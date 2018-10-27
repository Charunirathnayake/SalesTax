/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class SalesTax {

    /**
     * @param args the command line arguments
     */

     
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Sales Value in RS");
        double value=input.nextDouble();
        System.out.println("Enter the interest as percentage");
        double interest=input.nextDouble();
        System.out.println("Sales Tax is RS"+value*interest);
        
        
        
                
    }
    
}
