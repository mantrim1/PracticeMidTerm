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
public interface DiscountStrategy {

    double getDiscountAmount(double price, int qty);

    double getDiscountedTotal(double price, int qty);

    void setDiscountRate(double discountRate);
    
}
