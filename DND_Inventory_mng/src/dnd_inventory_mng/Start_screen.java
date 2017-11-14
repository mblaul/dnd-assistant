/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

/**
 *
 * @author duroj
 */
public class Start_screen extends javax.swing.JFrame {

    /**
     * Creates new form Start_screen
     */
    public Start_screen() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_load = new javax.swing.JButton();
        jButton_new = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_load.setText("Load Game");
        jButton_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loadActionPerformed(evt);
            }
        });

        jButton_new.setText("Start New Game");
        jButton_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_newActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 2, 48)); // NOI18N
        jLabel1.setText("Table-Top Titan");

        jButton_quit.setText("Quit");
        jButton_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_load, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_quit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_load, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jButton_quit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_newActionPerformed

        super.dispose();
        Menu_screen m = new Menu_screen();
        m.setVisible(true);
    }//GEN-LAST:event_jButton_newActionPerformed

    private void jButton_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loadActionPerformed

        super.dispose();
        Menu_screen m = new Menu_screen();
        m.setVisible(true);
    }//GEN-LAST:event_jButton_loadActionPerformed

    private void jButton_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_quitActionPerformed

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
            java.util.logging.Logger.getLogger(Start_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        ArrayList_Generator gen = new ArrayList_Generator();
        //Build master inventory list using a method from the InventoryList class
        InventoryList masterInventory = new InventoryList();
        masterInventory.buildItemInventoryList(ArrayList_Generator.armorItemList,ArrayList_Generator.meleeItemList,ArrayList_Generator.rangedItemList,
                                  ArrayList_Generator.potionItemList,ArrayList_Generator.adventureItemList);
                                    
        System.out.println(ArrayList_Generator.armorItemList.get(1).toString());
        
        //System.out.println(rangedItemList.get(1).getAttack());
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_load;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_quit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
