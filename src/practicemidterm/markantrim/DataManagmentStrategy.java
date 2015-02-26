/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;

/**
 * 
 *
 * @author Mark
 */
public interface DataManagmentStrategy {
    Product findProduct(final String prodId);
    Customer findCustomer(final String custId);
    
}
