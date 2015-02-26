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
public class PosManager {
    private ReceiptStrategy receiptStrategy;
    public final void newTransaction(String custID, String productId){
        this.receiptStrategy = new ConsoleReceipt();
        receiptStrategy.output();
        
    }
    public final void printReceipt(){
        receiptStrategy.output();
    }
    
}
