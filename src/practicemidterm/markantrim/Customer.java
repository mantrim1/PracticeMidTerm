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
public class Customer {
    private String customerID;
    private String customerName;

    public Customer() {
    }
    

    public Customer(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public final void setCustomerID(String customerID) {
        if(customerID==null||"".equals(customerID)){
        //Warning Needed
        }else{
        this.customerID = customerID;
        }
    }

    public final void setCustomerName(String customerName) {
         if(customerName==null||"".equals(customerName)){
        this.customerName=("Name Not Found");
        }else{
        this.customerName = customerName;
        }
    }
    
    

    public final String getCustomerID() {
        return customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }
    
}
