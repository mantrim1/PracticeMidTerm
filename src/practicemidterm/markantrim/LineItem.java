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
    private Product product;   
    private int qtyInTrans;

    public LineItem(DataManagmentStrategy fakeData, String productsInTrans, int qtyInTrans) {
        this.fakeData = fakeData;
        this.product = fakeData.findProduct(productsInTrans);
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
        return product;
    }

    public void setProductsInTrans(Product product) {
        this.product = product;
    }

    public int getQtyInTrans() {
        return qtyInTrans;
    }

    public void setQtyInTrans(int qtyInTrans) {
        this.qtyInTrans = qtyInTrans;
    }
    

 
    
    
}
