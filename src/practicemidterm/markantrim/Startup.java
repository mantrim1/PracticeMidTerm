/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;

import SuperflousFiles.GUIWarning;
import SuperflousFiles.ArrayListItemHolder;
import SuperflousFiles.GUIInput;
import SuperflousFiles.ArrayVsInputProductVerification;

/**
 *
 * @author Mark
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStrategy input = new GUIInput();
        POSManager test = new POSManager(input,new ArrayListItemHolder(),new GUIWarning());
        test.addProductItems();
    }
    
}
