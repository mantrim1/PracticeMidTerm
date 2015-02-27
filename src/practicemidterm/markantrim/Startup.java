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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PosManager go1 = new PosManager();
        go1.newTransaction("100");
        go1.addItem("A100", 2);
        go1.addItem("H100", 1);
        go1.addItem("C100", 3);
        go1.printReceipt(); 

        go1.newTransaction("200");
        go1.addItem("G100", 4);
        go1.addItem("E100", 1);
        go1.printReceipt();

        go1.newTransaction("300");
        go1.addItem("D100", 2);
        go1.addItem("B100", 4);
        go1.addItem("F100", 1);
        go1.printReceipt();
    }
    
}
