
package medicalstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicineEntry extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement stmt;
    public MedicineEntry() {
        initComponents();
        this.getRootPane().setDefaultButton(add_bt);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cname_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        price_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        type_cb = new javax.swing.JComboBox<>();
        mfd = new datechooser.beans.DateChooserCombo();
        exp = new datechooser.beans.DateChooserCombo();
        jLabel13 = new javax.swing.JLabel();
        add_bt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        quantity_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Medicine Entry");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Medicine Entry");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Medicine Id.");

        id_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_tfFocusLost(evt);
            }
        });
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Medicine Nmae");

        name_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Medicine Company Name");

        cname_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cname_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_tfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Price");

        price_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_tfActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Medicine Type");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Mfd. Date");

        type_cb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        type_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablets", "Capsuls", "Injections", " " }));

        mfd.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));

        exp.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Exp. Date");

        add_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_bt.setText("Add to Stock");
        add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Quantity");

        quantity_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantity_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(mfd, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(add_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGap(9, 9, 9)
                        .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(cname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(mfd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(add_bt)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void cname_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cname_tfActionPerformed

    private void price_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_tfActionPerformed

    private void add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btActionPerformed
        try {
            con=Conn.conLink();
            stmt = con.prepareStatement("insert into medicine values(?,?,?,?,?,?,?,?)");
            stmt.setString(1,id_tf.getText());
            stmt.setString(2,name_tf.getText());
            stmt.setString(3,cname_tf.getText());
            stmt.setString(4,(String) type_cb.getSelectedItem());
            Calendar c=mfd.getSelectedDate();
            stmt.setString(5,""+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
            Calendar d=exp.getSelectedDate();
            stmt.setString(6,""+d.get(Calendar.DATE)+"/"+d.get(Calendar.MONTH)+"/"+d.get(Calendar.YEAR));
            stmt.setString(7,price_tf.getText());
            stmt.setString(8,quantity_tf.getText());
            Byte r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!", "Medical Store", JOptionPane.YES_NO_OPTION);
            Byte s=0;
            if (r == 0)        
                s =(byte)stmt.executeUpdate();
            stmt = con.prepareStatement("insert into stock values(?,?,?)");
            stmt.setString(1,id_tf.getText());
            stmt.setString(2,name_tf.getText());
            stmt.setString(3,quantity_tf.getText());
            Byte t=(byte)stmt.executeUpdate();
            if(t==1&&s==1)
                JOptionPane.showMessageDialog(this,"Record Inserted Into Database");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MedicineEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_btActionPerformed

    private void quantity_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_tfActionPerformed

    private void id_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_tfFocusLost
        try {
            con=Conn.conLink();
            String url = "select name from medicine where ";
            url=url+"upper(id)=?";
            stmt=con.prepareStatement(url);
            stmt.setString(1,id_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"Please entre unique medicine id.","warning",JOptionPane.ERROR_MESSAGE);
                id_tf.requestFocus();
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MedicineEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_id_tfFocusLost

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bt;
    private javax.swing.JTextField cname_tf;
    private datechooser.beans.DateChooserCombo exp;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private datechooser.beans.DateChooserCombo mfd;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField price_tf;
    private javax.swing.JTextField quantity_tf;
    private javax.swing.JComboBox<String> type_cb;
    // End of variables declaration//GEN-END:variables
}
