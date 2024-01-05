package Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author juliomariotorresfandino
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    loginForm logForm = new loginForm();
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        //this.logForm.acomodarImagMenu(this.jMeMantenimiento, "src/Imagenes/mantenimiento.png");
        //this.logForm.acomodarImagen(jLblBackground, "src/Imagenes/blueWhiteBackground(RE).jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass() .getResource("/Imagenes/wallpaperVentPrinci.jpg"));
        Image img = icon.getImage();
        jDeskPaneFondo = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMeMenu = new javax.swing.JMenu();
        jMeSalir = new javax.swing.JMenuItem();
        jMeAyuda = new javax.swing.JMenuItem();
        jMeVentas = new javax.swing.JMenu();
        jMeVenta = new javax.swing.JMenuItem();
        jMeMantenimiento = new javax.swing.JMenu();
        jMeProduct = new javax.swing.JMenuItem();
        jMeEmple = new javax.swing.JMenuItem();
        jMeCliente = new javax.swing.JMenuItem();
        jMeReportes = new javax.swing.JMenu();
        jMeReportVent = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jFrCentrado");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jDeskPaneFondo.setMaximumSize(new java.awt.Dimension(784, 570));
        jDeskPaneFondo.setPreferredSize(new java.awt.Dimension(784, 570));

        javax.swing.GroupLayout jDeskPaneFondoLayout = new javax.swing.GroupLayout(jDeskPaneFondo);
        jDeskPaneFondo.setLayout(jDeskPaneFondoLayout);
        jDeskPaneFondoLayout.setHorizontalGroup(
            jDeskPaneFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jDeskPaneFondoLayout.setVerticalGroup(
            jDeskPaneFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jDeskPaneFondo, java.awt.BorderLayout.CENTER);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(407, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(407, 30));

        jMeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/products.png"))); // NOI18N
        jMeMenu.setText("MENU");

        jMeSalir.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jMeSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jMeSalir.setText("SALIR");
        jMeSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeSalirActionPerformed(evt);
            }
        });
        jMeMenu.add(jMeSalir);

        jMeAyuda.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jMeAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconHelp.png"))); // NOI18N
        jMeAyuda.setText("AYUDA");
        jMeMenu.add(jMeAyuda);

        jMenuBar1.add(jMeMenu);

        jMeVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconShop.png"))); // NOI18N
        jMeVentas.setText("VENTAS");

        jMeVenta.setFont(new java.awt.Font("Apple Braille", 1, 13)); // NOI18N
        jMeVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trade.png"))); // NOI18N
        jMeVenta.setText("Generar Venta");
        jMeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeVentaActionPerformed(evt);
            }
        });
        jMeVentas.add(jMeVenta);

        jMenuBar1.add(jMeVentas);

        jMeMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconMantenimiento.png"))); // NOI18N
        jMeMantenimiento.setText("MANTENIMIENTO");

        jMeProduct.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jMeProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dairy-products.png"))); // NOI18N
        jMeProduct.setText("PRODUCTO");
        jMeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeProductActionPerformed(evt);
            }
        });
        jMeMantenimiento.add(jMeProduct);

        jMeEmple.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jMeEmple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/employee.png"))); // NOI18N
        jMeEmple.setText("EMPLEADO");
        jMeEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeEmpleActionPerformed(evt);
            }
        });
        jMeMantenimiento.add(jMeEmple);

        jMeCliente.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jMeCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconClient.png"))); // NOI18N
        jMeCliente.setText("CLIENTE");
        jMeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeClienteActionPerformed(evt);
            }
        });
        jMeMantenimiento.add(jMeCliente);

        jMenuBar1.add(jMeMantenimiento);

        jMeReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconlist.png"))); // NOI18N
        jMeReportes.setText("REPORTES");

        jMeReportVent.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jMeReportVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconReport.png"))); // NOI18N
        jMeReportVent.setText("REPORTE VENTAS");
        jMeReportVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeReportVentActionPerformed(evt);
            }
        });
        jMeReportes.add(jMeReportVent);

        jMenuBar1.add(jMeReportes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMeSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMeSalirActionPerformed

    private void jMeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeVentaActionPerformed
        //Se agrega una ventana al JPanel
        VentasForm ventForm = new VentasForm();
        //jDeskPaneFondo.add(ventForm);
        //ventForm.setVisible(true);
        CentrarVentana(ventForm);
    }//GEN-LAST:event_jMeVentaActionPerformed

    private void jMeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeProductActionPerformed
        ProductoForm formProduct = new ProductoForm();
        CentrarVentana(formProduct);
    }//GEN-LAST:event_jMeProductActionPerformed

    private void jMeEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeEmpleActionPerformed
        EmpleadoForm formEmple = new EmpleadoForm();
        CentrarVentana(formEmple);
    }//GEN-LAST:event_jMeEmpleActionPerformed

    private void jMeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeClienteActionPerformed
        ClienteForm formClient = new ClienteForm();
        CentrarVentana(formClient);
    }//GEN-LAST:event_jMeClienteActionPerformed

    private void jMeReportVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeReportVentActionPerformed
        ReportVentForm  formReportVent = new ReportVentForm();
        CentrarVentana(formReportVent);
    }//GEN-LAST:event_jMeReportVentActionPerformed
    //Método para central las JInternal ventanas que se muestran en el jDeskPaneFondo
    void CentrarVentana(JInternalFrame frame){
        jDeskPaneFondo.add(frame);
        Dimension dimen = jDeskPaneFondo.getSize();
        //Dimensaion de la ventana dentro del JDeskPaneFondo
        Dimension frameDim = frame.getSize();
        frame.setLocation((dimen.width - frameDim.height)/2 , (dimen.height - frameDim.height)/2);
        frame.show();
    }
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDeskPaneFondo;
    private javax.swing.JMenuItem jMeAyuda;
    private javax.swing.JMenuItem jMeCliente;
    private javax.swing.JMenuItem jMeEmple;
    private javax.swing.JMenu jMeMantenimiento;
    private javax.swing.JMenu jMeMenu;
    private javax.swing.JMenuItem jMeProduct;
    private javax.swing.JMenuItem jMeReportVent;
    private javax.swing.JMenu jMeReportes;
    private javax.swing.JMenuItem jMeSalir;
    private javax.swing.JMenuItem jMeVenta;
    private javax.swing.JMenu jMeVentas;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
