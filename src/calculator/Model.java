/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author talhi
 */
public class Model {
    public static double result;
    
     public static void calculatrice(double nombre1 ,double nombre2, String operateur){
          System.out.println(operateur+"merde");
         switch(operateur){
             case "+" :
                result= nombre1 + nombre2;
                System.out.println(result);
                 break;
             case "-":
                 result= nombre1 - nombre2;
                 break;
              case "x":
                 result= nombre1 * nombre2;
                 break;
               case "/":
                 result= nombre1 / nombre2;
                 break;
               default: 
                
         }
        
          
     }
}