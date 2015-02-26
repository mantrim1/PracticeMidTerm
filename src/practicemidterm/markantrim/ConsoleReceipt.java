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
    }
    
    
   @Override
    public void output() {
        DecimalFormat format = new DecimalFormat("#.###");
        System.out.println("Kohl's Department Store"
                + "\n Customer Id: "+customer.getCustomerID()
                + "\n Customer Name: "+customer.getCustomerName()
                + "\n"
                + "\n Item QTY. Name            Price   Disc    Total"
                );
        
        for (LineItem lineItem : this.lineItems) {
            System.out.println("\n"+lineItem.getProductsInTrans().getProductID()+
                    "  "+lineItem.getQtyInTrans()+
                    "  "+lineItem.getProductsInTrans().getProductName()+
                    "    "+lineItem.getProductsInTrans().getProductPrice()+
                    "   "+format.format(lineItem.getProductsInTrans().getDiscountAmount(lineItem.getQtyInTrans())));
        }
                
        
       
        
    }

    public ConsoleReceipt(String custID, DataManagmentStrategy dataManagment) {
        this.customer=dataManagment.findCustomer(custID);
        this.dataManagment=dataManagment;
        
    }
    @Override
    public void addItem(String productID, int qty){
        LineItem[] temp = new LineItem[lineItems.length + 1];
        LineItem item = new LineItem(this.dataManagment,productID,qty);
        arraycopy(this.lineItems, 0, temp, 0, this.lineItems.length);
        this.lineItems=temp;
        lineItems[lineItems.length-1] = item;
    }

    public Customer getCustomer() {
        return customer;
    }
    @Override
    public void setCustomer(String customerId) {
        
        this.customer = this.dataManagment.findCustomer(customerId);
    }

    

    public DataManagmentStrategy getDataManagment() {
        return dataManagment;
    }

    public void setDataManagment(DataManagmentStrategy dataManagment) {
        this.dataManagment = dataManagment;
    }

    public TransactionMathsStrategy getTransMath() {
        return transMath;
    }

    public void setTransMath(TransactionMathsStrategy transMath) {
        this.transMath = transMath;
    }
    
}
