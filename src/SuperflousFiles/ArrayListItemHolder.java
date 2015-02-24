/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperflousFiles;

import java.util.ArrayList;
import practicemidterm.markantrim.Customer;
import practicemidterm.markantrim.ItemHolderStrategy;
import practicemidterm.markantrim.Product;

/**
 *
 * @author Mark
 */
public class ArrayListItemHolder implements ItemHolderStrategy {
    
    private ArrayList itemsInTransaction = new ArrayList();
    private ArrayList customerOnTransaction = new ArrayList(0);
    @Override
    public final void addItem(Product product, int index){
        String[] productID=product.getProductID();
        itemsInTransaction.add(productID[index]);
    }
    @Override
    public final void addCustomer(Customer customer, int index){
        String[] customerID=customer.getCustomerID();
        itemsInTransaction.add(customerID[index]);  
    }
    
}
