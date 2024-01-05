package Vistas;

import Modelo.ClienteDAO;
import Modelo.EmpleadoDAO;
import Modelo.TablaEmpleado;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpleadoForm extends javax.swing.JInternalFrame {
    EmpleadoDAO empleDao = new EmpleadoDAO();
    TablaEmpleado emple = new TablaEmpleado();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idEmple;
    
    public EmpleadoForm() {
        initComponents();
        acomodarImagen(jLblEmpleIcon, "src/Imagenes/empleLogo.png");
        listar();
    }
    
    void listar(){
        List<TablaEmpleado> lista = empleDao.listar();
        modelo = (DefaultTableModel)jTabla.getModel();
        Object[] obj = new Object[7];
        for(int i=0; i < lista.size(); i++){
            obj[0] = lista.get(i).getIdEmple();
            obj[1] = lista.get(i).getCedEmple();
            obj[2] = lista.get(i).getNombEmple();
            obj[3] = lista.get(i).getTelEmple();
            obj[4] = lista.get(i).getEstadoEmple();
            obj[5] = lista.get(i).getNombUserEmple();
            obj[6] = lista.get(i).getPassEmple();
            modelo.addRow(obj);
        }
        jTabla.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPaFormCliente = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLblCedula = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jLblUsername = new javax.swing.JLabel();
        jLblDirec = new javax.swing.JLabel();
        jLblContra = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCedula = new javax.swing.JTextField();
        jTxtTel = new javax.swing.JTextField();
        jTxtPassword = new javax.swing.JTextField();
        jTxtUsername = new javax.swing.JTextField();
        jComBoxEstado = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLblEmpleIcon = new javax.swing.JLabel();
        jPaTablaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO EMPLEADO");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPnlPrincipal.setSize(new java.awt.Dimension(800, 650));

        jPaFormCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaFormCliente.setPreferredSize(new java.awt.Dimension(800, 250));

        jLblNombre.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(162, 125, 49));
        jLblNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblNombre.setText("Nombre:");
        jLblNombre.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblNombre.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblCedula.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCedula.setForeground(new java.awt.Color(162, 125, 49));
        jLblCedula.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCedula.setText("Cédula:");
        jLblCedula.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCedula.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblEstado.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblEstado.setForeground(new java.awt.Color(162, 125, 49));
        jLblEstado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblEstado.setText("Estado:");
        jLblEstado.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblEstado.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblUsername.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblUsername.setForeground(new java.awt.Color(162, 125, 49));
        jLblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblUsername.setText("Username:");
        jLblUsername.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblUsername.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblDirec.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblDirec.setForeground(new java.awt.Color(162, 125, 49));
        jLblDirec.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblDirec.setText("Tel:");
        jLblDirec.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblDirec.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblContra.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblContra.setForeground(new java.awt.Color(162, 125, 49));
        jLblContra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblContra.setText("Password:");
        jLblContra.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblContra.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jkLogoTransparente.png"))); // NOI18N

        jTxtNombre.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtNombre.setForeground(new java.awt.Color(224, 11, 51));
        jTxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });

        jTxtCedula.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtCedula.setForeground(new java.awt.Color(224, 11, 51));
        jTxtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtCedula.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCedulaActionPerformed(evt);
            }
        });

        jTxtTel.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtTel.setForeground(new java.awt.Color(224, 11, 51));
        jTxtTel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtTel.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelActionPerformed(evt);
            }
        });

        jTxtPassword.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtPassword.setForeground(new java.awt.Color(224, 11, 51));
        jTxtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtPassword.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPasswordActionPerformed(evt);
            }
        });

        jTxtUsername.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtUsername.setForeground(new java.awt.Color(224, 11, 51));
        jTxtUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtUsername.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsernameActionPerformed(evt);
            }
        });

        jComBoxEstado.setFont(new java.awt.Font("GB18030 Bitmap", 1, 13)); // NOI18N
        jComBoxEstado.setForeground(new java.awt.Color(224, 11, 51));
        jComBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));

        btnAgregar.setBackground(new java.awt.Color(162, 125, 49));
        btnAgregar.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(162, 125, 49));
        btnActualizar.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(162, 125, 49));
        btnEliminar.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(162, 125, 49));
        btnNuevo.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLblEmpleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleLogo.png"))); // NOI18N
        jLblEmpleIcon.setMaximumSize(new java.awt.Dimension(144, 80));
        jLblEmpleIcon.setMinimumSize(null);
        jLblEmpleIcon.setPreferredSize(null);
        jLblEmpleIcon.setSize(new java.awt.Dimension(144, 80));

        javax.swing.GroupLayout jPaFormClienteLayout = new javax.swing.GroupLayout(jPaFormCliente);
        jPaFormCliente.setLayout(jPaFormClienteLayout);
        jPaFormClienteLayout.setHorizontalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addComponent(jLblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addComponent(jLblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblEmpleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLblLogo)
                .addGap(21, 21, 21))
        );
        jPaFormClienteLayout.setVerticalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addComponent(jLblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(8, 8, 8)
                        .addComponent(btnActualizar)
                        .addGap(8, 8, 8)
                        .addComponent(btnEliminar)
                        .addGap(6, 6, 6)
                        .addComponent(btnNuevo)
                        .addGap(1, 1, 1)))
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addComponent(jLblEmpleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaFormClienteLayout.createSequentialGroup()
                .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPaTablaCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaTablaCliente.setSize(new java.awt.Dimension(800, 300));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÉDULA", "NOMBRE", "TELÉFONO", "ESTADO", "USERNAME", "PASSWORD"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout jPaTablaClienteLayout = new javax.swing.GroupLayout(jPaTablaCliente);
        jPaTablaCliente.setLayout(jPaTablaClienteLayout);
        jPaTablaClienteLayout.setHorizontalGroup(
            jPaTablaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPaTablaClienteLayout.setVerticalGroup(
            jPaTablaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPaFormCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPaTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPrincipalLayout.createSequentialGroup()
                .addComponent(jPaFormCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jTxtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPasswordActionPerformed

    private void jTxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsernameActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        int fila = jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla");
        }else{
            idEmple = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());
            String cedEmple = jTabla.getValueAt(fila, 1).toString();
            String nombEmple = jTabla.getValueAt(fila, 2).toString();
            String telCliente = jTabla.getValueAt(fila, 3).toString();
            String estadoEmple = jTabla.getValueAt(fila, 4).toString();
            String userEmple = jTabla.getValueAt(fila, 5).toString();
            String passEmple = jTabla.getValueAt(fila, 6).toString();
            jTxtCedula.setText(cedEmple);
            jTxtNombre.setText(nombEmple);
            jTxtTel.setText(telCliente);
            jComBoxEstado.setSelectedItem(estadoEmple);
            jTxtUsername.setText(userEmple);
            jTxtPassword.setText(passEmple);
        }
    }//GEN-LAST:event_jTablaMouseClicked
    
    void agregar(){
        String cedEmple = jTxtCedula.getText();
        String nombEmple = jTxtNombre.getText();
        String telEmple = jTxtTel.getText();
        String estadoEmple = jComBoxEstado.getSelectedItem().toString();
        String userEmple = jTxtUsername.getText();
        String passEmple = jTxtPassword.getText();
        Object[] obj = new Object[6];
        obj[0] = cedEmple;
        obj[1] = nombEmple;
        obj[2] = telEmple;
        obj[3] = estadoEmple;
        obj[4] = userEmple;
        obj[5] = passEmple;
        empleDao.agregar(obj);
    }
    
    void actualizar(){
        int fila = jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ACTUALIZAR' los datos de un cliente primero debe seleccionar una fila de la tabla");
        } else {
            String cedEmple = jTxtCedula.getText();
            String nombEmple = jTxtNombre.getText();
            String telEmple = jTxtTel.getText();
            String estadoEmple = jComBoxEstado.getSelectedItem().toString();
            String userEmple = jTxtUsername.getText();
            String passEmple = jTxtPassword.getText();
            
            Object[] obj = new Object[7];
            obj[0] = cedEmple;
            obj[1] = nombEmple;
            obj[2] = telEmple;
            obj[3] = estadoEmple;
            obj[4] = userEmple;
            obj[5] = passEmple;
            obj[6] = idEmple;
            empleDao.actualizar(obj);
        }
    }
    
    void eliminar(){
        int fila = jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ELIMINAR' un cliente primero debe seleccionar una fila de la tabla");
        }else {
            int selectIdEmple = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());
            empleDao.eliminar(selectIdEmple);
        }
    }
    
    void nuevo(){
        jTxtCedula.setText("");
        jTxtNombre.setText("");
        jTxtTel.setText("");
        jComBoxEstado.setSelectedIndex(0);
        jTxtUsername.setText("");
        jTxtPassword.setText("");
        jTxtCedula.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i= i - 1;
        }
    }
    
    private void acomodarImagen(JLabel label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)); 
        label.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComBoxEstado;
    private javax.swing.JLabel jLblCedula;
    private javax.swing.JLabel jLblContra;
    private javax.swing.JLabel jLblDirec;
    private javax.swing.JLabel jLblEmpleIcon;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblUsername;
    private javax.swing.JPanel jPaFormCliente;
    private javax.swing.JPanel jPaTablaCliente;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPassword;
    private javax.swing.JTextField jTxtTel;
    private javax.swing.JTextField jTxtUsername;
    // End of variables declaration//GEN-END:variables
}
