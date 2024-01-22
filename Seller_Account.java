/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.managment;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author My PC
 */
public class Seller_Account extends javax.swing.JFrame {

    /**
     * Creates new form Seller_Account
     */
    public Seller_Account() {
        initComponents();
        SelectSeller();
        
    }

    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    public void SelectSeller(){
        
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from AWAIS.SELLERTABLE");
            tableseller.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        } catch(SQLException ex) {
            Logger.getLogger(Seller_Account.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SellerId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SellerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Sellergender = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        addbtnseller = new javax.swing.JButton();
        updateseller = new javax.swing.JButton();
        deletebtnseller = new javax.swing.JButton();
        clearbtnseller = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableseller = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Sellerpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selleracc = new javax.swing.JButton();
        category = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(242, 231, 192));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        SellerId.setForeground(new java.awt.Color(255, 51, 102));
        SellerId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SellerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerIdActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Seller ID:");

        SellerName.setForeground(new java.awt.Color(255, 51, 102));
        SellerName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SellerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerNameActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("Passward:");

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setText("Name:");

        Sellergender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sellergender.setForeground(new java.awt.Color(255, 51, 102));
        Sellergender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setText("Gender:");

        addbtnseller.setBackground(new java.awt.Color(242, 231, 192));
        addbtnseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addbtnseller.setForeground(new java.awt.Color(255, 51, 102));
        addbtnseller.setText("ADD");
        addbtnseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnsellerMouseClicked(evt);
            }
        });
        addbtnseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnsellerActionPerformed(evt);
            }
        });

        updateseller.setBackground(new java.awt.Color(242, 231, 192));
        updateseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updateseller.setForeground(new java.awt.Color(255, 51, 102));
        updateseller.setText("UPDATE");
        updateseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatesellerMouseClicked(evt);
            }
        });
        updateseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesellerActionPerformed(evt);
            }
        });

        deletebtnseller.setBackground(new java.awt.Color(242, 231, 192));
        deletebtnseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deletebtnseller.setForeground(new java.awt.Color(255, 51, 102));
        deletebtnseller.setText("Delete");
        deletebtnseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnsellerMouseClicked(evt);
            }
        });
        deletebtnseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnsellerActionPerformed(evt);
            }
        });

        clearbtnseller.setBackground(new java.awt.Color(242, 231, 192));
        clearbtnseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearbtnseller.setForeground(new java.awt.Color(255, 51, 102));
        clearbtnseller.setText("CLEAR");
        clearbtnseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnsellerMouseClicked(evt);
            }
        });
        clearbtnseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnsellerActionPerformed(evt);
            }
        });

        tableseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tableseller.setForeground(new java.awt.Color(255, 51, 102));
        tableseller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Seller ID", "User Name", "Gender"
            }
        ));
        tableseller.setRowHeight(20);
        tableseller.setSelectionBackground(new java.awt.Color(242, 231, 192));
        tableseller.setSelectionForeground(new java.awt.Color(255, 51, 102));
        tableseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesellerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableseller);

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 102));
        jLabel7.setText("Seller Account");

        Sellerpass.setForeground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(SellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(147, 147, 147)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sellergender, 0, 200, Short.MAX_VALUE)
                            .addComponent(Sellerpass)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(addbtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(updateseller, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(deletebtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(clearbtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(Sellerpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Sellergender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/managment/placeholder (1).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 102));
        jLabel9.setText("Value Mart");

        selleracc.setBackground(new java.awt.Color(255, 255, 255));
        selleracc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        selleracc.setForeground(new java.awt.Color(255, 51, 102));
        selleracc.setText("Manage Products");
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
        category.setText("Manage Category");
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
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(selleracc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerIdActionPerformed

    private void SellerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerNameActionPerformed

    private void addbtnsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnsellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnsellerActionPerformed

    private void updatesellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatesellerActionPerformed

    private void deletebtnsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnsellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnsellerActionPerformed

    private void clearbtnsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnsellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnsellerActionPerformed

    private void addbtnsellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnsellerMouseClicked
      if (SellerId.getText().isEmpty() || SellerName.getText().isEmpty() || Sellerpass.getText().isEmpty()
            || Sellergender.getSelectedItem().toString().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Kindly Enter Missing Value...");
    } else {
        String password = Sellerpass.getText();
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%.*?&])[A-Za-z\\d@$!%*?&]{8,}$";
            if(SellerName.getText().matches("^[A-Za-z]+$ ")){
                JOptionPane.showMessageDialog(this, "Kindly Enter Character in Name.....");
            } 
            else if(SellerId.getText().matches("^\\d{10}$"))
            {
                                      JOptionPane.showMessageDialog(this, "Kindly Enter ID in Name.....");
            }
            else{
        if (password.matches(regex)) {
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket", "awais", "awais");
                PreparedStatement add = con.prepareStatement("Insert into SELLERTABLE values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(SellerId.getText()));
                add.setString(2, SellerName.getText());
                add.setString(3, Sellerpass.getText());
                add.setString(4, Sellergender.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                con.close();

                SelectSeller();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String suggestionMessage = "Suggested password format: At least one uppercase letter, one digit, and one special character.";
            JOptionPane.showMessageDialog(this, "Password is invalid. " + suggestionMessage, "Invalid Password", JOptionPane.WARNING_MESSAGE);
        }
    }}
    }//GEN-LAST:event_addbtnsellerMouseClicked

    private void tablesellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesellerMouseClicked
       TableModel model=tableseller.getModel();
       int index=tableseller.getSelectedRow();
       SellerId.setText(model.getValueAt(index,0 ).toString());
       SellerName.setText(model.getValueAt(index, 1).toString());
       Sellerpass.setText(model.getValueAt(index, 2).toString());
       Sellergender.setSelectedItem(model.getValueAt(index,3).toString());
       
         
    }//GEN-LAST:event_tablesellerMouseClicked

    private void clearbtnsellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnsellerMouseClicked
        SellerId.setText("");
        SellerName.setText("");
        Sellerpass.setText("");
    }//GEN-LAST:event_clearbtnsellerMouseClicked

    private void deletebtnsellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnsellerMouseClicked
        if(SellerId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter a Seller to be deleted");
        }else{
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");
            String Sellid=SellerId.getText();
            String Query="Delete from AWAIS.SELLERTABLE where SELLERID= "+Sellid;
            stmt=con.createStatement();
            stmt.executeUpdate(Query);
            SelectSeller();
            JOptionPane.showMessageDialog(this,"Seller Deleted Sucessfully");
        } catch (SQLException ex) {
            Logger.getLogger(Seller_Account.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_deletebtnsellerMouseClicked

    private void updatesellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesellerMouseClicked
      if(SellerId.getText().isEmpty()||SellerName.getText().isEmpty()||Sellerpass.getText().isEmpty()
               ||Sellergender.getSelectedItem().toString().isEmpty()){
       JOptionPane.showMessageDialog(this,"Kindly Enter Missing Value...");
       }
       else{
           
            try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket","awais","awais");     
          String query = "UPDATE AWAIS.SELLERTABLE SET SELLERNAME='" + SellerName.getText() + "', SELLERPASSWARD='" + Sellerpass.getText() + "', SELLERGENDER='" + Sellergender.getSelectedItem().toString() + "' WHERE SELLERID=" + SellerId.getText();
        stmt=con.createStatement();
        stmt.executeUpdate(query);
        SelectSeller();
        JOptionPane.showMessageDialog(this,"Record Updated");
            } catch (Exception e) {
            
            e.printStackTrace();
        }
       }   
    }//GEN-LAST:event_updatesellerMouseClicked

    private void selleraccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selleraccMouseClicked
        new Manageproduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selleraccMouseClicked

    private void selleraccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selleraccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selleraccActionPerformed

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        new Manage_Category().setVisible(true);
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
            java.util.logging.Logger.getLogger(Seller_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SellerId;
    private javax.swing.JTextField SellerName;
    private javax.swing.JComboBox<String> Sellergender;
    private javax.swing.JPasswordField Sellerpass;
    private javax.swing.JButton addbtnseller;
    private javax.swing.JButton category;
    private javax.swing.JButton clearbtnseller;
    private javax.swing.JButton deletebtnseller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selleracc;
    private javax.swing.JTable tableseller;
    private javax.swing.JButton updateseller;
    // End of variables declaration//GEN-END:variables
}
