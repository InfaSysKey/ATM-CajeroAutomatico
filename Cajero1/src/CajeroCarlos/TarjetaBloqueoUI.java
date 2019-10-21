/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroCarlos;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author InfaSysKey Carlos del Cura Pascual
 * @version 1.0
 * 
 */
public class TarjetaBloqueoUI extends javax.swing.JPanel {

    private final Cuenta cuenta;
    private final Usuario usuario;
    private final Tarjeta tarjeta;
    /**
     * Creates new form TarjetaBloqueoUI
     */
    public TarjetaBloqueoUI(Usuario usuario, Tarjeta tarjeta, Cuenta cuenta) {
        initComponents();
        this.usuario = usuario;
        this.tarjeta = tarjeta;
        this.cuenta = cuenta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonBloquear = new javax.swing.JButton();
        botonVerTarjetas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMov = new javax.swing.JTable();

        setBackground(new java.awt.Color(134, 222, 249));

        jLabel1.setBackground(new java.awt.Color(134, 222, 249));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione la accion deseada");

        botonBloquear.setBackground(new java.awt.Color(34, 167, 240));
        botonBloquear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonBloquear.setForeground(new java.awt.Color(255, 255, 255));
        botonBloquear.setText("Bloquear Tarjeta");
        botonBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBloquearActionPerformed(evt);
            }
        });

        botonVerTarjetas.setBackground(new java.awt.Color(34, 167, 240));
        botonVerTarjetas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonVerTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        botonVerTarjetas.setText("Ver Tarjetas");
        botonVerTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerTarjetasActionPerformed(evt);
            }
        });

        tablaMov.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaMov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID_Cuenta", "ID_Tarjeta", "Pin", "Bloqueo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMov.setRowHeight(12);
        jScrollPane1.setViewportView(tablaMov);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(botonBloquear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVerTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * @param evt Para ver las tajetas del usuario.
     */
    private void botonVerTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerTarjetasActionPerformed
        List<Tarjeta> listaTarjeta = ServicioBBDD.getTarjetasLista(cuenta.getIdCuenta());
        DefaultTableModel modelo = new DefaultTableModel(0, 4);
        for (Tarjeta tarjeta : listaTarjeta) {
            int idcuenta = tarjeta.getIdCuenta();
            int idtarjeta = tarjeta.getIdTarjeta();
            
            int pin = tarjeta.getPin();
            int bloque = tarjeta.getTarjeta_bloqueo();
            System.out.println(idcuenta);
            System.out.println(idcuenta);
            System.out.println(pin);
            System.out.println(bloque);
            Object sBloque = null;
            
            if (bloque == 0) {
                sBloque = "No bloqueada";
            }else if (bloque == 1){
                sBloque = "Tarjeta Bloqueda";
            }
            
            Object[] datos = {idcuenta,idtarjeta,pin,sBloque};
            modelo.addRow(datos);
        }
        modelo.setColumnIdentifiers(new String[]{"ID_Cuenta","ID_Tarjeta","Pin","Bloqueo"});
        this.tablaMov.setModel(modelo);
        modelo.fireTableDataChanged();
    }//GEN-LAST:event_botonVerTarjetasActionPerformed
    /**
     * 
     * @param evt bloqueo la tarjeta seleccionada
     */
    private void botonBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBloquearActionPerformed
        try {
            int indice = this.tablaMov.getSelectedRow();
            int bloqueo = 1;
            int idTarjeta = (int) this.tablaMov.getValueAt(indice, 1);
            ServicioBBDD.tarjetaBloqueo(idTarjeta, bloqueo);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Ninguna fila seleccionada", "Advetencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonBloquearActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBloquear;
    private javax.swing.JButton botonVerTarjetas;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMov;
    // End of variables declaration//GEN-END:variables
}
