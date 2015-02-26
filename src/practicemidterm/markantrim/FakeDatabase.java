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
public class FakeDatabase implements DataManagmentStrategy {
    //final?
    private Customer[] customers ={
        new Customer("100", "John Smith")
    };
    //final?
    private Product[] products ={
    new Product("A100", "Packers T-Shirt", 39.99, new PercentOffDiscount())
            
    };
    @Override
    public final Customer findCustomer(final String custId) {
        // validation is needed for method parameter
        if(custId == null || custId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Customer customer = null;
        for(Customer c : customers) {
            if(custId.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }  
    @Override
    public final Product findProduct(final String prodId) {
        // validation is needed for method parameter
        if(prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
    
}
