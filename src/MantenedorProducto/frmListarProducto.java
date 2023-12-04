/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MantenedorProducto;
import MantenedorEmpleado.Conexion;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Daniel
 */
public class frmListarProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmListarProducto
     */
    public frmListarProducto() {
        initComponents();
         cargarDatosProductos(null);
        cargarComboBoxProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducto = new javax.swing.JTable();
        lblNombreProduct = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbBuscar = new javax.swing.JButton();
        cmbBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jtProducto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jtProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProducto);

        lblNombreProduct.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblNombreProduct.setText("Nombre del producto:");

        cmbProducto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Producto");

        cmbBuscar.setBackground(new java.awt.Color(0, 0, 0));
        cmbBuscar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cmbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        cmbBuscar.setText("Buscar");
        cmbBuscar.setBorder(null);
        cmbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarActionPerformed(evt);
            }
        });

        cmbBuscar1.setBackground(new java.awt.Color(0, 0, 0));
        cmbBuscar1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cmbBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        cmbBuscar1.setText("Volver");
        cmbBuscar1.setBorder(null);
        cmbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cmbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreProduct)
                        .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cmbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarActionPerformed
        String nombreProductoABuscar = (String) cmbProducto.getSelectedItem();
        cargarDatosProductos(nombreProductoABuscar);
    }//GEN-LAST:event_cmbBuscarActionPerformed

    private void cmbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscar1ActionPerformed
    this.dispose();        
    }//GEN-LAST:event_cmbBuscar1ActionPerformed

    /**
     * @param args the command line arguments
     */


    private void cargarComboBoxProductos() {
        try {
            DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
            String consulta = "SELECT Nombre FROM Producto";

            Connection con = Conexion.getConexion();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                modeloCombo.addElement(rs.getString("Nombre"));
            }

            cmbProducto.setModel(modeloCombo);

            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Puedes agregar aquí mensajes de error o mostrar cuadros de diálogo.
        }
    }

    private void cargarDatosProductos(String nombreProducto) {
       DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("NumProducto");
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Estado");

    String consulta;
    if (nombreProducto != null && !nombreProducto.isEmpty()) {
        consulta = "SELECT NumProducto, Nombre, Descripcion, Estado FROM Producto WHERE Nombre = ?";
    } else {
        consulta = "SELECT NumProducto, Nombre, Descripcion, Estado FROM Producto";
    }

    try {
        Connection con = Conexion.getConexion();
        PreparedStatement pstmt = con.prepareStatement(consulta);

        if (nombreProducto != null && !nombreProducto.isEmpty()) {
            pstmt.setString(1, nombreProducto);
        }

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Vector fila = new Vector();
            fila.add(rs.getInt("NumProducto"));
            fila.add(rs.getString("Nombre"));
            fila.add(rs.getString("Descripcion"));
            fila.add(rs.getString("Estado"));
            modelo.addRow(fila);
        }

        jtProducto.setModel(modelo);

        rs.close();
        pstmt.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }
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
            java.util.logging.Logger.getLogger(frmListarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBuscar;
    private javax.swing.JButton cmbBuscar1;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProducto;
    private javax.swing.JLabel lblNombreProduct;
    // End of variables declaration//GEN-END:variables
}