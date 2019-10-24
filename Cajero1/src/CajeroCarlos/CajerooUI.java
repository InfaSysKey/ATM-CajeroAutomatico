/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroCarlos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author InfaSysKey Carlos del Cura Pascual
 * @version 1.1
 * @see <a href = "https://www.linkedin.com/in/delcuracarlos/" /></a>
 *
 *
 */
public class CajerooUI extends javax.swing.JFrame implements ActionListener, MouseListener {

    /**
     * Atributos de las clases para que los datos, sacados de la base de datos
     * se queden almacenados en el CajeroUI. *
     */
    private Usuario usuario;
    private Tarjeta tarjeta;
    private Cuenta cuenta;
    private Movimiento movimiento;

    //Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    //Constructor de Cajero UI
    public CajerooUI() {
        initComponents();

        labelTarjeta.setVisible(false);
        labelPin.setVisible(false);
        txtNumTarjeta.setVisible(false);
        txtPassPin.setVisible(false);

        //Escucha del teclado
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

        //Desahabilitamos el teclado
        botonNumero0.setVisible(false);
        botonNumero1.setVisible(false);
        botonNumero2.setVisible(false);
        botonNumero3.setVisible(false);
        botonNumero4.setVisible(false);
        botonNumero5.setVisible(false);
        botonNumero6.setVisible(false);
        botonNumero7.setVisible(false);
        botonNumero8.setVisible(false);
        botonNumero9.setVisible(false);
        botonLimpiar.setVisible(false);
        botonCancelar.setVisible(false);
        botonAccionEnter.setVisible(false);

        labelBancoFassil.addMouseListener(this);
        labelLogoAtm.addMouseListener(this);
        getContentPane().setBackground(new Color(83, 88, 107));
        panelLogin.setBackground(new Color(134, 222, 249));
        //cursor();
    }
    /**
     * Cursos dedo.
     */
    /*public void cursor(){
        Cursor cursor;
        ImageIcon imagenes = new ImageIcon("src\\ImagenesCajero\\DedoNegro.png");
        Toolkit t = Toolkit.getDefaultToolkit();
        cursor = t.createCustomCursor(imagenes.getImage(), new Point(1, 1), "Dedo");
        setCursor(cursor);
    }*/

    /**
     *
     * @param e Un actionPerformed sobre los botonesdel teclado, para conseguir
     * los numeros.
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonNumero1 || e.getSource() == botonNumero2 || e.getSource() == botonNumero3 || e.getSource() == botonNumero4
                || e.getSource() == botonNumero5 || e.getSource() == botonNumero6 || e.getSource() == botonNumero7 || e.getSource() == botonNumero8
                || e.getSource() == botonNumero9 || e.getSource() == botonLimpiar || e.getSource() == botonNumero0) {
            String txtTar = txtNumTarjeta.getText();
            String txtPin = txtPassPin.getText();
            if (e.getSource() == botonNumero0) {
                if (txt1 == true) {
                    txtTar += "0";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "0";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero1) {
                if (txt1 == true) {
                    txtTar += "1";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "1";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero2) {
                if (txt1 == true) {
                    txtTar += "2";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "2";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero3) {
                if (txt1 == true) {
                    txtTar += "3";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "3";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero4) {
                if (txt1 == true) {
                    txtTar += "4";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "4";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero5) {
                if (txt1 == true) {
                    txtTar += "5";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "5";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero6) {
                if (txt1 == true) {
                    txtTar += "6";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "6";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero7) {
                if (txt1 == true) {
                    txtTar += "7";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "7";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero8) {
                if (txt1 == true) {
                    txtTar += "8";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "8";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonNumero9) {
                if (txt1 == true) {
                    txtTar += "9";
                    txtNumTarjeta.setText(txtTar);
                } else if (txt2 == true) {
                    txtPin += "9";
                    txtPassPin.setText(txtPin);
                }
            }
            if (e.getSource() == botonLimpiar) {
                if (txt2 == true) {
                    txtPassPin.setText("");
                } else if (txt1 = true) {
                    txtNumTarjeta.setText("");
                }
            }

        }
        if (e.getSource() == botonCancelar) {
            txtNumTarjeta.setText("");
            txtPassPin.setText("");
        }
    }

    /**
     *
     * @param e MouseClicked para abrir el menu administrador.
     *
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == labelBancoFassil || e.getSource() == labelLogoAtm) {
            if (e.getSource() == labelBancoFassil) {
                pulsar1 = true;
            }
            if (e.getSource() == labelLogoAtm) {
                pulsa12 = true;
            }
            if (pulsa12 == true && pulsar1 == true) {
                MenuAdministradorUI menuAdm = new MenuAdministradorUI();
                menuAdm.setVisible(true);
                pulsa12 = false;
                pulsar1 = false;
            }
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

        panelPantallaPrincipal = new javax.swing.JPanel();
        pantallaPrincipal = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        labelPin = new javax.swing.JLabel();
        labelTarjeta = new javax.swing.JLabel();
        txtNumTarjeta = new javax.swing.JTextField();
        txtPassPin = new javax.swing.JPasswordField();
        botonCancelar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonNumero1 = new javax.swing.JButton();
        botonAccionEnter = new javax.swing.JButton();
        botonNumero2 = new javax.swing.JButton();
        botonNumero3 = new javax.swing.JButton();
        botonNumero4 = new javax.swing.JButton();
        botonNumero5 = new javax.swing.JButton();
        botonNumero6 = new javax.swing.JButton();
        botonNumero7 = new javax.swing.JButton();
        botonNumero9 = new javax.swing.JButton();
        botonNumero8 = new javax.swing.JButton();
        botonNumero0 = new javax.swing.JButton();
        botonIngresarDinero = new javax.swing.JButton();
        botonPantallaPrincipal = new javax.swing.JButton();
        botonCambiarPin = new javax.swing.JButton();
        botonVerCuentas = new javax.swing.JButton();
        barraEstetica1 = new javax.swing.JPanel();
        barraEstetica2 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonTarjeta = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        barraEstetica5 = new javax.swing.JPanel();
        barraEstetica6 = new javax.swing.JPanel();
        barraEstetica7 = new javax.swing.JPanel();
        barraEstetica8 = new javax.swing.JPanel();
        botonRetirarDinero = new javax.swing.JButton();
        panelInformacionMasTarjeta = new javax.swing.JPanel();
        barraEstetica3 = new javax.swing.JPanel();
        barraEstetica4 = new javax.swing.JPanel();
        labelBancoFassil = new javax.swing.JLabel();
        botonIntroducirTarjeta = new javax.swing.JToggleButton();
        labelLogoAtm = new javax.swing.JLabel();
        barraEstetica9 = new javax.swing.JPanel();
        barraEstetica10 = new javax.swing.JPanel();
        barraEstetica11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero");
        setBackground(new java.awt.Color(153, 255, 153));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        panelPantallaPrincipal.setBackground(new java.awt.Color(52, 56, 67));

        pantallaPrincipal.setBackground(new java.awt.Color(134, 222, 249));
        pantallaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        pantallaPrincipal.setName(""); // NOI18N
        pantallaPrincipal.setPreferredSize(new java.awt.Dimension(519, 508));
        pantallaPrincipal.setLayout(new java.awt.CardLayout());

        panelLogin.setPreferredSize(new java.awt.Dimension(519, 508));

        labelPin.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelPin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPin.setText("Pin");
        labelPin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTarjeta.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarjeta.setText("NUMERO DE TARJETA");
        labelTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNumTarjeta.setBackground(new java.awt.Color(108, 122, 137));
        txtNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumTarjeta.setForeground(new java.awt.Color(228, 241, 254));
        txtNumTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumTarjetaMouseClicked(evt);
            }
        });

        txtPassPin.setBackground(new java.awt.Color(108, 122, 137));
        txtPassPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassPin.setForeground(new java.awt.Color(228, 241, 254));
        txtPassPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassPinMouseClicked(evt);
            }
        });

        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CancelNormal.png"))); // NOI18N
        botonCancelar.setAlignmentY(0.0F);
        botonCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CancelPulsadoNegro.png"))); // NOI18N

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CleanNormal.png"))); // NOI18N
        botonLimpiar.setAlignmentY(0.0F);
        botonLimpiar.setBorder(null);
        botonLimpiar.setBorderPainted(false);
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setFocusPainted(false);
        botonLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CleanPulsadoNegro.png"))); // NOI18N

        botonNumero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/1.png"))); // NOI18N
        botonNumero1.setAlignmentY(0.0F);
        botonNumero1.setBorder(null);
        botonNumero1.setBorderPainted(false);
        botonNumero1.setContentAreaFilled(false);
        botonNumero1.setFocusPainted(false);
        botonNumero1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/1Sombra.png"))); // NOI18N

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

        botonNumero8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/8.png"))); // NOI18N
        botonNumero8.setAlignmentY(0.0F);
        botonNumero8.setBorder(null);
        botonNumero8.setBorderPainted(false);
        botonNumero8.setContentAreaFilled(false);
        botonNumero8.setFocusPainted(false);
        botonNumero8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/8Sombra.png"))); // NOI18N

        botonNumero0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/0.png"))); // NOI18N
        botonNumero0.setAlignmentY(0.0F);
        botonNumero0.setBorder(null);
        botonNumero0.setBorderPainted(false);
        botonNumero0.setContentAreaFilled(false);
        botonNumero0.setFocusPainted(false);
        botonNumero0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/0Sombra.png"))); // NOI18N

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTarjeta))
                .addGap(31, 31, 31)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassPin)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonNumero4)
                            .addComponent(botonNumero8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(botonNumero7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero9))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(botonNumero5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCancelar)
                            .addComponent(botonAccionEnter)
                            .addComponent(botonLimpiar)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(botonNumero1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNumero2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNumero3)))
                .addGap(53, 53, 53))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassPin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNumero1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonNumero2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonNumero3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAccionEnter, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addComponent(botonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonNumero6)
                            .addComponent(botonNumero0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNumero9))
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addComponent(botonNumero5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonNumero7))
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addComponent(botonNumero4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonNumero8))))
                .addGap(39, 39, 39))
        );

        pantallaPrincipal.add(panelLogin, "card2");

        botonIngresarDinero.setBackground(new java.awt.Color(34, 167, 240));
        botonIngresarDinero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonIngresarDinero.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarDinero.setText("Ingresar Dinero");
        botonIngresarDinero.setEnabled(false);
        botonIngresarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarDineroActionPerformed(evt);
            }
        });

        botonPantallaPrincipal.setBackground(new java.awt.Color(34, 167, 240));
        botonPantallaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonPantallaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        botonPantallaPrincipal.setText("Pantalla Principal");
        botonPantallaPrincipal.setEnabled(false);
        botonPantallaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPantallaPrincipalActionPerformed(evt);
            }
        });

        botonCambiarPin.setBackground(new java.awt.Color(34, 167, 240));
        botonCambiarPin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCambiarPin.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarPin.setText("Cambiar PIN");
        botonCambiarPin.setEnabled(false);
        botonCambiarPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPinActionPerformed(evt);
            }
        });

        botonVerCuentas.setBackground(new java.awt.Color(34, 167, 240));
        botonVerCuentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonVerCuentas.setForeground(new java.awt.Color(255, 255, 255));
        botonVerCuentas.setText("Ver Cuenta");
        botonVerCuentas.setEnabled(false);
        botonVerCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerCuentasActionPerformed(evt);
            }
        });

        barraEstetica1.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica1.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica1Layout = new javax.swing.GroupLayout(barraEstetica1);
        barraEstetica1.setLayout(barraEstetica1Layout);
        barraEstetica1Layout.setHorizontalGroup(
            barraEstetica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica1Layout.setVerticalGroup(
            barraEstetica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        barraEstetica2.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica2.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica2Layout = new javax.swing.GroupLayout(barraEstetica2);
        barraEstetica2.setLayout(barraEstetica2Layout);
        barraEstetica2Layout.setHorizontalGroup(
            barraEstetica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica2Layout.setVerticalGroup(
            barraEstetica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        botonSalir.setBackground(new java.awt.Color(34, 167, 240));
        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setEnabled(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonTarjeta.setBackground(new java.awt.Color(34, 167, 240));
        botonTarjeta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        botonTarjeta.setText("Tarjeta Bloque");
        botonTarjeta.setEnabled(false);
        botonTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTarjetaActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(57, 182, 75));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel13.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        barraEstetica5.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica5.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica5Layout = new javax.swing.GroupLayout(barraEstetica5);
        barraEstetica5.setLayout(barraEstetica5Layout);
        barraEstetica5Layout.setHorizontalGroup(
            barraEstetica5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        barraEstetica5Layout.setVerticalGroup(
            barraEstetica5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        barraEstetica6.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica6.setPreferredSize(new java.awt.Dimension(450, 15));

        barraEstetica7.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica7.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica7Layout = new javax.swing.GroupLayout(barraEstetica7);
        barraEstetica7.setLayout(barraEstetica7Layout);
        barraEstetica7Layout.setHorizontalGroup(
            barraEstetica7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barraEstetica7Layout.setVerticalGroup(
            barraEstetica7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraEstetica6Layout = new javax.swing.GroupLayout(barraEstetica6);
        barraEstetica6.setLayout(barraEstetica6Layout);
        barraEstetica6Layout.setHorizontalGroup(
            barraEstetica6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(barraEstetica6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraEstetica6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(barraEstetica7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        barraEstetica6Layout.setVerticalGroup(
            barraEstetica6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(barraEstetica6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraEstetica6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(barraEstetica7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        barraEstetica8.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica8.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica8Layout = new javax.swing.GroupLayout(barraEstetica8);
        barraEstetica8.setLayout(barraEstetica8Layout);
        barraEstetica8Layout.setHorizontalGroup(
            barraEstetica8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica8Layout.setVerticalGroup(
            barraEstetica8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        botonRetirarDinero.setBackground(new java.awt.Color(34, 167, 240));
        botonRetirarDinero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRetirarDinero.setForeground(new java.awt.Color(255, 255, 255));
        botonRetirarDinero.setText("Retirar Dinero");
        botonRetirarDinero.setEnabled(false);
        botonRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetirarDineroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPantallaPrincipalLayout = new javax.swing.GroupLayout(panelPantallaPrincipal);
        panelPantallaPrincipal.setLayout(panelPantallaPrincipalLayout);
        panelPantallaPrincipalLayout.setHorizontalGroup(
            panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPantallaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraEstetica1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(panelPantallaPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIngresarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRetirarDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraEstetica2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPantallaPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barraEstetica8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(pantallaPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraEstetica5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraEstetica6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVerCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiarPin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(panelPantallaPrincipalLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(botonPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPantallaPrincipalLayout.setVerticalGroup(
            panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPantallaPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(barraEstetica1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPantallaPrincipalLayout.createSequentialGroup()
                            .addComponent(botonCambiarPin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(botonVerCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(barraEstetica6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(barraEstetica5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPantallaPrincipalLayout.createSequentialGroup()
                            .addComponent(botonRetirarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(botonIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(botonTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(barraEstetica2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(pantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraEstetica8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInformacionMasTarjeta.setBackground(new java.awt.Color(52, 56, 67));

        barraEstetica3.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica3.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica3Layout = new javax.swing.GroupLayout(barraEstetica3);
        barraEstetica3.setLayout(barraEstetica3Layout);
        barraEstetica3Layout.setHorizontalGroup(
            barraEstetica3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica3Layout.setVerticalGroup(
            barraEstetica3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        barraEstetica4.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica4.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica4Layout = new javax.swing.GroupLayout(barraEstetica4);
        barraEstetica4.setLayout(barraEstetica4Layout);
        barraEstetica4Layout.setHorizontalGroup(
            barraEstetica4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica4Layout.setVerticalGroup(
            barraEstetica4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        labelBancoFassil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/LogoBanco.jpg"))); // NOI18N

        botonIntroducirTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/CajeroBueno.gif"))); // NOI18N
        botonIntroducirTarjeta.setBorder(null);
        botonIntroducirTarjeta.setFocusPainted(false);
        botonIntroducirTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/IntroducirTarjeta.png"))); // NOI18N
        botonIntroducirTarjeta.setRolloverEnabled(false);
        botonIntroducirTarjeta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/TarjetaEntrada.png"))); // NOI18N
        botonIntroducirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntroducirTarjetaActionPerformed(evt);
            }
        });

        labelLogoAtm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoAtm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCajero/LogoATM.png"))); // NOI18N

        barraEstetica9.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica9.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica9Layout = new javax.swing.GroupLayout(barraEstetica9);
        barraEstetica9.setLayout(barraEstetica9Layout);
        barraEstetica9Layout.setHorizontalGroup(
            barraEstetica9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        barraEstetica9Layout.setVerticalGroup(
            barraEstetica9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        barraEstetica10.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica10.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica10Layout = new javax.swing.GroupLayout(barraEstetica10);
        barraEstetica10.setLayout(barraEstetica10Layout);
        barraEstetica10Layout.setHorizontalGroup(
            barraEstetica10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        barraEstetica10Layout.setVerticalGroup(
            barraEstetica10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        barraEstetica11.setBackground(new java.awt.Color(57, 182, 75));
        barraEstetica11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        barraEstetica11.setPreferredSize(new java.awt.Dimension(450, 15));

        javax.swing.GroupLayout barraEstetica11Layout = new javax.swing.GroupLayout(barraEstetica11);
        barraEstetica11.setLayout(barraEstetica11Layout);
        barraEstetica11Layout.setHorizontalGroup(
            barraEstetica11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraEstetica11Layout.setVerticalGroup(
            barraEstetica11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelInformacionMasTarjetaLayout = new javax.swing.GroupLayout(panelInformacionMasTarjeta);
        panelInformacionMasTarjeta.setLayout(panelInformacionMasTarjetaLayout);
        panelInformacionMasTarjetaLayout.setHorizontalGroup(
            panelInformacionMasTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelInformacionMasTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraEstetica4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionMasTarjetaLayout.createSequentialGroup()
                        .addComponent(barraEstetica9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelLogoAtm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(barraEstetica10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraEstetica3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraEstetica11, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(botonIntroducirTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBancoFassil, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelInformacionMasTarjetaLayout.setVerticalGroup(
            panelInformacionMasTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(barraEstetica4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBancoFassil)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionMasTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionMasTarjetaLayout.createSequentialGroup()
                        .addComponent(labelLogoAtm)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionMasTarjetaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelInformacionMasTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraEstetica9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraEstetica10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraEstetica3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIntroducirTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(barraEstetica11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInformacionMasTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInformacionMasTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPantallaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt Representa la accion del evento SALIR.
     *
     */
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        botonPantallaPrincipal.setEnabled(false);
        botonIngresarDinero.setEnabled(false);
        botonCambiarPin.setEnabled(false);
        botonVerCuentas.setEnabled(false);
        botonRetirarDinero.setEnabled(false);
        botonPantallaPrincipal.setEnabled(false);
        botonTarjeta.setEnabled(false);

        pantallaPrincipal.removeAll();
        finProg = new FinProgramaUI();
        pantallaPrincipal.add(finProg);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();

        JOptionPane.showMessageDialog(this, "Porfavor, retire su tarjeta");
        botonIntroducirTarjeta.setEnabled(true);


    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     *
     * @param evt Para volver a la pantalla principal.
     *
     */
    private void botonPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPantallaPrincipalActionPerformed
        pantallaPrincipal.removeAll();
        saludo = new SaludoUI(cuenta, tarjeta, usuario);
        pantallaPrincipal.add(saludo);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();

    }//GEN-LAST:event_botonPantallaPrincipalActionPerformed

    /**
     *
     * @param evt Introduccion de la tarjeta de credito.
     *
     */
    private void botonIntroducirTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntroducirTarjetaActionPerformed

        //Ponemos los botones y los labeles para introducir el login
        labelTarjeta.setVisible(true);
        labelPin.setVisible(true);
        txtNumTarjeta.setVisible(true);
        txtPassPin.setVisible(true);

        //Ponemos el teclado que sea visible.
        botonNumero0.setVisible(true);
        botonNumero1.setVisible(true);
        botonNumero2.setVisible(true);
        botonNumero3.setVisible(true);
        botonNumero4.setVisible(true);
        botonNumero5.setVisible(true);
        botonNumero6.setVisible(true);
        botonNumero7.setVisible(true);
        botonNumero8.setVisible(true);
        botonNumero9.setVisible(true);
        botonLimpiar.setVisible(true);
        botonCancelar.setVisible(true);
        botonAccionEnter.setVisible(true);

        //Ya que se ha introducido la tarjeta, se da la opcion de salir, pero unicamente esta opcion.
        botonSalir.setEnabled(true);

        if (botonIntroducirTarjeta.isSelected() == false) {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            System.exit(0);
        }
        botonIntroducirTarjeta.setEnabled(false);
    }//GEN-LAST:event_botonIntroducirTarjetaActionPerformed

    /**
     *
     * @param evt Vemos los movimientos de las cuentas.
     *
     */
    private void botonVerCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerCuentasActionPerformed
        pantallaPrincipal.removeAll();
        movimientos = new MovimientosListaUI(cuenta, tarjeta, usuario);
        pantallaPrincipal.add(movimientos);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();
    }//GEN-LAST:event_botonVerCuentasActionPerformed

    /**
     *
     * @param evt Vemos el panel para introducir dinero en nuestra cuenta.
     *
     */
    private void botonIngresarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarDineroActionPerformed
        pantallaPrincipal.removeAll();
        ingresar = new IngresarDineroUI(usuario, tarjeta, cuenta);
        movimientos = new MovimientosListaUI(cuenta, tarjeta, usuario);
        pantallaPrincipal.add(ingresar);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();
    }//GEN-LAST:event_botonIngresarDineroActionPerformed

    /**
     *
     * @param evt Para saber que txt del login esta activado y escribir en ese.
     *
     */
    private void txtNumTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumTarjetaMouseClicked
        txt2 = false;
        txt1 = true;
    }//GEN-LAST:event_txtNumTarjetaMouseClicked
    /**
     *
     * @param evt Para saber que txt del login esta activado y escribir en ese.
     *
     */
    private void txtPassPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassPinMouseClicked
        txt2 = true;
        txt1 = false;
    }//GEN-LAST:event_txtPassPinMouseClicked
    /**
     * 
     * @param evt Boton para comprobar los datos introducidos en los txtField.
     * 
     * Se van haciendo diferentes comprobaciones :
     *  1- Si la tarjeta esta bloqueada.
     *  2- Si la tarjeta esta mal introducida.
     *  3- Si el pin esta mal introducido.
     *  4- Si no hay cadena vacia en los txtFields.
     * 
     */
    private void botonAccionEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccionEnterActionPerformed
        try {
            int numeroTarjeta = Integer.parseInt(txtNumTarjeta.getText());
            int numeroPIN = Integer.parseInt(txtPassPin.getText());
            //Obtenemos la tarjeta.
            tarjeta = ServicioBBDD.getTarjeta(numeroTarjeta);
            falloTarjeta = tarjeta.getTarjeta_bloqueo();//Esto devulve 0 o 1.
            if (contadorFallos >= 3) {
                falloTarjeta = 1;
                ServicioBBDD.tarjetaBloqueo(tarjeta.getIdTarjeta(), falloTarjeta);
            }
            if (falloTarjeta != 1) {
                if (numeroTarjeta == tarjeta.getIdTarjeta()) {
                    if (numeroPIN == tarjeta.getPin()) {
                        if (txtNumTarjeta.equals("") == false && txtPassPin.equals("") == false) {
                            //Obtenemos la cuenta y usuario , si todas las condiciones son corrctas
                            cuenta = ServicioBBDD.getCuenta(tarjeta.getIdCuenta());
                            usuario = ServicioBBDD.getUsuario(cuenta.getIdUsuario());

                            pantallaPrincipal.removeAll();
                            saludo = new SaludoUI(cuenta, tarjeta, usuario);
                            pantallaPrincipal.add(saludo);
                            pantallaPrincipal.repaint();
                            pantallaPrincipal.revalidate();

                            botonPantallaPrincipal.setEnabled(true);
                            botonIngresarDinero.setEnabled(true);
                            botonCambiarPin.setEnabled(true);
                            botonVerCuentas.setEnabled(true);
                            botonRetirarDinero.setEnabled(true);
                            botonPantallaPrincipal.setEnabled(true);
                            botonTarjeta.setEnabled(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this.panelLogin, "Pin mal Introducido", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        contadorFallos++;
                    }
                } else {
                    //NO VALIDO
                    JOptionPane.showMessageDialog(this.panelLogin, "Numero de tarjeta mal introducido", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this.panelLogin, "Tarjeta bloqueada, pongase en contacto con el banco", "Advertencia", JOptionPane.WARNING_MESSAGE);
                pantallaPrincipal.removeAll();
                finProg = new FinProgramaUI();
                pantallaPrincipal.add(finProg);
                pantallaPrincipal.repaint();
                pantallaPrincipal.revalidate();
                JOptionPane.showMessageDialog(CajerooUI.pantallaPrincipal, "Porfavor, retire su tarjeta");
                botonIntroducirTarjeta.setEnabled(true);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.panelLogin, "El programa solo admite valores numericos", "Advetencia", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ev) {
            JOptionPane.showMessageDialog(this.panelLogin, "Complete todos los campos", "Advetencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonAccionEnterActionPerformed

    /**
     * 
     * @param evt Vemos el panel de retirar dinero.
     * 
     */
    private void botonRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetirarDineroActionPerformed
        pantallaPrincipal.removeAll();
        retirar = new RetirarDineroUI(usuario, tarjeta, cuenta);
        movimientos = new MovimientosListaUI(cuenta, tarjeta, usuario);
        pantallaPrincipal.add(retirar);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();
    }//GEN-LAST:event_botonRetirarDineroActionPerformed
    /**
     * 
     * @param evt Vemos el panel de cambiar el pin.
     * 
     */
    private void botonCambiarPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPinActionPerformed
        pantallaPrincipal.removeAll();
        cambiar = new CambiarPinUI(usuario, tarjeta, cuenta);
        pantallaPrincipal.add(cambiar);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();

    }//GEN-LAST:event_botonCambiarPinActionPerformed

    /**
     * 
     * @param evt Vemos el panel de la configuracion de la tarjeta.
     * 
     */
    private void botonTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTarjetaActionPerformed
        pantallaPrincipal.removeAll();
        tarjetaBlo = new TarjetaBloqueoUI(usuario, tarjeta, cuenta);
        pantallaPrincipal.add(tarjetaBlo);
        pantallaPrincipal.repaint();
        pantallaPrincipal.revalidate();
    }//GEN-LAST:event_botonTarjetaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajerooUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CajerooUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraEstetica1;
    private javax.swing.JPanel barraEstetica10;
    private javax.swing.JPanel barraEstetica11;
    private javax.swing.JPanel barraEstetica2;
    private javax.swing.JPanel barraEstetica3;
    private javax.swing.JPanel barraEstetica4;
    private javax.swing.JPanel barraEstetica5;
    private javax.swing.JPanel barraEstetica6;
    private javax.swing.JPanel barraEstetica7;
    private javax.swing.JPanel barraEstetica8;
    private javax.swing.JPanel barraEstetica9;
    public javax.swing.JButton botonAccionEnter;
    public static javax.swing.JButton botonCambiarPin;
    private javax.swing.JButton botonCancelar;
    public static javax.swing.JButton botonIngresarDinero;
    private javax.swing.JToggleButton botonIntroducirTarjeta;
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
    public static javax.swing.JButton botonPantallaPrincipal;
    public static javax.swing.JButton botonRetirarDinero;
    public static javax.swing.JButton botonSalir;
    public static javax.swing.JButton botonTarjeta;
    public static javax.swing.JButton botonVerCuentas;
    private javax.swing.JPanel jPanel13;
    public javax.swing.JLabel labelBancoFassil;
    public javax.swing.JLabel labelLogoAtm;
    private javax.swing.JLabel labelPin;
    private javax.swing.JLabel labelTarjeta;
    private javax.swing.JPanel panelInformacionMasTarjeta;
    private javax.swing.JPanel panelLogin;
    public javax.swing.JPanel panelPantallaPrincipal;
    public static javax.swing.JPanel pantallaPrincipal;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JPasswordField txtPassPin;
    // End of variables declaration//GEN-END:variables

    /**
     * Para poder trabajar con los paneles, hay que llamarlos antes y crear un objeto con ellos.
     * Cada objeto es un panel, que en su construcotor habra que pasarle una serie de datos, para
     * poder operar con ellos, dependiendo de cada accion.
     * 
     */
    RetirarDineroUI retirar = new RetirarDineroUI(usuario, tarjeta, cuenta);
    MovimientosListaUI movimientos = new MovimientosListaUI(cuenta, tarjeta, usuario);
    IngresarDineroUI ingresar = new IngresarDineroUI(usuario, tarjeta, cuenta);
    SaludoUI saludo = new SaludoUI(cuenta, tarjeta, usuario);
    CambiarPinUI cambiar = new CambiarPinUI(usuario, tarjeta, cuenta);
    TarjetaBloqueoUI tarjetaBlo = new TarjetaBloqueoUI(usuario, tarjeta, cuenta);
    FinProgramaUI finProg = new FinProgramaUI();
    FinProgramaUI saludoInio = new FinProgramaUI();
    
    //Comprobacion del teclado.
    boolean txt1 = false;
    boolean txt2 = false;
    
    //Para saber los fallos que lleva al introducir el pin.
    int falloTarjeta = 0;
    int contadorFallos = 0;
    
    //Para saber si hemos clickado en un sitio, para poder acceder al menu de administrador
    boolean pulsar1 = false;
    boolean pulsa12 = false;

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
