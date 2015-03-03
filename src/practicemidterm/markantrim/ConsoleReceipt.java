/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;
import static java.lang.System.arraycopy;
import java.text.*;
/**
 *
 * @author Mark
 */
//loop orig = temp temp=null orig[orig.length-1]="jim" 
//arraycopy(orig, 0, temp, 0, orig.length)
public class ConsoleReceipt implements ReceiptStrategy {
    private Customer customer;
    private LineItem[] lineItems=new LineItem[0];
    private DataManagmentStrategy dataManagment;
    private TransactionMathsStrategy transMath;
    
    
    public ConsoleReceipt() {
        this.dataManagment= new FakeDatabase();
        this.transMath= new RetailTransactionMath();
        
    }
    
    
   @Override
    public final void output() {
        
        System.out.println("Kohl's Department Store"
                + "\n Customer Id: "+customer.getCustomerID()
                + "\n Customer Name: "+customer.getCustomerName()
                + "\n"
                + "\nItem QTY. Name            Price   Disc    Total"
                + "\n************************************************"
                );
        
        for (int i=0;i<lineItems.length;i++) {
            System.out.println(lineItems[i].getProductsInTrans().getProductID()+
                    "  "+lineItems[i].getQtyInTrans()+
                    "  "+lineItems[i].getProductsInTrans().getProductName()+
                    "    "+lineItems[i].getProductsInTrans().getProductPrice()+
                    "   "+String.format("%.2f",lineItems[i].getProductsInTrans().getDiscountAmount(lineItems[i].getQtyInTrans()))+
                    "   "+String.format("%.2f", transMath.itemMaths(lineItems[i].getQtyInTrans(),lineItems[i].getProductsInTrans(),
                            (lineItems[i].getProductsInTrans().getDiscountAmount(lineItems[i].getQtyInTrans()))))
            );
           
        }
         System.out.println("\n"
                    + "Total: "+String.format("%.2f", this.transMath.totalMaths(lineItems))+
                    "\nYou Saved: "+String.format("%.2f",this.transMath.totalDiscount(lineItems))+
                    "\n\n\n"
            );
                
        
       
        
    }
   
    public ConsoleReceipt(String custID, DataManagmentStrategy dataManagment) {
        this.customer=dataManagment.findCustomer(custID);
        this.dataManagment=dataManagment;
        
    }
    @Override
    public final void addItem(String productID, int qty){
        LineItem[] temp = new LineItem[lineItems.length + 1];
        LineItem item = new LineItem(this.dataManagment,productID,qty);
        arraycopy(this.lineItems, 0, temp, 0, this.lineItems.length);
        this.lineItems=temp;
        lineItems[lineItems.length-1] = item;
    }

    public final Customer getCustomer() {
        return customer;
    }
    @Override
    public final void setCustomer(String customerId) {
        
        this.customer = this.dataManagment.findCustomer(customerId);
    }

    

    public final DataManagmentStrategy getDataManagment() {
        return dataManagment;
    }

    public final void setDataManagment(DataManagmentStrategy dataManagment) {
        this.dataManagment = dataManagment;
    }

    public final TransactionMathsStrategy getTransMath() {
        return transMath;
    }

    public final void setTransMath(TransactionMathsStrategy transMath) {
        this.transMath = transMath;
    }
  
    public final LineItem[] getLineItems() {
        return lineItems;
    }
    
}
