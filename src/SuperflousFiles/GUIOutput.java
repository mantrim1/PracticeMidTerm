/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperflousFiles;

import javax.swing.JOptionPane;
import practicemidterm.markantrim.OutputStrategy;

/**
 *
 * @author Mark
 */
public class GUIOutput implements OutputStrategy {
    ArrayListItemHolder itemHolder;
    @Override
    public void outputMessage() {
        JOptionPane.showMessageDialog(null,"Customer Id:");
    }
}
