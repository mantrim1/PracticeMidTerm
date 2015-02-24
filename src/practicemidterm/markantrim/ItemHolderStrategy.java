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
public interface ItemHolderStrategy {

    void addCustomer(Customer customer, int index);

    void addItem(Product product, int index);
    
}
