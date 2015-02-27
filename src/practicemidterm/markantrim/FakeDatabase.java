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
        new Customer("100", "Malcom Reynolds"),
        new Customer("200", "Solid Snake"),
        new Customer("300", "Garrus Vakarian")
    };
    //final?
    private Product[] products ={
    new Product("A100", "Packers T-Shirt", 39.99, new PercentOffDiscount()),
    new Product("B100", "Brown Bath Towel", 25.99, new QtyDisountWithPercentage(3,.30)),
    new Product("C100", "Women's Earrings", 95.99, new NoDiscount()),
    new Product("D100", "Chldren's Sneakers", 19.99, new NoDiscount()),
    new Product("E100", "Nutri Bullet", 129.99, new PercentOffDiscount(.20)),
    new Product("F100", "Waffle Maker", 69.99, new PercentOffDiscount(.30)),
    new Product("G100", "Red Oven Mitt", 5.99, new QtyDisountWithPercentage(2,.15)),
    new Product("H100", "Wood Cofee Table", 199.99, new NoDiscount())
        
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
