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
public class Product {
        private String productID;
        private String productName;
        private double productPrice;

    public Product() {
    }

    public Product(String productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
        

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductID(String productID) {
        if(productID==null||productID==""){
        //Warning Needed
        }else{
        this.productID = productID;
        }
        
    }

    public void setProductName(String productName) {
        if(productName==null||productName==""){
        this.productName=("Name Not Found");
        }else{
        this.productName = productName;
        }
    }

    public void setProductPrice(double productPrice) {
        if(productPrice<0){
        this.productPrice=(0.00);
        }else{
        this.productPrice = productPrice;
        }
    }
       
}
