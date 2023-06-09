/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BoardFinancePanel.offrandres;

import BoardMAnagement.*;

/**
 *
 * @author Comptabilité
 */
public class PanelOffrandres extends javax.swing.JPanel {

    /**
     * Creates new form PanelDeposit
     */
    public PanelOffrandres() {
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

        Finances = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Cadreoffrandretransaction = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        rechercheTransaction = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        Finances.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel27.setText("Offrandres");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cadreoffrandretransaction.setBackground(new java.awt.Color(255, 255, 255));
        Cadreoffrandretransaction.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        rechercheTransaction.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rechercheTransaction.setText("Typer ici pour rechercher");
        rechercheTransaction.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rechercheTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheTransactionMouseClicked(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Par date", "type", "" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BoardMAnagement/MainIcnone/icons8_save_32px.png"))); // NOI18N
        jLabel15.setText("PDF");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BoardMAnagement/MainIcnone/icons8_save_32px.png"))); // NOI18N
        jLabel14.setText("Excel");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rechercheTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rechercheTransaction)
                        .addComponent(jComboBox1))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Description", "Reference", "Type", "Unite", "Montant", "Deposit By"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel29.setText("Total  :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel32.setText("100000");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel33.setText("HTG");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel34.setText("100000");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel35.setText("HTG");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel30.setText("Mois Couant :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel36.setText("100000");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel37.setText("USD");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel38.setText("USD");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel39.setText("100000");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel40.setText("Total :");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel41.setText("Année Courante");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30)))
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel40)
                        .addComponent(jLabel41))
                    .addComponent(jLabel35)))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel38))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel37))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel39)
                    .addContainerGap()))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Nouveau");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(201, 201, 201))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cadreoffrandretransaction.add(jPanel2, "card2");

        javax.swing.GroupLayout FinancesLayout = new javax.swing.GroupLayout(Finances);
        Finances.setLayout(FinancesLayout);
        FinancesLayout.setHorizontalGroup(
            FinancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinancesLayout.createSequentialGroup()
                .addComponent(Cadreoffrandretransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FinancesLayout.setVerticalGroup(
            FinancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinancesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Cadreoffrandretransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Finances, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Finances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Nouvelleoffrande noff = new Nouvelleoffrande(null, true);  
        noff.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rechercheTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheTransactionMouseClicked
        rechercheTransaction.setText("");
    }//GEN-LAST:event_rechercheTransactionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadreoffrandretransaction;
    private javax.swing.JPanel Finances;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rechercheTransaction;
    // End of variables declaration//GEN-END:variables
}
