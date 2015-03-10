/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;

import javax.swing.JOptionPane;



/**
 *
 * @author Mark
 */
public class CashRegister {
    private ReceiptStrategy receiptStrategy;
    public final void newTransaction(String custID){
        try{
            POSVerification.customerIdNumbers(custID);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "The Customer Id did not match required pattern");
        }
        this.receiptStrategy = new ConsoleReceipt();
        this.receiptStrategy.setCustomer(custID);
        
    }
    public final void addItem(String productID, int qty){
        try{
            POSVerification.testIfEmpty(productID);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "The Item Id was not entered");
        }
        try{
            POSVerification.testQty(qty);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "The Qty entered did not match the required input");
        }
        this.receiptStrategy.addItem(productID, qty);
    }
    public final void printReceipt(){
        receiptStrategy.output();
    }
    
}
