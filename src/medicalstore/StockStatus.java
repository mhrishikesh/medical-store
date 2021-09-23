
package medicalstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StockStatus extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String url;
    
    public StockStatus() {
            initComponents();
            this.setLocationRelativeTo(null);
        try {
            con=Conn.conLink();
            stmt=con.prepareStatement("select * from Stock");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                DefaultTableModel m=(DefaultTableModel)stock_tb.getModel();
                Object []obj={rs.getString(1),rs.getString(2),rs.getString(3)};
                m.addRow(obj);
            }    
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        stock_tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mfd_tf = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avlq_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        exp_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addq_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock Status");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stock_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Id.", "Medicine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(stock_tb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 800, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Medicine Id.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 83, -1, 28));

        id_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });
        getContentPane().add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 87, 136, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mfd");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 113, -1));

        mfd_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(mfd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 133, 28));

        update_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update_bt.setText("Update");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });
        getContentPane().add(update_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 121, 28));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 107, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Stock Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Avl.Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 113, 28));

        avlq_tf.setEditable(false);
        avlq_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(avlq_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 133, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Exp. date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 113, 28));

        exp_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(exp_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 133, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Add Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 28));

        addq_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(addq_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 133, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Med. Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 113, -1));

        name_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });
        getContentPane().add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 133, 28));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 113, 28));

        price_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(price_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 133, 28));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addq_tf.setText("0");
        try {
            con=Conn.conLink();
            url = "select name,mfd,expd,price from medicine where ";
            url=url+"upper(id)=?";
            stmt=con.prepareStatement(url);
            stmt.setString(1,id_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
                {
                    name_tf.setText(rs.getString(1));
                    mfd_tf.setText(rs.getString(2));
                    exp_tf.setText(rs.getString(3));
                    price_tf.setText(rs.getString(4));
                }
            url = "select quantity from stock where ";
            url=url+"upper(id)=?";
            stmt=con.prepareStatement(url);
            stmt.setString(1,id_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
                {
                    avlq_tf.setText(rs.getString(1));
                }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
            try {
                con=Conn.conLink();
                url="delete from medicine where upper(id)=?";
                stmt=con.prepareStatement(url);
                stmt.setString(1,id_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                url="delete from stock where upper(id)=?";
                stmt=con.prepareStatement(url);
                stmt.setString(1,id_tf.getText().toUpperCase());
                int s=stmt.executeUpdate();
                if(r>0&&s>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
            con=Conn.conLink();
            stmt=con.prepareStatement("select * from Stock");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                DefaultTableModel m=(DefaultTableModel)stock_tb.getModel();
                Object []obj={rs.getString(1),rs.getString(2),rs.getString(3)};
                m.addRow(obj);
            }    
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

        try {
            con=Conn.conLink();
            stmt=con.prepareStatement("update stock set name=?,quantity=? where upper(id)=?");
            stmt.setString(1,(name_tf.getText()));
            stmt.setInt(2,Integer.parseInt(avlq_tf.getText())+Integer.parseInt(addq_tf.getText()));
            stmt.setString(3,(id_tf.getText()).toUpperCase());
            int r=stmt.executeUpdate();
            stmt=con.prepareStatement("update medicine set mfd=?,expd=?,price=? where upper(id)=?");
            stmt.setString(1,(mfd_tf.getText()));
            stmt.setString(2,(exp_tf.getText()));
            stmt.setInt(3,Integer.parseInt(price_tf.getText()));
            stmt.setString(4,(id_tf.getText()).toUpperCase());
            int s=stmt.executeUpdate();
            con.close();
                if(r>0&&s>0)
                   JOptionPane.showMessageDialog(this,"successfully updated!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not updated!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=Conn.conLink();
            stmt=con.prepareStatement("select * from Stock");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                DefaultTableModel m=(DefaultTableModel)stock_tb.getModel();
                Object []obj={rs.getString(1),rs.getString(2),rs.getString(3)};
                m.addRow(obj);
            }    
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(StockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_update_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addq_tf;
    private javax.swing.JTextField avlq_tf;
    private javax.swing.JTextField exp_tf;
    private javax.swing.JTextField id_tf;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mfd_tf;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField price_tf;
    private javax.swing.JTable stock_tb;
    private javax.swing.JButton update_bt;
    // End of variables declaration//GEN-END:variables
}
