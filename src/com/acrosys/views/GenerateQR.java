/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.acrosys.views;

import com.acrosys.controllers.AttendeeController;
import com.acrosys.controllers.EventController;
import com.acrosys.models.Attendee;
import com.acrosys.models.Event;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Map;

/**
 *
 * @author kryle
 */
public class GenerateQR extends javax.swing.JFrame {

    /**
     * Creates new form GenerateQR
     */
    public GenerateQR() {
        initComponents();
        lblSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lblSearch = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        controlNoSearch = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        labelImage = new javax.swing.JLabel();
        Control = new javax.swing.JLabel();
        ControlNum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AttendeeName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EventAttended = new javax.swing.JLabel();
        Control1 = new javax.swing.JLabel();
        EventCode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(251, 133, 0));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(810, 530));

        jLayeredPane2.setBackground(new java.awt.Color(12, 146, 148));
        jLayeredPane2.setOpaque(true);

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrosys/swing/search.png"))); // NOI18N
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrosys/collaterals/Untitled design (5).png"))); // NOI18N

        controlNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlNoSearchActionPerformed(evt);
            }
        });
        controlNoSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlNoSearchKeyPressed(evt);
            }
        });

        jLayeredPane2.setLayer(lblSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(controlNoSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(controlNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(controlNoSearch))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 146, 148), 3), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102))));
        jLayeredPane1.setOpaque(true);

        jLayeredPane3.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.setPreferredSize(new java.awt.Dimension(300, 300));

        jLayeredPane3.setLayer(labelImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );

        Control.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        Control.setForeground(new java.awt.Color(12, 146, 148));
        Control.setText("Control Number:");

        ControlNum.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        ControlNum.setForeground(new java.awt.Color(251, 133, 0));

        jLabel2.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 146, 148));
        jLabel2.setText("Attendee Name:");

        AttendeeName.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        AttendeeName.setForeground(new java.awt.Color(251, 133, 0));

        jLabel5.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 146, 148));
        jLabel5.setText("Event Attended:");

        EventAttended.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        EventAttended.setForeground(new java.awt.Color(251, 133, 0));

        Control1.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        Control1.setForeground(new java.awt.Color(12, 146, 148));
        Control1.setText("Event Code:");

        EventCode.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        EventCode.setForeground(new java.awt.Color(251, 133, 0));

        jLabel4.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 146, 148));
        jLabel4.setText("Age:");

        Age.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(251, 133, 0));

        jLabel6.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 146, 148));
        jLabel6.setText("Gender:");

        Gender.setFont(new java.awt.Font("Heavitas", 0, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(251, 133, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\soyvi\\Documents\\GitHub\\ACROSYS\\collaterals\\ORANGE.png")); // NOI18N

        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Control, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ControlNum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AttendeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EventAttended, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Control1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EventCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Age, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Gender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Control)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Control1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AttendeeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EventAttended, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EventCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ControlNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Control)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Control1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EventCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EventAttended, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttendeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Print.setFont(new java.awt.Font("Heavitas", 0, 12)); // NOI18N
        Print.setForeground(new java.awt.Color(251, 133, 0));
        Print.setText("Print");
        Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Print)
                .addGap(32, 32, 32))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
job.setJobName(ControlNum.getText());

job.setPrintable(new Printable() {
    public int print(Graphics pg, PageFormat pf, int pageNum) {
        pf.setOrientation(PageFormat.PORTRAIT);
        if (pageNum > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        Graphics2D g2 = (Graphics2D) pg;
        g2.translate(pf.getImageableX() + 25, pf.getImageableY() + 25); // Add left and top margins

        // Set custom width and height for printing (adjust these values as needed)
        double panelWidth = 2000; // Set your desired width (excluding margins)
        double panelHeight = 2200; // Set your desired height (excluding margins)

        double scaleX = pf.getImageableWidth() / panelWidth;
        double scaleY = pf.getImageableHeight() / panelHeight;

        g2.scale(scaleX, scaleY);

        jLayeredPane1.print(g2);

        return Printable.PAGE_EXISTS;
    }
});

boolean ok = job.printDialog();
if (ok) {
    try {
        job.print();
    } catch (PrinterException ex) {
        ex.printStackTrace();
    }
}

    }//GEN-LAST:event_PrintActionPerformed

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        
    }//GEN-LAST:event_lblSearchMouseClicked

    private void controlNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlNoSearchActionPerformed
        
    }//GEN-LAST:event_controlNoSearchActionPerformed

    private void controlNoSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controlNoSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String ctrlnosearch = controlNoSearch.getText();
            
            AttendeeController attendController = new AttendeeController();
            Attendee attendee = attendController.getAttendee(ctrlnosearch);

            ControlNum.setText(attendee.getControlno());
            EventCode.setText(attendee.getEvent_code());
            AttendeeName.setText(attendee.getClient_name());
            Age.setText(String.valueOf(attendee.getClient_age()));
            Gender.setText(attendee.getClient_gender());

            EventController eventController = new EventController();
            Event event = eventController.getEvent(attendee.getEvent_code());
            EventAttended.setText(event.getName());
        }
    }//GEN-LAST:event_controlNoSearchKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenerateQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateQR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel AttendeeName;
    private javax.swing.JLabel Control;
    private javax.swing.JLabel Control1;
    private javax.swing.JLabel ControlNum;
    private javax.swing.JLabel EventAttended;
    private javax.swing.JLabel EventCode;
    private javax.swing.JLabel Gender;
    private javax.swing.JButton Print;
    private javax.swing.JTextField controlNoSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel lblSearch;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
