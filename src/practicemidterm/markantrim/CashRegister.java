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

    public CashRegister(InputStrategy inputStrategy, LineItemStrategy lineItemStrategy, DataManagmentStrategy dataManagmentStrategy) {
        this.inputStrategy = inputStrategy;
        this.lineItemStrategy = lineItemStrategy;
        this.dataManagmentStrategy = dataManagmentStrategy;
    }
    

    

   
    
    
    public void addCustomerToTrans(String customerID){
        Customer customer = dataManagmentStrategy.findCustomer(customerID);
        lineItemStrategy.setCustomer(customer);
        lineItemStrategy.output();
    }
    
    public void addProductItems(String productID, int qty){
        dataManagmentStrategy.findProduct(productID);
    }
    
    
}
