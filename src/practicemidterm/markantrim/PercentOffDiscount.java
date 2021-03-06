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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate = .10;

   
    


    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        try{
            POSVerification.testIfNotNegative(discountRate, "discount");
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "The discount was not above 0");
        }
        this.discountRate = discountRate;
    }

    public  PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public PercentOffDiscount() {
    }
    
    @Override
    public final double getDiscountAmount(double price, int qty){
        return price*qty*this.discountRate;
        
    }
    @Override
    public final double getDiscountedTotal(double price, int qty){
        return price*qty-this.getDiscountedTotal(price, qty);
        
    }
    
}
