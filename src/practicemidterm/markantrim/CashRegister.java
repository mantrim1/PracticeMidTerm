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
    private ReceiptStrategy receiptStrategy;
    public final void newTransaction(String custID){
        this.receiptStrategy = new ConsoleReceipt();
        this.receiptStrategy.setCustomer(custID);
        
    }
    public final void addItem(String productID, int qty){
        this.receiptStrategy.addItem(productID, qty);
    }
    public final void printReceipt(){
        receiptStrategy.output();
    }
    
}
