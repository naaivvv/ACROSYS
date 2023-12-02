/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.acrosys.views;

import com.acrosys.controllers.AttendeeController;
import com.acrosys.controllers.DatabaseConnection;
import com.acrosys.models.Attendee;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author kryle
 */
public class AttendeeList extends javax.swing.JFrame {
    private boolean isEdit = false;
    private String attendeeCNno = null;
    File f = null;
    String path = null;
    private ImageIcon format = null;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel dm;
    int columnIndex = 1;
    
    /**
     * Creates new form ManageForm
     */
    public AttendeeList() {
        initComponents();
        LoadAttendees();
        Reset();
        lblCtrlnShow.setFont(new java.awt.Font("Lucida Grande", 1, 0));
        conn = DatabaseConnection.getConnection();
        updateCMB();
        CreateColumns();
        labelImage.setFont(new java.awt.Font("Lucida Grande", 1, 0));

    }
    
    private void updateCMB(){
        String sql = "select * from tbl_event";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cmb_Manage_SelectEvent.addItem(rs.getString("event_code"));
            }
            
        }catch(Exception e){
            
        }
    }
    
    private void CreateColumns(){
        dm = (DefaultTableModel)tbl_AttendeeList.getModel();
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
        txt_Manage_CN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Manage_EC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Manage_ClientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Manage_ClientAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_Manage_ClientGender = new javax.swing.JComboBox<>();
        btn_Manage_Save = new javax.swing.JButton();
        btn_Manage_Reset = new javax.swing.JButton();
        btn_Manage_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_Manage_Search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmb_Manage_SelectEvent = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_AttendeeList = new javax.swing.JTable();
        labelImage = new javax.swing.JLabel();
        lblCtrlnShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1820, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Event Attendee Details");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Control Number:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Event Code:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Client's Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Client's Age:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Client's Gender:");

        cmb_Manage_ClientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Female", "Male" }));

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

        txt_Manage_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Manage_SearchKeyPressed(evt);
            }
        });

        jLabel8.setText("Select Event:");

        cmb_Manage_SelectEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmb_Manage_SelectEvent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_Manage_SelectEventItemStateChanged(evt);
            }
        });

        tbl_AttendeeList.setModel(new javax.swing.table.DefaultTableModel(
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
                "Control Number", "Event Code", "Client's Name", "Client's Age", "Client's Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tbl_AttendeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AttendeeListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_AttendeeList);
        if (tbl_AttendeeList.getColumnModel().getColumnCount() > 0) {
            tbl_AttendeeList.getColumnModel().getColumn(0).setResizable(false);
            tbl_AttendeeList.getColumnModel().getColumn(1).setResizable(false);
            tbl_AttendeeList.getColumnModel().getColumn(2).setResizable(false);
            tbl_AttendeeList.getColumnModel().getColumn(3).setResizable(false);
            tbl_AttendeeList.getColumnModel().getColumn(4).setResizable(false);
        }

        lblCtrlnShow.setText("jLabel9");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Manage_CN)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Manage_EC, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Manage_ClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Manage_ClientAge, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Manage_ClientGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_Manage_Save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Manage_Reset)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_Manage_SelectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCtrlnShow)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(txt_Manage_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_Manage_SelectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_CN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_EC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Manage_ClientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Manage_ClientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Manage_Save)
                            .addComponent(btn_Manage_Reset))
                        .addGap(56, 56, 56)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCtrlnShow)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Manage_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_SaveActionPerformed
        String controlno = txt_Manage_CN.getText();
        String event_code = txt_Manage_EC.getText();
        String client_name = txt_Manage_ClientName.getText();
        int client_age = Integer.parseInt(txt_Manage_ClientAge.getText());
        String client_gender = cmb_Manage_ClientGender.getItemAt(cmb_Manage_ClientGender.getSelectedIndex());
        
        Attendee attendee = new Attendee(); //create an instance of Student Class
        attendee.setControlno(controlno);
        attendee.setEvent_code(event_code);
        attendee.setClient_name(client_name);
        attendee.setClient_age(client_age);
        attendee.setClient_gender(client_gender);
        
        AttendeeController attendController = new AttendeeController();
        if(!isEdit){
        attendController.saveAttendee(attendee);
        }else{
            attendController.updateAttendee(attendee);
        }
        LoadAttendees();
        Reset();
        LoadAttendees();
        Attendee ctrlno = attendController.getControlno(client_name);
        lblCtrlnShow.setText(ctrlno.getControlno());
        
        Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pst;
            ResultSet rs;
            String ctrln = lblCtrlnShow.getText(); 

        ByteArrayOutputStream out = QRCode.from(ctrln)
                            .to(ImageType.PNG).stream();
        try{
       String f_name = ctrln;
       String Path_name = "src\\com\\acrosys\\qrcodes\\";
       FileOutputStream fout = new FileOutputStream(new File(Path_name +(f_name + ".PNG")));
       fout.write(out.toByteArray());
       fout.flush();
        } catch (Exception e){
            System.out.println(e);
        }
        
        try {
            path = "src\\com\\acrosys\\qrcodes\\" + ctrln + ".PNG";
             ImageIcon ii = new ImageIcon(path);
             Image img = ii.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            labelImage.setIcon(new ImageIcon(img));
            File f = new File(path);
            System.out.println("Name: " + f.getName());
            InputStream is = new FileInputStream(f);
            pst = conn.prepareStatement("UPDATE tbl_attendees SET qr_name = ?, qr_path = ?, qr_imagefile = ? WHERE control_number = ?");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);
            pst.setString(4, ctrln);
            
            int inserted = pst.executeUpdate();
            if(inserted > 0){
                System.out.println("Image Successfully Inserted");
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AttendeeList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AttendeeList.class.getName()).log(Level.SEVERE, null, ex);
        }
        labelImage.setFont(new java.awt.Font("Lucida Grande", 1, 0));
    }//GEN-LAST:event_btn_Manage_SaveActionPerformed

    private void btn_Manage_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_ResetActionPerformed
        Reset();
    }//GEN-LAST:event_btn_Manage_ResetActionPerformed

    private void btn_Manage_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_deleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.YES_OPTION){
            AttendeeController attendController = new AttendeeController();
            attendController.deleteAttendee(attendeeCNno);
            LoadAttendees();
            btn_Manage_delete.setEnabled(false);
            attendeeCNno=null;
        }
    }//GEN-LAST:event_btn_Manage_deleteActionPerformed

    private void txt_Manage_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Manage_SearchKeyPressed
        AttendeeController attendController = new AttendeeController();
        List<Attendee> list = attendController.searchAttendee(null, txt_Manage_Search.getText());
        DefaultTableModel model = (DefaultTableModel) tbl_AttendeeList.getModel();
        model.setRowCount(0);
        
        for(Attendee attendee: list){
            String controlno = attendee.getControlno();
            String event_code = attendee.getEvent_code();
            String client_name =  attendee.getClient_name();
            int client_age = attendee.getClient_age();
            String client_gender = attendee.getClient_gender();
            
            model.addRow(new Object[]{controlno, event_code, client_name, client_age, client_gender});
        }
    }//GEN-LAST:event_txt_Manage_SearchKeyPressed

    private void tbl_AttendeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AttendeeListMouseClicked
        if(evt.getClickCount()==2){
            int selRow = tbl_AttendeeList.getSelectedRow();
            String controlno = tbl_AttendeeList.getValueAt(selRow, 0).toString();
            
            AttendeeController attendController = new AttendeeController();
            Attendee attendee = attendController.getAttendee(controlno);
            
            
            txt_Manage_CN.setEditable(false);
            txt_Manage_CN.setText(attendee.getControlno());
            txt_Manage_EC.setText(attendee.getEvent_code());
            txt_Manage_ClientName.setText(attendee.getClient_name());
            txt_Manage_ClientAge.setText(attendee.getClient_age() + "");
            cmb_Manage_ClientGender.setSelectedItem(attendee.getClient_gender());

            btn_Manage_Save.setText("UPDATE");
            btn_Manage_Reset.setText("CANCEL");

            btn_Manage_delete.setEnabled(false);
            txt_Manage_CN.setEditable(false);
            txt_Manage_CN.requestFocus();
            isEdit = false;
            
        }
        else{
            int selRow = tbl_AttendeeList.getSelectedRow();
            attendeeCNno = tbl_AttendeeList.getValueAt(selRow, 0).toString();
            btn_Manage_delete.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_AttendeeListMouseClicked

    private void filter (String query, int columnIndex){
        TableRowSorter<DefaultTableModel> tr =new TableRowSorter<> (dm);
        tbl_AttendeeList.setRowSorter(tr);
        
        if (!query.equals("-")){
            tr.setRowFilter(RowFilter.regexFilter(query, columnIndex));
        }else{
            tbl_AttendeeList.setRowSorter(tr);
        }
    }

    
    private void cmb_Manage_SelectEventItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_Manage_SelectEventItemStateChanged
        String query = cmb_Manage_SelectEvent.getSelectedItem().toString();
        
        filter(query, columnIndex);

    }//GEN-LAST:event_cmb_Manage_SelectEventItemStateChanged

    
    
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
            java.util.logging.Logger.getLogger(AttendeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Manage_Reset;
    private javax.swing.JButton btn_Manage_Save;
    private javax.swing.JButton btn_Manage_delete;
    private javax.swing.JComboBox<String> cmb_Manage_ClientGender;
    private javax.swing.JComboBox<String> cmb_Manage_SelectEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel lblCtrlnShow;
    private javax.swing.JTable tbl_AttendeeList;
    private javax.swing.JTextField txt_Manage_CN;
    private javax.swing.JTextField txt_Manage_ClientAge;
    private javax.swing.JTextField txt_Manage_ClientName;
    private javax.swing.JTextField txt_Manage_EC;
    private javax.swing.JTextField txt_Manage_Search;
    // End of variables declaration//GEN-END:variables

    private void LoadAttendees() {
        AttendeeController attendController = new AttendeeController();
        List<Attendee> list = attendController.attendeeList();
        DefaultTableModel model = (DefaultTableModel) tbl_AttendeeList.getModel();
        model.setRowCount(0);
        
        for(Attendee attendee: list){
            String controlno = attendee.getControlno();
            String event_code = attendee.getEvent_code();
            String client_name =  attendee.getClient_name();
            int client_age = attendee.getClient_age();
            String client_gender = attendee.getClient_gender();
            
            model.addRow(new Object[]{controlno, event_code, client_name, client_age, client_gender});
        }
    }

    private void Reset() {
        txt_Manage_CN.setText("");
        txt_Manage_EC.setText("");
        txt_Manage_ClientName.setText("");
        txt_Manage_ClientAge.setText("");
        cmb_Manage_ClientGender.setSelectedItem("");
                
        btn_Manage_Save.setText("SAVE");
        btn_Manage_Reset.setText("RESET");
        
        btn_Manage_delete.setEnabled(false);
        txt_Manage_CN.setEditable(false);
        txt_Manage_CN.requestFocus();
        isEdit = false;
    }

}
