/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.ClienteDAO;
import Modelo.ProductoDAO;
import Modelo.TablaCliente;
import Modelo.TablaEmpleado;
import Modelo.TablaFactura;
import Modelo.TablaProducto;
import Modelo.Venta;
import Modelo.VentaDAO;
import java.awt.event.ItemEvent;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juliomariotorresfandino
 */
public class VentasForm extends javax.swing.JInternalFrame {
    loginForm logForm = new loginForm();
    ClienteDAO clienteDao = new ClienteDAO();
    ProductoDAO productDao = new ProductoDAO();
    VentaDAO ventaDao = new VentaDAO();
    TablaProducto product = new TablaProducto();
    TablaCliente cliente = new TablaCliente();
    Venta venta = new Venta();
    TablaFactura factura = new TablaFactura();
    TablaEmpleado empleado = new TablaEmpleado();
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idProduct;
    double totalCompra;
    //Precio unitario de cada producto
    double precioProduct;
    //Número de unidades del producto que se va a facturar
    int cantProducto;
    
    
    //VentanaPrincipal ventPrincipal = new VentanaPrincipal();
    public VentasForm() {
        initComponents();
        logForm.acomodarImagen(this.jLblLogo, "src/Imagenes/jkLogoForm.png");
        logForm.acomodarImagen(this.jLblMarket, "src/Imagenes/marketLogo.png");
        logForm.acomodarImagen(this.jLblPos, "src/Imagenes/posBanner.png");
        generarNumSer();
        generarFecha();
        generarNombEmple();
    }
    
    void generarNombEmple(){
        loginForm logAux = new loginForm();
        String nombreEmpleSesionActual = logAux.nombEmpleSesionActual();
        System.out.println("NOMBRE EMPLEADO "+ nombreEmpleSesionActual);
        jTxtVende.setText(""+nombreEmpleSesionActual);
    }
    
    void generarFecha(){
        Calendar calendar = new GregorianCalendar();
        jTxtFecha.setText(""+calendar.get(Calendar.YEAR)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.DAY_OF_MONTH));
    }
    
    void generarNumSer(){
        String numSer = ventaDao.generarNumSer();
        if(numSer == null){
            jTxtNumser.setText("00000001");
        }else {
            int increment = Integer.parseInt(numSer);
            increment = increment + 1;
            jTxtNumser.setText("0000000"+increment);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaInfo = new javax.swing.JPanel();
        jLblMarket = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jLblPos = new javax.swing.JLabel();
        jLblDirec = new javax.swing.JLabel();
        jLblTel = new javax.swing.JLabel();
        jLblNumser = new javax.swing.JLabel();
        jTxtNumser = new javax.swing.JTextField();
        jPaFormulario = new javax.swing.JPanel();
        jLblCodCliente = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblCodProduct = new javax.swing.JLabel();
        jTxtCodCliente = new javax.swing.JTextField();
        jTxtCodProduct = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarProduct = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLblCliente = new javax.swing.JLabel();
        jLblProducto = new javax.swing.JLabel();
        jLblStock = new javax.swing.JLabel();
        jTxtCliente = new javax.swing.JTextField();
        jTxtProduct = new javax.swing.JTextField();
        jTxtStock = new javax.swing.JTextField();
        jLblCantidad = new javax.swing.JLabel();
        jSpinCantidad = new javax.swing.JSpinner();
        jLblVende = new javax.swing.JLabel();
        jTxtVende = new javax.swing.JTextField();
        jTxtFecha = new javax.swing.JTextField();
        jPaTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDetalle = new javax.swing.JTable();
        jPaOpciones = new javax.swing.JPanel();
        jLblTotalPagar = new javax.swing.JLabel();
        jTxtTotalPagar = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SISTEMA DE VENTAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaInfo.setPreferredSize(new java.awt.Dimension(800, 226));

        jLblMarket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marketLogo.png"))); // NOI18N
        jLblMarket.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLblMarket.setMaximumSize(new java.awt.Dimension(170, 144));
        jLblMarket.setMinimumSize(null);
        jLblMarket.setPreferredSize(null);
        jLblMarket.setSize(new java.awt.Dimension(170, 144));

        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jkLogoForm.png"))); // NOI18N
        jLblLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLblLogo.setMaximumSize(new java.awt.Dimension(170, 144));
        jLblLogo.setSize(new java.awt.Dimension(170, 144));

        jLblPos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/posBanner.png"))); // NOI18N
        jLblPos.setMaximumSize(new java.awt.Dimension(347, 48));
        jLblPos.setPreferredSize(new java.awt.Dimension(0, 0));
        jLblPos.setSize(new java.awt.Dimension(347, 48));

        jLblDirec.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        jLblDirec.setForeground(new java.awt.Color(162, 125, 49));
        jLblDirec.setText("Cra. 25 #62-236, Manizales, Caldas");

        jLblTel.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        jLblTel.setForeground(new java.awt.Color(162, 125, 49));
        jLblTel.setText("Tel. 3203576262");

        jLblNumser.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        jLblNumser.setForeground(new java.awt.Color(162, 125, 49));
        jLblNumser.setText("No. Serie:");

        jTxtNumser.setEditable(false);
        jTxtNumser.setBackground(new java.awt.Color(207, 193, 193));
        jTxtNumser.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        jTxtNumser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNumser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtNumser.setOpaque(true);
        jTxtNumser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaInfoLayout = new javax.swing.GroupLayout(jPaInfo);
        jPaInfo.setLayout(jPaInfoLayout);
        jPaInfoLayout.setHorizontalGroup(
            jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaInfoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLblDirec)))
                    .addGroup(jPaInfoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLblNumser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNumser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaInfoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLblTel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPaInfoLayout.setVerticalGroup(
            jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaInfoLayout.createSequentialGroup()
                .addGroup(jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaInfoLayout.createSequentialGroup()
                        .addGroup(jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPaInfoLayout.createSequentialGroup()
                                .addComponent(jLblPos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblDirec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLblNumser)
                                    .addComponent(jTxtNumser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 788, 150));

        jPaFormulario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaFormulario.setPreferredSize(new java.awt.Dimension(800, 226));

        jLblCodCliente.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCodCliente.setForeground(new java.awt.Color(162, 125, 49));
        jLblCodCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCodCliente.setText("Cod. Cliente");
        jLblCodCliente.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCodCliente.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblPrecio.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblPrecio.setForeground(new java.awt.Color(162, 125, 49));
        jLblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblPrecio.setText("PRECIO");
        jLblPrecio.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblPrecio.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblCodProduct.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCodProduct.setForeground(new java.awt.Color(162, 125, 49));
        jLblCodProduct.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCodProduct.setText("Cod. Producto");
        jLblCodProduct.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCodProduct.setMinimumSize(new java.awt.Dimension(140, 30));

        jTxtCodCliente.setFont(new java.awt.Font("GB18030 Bitmap", 1, 12)); // NOI18N
        jTxtCodCliente.setForeground(new java.awt.Color(224, 11, 51));
        jTxtCodCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtCodCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        jTxtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodClienteActionPerformed(evt);
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

        btnBuscarCliente.setBackground(new java.awt.Color(162, 125, 49));
        btnBuscarCliente.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarProduct.setBackground(new java.awt.Color(162, 125, 49));
        btnBuscarProduct.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnBuscarProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProduct.setText("BUSCAR");
        btnBuscarProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductActionPerformed(evt);
            }
        });

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

        jLblCliente.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCliente.setForeground(new java.awt.Color(162, 125, 49));
        jLblCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCliente.setText("CLIENTE");
        jLblCliente.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCliente.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblProducto.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblProducto.setForeground(new java.awt.Color(162, 125, 49));
        jLblProducto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblProducto.setText("PRODUCTO");
        jLblProducto.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblProducto.setMinimumSize(new java.awt.Dimension(140, 30));

        jLblStock.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblStock.setForeground(new java.awt.Color(162, 125, 49));
        jLblStock.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblStock.setText("STOCK");
        jLblStock.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblStock.setMinimumSize(new java.awt.Dimension(140, 30));

        jTxtCliente.setEditable(false);
        jTxtCliente.setBackground(new java.awt.Color(207, 193, 193));
        jTxtCliente.setFont(new java.awt.Font("Apple Braille", 3, 14)); // NOI18N
        jTxtCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtCliente.setOpaque(true);
        jTxtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtClienteActionPerformed(evt);
            }
        });

        jTxtProduct.setEditable(false);
        jTxtProduct.setBackground(new java.awt.Color(207, 193, 193));
        jTxtProduct.setFont(new java.awt.Font("Apple Braille", 3, 14)); // NOI18N
        jTxtProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtProduct.setOpaque(true);
        jTxtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtProductActionPerformed(evt);
            }
        });

        jTxtStock.setEditable(false);
        jTxtStock.setBackground(new java.awt.Color(207, 193, 193));
        jTxtStock.setFont(new java.awt.Font("Apple Braille", 3, 14)); // NOI18N
        jTxtStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtStock.setOpaque(true);
        jTxtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStockActionPerformed(evt);
            }
        });

        jLblCantidad.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblCantidad.setForeground(new java.awt.Color(162, 125, 49));
        jLblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblCantidad.setText("CANTIDAD");
        jLblCantidad.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblCantidad.setMinimumSize(new java.awt.Dimension(140, 30));

        jSpinCantidad.setPreferredSize(null);

        jLblVende.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblVende.setForeground(new java.awt.Color(162, 125, 49));
        jLblVende.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblVende.setText("VENDE");
        jLblVende.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblVende.setMinimumSize(new java.awt.Dimension(140, 30));

        jTxtVende.setEditable(false);
        jTxtVende.setBackground(new java.awt.Color(207, 193, 193));
        jTxtVende.setFont(new java.awt.Font("Apple Braille", 3, 14)); // NOI18N
        jTxtVende.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtVende.setOpaque(true);
        jTxtVende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtVendeActionPerformed(evt);
            }
        });

        jTxtFecha.setEditable(false);
        jTxtFecha.setBackground(new java.awt.Color(207, 193, 193));
        jTxtFecha.setFont(new java.awt.Font("Apple Braille", 3, 14)); // NOI18N
        jTxtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtFecha.setOpaque(true);
        jTxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaFormularioLayout = new javax.swing.GroupLayout(jPaFormulario);
        jPaFormulario.setLayout(jPaFormularioLayout);
        jPaFormularioLayout.setHorizontalGroup(
            jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaFormularioLayout.createSequentialGroup()
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLblCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLblCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPaFormularioLayout.createSequentialGroup()
                                .addComponent(jLblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaFormularioLayout.createSequentialGroup()
                                .addComponent(jLblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jTxtFecha))))
                .addGap(31, 31, 31)
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addComponent(jLblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addComponent(jLblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addComponent(jLblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaFormularioLayout.createSequentialGroup()
                        .addComponent(jLblVende, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtVende, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPaFormularioLayout.setVerticalGroup(
            jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaFormularioLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(jLblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduct)
                    .addComponent(jLblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(jLblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblVende, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtVende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPaFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 788, 180));

        jPaTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaTabla.setPreferredSize(new java.awt.Dimension(800, 225));

        jTablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM. SERIE", "COD", "PRODUCTO", "CANTIDAD", "PRE. UNITARIO", "SUBTOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTablaDetalle);

        javax.swing.GroupLayout jPaTablaLayout = new javax.swing.GroupLayout(jPaTabla);
        jPaTabla.setLayout(jPaTablaLayout);
        jPaTablaLayout.setHorizontalGroup(
            jPaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        jPaTablaLayout.setVerticalGroup(
            jPaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        getContentPane().add(jPaTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 788, -1));

        jPaOpciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLblTotalPagar.setFont(new java.awt.Font("DIN Alternate", 1, 18)); // NOI18N
        jLblTotalPagar.setForeground(new java.awt.Color(162, 125, 49));
        jLblTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLblTotalPagar.setText("TOTAL A PAGAR");
        jLblTotalPagar.setMaximumSize(new java.awt.Dimension(140, 30));
        jLblTotalPagar.setMinimumSize(new java.awt.Dimension(140, 30));

        jTxtTotalPagar.setEditable(false);
        jTxtTotalPagar.setBackground(new java.awt.Color(207, 193, 193));
        jTxtTotalPagar.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        jTxtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtTotalPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtTotalPagar.setOpaque(true);
        jTxtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalPagarActionPerformed(evt);
            }
        });

        btnGenerarVenta.setBackground(new java.awt.Color(162, 125, 49));
        btnGenerarVenta.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnGenerarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarVenta.setText("GENERAR VENTA");
        btnGenerarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(162, 125, 49));
        btnCancelar.setFont(new java.awt.Font("DIN Alternate", 3, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaOpcionesLayout = new javax.swing.GroupLayout(jPaOpciones);
        jPaOpciones.setLayout(jPaOpcionesLayout);
        jPaOpcionesLayout.setHorizontalGroup(
            jPaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaOpcionesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGenerarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLblTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPaOpcionesLayout.setVerticalGroup(
            jPaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarVenta)
                    .addComponent(btnCancelar)
                    .addComponent(jTxtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPaOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 569, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNumserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumserActionPerformed

    private void jTxtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodClienteActionPerformed

    private void jTxtCodProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodProductActionPerformed

    private void jTxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecioActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed
    
    private void btnBuscarProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductActionPerformed
        buscarProduct();
    }//GEN-LAST:event_btnBuscarProductActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProduct();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTxtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtClienteActionPerformed

    private void jTxtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtProductActionPerformed

    private void jTxtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtStockActionPerformed

    private void jTxtVendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtVendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtVendeActionPerformed

    private void jTxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFechaActionPerformed

    private void jTxtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalPagarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (jTxtTotalPagar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Para 'GENERAR VENTA' debe agregar productos a la tabla");
        }else{
            guardarVenta();
            guardarFactura();
            actualizarStock();   
            JOptionPane.showMessageDialog(this, "La venta se generó con exito");
            limpiarFormulario();
            generarNumSer();
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    //Deja en blanco los campos de 'jTablaDetalle'
    void limpiarTabla(){
        for(int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    //Deja en blanco todas las cajas de texto del formulario
    void limpiarFormulario(){
        limpiarTabla();
        jTxtCodCliente.setText("");
        jTxtCodProduct.setText("");
        jTxtPrecio.setText("");
        jSpinCantidad.setValue(1);
        jTxtCliente.setText("");
        jTxtProduct.setText("");
        jTxtStock.setText("");
        jTxtTotalPagar.setText("");
        //Para que el puntero se situe en la caja de texto 'jTxtCodCliente'
        jTxtCodCliente.requestFocus();
    }
    //Se captura la idProduct y la cantProduct de los productos que estan en
    //lista jTablaDetalle
    void actualizarStock(){
        for(int i = 0; i < modelo.getRowCount(); i++){
            TablaProducto productAux = new TablaProducto();
            idProduct = Integer.parseInt(jTablaDetalle.getValueAt(i, 1).toString());
            cantProducto = Integer.parseInt(jTablaDetalle.getValueAt(i, 3).toString());
            productAux = productDao.listarId(idProduct);
            int stockActualizado = productAux.getStockProduct() - cantProducto;
            productDao.actualizarStock(stockActualizado, idProduct);
        }
    }
    
    //Llena un registro en la tabla VENTA
    void guardarVenta(){
        int idCliente = cliente.getIdCliente();
        System.out.println(idCliente);
        int idEmple = 1;
        String numSerie = jTxtNumser.getText();
        System.out.println("numser: "+numSerie);
        double montoVenta = totalCompra;
        System.out.println("montoVenta: "+montoVenta);
        String fechaVenta = jTxtFecha.getText();
        System.out.println("fechaVenta "+fechaVenta);
        String estado = "1";
        
        venta.setIdCliente(idCliente);
        venta.setIdEmple(idEmple);
        venta.setNumSerie(numSerie);
        venta.setMontoVenta(montoVenta);
        venta.setFechaVenta(fechaVenta);
        venta.setEstadoVenta(estado); 
        ventaDao.guardarVenta(venta);
    }
    
    //Llena un registro en la tabla FACTURA
    void guardarFactura(){
        String idVentaAux = ventaDao.idVentas();
        int idVenta = Integer.parseInt(idVentaAux);
        for(int i=0; i <jTablaDetalle.getRowCount(); i++){
            idProduct = Integer.parseInt(jTablaDetalle.getValueAt(i, 1).toString());
            int cantProductos = Integer.parseInt(jTablaDetalle.getValueAt(i, 3).toString());
            double precioUnitario = Double.parseDouble(jTablaDetalle.getValueAt(i, 4).toString());
            factura.setIdVenta(idVenta);
            factura.setIdProduct(idProduct);
            factura.setCantProductos(cantProductos);
            factura.setPrecioVenta(precioUnitario);
            ventaDao.guardarFactura(factura);
        }
    }
    //Se agregan los valores de cada registro a la tabla de la interfaz 'jTablaDetalle'
    void agregarProduct(){
        double subtotal;
        int item =0;
        modelo = (DefaultTableModel)jTablaDetalle.getModel();
        //Atributos de cada columna: 
        item = item+1;
        idProduct = product.getIdProduct();
        String nombProduct = jTxtProduct.getText();
        precioProduct = Double.parseDouble(jTxtPrecio.getText());
        cantProducto = Integer.parseInt(jSpinCantidad.getValue().toString());
        subtotal = cantProducto * precioProduct;
        int stockProduct = Integer.parseInt(jTxtStock.getText());
        
        //Se listan (muestran) los atributos de cada columna en la tabla 'jTablaDetalle'
        ArrayList lista = new ArrayList();
        // Se evalúa si aún quedan productos en el stock
        if(stockProduct > 0){
            lista.add(item);
            lista.add(idProduct);
            lista.add(nombProduct);
            lista.add(cantProducto);
            lista.add(precioProduct);
            lista.add(subtotal);
            Object[] obj = new Object[6];
            obj[0] = lista.get(0);
            obj[1] = lista.get(1);
            obj[2] = lista.get(2);
            obj[3] = lista.get(3);
            obj[4] = lista.get(4);
            obj[5] = lista.get(5);
            modelo.addRow(obj);
            jTablaDetalle.setModel(modelo);
            // Se calcula el total cada vez que se agreguen productos a la tabla
            calcularTotal();
        }else{
            JOptionPane.showMessageDialog(this, "No hay unidades existentes de "+nombProduct);
        }
    }
    
    //Se recorre cada fila de 'jTablaDetalle' y en cada iteración se calcula 
    //el precio total a pagar en la compra
    void calcularTotal(){
        totalCompra = 0;
        for(int i = 0; i < jTablaDetalle.getRowCount(); i++){
            cantProducto = Integer.parseInt(jTablaDetalle.getValueAt(i, 3).toString());
            precioProduct = Double.parseDouble(jTablaDetalle.getValueAt(i, 4).toString());
            totalCompra = totalCompra + (cantProducto * precioProduct);
        }
        jTxtTotalPagar.setText(String.valueOf(totalCompra));
    }
    
    //Método que busca según la idProduct y muestra el nombProduct, precioProduct y stockProduct en las cajas
    //de texto correspondientes
    void buscarProduct(){
        idProduct = Integer.parseInt(jTxtCodProduct.getText());
        if(jTxtCodProduct.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Para 'BUSCAR' un PRODUCTO primero debe poner el código");
        }else{
            product = productDao.listarId(idProduct);
            if(product.getIdProduct() != 0){
                jTxtProduct.setText(product.getNombProduct());
                jTxtPrecio.setText(String.valueOf(product.getPrecioProduct()));
                jTxtStock.setText(String.valueOf(product.getStockProduct()));
                
            }else{
                JOptionPane.showMessageDialog(this, "Producto NO registrado");
                jTxtCodProduct.requestFocus();
            }
        }
    }
    
    //Método que busca según la cedCliente y muestra el nombCliente en la caja
    //de texto correspondiente
    void buscarCliente(){
        int resp;
        String cedCliente =jTxtCodCliente.getText();
        if(jTxtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Para 'BUSCAR' un CLIENTE primero debe poner la cédula");
        }else{
            cliente = clienteDao.listarId(cedCliente);
            if(cliente.getCedCliente() != null){
                jTxtCliente.setText(cliente.getNombCliente());
                jTxtCodProduct.requestFocus();
            }else{
                resp = JOptionPane.showConfirmDialog(this, "Cliente NO registrado. ¿Desea registrar uno nuevo?");
                if(resp == 0){
                    ClienteForm clienteForm = new ClienteForm();
                    VentanaPrincipal.jDeskPaneFondo.add(clienteForm);
                    clienteForm.setVisible(true);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProduct;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLblCantidad;
    private javax.swing.JLabel jLblCliente;
    private javax.swing.JLabel jLblCodCliente;
    private javax.swing.JLabel jLblCodProduct;
    private javax.swing.JLabel jLblDirec;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblMarket;
    private javax.swing.JLabel jLblNumser;
    private javax.swing.JLabel jLblPos;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JLabel jLblProducto;
    private javax.swing.JLabel jLblStock;
    private javax.swing.JLabel jLblTel;
    private javax.swing.JLabel jLblTotalPagar;
    private javax.swing.JLabel jLblVende;
    private javax.swing.JPanel jPaFormulario;
    private javax.swing.JPanel jPaInfo;
    private javax.swing.JPanel jPaOpciones;
    private javax.swing.JPanel jPaTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinCantidad;
    private javax.swing.JTable jTablaDetalle;
    private javax.swing.JTextField jTxtCliente;
    private javax.swing.JTextField jTxtCodCliente;
    private javax.swing.JTextField jTxtCodProduct;
    private javax.swing.JTextField jTxtFecha;
    private javax.swing.JTextField jTxtNumser;
    private javax.swing.JTextField jTxtPrecio;
    private javax.swing.JTextField jTxtProduct;
    private javax.swing.JTextField jTxtStock;
    private javax.swing.JTextField jTxtTotalPagar;
    private javax.swing.JTextField jTxtVende;
    // End of variables declaration//GEN-END:variables
}
