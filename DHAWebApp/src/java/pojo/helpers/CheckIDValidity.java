/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.helpers;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
public class CheckIDValidity {
    
    
    private String idString;

    public CheckIDValidity() {
    }

    public CheckIDValidity(String idString) {
        this.idString = idString;
    }

    public boolean testID(){
        
        if(idString.length() !=13){
            return false;
        }
        
        int sum = 0;
        
        for(int i=0;i<idString.length();i++){
            
            int digit = Character.getNumericValue(idString.charAt(i));
            if((i+1) % 2 ==0){
                
                digit *=2;
                if(digit>9){
                    digit %=9;
                }
            }
            
            sum +=digit;
        }
        
        return sum%10==0;
    }
    
    
            
            
}
