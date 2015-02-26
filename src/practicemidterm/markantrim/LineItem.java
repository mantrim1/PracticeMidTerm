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

public class LineItem {
    private DataManagmentStrategy fakeData;
    private Product productsInTrans;   
    private int qtyInTrans;

    public LineItem(DataManagmentStrategy fakeData, String productsInTrans, int qtyInTrans) {
        this.fakeData = fakeData;
        this.productsInTrans = fakeData.findProduct(productsInTrans);
        this.qtyInTrans = qtyInTrans;
    }

    public LineItem() {
    }
    
    
    public DataManagmentStrategy getFakeData() {
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

    public int getQtyInTrans() {
        return qtyInTrans;
    }

    public void setQtyInTrans(int qtyInTrans) {
        this.qtyInTrans = qtyInTrans;
    }
    
    public static void main(String[] args) {
       
    }
 
    
    
}
