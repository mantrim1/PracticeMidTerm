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
public interface ReceiptStrategy {
    void output();
    void addItem(String productID, int qty);
    void setCustomer(String customerID);
    LineItem[] getLineItems();
   
}
