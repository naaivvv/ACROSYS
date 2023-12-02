/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.acrosys.views;

import com.acrosys.controllers.EventController;
import com.acrosys.models.Event;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kryle
 */
public class EventList extends javax.swing.JFrame {
    private boolean isEdit = false;
    private String eventCode = null;

    /**
     * Creates new form ManageForm
     */
    public EventList() {
        initComponents();
        LoadEvents();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Manage_EN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Manage_EC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Manage_Save = new javax.swing.JButton();
        btn_Manage_Reset = new javax.swing.JButton();
        btn_Manage_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_Manage_Search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_EventList = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Manage_DS = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        dtDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        dtTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1820, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Event Details");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Event Code:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Description:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_Manage_Save.setText("SAVE");
        btn_Manage_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_SaveActionPerformed(evt);
            }
        });

        btn_Manage_Reset.setText("RESET");
        btn_Manage_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_ResetActionPerformed(evt);
            }
        });

        btn_Manage_delete.setText("DELETE");
        btn_Manage_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_deleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Search:");

        txt_Manage_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Manage_SearchActionPerformed(evt);
            }
        });
        txt_Manage_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Manage_SearchKeyPressed(evt);
            }
        });

        tbl_EventList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Event Name", "Event Code", "Description", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_EventList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_EventListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_EventList);
        if (tbl_EventList.getColumnModel().getColumnCount() > 0) {
            tbl_EventList.getColumnModel().getColumn(0).setResizable(false);
            tbl_EventList.getColumnModel().getColumn(1).setResizable(false);
            tbl_EventList.getColumnModel().getColumn(2).setResizable(false);
            tbl_EventList.getColumnModel().getColumn(3).setResizable(false);
            tbl_EventList.getColumnModel().getColumn(4).setResizable(false);
        }

        txt_Manage_DS.setColumns(20);
        txt_Manage_DS.setRows(5);
        jScrollPane1.setViewportView(txt_Manage_DS);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addComponent(dtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Manage_EN)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Manage_EC, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn_Manage_Save)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_Manage_Reset))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btn_Manage_delete)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Manage_delete)
                    .addComponent(jLabel7)
                    .addComponent(txt_Manage_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_EN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_EC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Manage_Save)
                            .addComponent(btn_Manage_Reset))))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Manage_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_SaveActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat tFormat = new SimpleDateFormat("hh:mm a");
        
        String event_name = txt_Manage_EN.getText();
        String event_code = txt_Manage_EC.getText();
        String description = txt_Manage_DS.getText();
        String date = dFormat.format(dtDate.getDate());
        String time = tFormat.format(dtTime.getText());
        String dateTime = date + ", " + time;
        Event event = new Event(); //create an instance of Student Class
        event.setName(event_name);
        event.setCode(event_code);
        event.setDescription(description);
        event.setDate(dateTime);
        
        EventController eventController = new EventController();
        if(!isEdit){
        eventController.saveEvent(event);
        }else{
            eventController.updateEvent(event);
        }
        LoadEvents();
        Reset();
        LoadEvents();
    }//GEN-LAST:event_btn_Manage_SaveActionPerformed

    private void btn_Manage_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_ResetActionPerformed
        Reset();
    }//GEN-LAST:event_btn_Manage_ResetActionPerformed

    private void btn_Manage_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_deleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.YES_OPTION){
            EventController eventController = new EventController();
            eventController.deleteEvent(eventCode);
            LoadEvents();
            btn_Manage_delete.setEnabled(false);
            eventCode=null;
        }
    }//GEN-LAST:event_btn_Manage_deleteActionPerformed

    private void txt_Manage_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Manage_SearchKeyPressed
        EventController eventController = new EventController();
        List<Event> list = eventController.searchEvent(null, txt_Manage_Search.getText());
        DefaultTableModel model = (DefaultTableModel) tbl_EventList.getModel();
        model.setRowCount(0);
        
        for(Event event: list){
            String event_name = event.getName();
            String event_code = event.getCode();
            String description =  event.getDescription();
            String dateTime =  event.getDate();

            
            model.addRow(new Object[]{event_name, event_code, description, dateTime});
        }
    }//GEN-LAST:event_txt_Manage_SearchKeyPressed

    private void tbl_EventListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EventListMouseClicked
        if(evt.getClickCount()==2){
            int selRow = tbl_EventList.getSelectedRow();
            String controlno = tbl_EventList.getValueAt(selRow, 0).toString();
            
            EventController eventController = new EventController();
            Event event = eventController.getEvent(controlno);
            
            
            txt_Manage_EN.setText(event.getName());
            txt_Manage_EC.setText(event.getCode());
            txt_Manage_DS.setText(event.getDescription());
            dtDate.setDate(event.getDate());
            dtTime.setDate(event.getDate());

            btn_Manage_Save.setText("UPDATE");
            btn_Manage_Reset.setText("CANCEL");

            btn_Manage_delete.setEnabled(false);
            isEdit = false;
            
        }
        else{
            int selRow = tbl_EventList.getSelectedRow();
            eventCode = tbl_EventList.getValueAt(selRow, 0).toString();
            btn_Manage_delete.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_EventListMouseClicked

    private void txt_Manage_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Manage_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Manage_SearchActionPerformed


    
    
    
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
            java.util.logging.Logger.getLogger(EventList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Manage_Reset;
    private javax.swing.JButton btn_Manage_Save;
    private javax.swing.JButton btn_Manage_delete;
    private com.toedter.calendar.JDateChooser dtDate;
    private javax.swing.JTextField dtTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_EventList;
    private javax.swing.JTextArea txt_Manage_DS;
    private javax.swing.JTextField txt_Manage_EC;
    private javax.swing.JTextField txt_Manage_EN;
    private javax.swing.JTextField txt_Manage_Search;
    // End of variables declaration//GEN-END:variables

    private void LoadEvents() {
        EventController eventController = new EventController();
        List<Event> list = eventController.eventList();
        DefaultTableModel model = (DefaultTableModel) tbl_EventList.getModel();
        model.setRowCount(0);
        
        for(Event event: list){
            String event_name = event.getName();
            String event_code = event.getCode();
            String description =  event.getDescription();
            String dateTime =  event.getDate();
            
            model.addRow(new Object[]{event_name, event_code, description, dateTime});
        }
    }

    private void Reset() {
        txt_Manage_EN.setText("");
        txt_Manage_EC.setText("");
        txt_Manage_DS.setText("");
        dtDate.setDate("");
        dtTime.setText("");
                
        btn_Manage_Save.setText("SAVE");
        btn_Manage_Reset.setText("RESET");
        
        btn_Manage_delete.setEnabled(false);
        isEdit = false;
    }

}
