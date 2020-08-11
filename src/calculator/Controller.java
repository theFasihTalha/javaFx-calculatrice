/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static calculator.Model.result;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author talhi
 */
public class Controller {
     @FXML
       private Label affiche;
       private double nb1;
       private double nb2;
       private static String operateur="";
       private double result2;
       private boolean start;
       private String operator="";
       public void clear(){
           affiche.setText("");
       }
     

    
    public void getNb(ActionEvent event){
        //clear();
        
       // String operateur=((Button)event.getSource()).getText(); 
                if(operateur==""){
              String snb1=((Button)event.getSource()).getText();
        affiche.setText(affiche.getText() + snb1);
        }
//                else  if(operateur=="" &&  affiche.getText() != null){
//              String snb=((Button)event.getSource()).getText();
//           
//                affiche.setText(affiche.getText() + snb);
//        }
//                else {
//                       String snb2=((Button)event.getSource()).getText();
//                        affiche.setText(affiche.getText() + snb2);
//                }

                else if(operateur!=null || operateur!="") {
                    
                    if(affiche.getText().length() == 1 && !start){
                    clear();
                    String snb2=((Button)event.getSource()).getText();
                        affiche.setText(affiche.getText() + snb2);
                        start = true;
                }else{
                        String snb2=((Button)event.getSource()).getText();
                        affiche.setText(affiche.getText() + snb2);
                        
                                
                    }
                       
                }
    }
    public void getOperateur(ActionEvent event){
       
           operateur=((Button)event.getSource()).getText();
           
           if(operateur.equals("=")){
                nb2=Double.parseDouble(affiche.getText());
                System.out.println(nb2);
                clear();
                Model.calculatrice(nb1, nb2, operator);
             String s=String.valueOf(Model.result);  
                        affiche.setText(s);   
                        operator="";
                       }
           else{
               operator = operateur;
                nb1=Double.parseDouble(affiche.getText());
                System.out.println(nb1);
              clear();
        affiche.setText(operator); 
                
                  
       
   
        
       }
}
    public void getName(ActionEvent event) {
        
    }
    
    
    }
    

