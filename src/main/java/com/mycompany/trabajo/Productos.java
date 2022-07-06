package com.mycompany.trabajo;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Productos extends javax.swing.JFrame {
  
    /**
     * Creates new form ProductosJframe
     */
    public Productos() {
        initComponents();
        setLocationRelativeTo(null);
        llenarTabla();
        this.ComboBoxTipo.setEnabled(false);
        this.ButtonContinuar.setEnabled(false);
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
        Tabla = new javax.swing.JTable();
        ButtonInsertar = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        ButtonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        ButtonInsertar.setText("Insertar");
        ButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertarActionPerformed(evt);
            }
        });

        ButtonModificar.setText("Modificar");
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
            }
        });

        ButtonBorrar.setText("Borrar");

        ButtonVolver.setText("Volver");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sano", "No Sano" }));
        ComboBoxTipo.setToolTipText("");
        ComboBoxTipo.setEnabled(false);
        ComboBoxTipo.setKeySelectionManager(null);
        ComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxTipoItemStateChanged(evt);
            }
        });
        ComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoActionPerformed(evt);
            }
        });

        ButtonContinuar.setText("Continuar");
        ButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBorrar)
                    .addComponent(ButtonModificar)
                    .addComponent(ButtonInsertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonVolver)
                    .addComponent(ButtonContinuar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertarActionPerformed
        // TODO add your handling code here:
        this.ComboBoxTipo.setEnabled(true);
        this.ButtonContinuar.setEnabled(true);
        this.ButtonModificar.setEnabled(false);
        this.ButtonBorrar.setEnabled(false);
        this.ButtonVolver.setEnabled(false);
        /*
        NuevoProducto ventana = new NuevoProducto();
        ventana.setVisible(true);
         this.setVisible(false);
        */
    }//GEN-LAST:event_ButtonInsertarActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed
        // TODO add your handling code here:
        Fechas fecha = new Fechas();
        fecha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonModificarActionPerformed

    private void ComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoActionPerformed

    private void ButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonContinuarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if(this.ComboBoxTipo.getSelectedIndex()==0){
            Sano ventana = new Sano();
            ventana.setVisible(true);
        }
        if(this.ComboBoxTipo.getSelectedIndex()==1){
            NoSano ventana = new NoSano();
            ventana.setVisible(true);
        }
        
    }//GEN-LAST:event_ButtonContinuarActionPerformed

    private void ComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxTipoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoItemStateChanged

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        // TODO add your handling code here:
        Fechas ventana = new Fechas();
        ventana.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_ButtonVolverActionPerformed
     private void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(new String []{"Productos","Cantidad","Calorías","Sellos","Vegano"},Principal.ListaFecha.get(Fechas.variable).getListaProducto().size());
        Tabla.setModel(modelo);
        
        TableModel modelofechas = Tabla.getModel();
        for(int i = 0 ; i < Principal.ListaFecha.get(Fechas.variable).getListaProducto().size(); i++){
            Producto producto = new ProductoNoSano();
            if( producto.getClass() == Principal.ListaFecha.get(Fechas.variable).getListaProducto().get(i).getClass()){
            producto = Principal.ListaFecha.get(Fechas.variable).getListaProducto().get(i);
            modelofechas.setValueAt(producto.getNombre(), i, 0);
            modelofechas.setValueAt(producto.getCantidad(), i, 1);
            modelofechas.setValueAt(producto.getCalorias(), i, 2);
            ProductoNoSano producto2 = (ProductoNoSano)producto;
            modelofechas.setValueAt(producto2.getSellos(), i, 3);
            modelofechas.setValueAt("X", i, 4);
        }else{
                Producto producto3 = new ProductoSano();
                producto3 = Principal.ListaFecha.get(Fechas.variable).getListaProducto().get(i);
                
                modelofechas.setValueAt(producto3.getNombre(), i, 0);
                modelofechas.setValueAt(producto3.getCantidad(), i, 1);
                modelofechas.setValueAt(producto3.getCalorias(), i, 2);
                modelofechas.setValueAt("X", i, 3);
                ProductoSano producto4 = (ProductoSano)producto3;
                if(producto4.isVegan()== true){
                    modelofechas.setValueAt("true", i, 4);
                }
                if(producto4.isVegan()== false){
                    modelofechas.setValueAt("false", i, 4);
                }
                
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonContinuar;
    private javax.swing.JButton ButtonInsertar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
