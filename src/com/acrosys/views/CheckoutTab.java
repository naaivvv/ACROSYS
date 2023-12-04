/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.acrosys.views;

import com.acrosys.controllers.AttendeeController;
import com.acrosys.models.Attendee;
import com.acrosys.models.Event;
import com.acrosys.models.User;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author hansa
 */
public class CheckoutTab extends javax.swing.JFrame {
    private User user;
    private Event event;
    
    /**
     * Creates new form ScannerTab
     */
    public CheckoutTab(User user, Event evt) {
        initComponents();
        
        txt_Code.requestFocus();
        lbl_EvtName.setText(evt.getName());
        
        this.user = user;
        this.event = evt;
        Reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        lbl_EvtName = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_AttendeeName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_AttendeeAge = new javax.swing.JLabel();
        lbl_AttendeeGender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_Time = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Code = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_EvtName.setEditable(false);
        lbl_EvtName.setColumns(20);
        lbl_EvtName.setFont(new java.awt.Font("Heavitas", 0, 70)); // NOI18N
        lbl_EvtName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EvtName.setLineWrap(true);
        lbl_EvtName.setRows(5);
        lbl_EvtName.setText("DevFest 2023");
        lbl_EvtName.setWrapStyleWord(true);
        lbl_EvtName.setOpaque(false);
        jLayeredPane2.add(lbl_EvtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 760, 440));

        jLabel3.setFont(new java.awt.Font("Heavitas", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHECK-OUT");
        jLayeredPane2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 140, 438, 69));

        jLabel4.setFont(new java.awt.Font("Heavitas", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COUNTER");
        jLayeredPane2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, 303, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_AttendeeName.setFont(new java.awt.Font("Heavitas", 0, 48)); // NOI18N
        lbl_AttendeeName.setForeground(new java.awt.Color(251, 133, 0));
        lbl_AttendeeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AttendeeName.setText("GIEZHIA DIAZ");

        jLabel7.setFont(new java.awt.Font("Heavitas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 146, 148));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGE:");

        jLabel8.setFont(new java.awt.Font("Heavitas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 146, 148));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GENDER:");

        lbl_AttendeeAge.setFont(new java.awt.Font("Heavitas", 0, 36)); // NOI18N
        lbl_AttendeeAge.setForeground(new java.awt.Color(251, 133, 0));
        lbl_AttendeeAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AttendeeAge.setText("21");

        lbl_AttendeeGender.setFont(new java.awt.Font("Heavitas", 0, 36)); // NOI18N
        lbl_AttendeeGender.setForeground(new java.awt.Color(251, 133, 0));
        lbl_AttendeeGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AttendeeGender.setText("FEMALE");

        jLabel9.setFont(new java.awt.Font("Heavitas", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(12, 146, 148));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ATENDEE NAME:");

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));

        jLabel12.setFont(new java.awt.Font("Heavitas", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TIME OF ENTRY:");

        lbl_Time.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        lbl_Time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Time.setText("7:20 AM - 11/22/2023");

        jLabel14.setFont(new java.awt.Font("Heavitas", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CHECK-OUT RECORDED");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Time, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Time)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_AttendeeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_AttendeeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_AttendeeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_AttendeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AttendeeAge)
                    .addComponent(lbl_AttendeeGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, -1, -1));

        txt_Code.setBackground(new java.awt.Color(251, 133, 0));
        txt_Code.setForeground(new java.awt.Color(255, 255, 255));
        txt_Code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CodeKeyPressed(evt);
            }
        });
        jLayeredPane2.add(txt_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 770, 582, 63));

        jButton1.setBackground(new java.awt.Color(12, 146, 148));
        jButton1.setFont(new java.awt.Font("Heavitas", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 840, 114, 42));

        back_button.setFont(new java.awt.Font("Heavitas", 0, 12)); // NOI18N
        back_button.setForeground(new java.awt.Color(12, 146, 148));
        back_button.setText("< Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jLayeredPane2.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 0, 90, 60));

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 1095));

        jPanel1.setBackground(new java.awt.Color(12, 146, 148));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acrosys/collaterals/acrosys 1080p with icon.png"))); // NOI18N
        jLabel2.setToolTipText("");

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_CodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            Reset();
            String ctrlNo = txt_Code.getText();
            LocalDateTime date = LocalDateTime.now();
            String currDate = DateTimeFormatter.ofPattern("hh:mm a - yyyy/MM/dd").format(date);
            
            
            try {
                AttendeeController atCon = new AttendeeController();
                Attendee attendee = atCon.getAttendee(ctrlNo);
                
                if (!attendee.getEvent_code().equals(event.getCode())){
                    JOptionPane.showMessageDialog(null,"Attendee in different event.","Alert", JOptionPane.ERROR_MESSAGE);
                    
                    txt_Code.setText("");
                    return;
                }
                
                if(!attendee.isChecked_in()){
                    JOptionPane.showMessageDialog(null,"Attendee already checked in.","Alert", JOptionPane.ERROR_MESSAGE);

                    txt_Code.setText("");
                    return;
                }

                lbl_AttendeeName.setText(attendee.getClient_name());
                lbl_AttendeeAge.setText(String.valueOf(attendee.getClient_age()));
                lbl_AttendeeGender.setText(attendee.getClient_gender());
                lbl_Time.setText(currDate);

                attendee.setChecked_in(true);
                attendee.setCheckOut_time(date);
                atCon.updateAttendee(attendee);

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,"Attendee not found.","Alert", JOptionPane.ERROR_MESSAGE);
            }
            
            txt_Code.setText("");
        }
    }//GEN-LAST:event_txt_CodeKeyPressed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        new Dashboard(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void Reset(){
        lbl_AttendeeName.setText("");
        lbl_AttendeeAge.setText("");
        lbl_AttendeeGender.setText("");
        lbl_Time.setText("");   
    }
    
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
            java.util.logging.Logger.getLogger(CheckoutTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckoutTab(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_AttendeeAge;
    private javax.swing.JLabel lbl_AttendeeGender;
    private javax.swing.JLabel lbl_AttendeeName;
    private javax.swing.JTextArea lbl_EvtName;
    private javax.swing.JLabel lbl_Time;
    private javax.swing.JTextField txt_Code;
    // End of variables declaration//GEN-END:variables
}
