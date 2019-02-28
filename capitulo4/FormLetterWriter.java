/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4;

/**
 *
 * @author eriss
 */
public class FormLetterWriter {
    

     public String displaySalutation(String a){
        return String.format("Estimado Sr. o Sr. %s \nGracias por su pedido reciente",a);
    }
    
    public String displayString(String n,String a){
        return String.format("\nEstimado %s %s \nGracias por su pedido reciente",n,a);
    }

}
