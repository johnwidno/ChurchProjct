/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BoardMAnagement;

import Gestiondeformulairecarte.Selectimage;
import MesClasses.VariableGlobale;

/**
 *
 * @author Dorcy
 */
public class PanelUtilisateur extends javax.swing.JPanel {

    /**
     * Creates new form ProfileEglise
     */
    public PanelUtilisateur() {
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

        panelegliseinfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CardeCenter = new javax.swing.JPanel();
        PanelListUtilisateur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        NouveuUtlisateur = new javax.swing.JPanel();
        Creeutilisateru = new javax.swing.JPanel();
        Comptuseser = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Usenameincorecte = new javax.swing.JLabel();
        Passwordincorecte = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Password1 = new javax.swing.JPasswordField();
        Passwordincorecte1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        recherche = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboSelecteddepartement = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        comboSelecteddepartement1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        INSCRIRE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        panelegliseinfo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CardeCenter.setLayout(new java.awt.CardLayout());

        PanelListUtilisateur.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "john", "jean @3n", "john widno", "widno dorcy", "Administrateur", "23-23-23"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NO ", "Nom d 'utilisateur", "Mot de pase", "Nom ", "Prenom", "Fonction", "Date de creation"
            }
        ));
        jTable1.setRowHeight(60);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Ajouter un utlisateur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelListUtilisateurLayout = new javax.swing.GroupLayout(PanelListUtilisateur);
        PanelListUtilisateur.setLayout(PanelListUtilisateurLayout);
        PanelListUtilisateurLayout.setHorizontalGroup(
            PanelListUtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListUtilisateurLayout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(381, 381, 381))
            .addGroup(PanelListUtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelListUtilisateurLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        PanelListUtilisateurLayout.setVerticalGroup(
            PanelListUtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListUtilisateurLayout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
            .addGroup(PanelListUtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListUtilisateurLayout.createSequentialGroup()
                    .addContainerGap(103, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        CardeCenter.add(PanelListUtilisateur, "card2");

        NouveuUtlisateur.setBackground(new java.awt.Color(255, 255, 255));

        Creeutilisateru.setBackground(new java.awt.Color(255, 255, 255));

        Comptuseser.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBackground(new java.awt.Color(0, 0, 51));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 51));
        jLabel38.setText("NOM D'UTILISATEUR");

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CONFIRMER LE MOT DE PASSE");

        username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setText("votre nom nom d'utilisateur");
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Password.setText("jPasswordField1");
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Usenameincorecte.setForeground(new java.awt.Color(102, 0, 0));
        Usenameincorecte.setText("nom user incorect");

        Passwordincorecte.setForeground(new java.awt.Color(102, 0, 0));
        Passwordincorecte.setText("Mot  de passe incorecter");

        jLabel39.setBackground(new java.awt.Color(0, 0, 51));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 51));
        jLabel39.setText("MOT DE PASSE");

        Password1.setText("jPasswordField1");
        Password1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password1ActionPerformed(evt);
            }
        });

        Passwordincorecte1.setForeground(new java.awt.Color(102, 0, 0));
        Passwordincorecte1.setText("Mot  de passe incorecter");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(Usenameincorecte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(Passwordincorecte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Password1)
                    .addComponent(Passwordincorecte1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel38)
                .addGap(54, 54, 54)
                .addComponent(Usenameincorecte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passwordincorecte1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passwordincorecte)
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ComptuseserLayout = new javax.swing.GroupLayout(Comptuseser);
        Comptuseser.setLayout(ComptuseserLayout);
        ComptuseserLayout.setHorizontalGroup(
            ComptuseserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComptuseserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ComptuseserLayout.setVerticalGroup(
            ComptuseserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComptuseserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel35.setBackground(new java.awt.Color(0, 0, 51));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("CREER UN COMPTE UTILISATEUR");

        recherche.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        recherche.setText("recherche   (par date) .");
        recherche.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionMembres/membreicones/icons8_search_24px_2.png"))); // NOI18N

        jLabel1.setText("NB : Utilisateur doi d'abord  être un employé");

        comboSelecteddepartement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSelecteddepartement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autre Activités" }));
        comboSelecteddepartement.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        comboSelecteddepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelecteddepartementActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("john widno dorcy");

        jLabel4.setText("Adminisrateur general");

        jLabel7.setText("Secretaire");

        jLabel8.setText("02/23/23");

        username1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        username1.setForeground(new java.awt.Color(102, 102, 102));
        username1.setText("Comme administraeur");
        username1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        username1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username1MouseClicked(evt);
            }
        });
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });

        comboSelecteddepartement1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSelecteddepartement1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir role ici..." }));
        comboSelecteddepartement1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        comboSelecteddepartement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelecteddepartement1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(username1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(comboSelecteddepartement1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(comboSelecteddepartement1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Creer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        INSCRIRE.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        INSCRIRE.setForeground(new java.awt.Color(0, 0, 51));
        INSCRIRE.setText("Annuler");
        INSCRIRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSCRIREActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreeutilisateruLayout = new javax.swing.GroupLayout(Creeutilisateru);
        Creeutilisateru.setLayout(CreeutilisateruLayout);
        CreeutilisateruLayout.setHorizontalGroup(
            CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreeutilisateruLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CreeutilisateruLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboSelecteddepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CreeutilisateruLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Comptuseser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CreeutilisateruLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(INSCRIRE, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreeutilisateruLayout.setVerticalGroup(
            CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreeutilisateruLayout.createSequentialGroup()
                .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Comptuseser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CreeutilisateruLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(51, 51, 51)
                        .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSelecteddepartement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CreeutilisateruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSCRIRE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NouveuUtlisateurLayout = new javax.swing.GroupLayout(NouveuUtlisateur);
        NouveuUtlisateur.setLayout(NouveuUtlisateurLayout);
        NouveuUtlisateurLayout.setHorizontalGroup(
            NouveuUtlisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
            .addGroup(NouveuUtlisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NouveuUtlisateurLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Creeutilisateru, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        NouveuUtlisateurLayout.setVerticalGroup(
            NouveuUtlisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(NouveuUtlisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NouveuUtlisateurLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Creeutilisateru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        CardeCenter.add(NouveuUtlisateur, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CardeCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CardeCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Panel Utilisateurs");

        javax.swing.GroupLayout panelegliseinfoLayout = new javax.swing.GroupLayout(panelegliseinfo);
        panelegliseinfo.setLayout(panelegliseinfoLayout);
        panelegliseinfoLayout.setHorizontalGroup(
            panelegliseinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelegliseinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(511, 511, 511))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelegliseinfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        panelegliseinfoLayout.setVerticalGroup(
            panelegliseinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelegliseinfoLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelegliseinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelegliseinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CardeCenter.removeAll();
        CardeCenter.add(NouveuUtlisateur);
        CardeCenter.repaint();
        CardeCenter.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        Password.setText("");
    }//GEN-LAST:event_PasswordActionPerformed

    private void Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password1ActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        recherche.setText("");
    }//GEN-LAST:event_rechercheActionPerformed

    private void comboSelecteddepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelecteddepartementActionPerformed

    }//GEN-LAST:event_comboSelecteddepartementActionPerformed

    private void username1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_username1MouseClicked

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void comboSelecteddepartement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelecteddepartement1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSelecteddepartement1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Passwordincorecte.setText("");
        Usenameincorecte.setText("");
          CardeCenter.removeAll();
        CardeCenter.add(PanelListUtilisateur);
        CardeCenter.repaint();
        CardeCenter.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void INSCRIREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSCRIREActionPerformed

    }//GEN-LAST:event_INSCRIREActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardeCenter;
    private javax.swing.JPanel Comptuseser;
    private javax.swing.JPanel Creeutilisateru;
    private javax.swing.JButton INSCRIRE;
    private javax.swing.JPanel NouveuUtlisateur;
    private javax.swing.JPanel PanelListUtilisateur;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JLabel Passwordincorecte;
    private javax.swing.JLabel Passwordincorecte1;
    private javax.swing.JLabel Usenameincorecte;
    private javax.swing.JComboBox<String> comboSelecteddepartement;
    private javax.swing.JComboBox<String> comboSelecteddepartement1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelegliseinfo;
    private javax.swing.JTextField recherche;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
