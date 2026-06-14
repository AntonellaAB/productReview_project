
package ui;

import dao.UserDAO;
import javax.swing.JOptionPane;
import model.User;

public class SignUp extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SignUp.class.getName());
    private final UserDAO userDAO = new UserDAO();
    
    public SignUp() {
        initComponents();
        setTitle("Crear Usuario");
        setLocationRelativeTo(null);
        // Para que tengan un margen interno
        javax.swing.border.Border padding = javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0);
        txtName.setBorder(padding);
        txtEmail.setBorder(padding);
        txtPasswd.setBorder(padding);
        txtRetypePasswd.setBorder(padding);
        
        
        //CENTRAR LOS OBJETOS 
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 118, 300, 50));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        jPanel1.add(icon_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 60, 117, 117));

        //sUBTITULO
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 210, 530, 40));

        // PRIMERA COLUMNA
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 260, 40));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 250, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 40));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 250, 30));

        // SEGUNDA COLUMNA
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 200, 40));
        jPanel1.add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 250, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 240, 40));
        jPanel1.add(txtRetypePasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 250, 30));
        //botones
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 140, 40));
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 140, 40));
        escalarIcon();
        
        
    }
    
    private void escalarIcon(){
        java.net.URL imgURL = getClass().getResource("/recursos/review_white_icon.png");
        if (imgURL != null){
            javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(imgURL);
            java.awt.Image imagenOriginal = iconoOriginal.getImage();
            
            java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(
            icon_box.getWidth(), 
            icon_box.getHeight(), 
            java.awt.Image.SCALE_SMOOTH
            );
            icon_box.setIcon(new javax.swing.ImageIcon(imagenEscalada));
        
        }else {
            logger.log(java.util.logging.Level.WARNING, "No se encontro el icono en la ruta especificada.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        icon_box = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JPasswordField();
        txtRetypePasswd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 81, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Heavitas", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(244, 246, 247));
        Title.setText("Paraguay Review");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 280, 50));

        icon_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/review_white_icon.png"))); // NOI18N
        jPanel1.add(icon_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 117, 117));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 246, 247));
        jLabel1.setText("Confirmar contraseña *");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 246, 247));
        jLabel2.setText("Nombre de usuario*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 260, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 246, 247));
        jLabel3.setText("Email *");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 246, 247));
        jLabel4.setText("Contraseña *");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 200, 40));

        txtName.setBackground(new java.awt.Color(244, 246, 247));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setToolTipText("");
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtName.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtName.addActionListener(this::txtNameActionPerformed);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 250, 30));

        txtEmail.setBackground(new java.awt.Color(244, 246, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtEmail.addActionListener(this::txtEmailActionPerformed);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 250, 30));

        btnExit.setBackground(new java.awt.Color(43, 58, 66));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(244, 246, 247));
        btnExit.setText("Atras");
        btnExit.setBorder(null);
        btnExit.addActionListener(this::btnExitActionPerformed);
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 138, 45));

        btnSignUp.setBackground(new java.awt.Color(43, 58, 66));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(244, 246, 247));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(null);
        btnSignUp.addActionListener(this::btnSignUpActionPerformed);
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 138, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 246, 247));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Por favor completa lo siguientes datos para continuar");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 530, 40));

        txtPasswd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPasswd.addActionListener(this::txtPasswdActionPerformed);
        jPanel1.add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 250, 30));

        txtRetypePasswd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRetypePasswd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtRetypePasswd.addActionListener(this::txtRetypePasswdActionPerformed);
        jPanel1.add(txtRetypePasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String username = txtName.getText();
        String email = txtEmail.getText().trim();
        String password = txtPasswd.getText().trim();
        String RetypedPassword = txtRetypePasswd.getText().trim();
        
        if( username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de usuario", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        if (email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un correo electrónico", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
        if (password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar una contraseña", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            txtPasswd.requestFocus();
            return;
        }
        if (RetypedPassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe confirmar la contraseña para continuar", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            txtRetypePasswd.requestFocus();
            return;
        }
        
        
      
        if (!password.equals(RetypedPassword)){
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error de validación", JOptionPane.ERROR_MESSAGE);
            txtPasswd.setText("");
            txtRetypePasswd.setText("");
            txtPasswd.requestFocus();
            return;
        }
        
        
        
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        boolean esValido = userDAO.createUser(user);
        
        if (esValido){
            JOptionPane.showMessageDialog(this, "Bienvenido!", "Usuario creado", JOptionPane.INFORMATION_MESSAGE);
            //mostrar ventana de confirmacion - todavia no se hizo
            
            txtName.setText("");
            txtEmail.setText("");
            txtPasswd.setText("");
            txtRetypePasswd.setText("");
            
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Por favor confirme los datos ingresados", "Datos Inválidos", JOptionPane.ERROR_MESSAGE);
            txtPasswd.setText("");
            txtRetypePasswd.setText("");
        }
  
    }//GEN-LAST:event_btnSignUpActionPerformed

    
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtPasswd.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRetypePasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetypePasswdActionPerformed
        btnSignUp.requestFocus();
    }//GEN-LAST:event_txtRetypePasswdActionPerformed

    private void txtPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswdActionPerformed
        txtRetypePasswd.requestFocus();
    }//GEN-LAST:event_txtPasswdActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new SignUp().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel icon_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JPasswordField txtRetypePasswd;
    // End of variables declaration//GEN-END:variables
}
