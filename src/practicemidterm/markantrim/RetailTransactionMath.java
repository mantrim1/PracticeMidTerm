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
    private ReceiptStrategy receiptStrategy;

    public RetailTransactionMath(ReceiptStrategy receiptStrategy) {
        this.receiptStrategy = receiptStrategy;
    }
    
 @Override
    public double totalMaths() {
        double total=0;
        for(int i=0;i<receiptStrategy.getLineItems().length;i++){
            total+=itemMaths(receiptStrategy.getLineItems()[i].getQtyInTrans(), i);
        }
        return total;
    }

    @Override
    public double itemMaths(int qty, Product product) {
        double qtyTotal=product.getProductPrice()*qty;
        return qtyTotal;
    }
    //use product item in maths thing to make it better fix null pointer


