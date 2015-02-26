/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;
import static java.lang.System.arraycopy;
/**
 *
 * @author Mark
 */
//loop orig = temp temp=null orig[orig.length-1]="jim" 
//arraycopy(orig, 0, temp, 0, orig.length)
public class ConsoleReceipt implements ReceiptStrategy {
    private Customer customer;
    private LineItem[] lineItem=new LineItem[0];
    private LineItem[] temp=new LineItem[0];
    private DataManagmentStrategy dataManagment;
    private TransactionMathsStrategy transMath;

    public ConsoleReceipt() {
    }
    
    
    @Override
    public void output() {
        System.out.println("Kohl's Department Store"
                + "\n Customer Id: "+customer.getCustomerID()
                + "\n Customer Name: "+customer.getCustomerName()
                + "\n"
                + "\n Item     QTY.    Name    Price   Disc    Total"
                + "\n");
       
        
    }

    public ConsoleReceipt(String custID, DataManagmentStrategy dataManagment) {
        this.customer=dataManagment.findCustomer(custID);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem[] lineItem) {
        this.lineItem = lineItem;
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
