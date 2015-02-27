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
public class RetailTransactionMath implements TransactionMathsStrategy {
    private LineItem lineItem;

    public RetailTransactionMath(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public RetailTransactionMath() {
    }
    

    
    
 @Override
    public double totalMaths(LineItem[] lineItems) {
        double total=0;
        for(int i=0;i<lineItems.length;i++){
            total+=itemMaths(lineItems[i].getQtyInTrans(), lineItems[i].getProductsInTrans(),
                    (lineItems[i].getProductsInTrans().getDiscountAmount(lineItems[i].getQtyInTrans())));
        }
        return total;
    }
    @Override
    public double totalDiscount(LineItem[] lineItems){
        double totalDisc=0;
        for(int i=0;i<lineItems.length;i++){
            totalDisc+=lineItems[i].getProductsInTrans().getDiscountAmount(lineItems[i].getQtyInTrans());
        }
        return totalDisc;
    }
    @Override
    public double itemMaths(int qty, Product product, double discount) {
//        System.out.println(qty+"    "+product.getProductPrice());
        double qtyTotal=(product.getProductPrice()*qty)-(discount);
        return qtyTotal;
    }
    //use product item in maths thing to make it better fix null pointer
}

