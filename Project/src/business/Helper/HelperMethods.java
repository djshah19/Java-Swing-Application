/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Helper;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hiren Patel
 */
public class HelperMethods {
    
    public static void checkEmail(JTextField field) {
          if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", field.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
    
    public static void checkNumbers(KeyEvent evt, JTextField field)
    {
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key == KeyEvent.VK_BACK_SPACE)) {
            field.setEditable(true);
            field.setBackground(Color.white);
        } else {
            field.setEditable(false);
            field.setBackground(Color.red);
        }
    }
    
    public static void checkValidSSN(JTextField field)
    {
        if (field.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "SSN should be 9 digits only.", "Please check SSN", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void clearText(JTextField field)
    {
        field.setText("");
    }
    
    public static void clearPasswordText(JPasswordField field)
    {
        field.setText("");
    }
    
}
