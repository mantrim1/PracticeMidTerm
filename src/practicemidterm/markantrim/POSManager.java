/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;

import SuperflousFiles.WarningStrategy;

/**
 *
 * @author Mark
 */
public class POSManager {
    private InputStrategy inputStrategy;
    private ItemHolderStrategy itemHolderStrategy;
    private WarningStrategy warningStrategy;

    public POSManager(InputStrategy inputStrategy, ItemHolderStrategy itemHolderStrategy, WarningStrategy warningStrategy) {    
        this.inputStrategy = inputStrategy;
        this.itemHolderStrategy = itemHolderStrategy;
        this.warningStrategy = warningStrategy;
    }

   
    
    
    
    public void getWarning(){
        warningStrategy.warningDisplay();
    }
    public void addProductItems(){
        
        
       
        
    }
    
    
}
