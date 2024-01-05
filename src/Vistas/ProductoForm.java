package Vistas;

import Modelo.EmpleadoDAO;
import Modelo.ProductoDAO;
import Modelo.TablaProducto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductoForm extends javax.swing.JInternalFrame {
    loginForm logForm = new loginForm();
    ProductoDAO prodDao = new ProductoDAO();
    TablaProducto product = new TablaProducto();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idProduct;
    
    public ProductoForm() {
        initComponents();
        this.logForm.acomodarImagen(jLblProductLogo, "src/Imagenes/productLogo.png");
        listar();
    }
    
    void listar(){
        List<TablaProducto> lista = prodDao.listar();
        modelo = (DefaultTableModel)jTablaProducto.getModel();
        Object[] obj = new Object[5];
        for(int i=0; i < lista.size() ; i++){
            obj[0] = lista.get(i).getIdProduct();
            obj[1] = lista.get(i).getNombProduct();
            obj[2] = lista.get(i).getPrecioProduct();
            obj[3] = lista.get(i).getStockProduct();
            obj[4] = lista.get(i).getEstadoProduct();
            modelo.addRow(obj);
        }
        jTablaProducto.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaPrincipal = new javax.swing.JPanel();
        jPaFormCliente = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLblCodProduct = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jLblStock = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCodProduct = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        jComBoxEstado = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLblProductLogo = new javax.swing.JLabel();
        jSpinStock = new javax.swing.JSpinner();
        jPaTablaProduct = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaProducto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO PRODUCTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaFormCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPaFormCliente.setPreferredSize(new java.awt.Dimension(800, 280));

        jLblNombre.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(162, 125, 49));
        jLblNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblNombre.setText("Nombre:");
        jLblNombre.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblNombre.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblCodProduct.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCodProduct.setForeground(new java.awt.Color(162, 125, 49));
        jLblCodProduct.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCodProduct.setText("Cod. Producto:");
        jLblCodProduct.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCodProduct.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblEstado.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblEstado.setForeground(new java.awt.Color(162, 125, 49));
        jLblEstado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblEstado.setText("Estado");
        jLblEstado.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblEstado.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblStock.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblStock.setForeground(new java.awt.Color(162, 125, 49));
        jLblStock.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblStock.setText("Stock:");
        jLblStock.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblStock.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblPrecio.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblPrecio.setForeground(new java.awt.Color(162, 125, 49));
        jLblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblPrecio.setText("Precio Venta:");
        jLblPrecio.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblPrecio.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jkLogoTransparente.png"))); // NOI18N
        jLblLogo.setPreferredSize(null);

        jTxtNombre.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtNombre.setForeground(new java.awt.Color(224, 11, 51));
        jTxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });

        jTxtCodProduct.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtCodProduct.setForeground(new java.awt.Color(224, 11, 51));
        jTxtCodProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtCodProduct.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtCodProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodProductActionPerformed(evt);
            }
        });

        jTxtPrecio.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtPrecio.setForeground(new java.awt.Color(224, 11, 51));
        jTxtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtPrecio.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecioActionPerformed(evt);
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

        jLblProductLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productLogo.png"))); // NOI18N
        jLblProductLogo.setMaximumSize(new java.awt.Dimension(120, 90));
        jLblProductLogo.setMinimumSize(null);
        jLblProductLogo.setPreferredSize(null);
        jLblProductLogo.setSize(new java.awt.Dimension(130, 90));

        jSpinStock.setPreferredSize(null);

        javax.swing.GroupLayout jPaFormClienteLayout = new javax.swing.GroupLayout(jPaFormCliente);
        jPaFormCliente.setLayout(jPaFormClienteLayout);
        jPaFormClienteLayout.setHorizontalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaFormClienteLayout.createSequentialGroup()
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLblProductLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPaFormClienteLayout.setVerticalGroup(
            jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaFormClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblProductLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addComponent(jLblCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormClienteLayout.createSequentialGroup()
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addGap(6, 6, 6)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))
                        .addGap(6, 6, 6)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar))
                        .addGap(6, 6, 6)
                        .addGroup(jPaFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo))
                        .addGap(7, 7, 7)
                        .addComponent(jSpinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPaPrincipalLayout = new javax.swing.GroupLayout(jPaPrincipal);
        jPaPrincipal.setLayout(jPaPrincipalLayout);
        jPaPrincipalLayout.setHorizontalGroup(
            jPaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaPrincipalLayout.createSequentialGroup()
                .addComponent(jPaFormCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPaPrincipalLayout.setVerticalGroup(
            jPaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaFormCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPaTablaProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Stock", "Estado"
            }
        ));
        jTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaProducto);

        javax.swing.GroupLayout jPaTablaProductLayout = new javax.swing.GroupLayout(jPaTablaProduct);
        jPaTablaProduct.setLayout(jPaTablaProductLayout);
        jPaTablaProductLayout.setHorizontalGroup(
            jPaTablaProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        jPaTablaProductLayout.setVerticalGroup(
            jPaTablaProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        getContentPane().add(jPaTablaProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 790, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtCodProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodProductActionPerformed

    private void jTxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecioActionPerformed

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

    private void jTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaProductoMouseClicked
        int fila = jTablaProducto.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla");
        } else{
            idProduct = Integer.parseInt(jTablaProducto.getValueAt(fila, 0).toString());
            String nombProduct = jTablaProducto.getValueAt(fila, 1).toString();
            Double precioProduct = Double.parseDouble(jTablaProducto.getValueAt(fila, 2).toString());
            int stockProduct = Integer.parseInt(jTablaProducto.getValueAt(fila, 3).toString());
            String estadoProduct = jTablaProducto.getValueAt(fila, 4).toString();
            
            jTxtCodProduct.setText(Integer.toString(idProduct));
            jTxtNombre.setText(nombProduct);
            jTxtPrecio.setText(Double.toString(precioProduct));
            jComBoxEstado.setSelectedItem(estadoProduct);
            jSpinStock.setValue(stockProduct);
        }
    }//GEN-LAST:event_jTablaProductoMouseClicked

    void agregar(){
        int idProductAux = Integer.parseInt(jTxtCodProduct.getText());
        String nombProduct = jTxtNombre.getText();
        Double precioProduct = Double.parseDouble(jTxtPrecio.getText());
        int stockProduct = (Integer) jSpinStock.getValue();
        String estadoProduct = jComBoxEstado.getSelectedItem().toString();
        Object[] obj = new Object[5];
        obj[0] = idProductAux;
        obj[1] = nombProduct;
        obj[2] = precioProduct;
        obj[3] = stockProduct;
        obj[4] = estadoProduct;
        try {
            prodDao.agregar(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Producto ya existente en la tienda, verifique en la lista");
        }
    }
    
    void actualizar(){
        int fila = jTablaProducto.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ACTUALIZAR' los datos de un cliente primero debe seleccionar una fila de la tabla");
        } else {
            String nombProduct = jTxtNombre.getText();
            Double precioProduct = Double.parseDouble(jTxtPrecio.getText());
            int stockProduct = (Integer) jSpinStock.getValue();
            String estadoProduct = jComBoxEstado.getSelectedItem().toString();

            Object[] obj = new Object[5];
            obj[0] = nombProduct;
            obj[1] = precioProduct;
            obj[2] = stockProduct;
            obj[3] = estadoProduct;
            obj[4] = idProduct;
            prodDao.actualizar(obj);
        }
    }
    
    void eliminar(){
        int fila = jTablaProducto.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Para 'ELIMINAR' un producto primero debe seleccionar una fila de la tabla");
        } else {
            int selectIdProduct = Integer.parseInt(jTablaProducto.getValueAt(fila, 0).toString());
            prodDao.eliminar(selectIdProduct);
        }
    }
    
    void nuevo(){
        jTxtCodProduct.setText("");
        jTxtNombre.setText("");
        jTxtPrecio.setText("");
        jSpinStock.setValue(0);
        jComBoxEstado.setSelectedIndex(0);
        jTxtCodProduct.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComBoxEstado;
    private javax.swing.JLabel jLblCodProduct;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JLabel jLblProductLogo;
    private javax.swing.JLabel jLblStock;
    private javax.swing.JPanel jPaFormCliente;
    private javax.swing.JPanel jPaPrincipal;
    private javax.swing.JPanel jPaTablaProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinStock;
    private javax.swing.JTable jTablaProducto;
    private javax.swing.JTextField jTxtCodProduct;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
