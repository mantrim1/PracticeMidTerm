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
public class CashRegister {
    private InputStrategy inputStrategy;
    private LineItemStrategy lineItemStrategy;
    private DataManagmentStrategy dataManagmentStrategy;
    private TransactionMathsStrategy transactionMathsStrategy;

    public CashRegister(InputStrategy inputStrategy, LineItemStrategy lineItemStrategy, DataManagmentStrategy dataManagmentStrategy) {
        this.inputStrategy = inputStrategy;
        this.lineItemStrategy = lineItemStrategy;
        this.dataManagmentStrategy = dataManagmentStrategy;
        
    }

    public CashRegister() {
    }
     
    public final void addCustomerToTrans(String customerID){
        Customer customer = dataManagmentStrategy.findCustomer(customerID);
        lineItemStrategy.setCustomer(customer);
        
    }
    
    public final void addProductItems(String productID, int qty){
       Product product = dataManagmentStrategy.findProduct(productID);
       //add product to productInTrans array
    }
    public final void newTransaction(String custID){
        lineItemStrategy = new ConsoleLineItem();
        inputStrategy = new HardCodeInput();
        dataManagmentStrategy = new FakeDatabase();
        this.transactionMathsStrategy=new RetailTransactionMath(lineItemStrategy);
        this.addCustomerToTrans(custID);    
    }
    public final void printReceipt(){
        lineItemStrategy.output();
    }
    public final void calculate(){
        this.transactionMathsStrategy.totalMaths();       
    }
    
}
