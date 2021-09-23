
package medicalstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String user="",pass="",s="";
    byte r=0;
    
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        show = new javax.swing.JButton();
        logIn_bt = new javax.swing.JButton();
        reset_bt = new javax.swing.JButton();
        change_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn Window");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("User Name");

        username_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_tfActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        password_pf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password_pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_pfActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        logIn_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logIn_bt.setText("Log In");
        logIn_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logIn_btMouseEntered(evt);
            }
        });
        logIn_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logIn_btActionPerformed(evt);
            }
        });

        reset_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset_bt.setText("Reset");
        reset_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btActionPerformed(evt);
            }
        });

        change_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        change_bt.setText("Change Password");
        change_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(logIn_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(reset_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logIn_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reset_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfActionPerformed

    private void password_pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_pfActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
      if(show.getText().equals("Show")){
            show.setText("Hide");
            password_pf.setEchoChar((char)0);
        } else if(show.getText().equals("Hide")) {
            show.setText("Show");
            password_pf.setEchoChar('*');
        } 
    }//GEN-LAST:event_showActionPerformed

    private void logIn_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logIn_btActionPerformed
            user="";
            pass="";
            s="";
            r=0;
            char str[]=password_pf.getPassword();
            for(int i=0;i<str.length;i++)
                s=s+str[i];
        try {
            
            stmt=con.prepareStatement("select username,password from login");
            rs=stmt.executeQuery();
            while(rs.next()) {
                user=rs.getString(1);
                pass=rs.getString(2);
                if(s.equals(pass)&&username_tf.getText().equals(user)){
                    r=1;
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(r==1)
        {
        new MainWindow().setVisible(true);
        username_tf.setText("");
        password_pf.setText("");
        username_tf.requestFocus();
        }
        else
            JOptionPane.showMessageDialog(this,"Wrong password");
    }//GEN-LAST:event_logIn_btActionPerformed

    private void logIn_btMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logIn_btMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logIn_btMouseEntered

    private void change_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btActionPerformed
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_change_btActionPerformed

    private void reset_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btActionPerformed
        username_tf.setText("");
        password_pf.setText("");
        username_tf.requestFocus();
    }//GEN-LAST:event_reset_btActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logIn_bt;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton reset_bt;
    private javax.swing.JButton show;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
