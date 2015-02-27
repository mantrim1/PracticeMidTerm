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
public class QtyDisountWithPercentage implements DiscountStrategy {
    private int minQTY=5;
    private double discountRate=.1;

    public QtyDisountWithPercentage() {
    }

    public QtyDisountWithPercentage(int minQTY) {
        this.minQTY = minQTY;
    }

    public QtyDisountWithPercentage(int minQty, double discRate) {
        this.discountRate=discRate;
        this.minQTY=minQty;
    }

    
    

    @Override
    public double getDiscountAmount(double price, int qty) {
        
        if(qty>=this.minQTY){
           return price*qty*this.discountRate;
            
        }else{
            return price*qty;
        }
    }

    @Override
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
    
    
    
}
