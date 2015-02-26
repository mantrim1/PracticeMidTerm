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
    private ReceiptStrategy lineItemStrategy;

    public RetailTransactionMath(ReceiptStrategy lineItemStrategy) {
        this.lineItemStrategy = lineItemStrategy;
    }
    
 @Override
    public double totalMaths() {
        double total=0;
        for(int i=0;i<lineItemStrategy.getProductsInTrans().length;i++){
            total+=itemMaths(lineItemStrategy.getQtyInTrans()[i], i);
        }
        return total;
    }

    @Override
    public double itemMaths(int qty, int index) {
        double qtyTotal=lineItemStrategy.getProductsInTrans()[index].getProductPrice()*qty;
        return qtyTotal;
    }
    
}


