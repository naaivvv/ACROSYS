
package com.acrosys.swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class TextFieldAnim extends JTextField{
    
    public TextFieldAnim(){
        setBackground(new Color(255,255,255,0));//Remove background
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 50));//Set Right border 50
        setFont(new java.awt.Font("Segoe UI", 0, 14));
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        
        super.paintComponent(grphcs);
    }
}
