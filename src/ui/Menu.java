
package ui;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    private javax.swing.JPopupMenu optionsMenu;
    
    public Menu() {
        initComponents();
        setSize(1000, 610);
        setResizable(false);
        setLocationRelativeTo(null);
        
        OptionsMenu();
        escalarTodosLosIconos();
    }
    
    
    private void OptionsMenu(){
        optionsMenu = new javax.swing.JPopupMenu();  
        

        javax.swing.JMenuItem itemProfile = new javax.swing.JMenuItem("Mi Información Personal");
        javax.swing.JMenuItem itemReviews = new javax.swing.JMenuItem("Mis Reseñas");
        javax.swing.JMenuItem itemSearch = new javax.swing.JMenuItem("Buscar");
        
        
        javax.swing.JMenuItem itemCredits = new javax.swing.JMenuItem("Créditos");
        itemCredits.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Paraguay Review - Versión 1.0\nDesarrollado por el Equipo de Backend & PM"
                    + "\n Mauricio Agüero - CI: 5.285.627 \n Nayeli Bernal - CI: 5.664.170 \n Antonella Garay - CI: 5.644.950 \n Ezequiel Gonzalez - CI: 5.932.597 "
                    + "\n Fabrizio Mazó - CI: 5.708.103 \n Francisco Núñez - CI: 5.728.021 \n Matias Ojeda - CI: 5.643.062 \n Jorge Ríos - CI: 6.547.706 "
                    + "\n Ivo Vallejos - CI: 5.100.144", "Créditos", JOptionPane.INFORMATION_MESSAGE);
        });
        
       
        optionsMenu.add(itemProfile);
        optionsMenu.add(itemReviews);
        optionsMenu.add(itemSearch);
        optionsMenu.addSeparator(); 
        optionsMenu.add(itemCredits);
        
    }
    
    private void escalarYCentrarIcono(javax.swing.JLabel label, String rutaRecurso, int ancho, int alto) {
        java.net.URL imgURL = getClass().getResource(rutaRecurso);
        if (imgURL != null) {
            javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(imgURL);
            java.awt.Image imagenOriginal = iconoOriginal.getImage();

            java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
            label.setIcon(new javax.swing.ImageIcon(imagenEscalada));

            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        } else {
            logger.log(java.util.logging.Level.WARNING, "No se encontró el recurso: " + rutaRecurso);
        }
    }

    private void escalarTodosLosIconos() {
        int anchoIcono = 140; 
        int altoIcono = 110;

        escalarYCentrarIcono(icon1, "/recursos/tech_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon2, "/recursos/book_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon3, "/recursos/house_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon4, "/recursos/beauty_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon5, "/recursos/clothe_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon6, "/recursos/toys_icon.png", anchoIcono, altoIcono);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        subPanel1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subPanel2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        subPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();

        subPanel4 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        subPanel5 = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        subPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        icon6 = new javax.swing.JLabel();

        subPanel4 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 246, 247));

        btnMenu.setBackground(new java.awt.Color(50, 74, 129));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));

        btnMenu.setText("jButton1");
        btnMenu.setText("Menú");

        btnMenu.setBorder(null);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusable(false);
        btnMenu.addActionListener(this::btnMenuActionPerformed);

        jPanel2.setLayout(new java.awt.GridLayout(2, 3, 20, 20));

        subPanel1.setBackground(new java.awt.Color(255, 255, 255));
        subPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tech_icon.png"))); // NOI18N
        subPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Electrónica");
        jLabel2.setAlignmentX(0.5F);
        subPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        jPanel2.add(subPanel1);

        subPanel2.setBackground(new java.awt.Color(255, 255, 255));
        subPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/book_icon.png"))); // NOI18N
        subPanel2.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Libros");
        jLabel3.setAlignmentX(0.5F);
        subPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        jPanel2.add(subPanel2);

        subPanel3.setBackground(new java.awt.Color(255, 255, 255));
        subPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hogar");
        jLabel4.setAlignmentX(0.5F);
        subPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 20));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/house_icon.png"))); // NOI18N
        subPanel3.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jPanel2.add(subPanel3);


        subPanel4.setBackground(new java.awt.Color(255, 255, 255));
        subPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/beauty_icon.png"))); // NOI18N
        subPanel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Belleza");
        jLabel5.setAlignmentX(0.5F);
        subPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        jPanel2.add(subPanel4);


        subPanel5.setBackground(new java.awt.Color(255, 255, 255));
        subPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clothe_icon.png"))); // NOI18N
        subPanel5.add(icon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ropa");
        jLabel6.setAlignmentX(0.5F);
        subPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        jPanel2.add(subPanel5);

        subPanel6.setBackground(new java.awt.Color(255, 255, 255));
        subPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Juguetes");
        jLabel7.setAlignmentX(0.5F);
        subPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/toys_icon.png"))); // NOI18N
        subPanel6.add(icon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jPanel2.add(subPanel6);


        subPanel4.setBackground(new java.awt.Color(255, 255, 255));
        subPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 224, 230), 2, true));
        subPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/beauty_icon.png"))); // NOI18N
        subPanel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Belleza");
        jLabel5.setAlignmentX(0.5F);
        subPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 20));

        jPanel2.add(subPanel4);


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()

                        .addGap(55, 55, 55)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addGap(83, 83, 83)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGap(46, 46, 46)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))

                .addGap(24, 24, 24)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        optionsMenu.show(btnMenu, 0, btnMenu.getHeight());
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JPanel subPanel2;
    private javax.swing.JPanel subPanel3;
    private javax.swing.JPanel subPanel4;
    private javax.swing.JPanel subPanel5;
    private javax.swing.JPanel subPanel6;
    // End of variables declaration//GEN-END:variables
}
