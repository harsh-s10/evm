/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electronicvotingmachine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Paramjeet Singh
 */
public class VotingScreen extends javax.swing.JFrame {

    /**
     * Creates new form VotingScreen
     */
    Connection con;
    PreparedStatement ps;
    public static String x=Login.userName;
    public VotingScreen() {
        initComponents();
        jLabel10.setText(Login.userName);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/evm","root","h9ps@9901");
        
        }
        catch(Exception ex)
        {
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bjp = new javax.swing.JButton();
        congress = new javax.swing.JButton();
        aap = new javax.swing.JButton();
        cpi = new javax.swing.JButton();
        ncp = new javax.swing.JButton();
        bsp = new javax.swing.JButton();
        sp = new javax.swing.JButton();
        nota = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/bjp.png"))); // NOI18N
        jPanel1.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/congress.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/aap_1.png"))); // NOI18N
        jPanel1.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/CPI.png"))); // NOI18N
        jPanel1.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/ncp1.png"))); // NOI18N
        jPanel1.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/bsp1.png"))); // NOI18N
        jPanel1.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/sp1.png"))); // NOI18N
        jPanel1.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicvotingmachine/nota1.png"))); // NOI18N
        jPanel1.add(jLabel8);

        jPanel2.setLayout(new java.awt.GridLayout(8, 1));

        bjp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bjp.setForeground(new java.awt.Color(255, 51, 0));
        bjp.setText("BJP");
        bjp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjpActionPerformed(evt);
            }
        });
        jPanel2.add(bjp);

        congress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        congress.setForeground(new java.awt.Color(0, 153, 51));
        congress.setText("CONGRESS");
        congress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congressActionPerformed(evt);
            }
        });
        jPanel2.add(congress);

        aap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aap.setText("AAP");
        aap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aapActionPerformed(evt);
            }
        });
        jPanel2.add(aap);

        cpi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cpi.setForeground(new java.awt.Color(0, 153, 153));
        cpi.setText("CPI");
        cpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpiActionPerformed(evt);
            }
        });
        jPanel2.add(cpi);

        ncp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ncp.setForeground(new java.awt.Color(0, 102, 0));
        ncp.setText("NCP");
        ncp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncpActionPerformed(evt);
            }
        });
        jPanel2.add(ncp);

        bsp.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        bsp.setForeground(new java.awt.Color(51, 0, 153));
        bsp.setText("BSP");
        bsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bspActionPerformed(evt);
            }
        });
        jPanel2.add(bsp);

        sp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sp.setForeground(new java.awt.Color(204, 204, 0));
        sp.setText("SP");
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        jPanel2.add(sp);

        nota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nota.setText("NOTA");
        nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaActionPerformed(evt);
            }
        });
        jPanel2.add(nota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="SP";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_spActionPerformed

    private void bjpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjpActionPerformed
        // TODO add your handling code here:
        try{
            String party_name="BJP";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_bjpActionPerformed

    private void bspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bspActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="BSP";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_bspActionPerformed

    private void congressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congressActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="CONGRESS";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_congressActionPerformed

    private void aapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aapActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="AAP";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_aapActionPerformed

    private void ncpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncpActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="NCP";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_ncpActionPerformed

    private void cpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpiActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="CPI";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_cpiActionPerformed

    private void notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaActionPerformed
        // TODO add your handling code here:
           try{
            String party_name="NOTA";
            choice(party_name);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_notaActionPerformed
public void choice(String partyname){
try {
    String sql1="insert into vote values(?,?)";
    ps=con.prepareStatement(sql1);
    ps.setString(1, x);
    System.out.println(x);
    ps.setString(2, partyname);
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null,"Congratulations, you have casted your vote");
    this.setVisible(false);
}
catch(Exception ex)
{
    System.out.println(ex);
}
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
            java.util.logging.Logger.getLogger(VotingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aap;
    private javax.swing.JButton bjp;
    private javax.swing.JButton bsp;
    private javax.swing.JButton congress;
    private javax.swing.JButton cpi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ncp;
    private javax.swing.JButton nota;
    private javax.swing.JButton sp;
    // End of variables declaration//GEN-END:variables
}
