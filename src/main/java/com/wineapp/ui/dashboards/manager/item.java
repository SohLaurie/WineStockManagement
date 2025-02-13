/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineapp.ui.dashboards.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class item extends javax.swing.JFrame {

    /**
     * Creates new form reg
     */
    public item() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     Connection con1;
     PreparedStatement insert; 
     
   
     
 
 
         ////
    private void table_update() {
        int CC;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/winestock","root","");
            insert = con1.prepareStatement("SELECT * FROM item");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable3.getModel();
            DFT.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("Id"));
                    v2.add(Rs.getString("Name"));
                    v2.add(Rs.getString("Type"));
                    v2.add(Rs.getString("Country"));
                    v2.add(Rs.getString("Year"));
                    v2.add(Rs.getString("Quantity"));
                    v2.add(Rs.getString("Price"));
                    v2.add(Rs.getString("supID"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        table1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        supplier = new javax.swing.JTextField();
        item = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("STOCK MANAGEMENT PANEL");

        table1.setBackground(new java.awt.Color(51, 0, 51));
        table1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 102))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Wine_name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");

        type.setBackground(new java.awt.Color(204, 0, 102));
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        add.setForeground(new java.awt.Color(204, 0, 102));
        add.setText("Add Item");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 102));
        update.setText("Update Item");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Country");

        country.setBackground(new java.awt.Color(204, 0, 102));
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        price.setBackground(new java.awt.Color(204, 0, 102));
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        supplier.setBackground(new java.awt.Color(204, 0, 102));
        supplier.setForeground(new java.awt.Color(255, 255, 255));
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });

        item.setBackground(new java.awt.Color(204, 0, 102));
        item.setForeground(new java.awt.Color(255, 255, 255));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        qty.setBackground(new java.awt.Color(204, 0, 102));
        qty.setForeground(new java.awt.Color(255, 255, 255));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        year.setBackground(new java.awt.Color(204, 0, 102));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Year");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supplier_id");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Type");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 102));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table1Layout = new javax.swing.GroupLayout(table1);
        table1.setLayout(table1Layout);
        table1Layout.setHorizontalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table1Layout.createSequentialGroup()
                        .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supplier)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qty, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type)
                            .addComponent(item)
                            .addComponent(country)
                            .addComponent(price))
                        .addContainerGap())
                    .addGroup(table1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        table1Layout.setVerticalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(jButton1))
                .addGap(66, 66, 66))
        );

        jTable3.setBackground(new java.awt.Color(51, 0, 51));
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_id", "Item_name", "Type", "Country", "Year", "Quantity", "Price", "Supplier_id"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        table1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel DFT = (DefaultTableModel) jTable3.getModel();
         int selectedRow =  jTable3.getSelectedRow();
         
         
//         stock.setText(DFT.getValueAt(selectedRow, 0).toString());
        item.setText(DFT.getValueAt(selectedRow, 1).toString());
        type.setText(DFT.getValueAt(selectedRow, 2).toString());
        country.setText(DFT.getValueAt(selectedRow, 3).toString());
        year.setText(DFT.getValueAt(selectedRow, 4).toString());
        qty.setText(DFT.getValueAt(selectedRow, 5).toString());
        price.setText(DFT.getValueAt(selectedRow, 6).toString());
        supplier.setText(DFT.getValueAt(selectedRow, 7).toString());
          
         
    }//GEN-LAST:event_jTable3MouseClicked

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_priceActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        //update function
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int selectedIndex = jTable3.getSelectedRow();
        try {

            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
//           
            String Item=item.getText();
            int Price=Integer.parseInt(price.getText());
            int Quantity =Integer.parseInt(qty.getText());
            int Year= Integer.parseInt(year.getText());
            String Country= country.getText();
            String Type = type.getText();
            int Sup=Integer.parseInt(supplier.getText());
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/winestock","root","");
            insert = con1.prepareStatement("update item set Name= ?, Type=?, Country= ?, Year= ?, Quantity= ?,Price= ?, supID= ? where Id=?");
// 
            insert.setString(1,Item);
            insert.setString(2,Type);
            insert.setString(3,Country);
            insert.setInt(4,Year);
            insert.setInt(5,Quantity);
            insert.setInt(6,Price);
            insert.setInt(7,Sup);
            insert.setInt(8, id);
            insert.executeUpdate();
            
            table_update();
            JOptionPane.showMessageDialog(this, "Stock Updated");
//          
            item.setText("");
            type.setText("");
            country.setText("");
            year.setText("");
            qty.setText("");
            price.setText("");
            supplier.setText("");
            

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

//        String product =stock.getText();
        String Item=item.getText();
            int Price=Integer.parseInt(price.getText());
            int Quantity =Integer.parseInt(qty.getText());
            int Year= Integer.parseInt(year.getText());
            String Country= country.getText();
            String Type = type.getText();
            int Sup= Integer.parseInt(supplier.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/winestock","root","");
            insert = con1.prepareStatement("insert into item(Name,Type,Country,Year,Quantity,Price,supID)values(?,?,?,?,?,?,?)");
//            insert.setString(1, product);
            insert.setString(1,Item);
            insert.setString(2,Type);
            insert.setString(3,Country);
            insert.setInt(4,Year);
            insert.setInt(5,Quantity);
            insert.setInt(6,Price);
            insert.setInt(7,Sup);
            insert.executeUpdate();
            
            table_update();

            JOptionPane.showMessageDialog(this,"Product Saved");

//            stock.setText("");
            item.setText("");
            type.setText("");
            country.setText("");
            year.setText("");
            qty.setText("");
            price.setText("");
            supplier.setText("");
            type.requestFocus();
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField country;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField supplier;
    private javax.swing.JPanel table1;
    private javax.swing.JTextField type;
    private javax.swing.JButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
