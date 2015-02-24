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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate = .10;

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public PercentOffDiscount() {
    }
    
    @Override
    public double getDiscountAmount(double price, int qty){
        return price*qty*this.discountRate;
        
    }
    @Override
    public double getDiscountedTotal(double price, int qty){
        return price*qty-this.getDiscountedTotal(price, qty);
        
    }
    
}
