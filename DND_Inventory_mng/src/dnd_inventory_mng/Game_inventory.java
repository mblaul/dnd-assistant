/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Game_inventory extends javax.swing.JFrame {

    /**
     * Creates new form Game_inventory
     */
//<<<<<<< HEAD
    
//=======
    private JList<String> itemJList;
   
//>>>>>>> 6a71f19027d82264f18363986583ffda8d4c2a98
    
    public Game_inventory() {
       
        
        
        String items[] = {}; 
        DefaultListModel demoList = new DefaultListModel();
        demoList.addElement(ArrayList_Generator.armorItemList.get(0).getName());
        
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_close = new javax.swing.JButton();
        jButton_add_item = new javax.swing.JButton();
        jTabbedPane_itemType = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        int i=0;
        DefaultListModel demoList = new DefaultListModel();
        for(Armor e : ArrayList_Generator.armorItemList){
            demoList.addElement(ArrayList_Generator.armorItemList.get(i).getName());
            i++;
        }
        jList_armorItemlist = new javax.swing.JList<>(demoList);
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        int j=0;
        DefaultListModel rangedList = new DefaultListModel();
        for(Ranged e : ArrayList_Generator.rangedItemList){
            rangedList.addElement(ArrayList_Generator.rangedItemList.get(j).getName());
            j++;
        }
        jList_rangedItemList = new javax.swing.JList<>(rangedList);
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        int k=0;
        DefaultListModel potionList = new DefaultListModel();
        for(Potion e : ArrayList_Generator.potionItemList){
            potionList.addElement(ArrayList_Generator.potionItemList.get(k).getName());
            k++;
        }
        jList_potionItemList = new javax.swing.JList<>(potionList);
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        int m=0;
        DefaultListModel meleeList = new DefaultListModel();
        for(Melee e : ArrayList_Generator.meleeItemList){
            meleeList.addElement(ArrayList_Generator.meleeItemList.get(m).getName());
            m++;
        }
        jList_meleeItemList = new javax.swing.JList<>(meleeList);
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        int q=0;
        DefaultListModel adventureList = new DefaultListModel();
        for(Adventure e : ArrayList_Generator.adventureItemList){
            adventureList.addElement(ArrayList_Generator.adventureItemList.get(q).getName());
            q++;
        }
        jList_adventureItemList = new javax.swing.JList<>(adventureList);
        jLabel_itemImg = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea_stats = new javax.swing.JTextArea();
        jButton_view = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_close.setBackground(new java.awt.Color(255, 51, 0));
        jButton_close.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jButton_close.setText("Close");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        jButton_add_item.setBackground(new java.awt.Color(0, 204, 51));
        jButton_add_item.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jButton_add_item.setText("Add Item");
        jButton_add_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_itemActionPerformed(evt);
            }
        });

        jTabbedPane_itemType.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N

        jList_armorItemlist.setBackground(new java.awt.Color(153, 255, 255));
        jList_armorItemlist.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jList_armorItemlist, org.jdesktop.beansbinding.ObjectProperty.create(), jList_armorItemlist, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jList_armorItemlist);

        jTabbedPane_itemType.addTab("Armor", jScrollPane2);

        jList_rangedItemList.setBackground(new java.awt.Color(204, 204, 255));
        jList_rangedItemList.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jList_rangedItemList.setModel(rangedList);
        jScrollPane3.setViewportView(jList_rangedItemList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_itemType.addTab("Ranged", jPanel2);

        jList_potionItemList.setBackground(new java.awt.Color(255, 102, 102));
        jList_potionItemList.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jList_potionItemList.setModel(potionList);
        jScrollPane4.setViewportView(jList_potionItemList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_itemType.addTab("Potion", jPanel3);

        jList_meleeItemList.setBackground(new java.awt.Color(255, 153, 102));
        jList_meleeItemList.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jList_meleeItemList.setModel(meleeList);
        jScrollPane1.setViewportView(jList_meleeItemList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_itemType.addTab("Melee", jPanel1);

        jList_adventureItemList.setBackground(new java.awt.Color(204, 255, 204));
        jList_adventureItemList.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jList_adventureItemList.setModel(adventureList);
        jScrollPane5.setViewportView(jList_adventureItemList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_itemType.addTab("Adventure", jPanel4);

        jTextArea_stats.setColumns(20);
        jTextArea_stats.setRows(5);
        jScrollPane7.setViewportView(jTextArea_stats);

        jButton_view.setBackground(new java.awt.Color(0, 204, 51));
        jButton_view.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jButton_view.setText("View Stats");
        jButton_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_itemType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton_close))
                            .addComponent(jLabel_itemImg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_view)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_add_item))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add_item)
                            .addComponent(jButton_view))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_itemImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_close)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane_itemType)
                        .addGap(15, 15, 15))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jButton_add_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_itemActionPerformed
        Add_item p = new Add_item();
            p.setVisible(true);
            
            String[] thinglist = {"a","b","c"};
            JList thingy =(JList) jScrollPane2.getViewport().getView();thingy.setListData(thinglist);
            thingy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JScrollPane jScrollPane2 = new JScrollPane(thingy);
            super.dispose();
            
           
    }//GEN-LAST:event_jButton_add_itemActionPerformed

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jButton_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewActionPerformed
        int i;
        switch(this.jTabbedPane_itemType.getSelectedIndex()){
           case 0 :
            i = this.jList_armorItemlist.getSelectedIndex();
            this.jTextArea_stats.setText(ArrayList_Generator.armorItemList.get(i).toString());
            this.jLabel_itemImg.setIcon(new ImageIcon(this.getClass().getResource("/images/Ironhelmetbgcl.jpg")));
            break;
           case 1 :
            i = this.jList_rangedItemList.getSelectedIndex();
            this.jTextArea_stats.setText(ArrayList_Generator.rangedItemList.get(i).toString());
            this.jLabel_itemImg.setIcon(new ImageIcon(this.getClass().getResource("/images/longbowbgcl copy.jpg")));
            break;
           case 2 :
            i = this.jList_potionItemList.getSelectedIndex();
            this.jTextArea_stats.setText(ArrayList_Generator.potionItemList.get(i).toString());
            this.jLabel_itemImg.setIcon(new ImageIcon(this.getClass().getResource("/images/potioncl copy.jpg")));
            break;
           case 3 :
            i = this.jList_meleeItemList.getSelectedIndex();
            this.jTextArea_stats.setText(ArrayList_Generator.meleeItemList.get(i).toString());
            this.jLabel_itemImg.setIcon(new ImageIcon(this.getClass().getResource("/images/warhammerbgcl copy.jpg")));
            break;
           case 4 :
            i = this.jList_adventureItemList.getSelectedIndex();
            this.jTextArea_stats.setText(ArrayList_Generator.adventureItemList.get(i).toString());
            this.jLabel_itemImg.setIcon(new ImageIcon(this.getClass().getResource("/images/shieldbgcl copy.jpg")));
            break;
            
       }
    }//GEN-LAST:event_jButton_viewActionPerformed

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
            java.util.logging.Logger.getLogger(Game_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_inventory().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_item;
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_view;
    private javax.swing.JLabel jLabel_itemImg;
    private javax.swing.JList<String> jList_adventureItemList;
    private javax.swing.JList<String> jList_armorItemlist;
    private javax.swing.JList<String> jList_meleeItemList;
    private javax.swing.JList<String> jList_potionItemList;
    private javax.swing.JList<String> jList_rangedItemList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane_itemType;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_stats;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
