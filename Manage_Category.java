/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author My PC
 */
public class Manage_Category extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Category
     */
    public Manage_Category() {
        initComponents();
        SelectCategory();
    }
    public void SelectCategory(){
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from AWAIS.CATEGORYTABLE");
            categorytable.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        } catch(SQLException ex) {
            Logger.getLogger(Seller_Account.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }

    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Cat_id_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cat_name_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cat_desc_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorytable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selleracc = new javax.swing.JButton();
        category = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(242, 231, 192));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Cat_id_field.setForeground(new java.awt.Color(255, 51, 102));
        Cat_id_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cat_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_id_fieldActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Category ID:");

        Cat_name_field.setForeground(new java.awt.Color(255, 51, 102));
        Cat_name_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cat_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_name_fieldActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("Description:");

        Cat_desc_field.setForeground(new java.awt.Color(255, 51, 102));
        Cat_desc_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cat_desc_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_desc_fieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setText("Name:");

        addbtn.setBackground(new java.awt.Color(242, 231, 192));
        addbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 51, 102));
        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(242, 231, 192));
        updatebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 51, 102));
        updatebtn.setText("UPDATE");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(242, 231, 192));
        deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 51, 102));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(242, 231, 192));
        clearbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 51, 102));
        clearbtn.setText("CLEAR");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        categorytable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        categorytable.setForeground(new java.awt.Color(255, 51, 102));
        categorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category ID", " Name", "Description"
            }
        ));
        categorytable.setRowHeight(20);
        categorytable.setSelectionBackground(new java.awt.Color(242, 231, 192));
        categorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categorytable);

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 102));
        jLabel7.setText("Manage Categories");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cat_desc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(Cat_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(17, 17, 17)
                            .addComponent(Cat_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(75, 75, 75)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cat_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Cat_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cat_desc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/managment/placeholder (1).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 102));
        jLabel9.setText("Value Mart");

        selleracc.setBackground(new java.awt.Color(255, 255, 255));
        selleracc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        selleracc.setForeground(new java.awt.Color(255, 51, 102));
        selleracc.setText("Manage Seller");
        selleracc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 0, true));
        selleracc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selleraccMouseClicked(evt);
            }
        });
        selleracc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selleraccActionPerformed(evt);
            }
        });

        category.setBackground(new java.awt.Color(255, 255, 255));
        category.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        category.setForeground(new java.awt.Color(255, 51, 102));
        category.setText("Manage Products");
        category.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 0, true));
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selleracc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selleracc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cat_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_id_fieldActionPerformed

    private void Cat_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_name_fieldActionPerformed

    private void Cat_desc_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_desc_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_desc_fieldActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
         if(Cat_id_field.getText().isEmpty()||Cat_name_field.getText().isEmpty()||Cat_desc_field.getText().isEmpty()
            ){
       JOptionPane.showMessageDialog(this,"Kindly Enter Missing Value...");
       }
       else{
           
            try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");
            PreparedStatement add=con.prepareStatement("Insert into CATEGORYTABLE values(?,?,?)");
            add.setInt(1, Integer.valueOf(Cat_id_field.getText()));
            add.setString(2, Cat_name_field.getText());
            add.setString(3, Cat_desc_field.getText());
            int row =add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller Added Sucessfully");
            con.close();
           SelectCategory();
          
        } catch (Exception e) {
            
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_addbtnMouseClicked

    private void categorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytableMouseClicked
        TableModel model=categorytable.getModel();
       int index=categorytable.getSelectedRow();
       Cat_id_field.setText(model.getValueAt(index,0 ).toString());
       Cat_name_field.setText(model.getValueAt(index, 1).toString());
       Cat_desc_field.setText(model.getValueAt(index,2).toString());
    }//GEN-LAST:event_categorytableMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
         Cat_id_field.setText("");
        Cat_name_field.setText("");
        Cat_desc_field.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        if(Cat_id_field.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter a Seller to be deleted");
        }else{
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");
            String Cateid=Cat_id_field.getText();
            String Query="Delete from AWAIS.CATEGORYTABLE where CATID= "+Cateid;
            stmt=con.createStatement();
            stmt.executeUpdate(Query);
            SelectCategory();
            JOptionPane.showMessageDialog(this,"Seller Deleted Sucessfully");
        
        } catch (SQLException ex) {
            Logger.getLogger(Seller_Account.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_deletebtnMouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
       if(Cat_id_field.getText().isEmpty()||Cat_name_field.getText().isEmpty()||Cat_desc_field.getText().isEmpty()
               ){
       JOptionPane.showMessageDialog(this,"Kindly Enter Missing Value...");
       }
       else{
           
            try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");     
          String query = "UPDATE AWAIS.CATEGORYTABLE SET CATNAME='" + Cat_name_field.getText() + "', CATDESC='" + Cat_desc_field.getText() + "' WHERE CATID=" + Cat_id_field.getText();
        stmt=con.createStatement();
        stmt.executeUpdate(query);
        SelectCategory();
        JOptionPane.showMessageDialog(this,"Record Updated");
            } catch (Exception e) {
            
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_updatebtnMouseClicked

    private void selleraccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selleraccMouseClicked
        new Seller_Account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selleraccMouseClicked

    private void selleraccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selleraccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selleraccActionPerformed

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        new Manageproduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryMouseClicked

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
            java.util.logging.Logger.getLogger(Manage_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cat_desc_field;
    private javax.swing.JTextField Cat_id_field;
    private javax.swing.JTextField Cat_name_field;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton category;
    private javax.swing.JTable categorytable;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selleracc;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
