/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperflousFiles;

import javax.swing.JOptionPane;
import practicemidterm.markantrim.InputStrategy;

/**
 *
 * @author Mark
 */
public class GUIInput implements InputStrategy {
    private String customerID;
    private String productID;
    @Override
    public void displayGuiInput(){
        displayGuiCustomerID();
        displayGuiProductID();
    }
    @Override
    public void displayGuiCustomerID(){
        customerID = JOptionPane.showInputDialog("Enter Customer Id");
    }
    @Override
    public void displayGuiProductID(){
        productID = JOptionPane.showInputDialog("Enter Product Id");
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    
    @Override
    public String getCustomerID() {
        return customerID;
    }

    @Override
    public String getProductID() {
        return productID;
    }
    
}
