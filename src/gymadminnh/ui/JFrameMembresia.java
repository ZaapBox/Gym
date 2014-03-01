/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gymadminnh.ui;

import gymadminnh.data.Cliente;
import gymadminnh.data.DataUtils;
import gymadminnh.data.Membresia;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
public class JFrameMembresia extends javax.swing.JFrame {

    private static Cliente cliente;
    private static boolean esNueva;
    private static Membresia membresia;
    
    /**
     * Creates new form JFrameMembresia
     */
    public JFrameMembresia(boolean b, Cliente c) {
        this.cliente = c;
        this.esNueva = b;
        initComponents();
        if ( !esNueva ){
            int tamanoLista = cliente.getListaMembresias().size();
            membresia = cliente.getListaMembresias().get(tamanoLista-1);
            cargarUltimaMembresia();   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbuttonGuardarMembresia = new javax.swing.JButton();
        jbuttonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jxdatepickerFecha = new org.jdesktop.swingx.JXDatePicker();
        jtfPrecio = new javax.swing.JTextField();
        jspinnerDuracion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Membresia");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Membresia"));

        jLabel1.setText("Fecha (dd/mm/aaa)");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtaDescripcion);

        jLabel2.setText("Duracion(meses)");

        jLabel3.setText("Precio");

        jbuttonGuardarMembresia.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jbuttonGuardarMembresia.setText("Guardar");
        jbuttonGuardarMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonGuardarMembresiaActionPerformed(evt);
            }
        });

        jbuttonCancelar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jbuttonCancelar.setText("Cancelar");
        jbuttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Descripcion");

        jxdatepickerFecha.setDate(new Date());
        this.jxdatepickerFecha.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

        jspinnerDuracion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbuttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuttonGuardarMembresia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jxdatepickerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspinnerDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jxdatepickerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jspinnerDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonGuardarMembresia)
                    .addComponent(jbuttonCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbuttonCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jbuttonGuardarMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonGuardarMembresiaActionPerformed
        int resultado = 0;
//        int total = 0;
        if ( datosValidados() ){
            if ( esNueva ){
                resultado = new DataUtils().agregarMembresiaDB(membresia, cliente.getIdCliente());
//                total += resultado;
                
//                StringBuilder sb = new StringBuilder();
//                sb.append("Membresia ");
//                sb.append(cliente.getNombre());
//                sb.append(", ");
//                sb.append(membresia.getDuracion());
//                sb.append("mes(es), ");
//                sb.append(membresia.getDescripcion());
//                resultado = new DataUtils().agregarMovimiento(membresia.getFechaInicio(), membresia.getPrecio(), sb.toString());
//                total += resultado;
            } else {
                resultado = new DataUtils().modificarMembresiaDB(membresia);
//                total += resultado;
                
//                StringBuilder sb = new StringBuilder();
//                sb.append("Membresia ");
//                sb.append(cliente.getNombre());
//                sb.append(", ");
//                sb.append(membresia.getDuracion());
//                sb.append("mes(es), ");
//                sb.append(membresia.getDescripcion());
//                resultado = new DataUtils().modificarMovimientoDB(membresia.getFechaInicio(), membresia.getPrecio(), sb.toString());
            }
            
//            if ( resultado == 1 ){
//                JOptionPane.showMessageDialog(this, "Datos guardados.");
//            } else {
//                JOptionPane.showMessageDialog(this, "Hubo un error al guardar los datos. Los datos no han sido guardados.");
//            }
//            System.out.println("result: " + resultado);
            
            if ( resultado == 1 ){
                JOptionPane.showMessageDialog(this, "Datos guardados.");
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al guardar los datos. Los datos no han sido guardados.");
            }
            this.dispose();
        }
    }//GEN-LAST:event_jbuttonGuardarMembresiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameMembresia(esNueva, cliente).setVisible(true);
            }
        });
    }
    
    private boolean datosValidados() {
        String strPrecio = this.jtfPrecio.getText();
        String strDuracion = this.jspinnerDuracion.getValue().toString();
        
        if ( strPrecio.isEmpty() ){
            JOptionPane.showMessageDialog(this, "El campo de precio no puede estar vacio.");
            return false;
        } else if ( !esNumero(strPrecio) ){
            JOptionPane.showMessageDialog(this, "Error en el campo de precio.");
            return false;
        } else if ( !esNumero(strDuracion)){
            JOptionPane.showMessageDialog(this, "Error en el campo de duracion.");
            return false;
        } else {
            if ( esNueva ){
                membresia = new Membresia();
            }
            membresia.setFechaInicio(this.jxdatepickerFecha.getDate());
            membresia.setDuracion( Short.parseShort(strDuracion));
            membresia.setPrecio(Double.parseDouble(strPrecio));
            membresia.setDescripcion(this.jtaDescripcion.getText());
            return true;
        }
    }
    
    private boolean esNumero(String text) {
        try {
            double d = Double.parseDouble(text);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void cargarUltimaMembresia() {
        this.jxdatepickerFecha.setDate(membresia.getFechaInicio());
        this.jspinnerDuracion.setValue(membresia.getDuracion());
        this.jtfPrecio.setText(String.valueOf(membresia.getPrecio()));
        this.jtaDescripcion.setText(membresia.getDescripcion());
    }
    
//    private void setFechaVence() {
//        Date fecha = this.jxdatepickerFecha.getDate();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(fecha);
//        int meses = Integer.parseInt(String.valueOf(this.jspinnerDuracion.getValue()));
//        cal.add(Calendar.MONTH, meses);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        this.jlabelFechaVence.setText(sdf.format(cal.getTime()));
//        this.jlabelFechaVence.updateUI();
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbuttonCancelar;
    private javax.swing.JButton jbuttonGuardarMembresia;
    private javax.swing.JSpinner jspinnerDuracion;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfPrecio;
    private org.jdesktop.swingx.JXDatePicker jxdatepickerFecha;
    // End of variables declaration//GEN-END:variables
}