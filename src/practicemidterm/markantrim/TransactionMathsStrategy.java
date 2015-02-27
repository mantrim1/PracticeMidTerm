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
public interface TransactionMathsStrategy {

    double itemMaths(int qty, Product product);

    double totalMaths();
    
}
