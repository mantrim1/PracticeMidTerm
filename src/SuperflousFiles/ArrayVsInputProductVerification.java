/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperflousFiles;

import practicemidterm.markantrim.InputStrategy;
import practicemidterm.markantrim.Product;

/**
 *
 * @author Mark
 */
public class ArrayVsInputProductVerification implements VerificationStrategy {
    private Product product;
    private boolean isInArray;

    public ArrayVsInputProductVerification(Product product) {
        this.product = product;
    
    }
    @Override
    public boolean verify(InputStrategy input){
        for(String productID: product.getProductID()){
            if(productID.equals(input.getProductID())){
                isInArray=true;
            
        }
            
        }
        return isInArray;
    }
    
    
}
