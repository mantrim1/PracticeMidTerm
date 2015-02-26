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
    private Customer customer;
    @Override
    public void output() {
        System.out.println("Kohl's Department Store"
                + "/n Customer Id: "
                + "/n Customer Name: "
                + "/n"
                + "Item     QTY.    Name    Price   Disc"
                + "/n");
        
    }

    @Override
    public double totalMaths() {
        double total=0;
        for(Product p : productsInTrans){
            total+=itemMaths(qty, p);
        }
        return total;
    }

    @Override
    public double itemMaths(int qty, int index) {
        double qtyTotal=productsInTrans[index].getProductPrice()*qty;
        return qtyTotal;
    }
    
    
}
