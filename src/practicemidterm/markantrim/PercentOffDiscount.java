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
public class PercentOffDiscount {
    private double discountRate = .10;

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public PercentOffDiscount() {
    }
    
    public double getDiscountAmount(double price, int qty){
        return price*qty*this.discountRate;
        
    }
    public double getDiscountedTotal(double price, int qty){
        return price*qty-this.getDiscountedTotal(price, qty);
        
    }
    
}
