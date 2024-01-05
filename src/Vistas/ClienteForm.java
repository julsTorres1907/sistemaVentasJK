package Vistas;

import Modelo.ClienteDAO;
import Modelo.TablaCliente;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteForm extends javax.swing.JInternalFrame {
    private ImageIcon imagen;
    private Icon icon;
    
    ClienteDAO clientDao = new ClienteDAO();
    TablaCliente client = new TablaCliente();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idCliente;
    
    public ClienteForm() {
        initComponents();
        this.acomodarImagen(this.jLblClienteLogo, "src/Imagenes/clienteLogotipo.png");
        listar();
    }
    
    void listar(){
        List<TablaCliente> lista = clientDao.listar();
        modelo = (DefaultTableModel)jTabla.getModel();
        Object[] obj = new Object[5];
        for(int i=0; i<lista.size(); i++){
            obj[0]=lista.get(i).getIdCliente();
            obj[1]=lista.get(i).getCedCliente();
            obj[2]=lista.get(i).getNombCliente();
            obj[3]=lista.get(i).getDirecCliente();
            obj[4]=lista.get(i).getEstadoCliente();
            modelo.addRow(obj);
        }
        jTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaPrincipal = new javax.swing.JPanel();
        jPaTablaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPaFormCliente = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLblCedula = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jLblDirec = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCedula = new javax.swing.JTextField();
        jTxtDirec = new javax.swing.JTextField();
        jComBoxEstado = new javax.swing.JComboBox<>();
        jLblLogo = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLblClienteLogo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODULO CLIENTES");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPaPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        jPaPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        jPaPrincipal.setLayout(new java.awt.BorderLayout());

        jPaTablaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPaTablaCliente.setPreferredSize(new java.awt.Dimension(800, 300));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cédula", "Nombre", "Dirección", "Estado"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        jPaPrincipal.add(jPaTablaCliente, java.awt.BorderLayout.CENTER);

        jPaFormCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLblDirec.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblDirec.setForeground(new java.awt.Color(162, 125, 49));
        jLblDirec.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblDirec.setText("Dirección:");
        jLblDirec.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblDirec.setMinimumSize(new java.awt.Dimension(140, 30));

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

        jTxtDirec.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtDirec.setForeground(new java.awt.Color(224, 11, 51));
        jTxtDirec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtDirec.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDirecActionPerformed(evt);
            }
        });

        jComBoxEstado.setFont(new java.awt.Font("GB18030 Bitmap", 1, 13)); // NOI18N
        jComBoxEstado.setForeground(new java.awt.Color(224, 11, 51));
        jComBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));

        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jkLogoTransparente.png"))); // NOI18N

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

        jLblClienteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteLogotipo.png"))); // NOI18N
        jLblClienteLogo.setMaximumSize(new java.awt.Dimension(160, 90));
        jLblClienteLogo.setMinimumSize(null);
        jLblClienteLogo.setPreferredSize(null);
        jLblClienteLogo.setSize(new java.awt.Dimension(140, 90));

        javax.swing.GroupLayout jPaFormClienteLayout = new javax.swing.GroupLayout(jPaFormCliente);
        jPaFormCliente.setLayout(jPaFormClienteLayout);
        jPaFormClienteLayout.setHorizontalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLblClienteLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLblLogo)
                .addGap(27, 27, 27))
        );
        jPaFormClienteLayout.setVerticalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaFormClienteLayout.createSequentialGroup()
                .addComponent(jLblClienteLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addComponent(jLblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTxtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAgregar)
                        .addGap(8, 8, 8)
                        .addComponent(btnActualizar)
                        .addGap(8, 8, 8)
                        .addComponent(btnEliminar)
                        .addGap(9, 9, 9)
                        .addComponent(btnNuevo)))
                .addContainerGap())
            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPaPrincipal.add(jPaFormCliente, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPaPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jTxtDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDirecActionPerformed

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

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        int fila = jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ACTUALIZAR' los datos de un cliente primero debe seleccionar una fila de la tabla");
        }else{
            idCliente = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());
            String cedCliente = jTabla.getValueAt(fila, 1).toString();
            String nombCliente = jTabla.getValueAt(fila, 2).toString();
            String direcCliente = jTabla.getValueAt(fila, 3).toString();
            String estadoCliente = jTabla.getValueAt(fila, 4).toString();
            jTxtCedula.setText(cedCliente);
            jTxtNombre.setText(nombCliente);
            jTxtDirec.setText(direcCliente);
            jComBoxEstado.setSelectedItem(estadoCliente);
        }
        
    }//GEN-LAST:event_jTablaMouseClicked
    
    void agregar(){
        String cedCliente = jTxtCedula.getText();
        String nombCliente = jTxtNombre.getText();
        String direcCliente = jTxtDirec.getText();
        String estadoCliente = jComBoxEstado.getSelectedItem().toString();
        Object[] obj = new Object[4];
        obj[0] = cedCliente;
        obj[1] = nombCliente;
        obj[2] = direcCliente;
        obj[3] = estadoCliente;
        clientDao.agregar(obj);
    }
    
    void actualizar(){
        int fila=jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ACTUALIZAR' los datos de un cliente primero debe seleccionar una fila de la tabla");
        }else{
            String cedCliente = jTxtCedula.getText();
            String nombCliente = jTxtNombre.getText();
            String direcCliente = jTxtDirec.getText();
            String estadoCliente = jComBoxEstado.getSelectedItem().toString();
            Object[] obj = new Object[5];

            obj[0] = cedCliente;
            obj[1] = nombCliente;
            obj[2] = direcCliente;
            obj[3] = estadoCliente;
            obj[4] = idCliente;
            clientDao.actualizar(obj);
        }
    }
    
    void eliminar(){
        int fila = jTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ELIMINAR' un cliente primero debe seleccionar una fila de la tabla");
        }else{
            int selectIdClient = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());
            clientDao.eliminar(selectIdClient);
        }
    }
    
    void nuevo(){
        jTxtCedula.setText("");
        jTxtNombre.setText("");
        jTxtDirec.setText("");
        jComBoxEstado.setSelectedItem(0);
        jTxtCedula.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i=0; i <modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    private void acomodarImagen(JLabel label, String ruta){ 
        this.imagen = new ImageIcon(ruta);
        this.icon = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)); 
        label.setIcon(this.icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComBoxEstado;
    private javax.swing.JLabel jLblCedula;
    private javax.swing.JLabel jLblClienteLogo;
    private javax.swing.JLabel jLblDirec;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JPanel jPaFormCliente;
    private javax.swing.JPanel jPaPrincipal;
    private javax.swing.JPanel jPaTablaCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtDirec;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
