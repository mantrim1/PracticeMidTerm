/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;



/**
 *
 * @author Mark
 */
public class CashRegister {
    private InputStrategy inputStrategy;
    private LineItemStrategy lineItemStrategy;
    private DataManagmentStrategy dataManagmentStrategy;
    

    public CashRegister(InputStrategy inputStrategy, LineItemStrategy lineItemStrategy) {    
        this.inputStrategy = inputStrategy;
        this.lineItemStrategy = lineItemStrategy;   
    }

   
    
    
    
    
    public void addProductItems(String productID, int qty){
        dataManagmentStrategy.findProduct(productID);
    }
    
    
}
