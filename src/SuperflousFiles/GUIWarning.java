/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperflousFiles;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public class GUIWarning implements WarningStrategy {
    @Override
    public void warningDisplay(){
        JOptionPane.showMessageDialog(null, "No Match Found Please Try Again");
    }
}
