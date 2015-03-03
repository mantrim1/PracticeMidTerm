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
    
    
    public final DataManagmentStrategy getFakeData() {
        return fakeData;
    }

    public final void setFakeData(FakeDatabase fakeData) {
        this.fakeData = fakeData;
    }

    public final Product getProductsInTrans() {
        return product;
    }

    public final void setProductsInTrans(Product product) {
        this.product = product;
    }

    public final int getQtyInTrans() {
        return qtyInTrans;
    }

    public final void setQtyInTrans(int qtyInTrans) {
        this.qtyInTrans = qtyInTrans;
    }
    

 
    
    
}
