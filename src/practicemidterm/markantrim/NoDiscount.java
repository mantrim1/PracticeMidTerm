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
public class NoDiscount implements DiscountStrategy {
    private double discountRate=0;

    public double getDiscountRate() {
        return this.discountRate;
    }

    @Override
    public double getDiscountedTotal(double price, int qty) {
        return price*qty-this.getDiscountedTotal(price, qty);
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate=discountRate;
    }
    @Override
    public double getDiscountAmount(double price, int qty) {
        double disc=0;
        return disc;
    }
    
}
