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
public class LineItem {
    private FakeDatabase fakeData;
    private Product productsInTrans;   
    private int qtyInTrans;
    private Customer customer;
    

    public LineItem(FakeDatabase fakeData, Customer customer) {
        this.fakeData = fakeData;
        this.customer = customer;
    }

    public LineItem() {
    }
    
    
    public FakeDatabase getFakeData() {
        return fakeData;
    }

    public void setFakeData(FakeDatabase fakeData) {
        this.fakeData = fakeData;
    }

    public Product getProductsInTrans() {
        return productsInTrans;
    }

    public void setProductsInTrans(Product productsInTrans) {
        this.productsInTrans = productsInTrans;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQtyInTrans() {
        return qtyInTrans;
    }

    public void setQtyInTrans(int qtyInTrans) {
        this.qtyInTrans = qtyInTrans;
    }
    
    public static void main(String[] args) {
       
    }
 
    
    
}
