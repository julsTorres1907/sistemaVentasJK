package Vistas;

import Modelo.EmpleadoDAO;
import Modelo.TablaEmpleado;
import java.awt.Color;
import java.awt.Image;
import java.security.Principal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author juliomariotorresfandino
 */
public class loginForm extends javax.swing.JFrame {
    EmpleadoDAO emple1 = new EmpleadoDAO();
    TablaEmpleado tabEmple = new TablaEmpleado();
    EmpleadoForm empleForm = new EmpleadoForm();
    
    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.acomodarImagen(this.jLbBackground, "src/Imagenes/wppLogin.png");
        this.acomodarImagen(this.jLbUser, "src/Imagenes/jkLogoTransparente.png");
        txtPassword.setText("1234");
        txtUser.setText("emple1");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPaRegistro = new javax.swing.JPanel();
        jLaNameUser = new javax.swing.JLabel();
        jLaPasswordUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLbUser = new javax.swing.JLabel();
        jLbLogin = new javax.swing.JLabel();
        jLbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackground.setMaximumSize(new java.awt.Dimension(360, 600));
        jPanelBackground.setMinimumSize(new java.awt.Dimension(360, 600));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(360, 600));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPaRegistro.setAlignmentX(0.0F);
        jPaRegistro.setAlignmentY(0.0F);
        jPaRegistro.setOpaque(false);

        jLaNameUser.setFont(new java.awt.Font("DIN Alternate", 1, 22)); // NOI18N
        jLaNameUser.setForeground(new java.awt.Color(162, 125, 49));
        jLaNameUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLaNameUser.setText("USER");
        jLaNameUser.setMaximumSize(new java.awt.Dimension(140, 30));
        jLaNameUser.setMinimumSize(new java.awt.Dimension(140, 30));

        jLaPasswordUser.setFont(new java.awt.Font("DIN Alternate", 1, 22)); // NOI18N
        jLaPasswordUser.setForeground(new java.awt.Color(162, 125, 49));
        jLaPasswordUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLaPasswordUser.setText("PASSWORD");
        jLaPasswordUser.setVerifyInputWhenFocusTarget(false);

        txtUser.setFont(new java.awt.Font("GB18030 Bitmap", 1, 15)); // NOI18N
        txtUser.setForeground(new java.awt.Color(224, 11, 51));
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(162, 125, 49));
        btnIngresar.setFont(new java.awt.Font("DIN Alternate", 3, 22)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("LOGIN");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaRegistroLayout = new javax.swing.GroupLayout(jPaRegistro);
        jPaRegistro.setLayout(jPaRegistroLayout);
        jPaRegistroLayout.setHorizontalGroup(
            jPaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaRegistroLayout.createSequentialGroup()
                        .addComponent(jLaNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaRegistroLayout.createSequentialGroup()
                        .addComponent(jLaPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaRegistroLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPaRegistroLayout.setVerticalGroup(
            jPaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaRegistroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLaPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBackground.add(jPaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 360, 170));

        jLbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jkLogoTransparente.png"))); // NOI18N
        jPanelBackground.add(jLbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 360, 260));

        jLbLogin.setFont(new java.awt.Font("Courier", 3, 22)); // NOI18N
        jLbLogin.setForeground(new java.awt.Color(162, 125, 49));
        jLbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbLogin.setText("para Supermercados UNAL");
        jPanelBackground.add(jLbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 360, 30));

        jLbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wppLogin.png"))); // NOI18N
        jLbBackground.setAlignmentY(0.0F);
        jLbBackground.setPreferredSize(new java.awt.Dimension(360, 600));
        jPanelBackground.add(jLbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        getContentPane().add(jPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    
    //Metodo que guarda el nombre del empleado que ha iniciado sesión
    public String nombEmpleSesionActual (){
        String nombEmpleado;
        String nameUser = txtUser.getText();
        String passUser = txtPassword.getText();
        
        tabEmple = emple1.validarEmpleado(passUser, nameUser);
        nombEmpleado = tabEmple.getNombEmple();
        System.out.println(nombEmpleado);
        return nombEmpleado;
    }
    // Se validan los datos ingresados en el formulario de Login
    public void validar(){
        String nameUser = txtUser.getText();
        String passUser = txtPassword.getText();
        //Se evalua si el usuario NO lleno las cajas de texto
        if(txtUser.getText().equals("") || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Se deben llenar todos los datos del formulario");
            txtUser.requestFocus();
        }else{
            //Entra aquí si el usuario si ingreso los datos en las cajas de texto
            //Se comparan los datos ingresados con los usuario ya registrados en la base de datos
            tabEmple = emple1.validarEmpleado(passUser, nameUser);
            String nombEmpleado = tabEmple.getNombEmple();
            if(tabEmple.getNombUserEmple() != null && tabEmple.getPassEmple()!= null){
                VentanaPrincipal ventPrincipal = new VentanaPrincipal();
                ventPrincipal.setVisible(true);
                dispose();
            } else{
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos, vuelva a intentarlo nuevamente");
                txtUser.requestFocus();
            }
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    } 
    
    
    public void acomodarImagen(JLabel label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)); 
        label.setIcon(icon);
        this.repaint();
    }
    
    /*public void acomodarImagMenu(JMenu label, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icon = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)); 
        label.setIcon(this.icon);
        this.repaint();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLaNameUser;
    private javax.swing.JLabel jLaPasswordUser;
    private javax.swing.JLabel jLbBackground;
    private javax.swing.JLabel jLbLogin;
    private javax.swing.JLabel jLbUser;
    private javax.swing.JPanel jPaRegistro;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
