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
    private Customer[] customers ={
        new Customer("100", "John Smith")
    };
    private Product[] products ={
    new Product("A100", "Packers T-Shirt", 39.99/*discount strategy goes here*/)
};
           
    
}
