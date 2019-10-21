/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroCarlos;

import static CajeroCarlos.CajerooUI.pantallaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author InfaSysKey Carlos del Cura Pascual
 * @version 1.0
 * 
 */
public class CambiarPinUI extends javax.swing.JPanel implements ActionListener {

    private final Cuenta cuenta;
    private final Usuario usuario;
    private final Tarjeta tarjeta;

    /**
     * Creates new form CambiarPinUI
     */
    public CambiarPinUI(Usuario usuario, Tarjeta tarjeta, Cuenta cuenta) {
        initComponents();
        this.usuario = usuario;
        this.tarjeta = tarjeta;
        this.cuenta = cuenta;
        botonNumero0.addActionListener(this);
        botonNumero1.addActionListener(this);
        botonNumero2.addActionListener(this);
        botonNumero3.addActionListener(this);
        botonNumero4.addActionListener(this);
        botonNumero5.addActionListener(this);
        botonNumero6.addActionListener(this);
        botonNumero7.addActionListener(this);
        botonNumero8.addActionListener(this);
        botonNumero9.addActionListener(this);
        botonLimpiar.addActionListener(this);
        botonCancelar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonNumero1 || e.getSource() == botonNumero2 || e.getSource() == botonNumero3 || e.getSource() == botonNumero4
                || e.getSource() == botonNumero5 || e.getSource() == botonNumero6 || e.getSource() == botonNumero7 || e.getSource() == botonNumero8
                || e.getSource() == botonNumero9 || e.getSource() == botonLimpiar || e.getSource() == botonNumero0) {
            String txtNeuvo1 = txtPin.getText();
            String txtNuevo2 = txtPin2.getText();
            if (e.getSource() == botonNumero0) {
                if (txt1 == true) {
                    txtNeuvo1 += "0";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "0";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero1) {
                if (txt1 == true) {
                    txtNeuvo1 += "1";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "1";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero2) {
                if (txt1 == true) {
                    txtNeuvo1 += "2";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "2";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero3) {
                if (txt1 == true) {
                    txtNeuvo1 += "3";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "3";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero4) {
                if (txt1 == true) {
                    txtNeuvo1 += "4";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "4";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero5) {
                if (txt1 == true) {
                    txtNeuvo1 += "5";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "5";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero6) {
                if (txt1 == true) {
                    txtNeuvo1 += "6";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "6";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero7) {
                if (txt1 == true) {
                    txtNeuvo1 += "7";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "7";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero8) {
                if (txt1 == true) {
                    txtNeuvo1 += "8";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "8";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonNumero9) {
                if (txt1 == true) {
                    txtNeuvo1 += "9";
                    txtPin.setText(txtNeuvo1);
                } else if (txt2 == true) {
                    txtNuevo2 += "9";
                    txtPin2.setText(txtNuevo2);
                }
            }
            if (e.getSource() == botonLimpiar) {
                if (txt2 == true) {
                    txtPin.setText("");
                } else if (txt1 = true) {
                    txtPin2.setText("");
                }
            }

        }
        if (e.getSource() == botonCancelar) {
            txtPin.setText("");
            txtPin2.setText("");
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

        botonCancelar = new javax.swing.JButton();
        botonNumero8 = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonNumero0 = new javax.swing.JButton();
        botonAccionEnter = new javax.swing.JButton();
        botonNumero1 = new javax.swing.JButton();
        botonNumero2 = new javax.swing.JButton();
        botonNumero3 = new javax.swing.JButton();
        botonNumero4 = new javax.swing.JButton();
        botonNumero5 = new javax.swing.JButton();
        botonNumero6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        botonNumero7 = new javax.swing.JButton();
        botonNumero9 = new javax.swing.JButton();
        txtPin = new javax.swing.JPasswordField();
        txtPin2 = new javax.swing.JPasswordField();
        lblCambio1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(134, 222, 249));
        setPreferredSize(new java.awt.Dimension(519, 508));

        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CancelNormal.png"))); // NOI18N
        botonCancelar.setAlignmentY(0.0F);
        botonCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CancelPulsadoNegro.png"))); // NOI18N

        botonNumero8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/8.png"))); // NOI18N
        botonNumero8.setAlignmentY(0.0F);
        botonNumero8.setBorder(null);
        botonNumero8.setBorderPainted(false);
        botonNumero8.setContentAreaFilled(false);
        botonNumero8.setFocusPainted(false);
        botonNumero8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/8Sombra.png"))); // NOI18N

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CleanNormal.png"))); // NOI18N
        botonLimpiar.setAlignmentY(0.0F);
        botonLimpiar.setBorder(null);
        botonLimpiar.setBorderPainted(false);
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setFocusPainted(false);
        botonLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CleanPulsadoNegro.png"))); // NOI18N

        botonNumero0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/0.png"))); // NOI18N
        botonNumero0.setAlignmentY(0.0F);
        botonNumero0.setBorder(null);
        botonNumero0.setBorderPainted(false);
        botonNumero0.setContentAreaFilled(false);
        botonNumero0.setFocusPainted(false);
        botonNumero0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/0Sombra.png"))); // NOI18N

        botonAccionEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/EnterNormal.png"))); // NOI18N
        botonAccionEnter.setAlignmentY(0.0F);
        botonAccionEnter.setBorder(null);
        botonAccionEnter.setBorderPainted(false);
        botonAccionEnter.setContentAreaFilled(false);
        botonAccionEnter.setFocusPainted(false);
        botonAccionEnter.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/EnterFondoNegro.png"))); // NOI18N
        botonAccionEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccionEnterActionPerformed(evt);
            }
        });

        botonNumero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/1.png"))); // NOI18N
        botonNumero1.setAlignmentY(0.0F);
        botonNumero1.setBorder(null);
        botonNumero1.setBorderPainted(false);
        botonNumero1.setContentAreaFilled(false);
        botonNumero1.setFocusPainted(false);
        botonNumero1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/1Sombra.png"))); // NOI18N

        botonNumero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/2.png"))); // NOI18N
        botonNumero2.setAlignmentY(0.0F);
        botonNumero2.setBorder(null);
        botonNumero2.setBorderPainted(false);
        botonNumero2.setContentAreaFilled(false);
        botonNumero2.setFocusPainted(false);
        botonNumero2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/2Sombra.png"))); // NOI18N

        botonNumero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/3.png"))); // NOI18N
        botonNumero3.setAlignmentY(0.0F);
        botonNumero3.setBorder(null);
        botonNumero3.setBorderPainted(false);
        botonNumero3.setContentAreaFilled(false);
        botonNumero3.setFocusPainted(false);
        botonNumero3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/3pre.png"))); // NOI18N

        botonNumero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/4.png"))); // NOI18N
        botonNumero4.setAlignmentY(0.0F);
        botonNumero4.setBorder(null);
        botonNumero4.setBorderPainted(false);
        botonNumero4.setContentAreaFilled(false);
        botonNumero4.setFocusPainted(false);
        botonNumero4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/4Sombra.png"))); // NOI18N

        botonNumero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/5.png"))); // NOI18N
        botonNumero5.setAlignmentY(0.0F);
        botonNumero5.setBorder(null);
        botonNumero5.setBorderPainted(false);
        botonNumero5.setContentAreaFilled(false);
        botonNumero5.setFocusPainted(false);
        botonNumero5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/5Sombra.png"))); // NOI18N

        botonNumero6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/6.png"))); // NOI18N
        botonNumero6.setAlignmentY(0.0F);
        botonNumero6.setBorder(null);
        botonNumero6.setBorderPainted(false);
        botonNumero6.setContentAreaFilled(false);
        botonNumero6.setFocusPainted(false);
        botonNumero6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/6Sombra.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(134, 222, 249));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMBIAR PIN TARJETA");

        lblCambio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambio.setText("ESCRIBA EL NUEVO PIN");

        botonNumero7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/7.png"))); // NOI18N
        botonNumero7.setAlignmentY(0.0F);
        botonNumero7.setBorder(null);
        botonNumero7.setBorderPainted(false);
        botonNumero7.setContentAreaFilled(false);
        botonNumero7.setFocusPainted(false);
        botonNumero7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/7Sombra.png"))); // NOI18N

        botonNumero9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/9.png"))); // NOI18N
        botonNumero9.setAlignmentY(0.0F);
        botonNumero9.setBorder(null);
        botonNumero9.setBorderPainted(false);
        botonNumero9.setContentAreaFilled(false);
        botonNumero9.setFocusPainted(false);
        botonNumero9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/9Sombra.png"))); // NOI18N

        txtPin.setBackground(new java.awt.Color(108, 122, 137));
        txtPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPin.setForeground(new java.awt.Color(228, 241, 254));
        txtPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPinMouseClicked(evt);
            }
        });

        txtPin2.setBackground(new java.awt.Color(108, 122, 137));
        txtPin2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPin2.setForeground(new java.awt.Color(228, 241, 254));
        txtPin2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPin2MouseClicked(evt);
            }
        });

        lblCambio1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCambio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambio1.setText("VUELVE A INTRODUCIRLO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 109, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCambio1)
                            .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPin2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonNumero4)
                                    .addComponent(botonNumero8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonNumero7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonNumero9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonNumero5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonNumero6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNumero1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAccionEnter, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPin2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCambio1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonNumero1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonNumero2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonNumero3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonNumero6)
                                    .addComponent(botonNumero0))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botonNumero5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonNumero7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botonNumero4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botonNumero8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAccionEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt Cogemos los datos introducidos en los txtField y se lo pasamos
     * a una consulta para cambair el pin a la tarjeta que estamos usando.
     * 
     */
    private void botonAccionEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccionEnterActionPerformed
        try {
            int pinNuevo1 = Integer.parseInt(txtPin.getText().trim());
            int pinNuevo2 = Integer.parseInt(txtPin2.getText().trim());
            if (pinNuevo1 == pinNuevo2) {
                int numtarjeta = tarjeta.getIdTarjeta();
                ServicioBBDD.actualizarPin(numtarjeta, pinNuevo2);
            }else{
                JOptionPane.showMessageDialog(pantallaPrincipal, "No coinciden los PIN", "Advetencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(pantallaPrincipal, "El programa solo admite valores numericos", "Advetencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_botonAccionEnterActionPerformed

    private void txtPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPinMouseClicked
       txt2 = false;
       txt1 = true;
    }//GEN-LAST:event_txtPinMouseClicked

    private void txtPin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPin2MouseClicked
        txt2 = true;
        txt1 = false;
    }//GEN-LAST:event_txtPin2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonAccionEnter;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonLimpiar;
    public javax.swing.JButton botonNumero0;
    public javax.swing.JButton botonNumero1;
    public javax.swing.JButton botonNumero2;
    public javax.swing.JButton botonNumero3;
    public javax.swing.JButton botonNumero4;
    public javax.swing.JButton botonNumero5;
    public javax.swing.JButton botonNumero6;
    public javax.swing.JButton botonNumero7;
    public javax.swing.JButton botonNumero8;
    public javax.swing.JButton botonNumero9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblCambio;
    public javax.swing.JLabel lblCambio1;
    private javax.swing.JPasswordField txtPin;
    private javax.swing.JPasswordField txtPin2;
    // End of variables declaration//GEN-END:variables
    boolean txt2 = false;
    boolean txt1 = false;
}
