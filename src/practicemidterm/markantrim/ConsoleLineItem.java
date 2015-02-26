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
public class ConsoleLineItem implements LineItemStrategy {
    private FakeDatabase fakeData;
    private Product[] productsInTrans= {};
    private int[] qtyInTrans ={};
    private Customer customer;
    @Override
    public void output() {
        System.out.println("Kohl's Department Store"
                + "\n Customer Id: "+customer.getCustomerID()
                + "\n Customer Name: "+customer.getCustomerName()
                + "\n"
                + "\n Item     QTY.    Name    Price   Disc"
                + "\n");
        
    }

    public ConsoleLineItem(FakeDatabase fakeData, Customer customer) {
        this.fakeData = fakeData;
        this.customer = customer;
    }

    public ConsoleLineItem() {
    }
    
   

    public FakeDatabase getFakeData() {
        return fakeData;
    }

    public void setFakeData(FakeDatabase fakeData) {
        this.fakeData = fakeData;
    }

    public Product[] getProductsInTrans() {
        return productsInTrans;
    }

    public void setProductsInTrans(Product[] productsInTrans) {
        this.productsInTrans = productsInTrans;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int[] getQtyInTrans() {
        return qtyInTrans;
    }

    public void setQtyInTrans(int[] qtyInTrans) {
        this.qtyInTrans = qtyInTrans;
    }
    
    
    
    
}
