
package IGU;

import Logica.Controladora;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class FormularioPeluqueria extends javax.swing.JFrame {
    //Creando mi objeto para mostar mi imagen 
    FondoPAnel fondo = new FondoPAnel();

   //Inicializando una vaiable global de controladora
    Controladora control;
    
   //Guardando clase para personalizar mis JOptionDialog
    UIManager UI;


    public FormularioPeluqueria() {
        
        //Quito el contorno de la ventana que viene por defecto(saco el boton minimizar maximisar y cerrar)
        this.setUndecorated(true);
        
        //Mostrando mi imagen en la parte superior
        this.setContentPane(fondo);

        initComponents();
        // Instanciando mi variable control 
        control = new Controladora();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel01 = new FondoPAnel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCerrarVentana = new javax.swing.JLabel();
        jLabelCerrarVentana1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel03 = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        textClienteN = new javax.swing.JTextField();
        jLabelCliente1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textColor = new javax.swing.JTextField();
        jLabelCliente2 = new javax.swing.JLabel();
        textRaza = new javax.swing.JTextField();
        jLabelRaza = new javax.swing.JLabel();
        textCelDuenio = new javax.swing.JTextField();
        jLabelCelDuenio = new javax.swing.JLabel();
        textNombreDuenio = new javax.swing.JTextField();
        jLabeNombreDuenio = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        jLabelAlergico = new javax.swing.JLabel();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        jLabelAtencionEspecial = new javax.swing.JLabel();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JPanel();
        jLabelLimpiar1 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JPanel();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(197, 227, 255));

        jPanel01.setBackground(new java.awt.Color(255, 102, 102));
        jPanel01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel01MouseDragged(evt);
            }
        });
        jPanel01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel01MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 48, 17));
        jLabel1.setText("Peluquería ");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 48, 17));
        jLabel2.setText("Canina ");

        jLabelCerrarVentana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCerrarVentana.setForeground(new java.awt.Color(108, 119, 206));
        jLabelCerrarVentana.setText(" x");
        jLabelCerrarVentana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 119, 206)));
        jLabelCerrarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarVentanaMouseClicked(evt);
            }
        });

        jLabelCerrarVentana1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCerrarVentana1.setForeground(new java.awt.Color(108, 119, 206));
        jLabelCerrarVentana1.setText(" -");
        jLabelCerrarVentana1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 119, 206), 1, true));
        jLabelCerrarVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrarVentana1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarVentana1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel01Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel01Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addComponent(jLabelCerrarVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCerrarVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel03.setBackground(new java.awt.Color(108, 119, 206));

        jLabelCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente N°:");

        textClienteN.setBackground(new java.awt.Color(239, 244, 251));
        textClienteN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textClienteN.setBorder(null);

        jLabelCliente1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente1.setText("Nombre:");

        textNombre.setBackground(new java.awt.Color(239, 244, 251));
        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(null);

        textColor.setBackground(new java.awt.Color(239, 244, 251));
        textColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textColor.setBorder(null);

        jLabelCliente2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCliente2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente2.setText("Color:");

        textRaza.setBackground(new java.awt.Color(239, 244, 251));
        textRaza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textRaza.setBorder(null);

        jLabelRaza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRaza.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRaza.setText("Raza:");

        textCelDuenio.setBackground(new java.awt.Color(239, 244, 251));
        textCelDuenio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textCelDuenio.setBorder(null);

        jLabelCelDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCelDuenio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCelDuenio.setText("Cel. Dueño:");

        textNombreDuenio.setBackground(new java.awt.Color(239, 244, 251));
        textNombreDuenio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombreDuenio.setBorder(null);

        jLabeNombreDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeNombreDuenio.setForeground(new java.awt.Color(255, 255, 255));
        jLabeNombreDuenio.setText("Nombre Dueño:");

        cmbAlergico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "si", "no" }));

        jLabelAlergico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAlergico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlergico.setText("Alérgico:");

        cmbAtencionEspecial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "si", "no" }));

        jLabelAtencionEspecial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAtencionEspecial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAtencionEspecial.setText("Atencion Especial:");

        jLabelObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservaciones.setText("Observaciones:");

        textArea.setBackground(new java.awt.Color(239, 244, 251));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textArea.setRows(5);
        textArea.setBorder(null);
        jScrollPane1.setViewportView(textArea);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        jLabelLimpiar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLimpiar1.setForeground(new java.awt.Color(108, 119, 206));
        jLabelLimpiar1.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLimpiar1.setBackground(new java.awt.Color(108, 119, 206));
        btnLimpiar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiar1MouseExited(evt);
            }
        });

        jLabelLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiar1Layout = new javax.swing.GroupLayout(btnLimpiar1);
        btnLimpiar1.setLayout(btnLimpiar1Layout);
        btnLimpiar1Layout.setHorizontalGroup(
            btnLimpiar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiar1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnLimpiar1Layout.setVerticalGroup(
            btnLimpiar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel03Layout = new javax.swing.GroupLayout(jPanel03);
        jPanel03.setLayout(jPanel03Layout);
        jPanel03Layout.setHorizontalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel03Layout.createSequentialGroup()
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel03Layout.createSequentialGroup()
                                        .addComponent(jLabelCliente)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel03Layout.createSequentialGroup()
                                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRaza)
                                            .addComponent(jLabelAlergico))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(textClienteN))
                                    .addGroup(jPanel03Layout.createSequentialGroup()
                                        .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addComponent(jLabeNombreDuenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addComponent(jLabelAtencionEspecial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCliente1)
                                    .addComponent(jLabelCliente2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textColor, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(textNombre)))
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addComponent(jLabelCelDuenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel03Layout.createSequentialGroup()
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelObservaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel03Layout.setVerticalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente)
                    .addComponent(textClienteN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRaza)
                    .addComponent(textRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente2)
                    .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAlergico)
                            .addComponent(jLabelAtencionEspecial)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(13, 13, 13)
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNombreDuenio)
                    .addComponent(textNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelDuenio)
                    .addComponent(textCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addComponent(jLabelObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel03Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel03Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))))
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON LIMPIAR
    private void btnLimpiar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar1MouseExited
        btnLimpiar1.setBackground(new Color(108,119,206));
        jLabelLimpiar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnLimpiar1MouseExited

    //BOTON LIMPIAR
    private void btnLimpiar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar1MouseEntered
        btnLimpiar1.setBackground(new Color(206,206,206));
        jLabelLimpiar.setForeground(new java.awt.Color(108,119,206));
    }//GEN-LAST:event_btnLimpiar1MouseEntered

    private void btnLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar1MouseClicked
        //Seteando mis TextField en campos vacios
        textClienteN.setText("");
        textNombre.setText("");
        textRaza.setText("");
        textColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        textNombreDuenio.setText("");
        textCelDuenio.setText("");
        textArea.setText("");

    }//GEN-LAST:event_btnLimpiar1MouseClicked
    
    
    //BOTON GUARDAR
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(206,206,206));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        try{

            //Guardando informacion de mis textFile del formulario para enviarlos a la logica, mas espesifico a la clase controladora

            int num_cliente = Integer.parseInt(textClienteN.getText());//Tranformando mi string a Int
            String nombre_perro = textNombre.getText();
            String raza = textRaza.getText();
            String color = textColor.getText();

            boolean alergico;
            //Convirtiendo mi respuestsa a booleano
            if( "si".equals((String) cmbAlergico.getSelectedItem())){

                alergico = true;
            }else{

                alergico = false;
            }

            boolean atención_especial;
            //Convirtiendo mi respuestsa a booleano
            if( "si".equals((String) cmbAtencionEspecial.getSelectedItem())){

                atención_especial = true;
            }else{

                atención_especial = false;
            }

            String nombre_duenio = textNombreDuenio.getText();
            String celular_duenio = textCelDuenio.getText();
            String observaciones = textArea.getText();

            //Utilizando mi istancia ya creada para enviar mis datos a la logica
            control.altaRegistro(num_cliente, nombre_perro,raza, color, alergico, atención_especial, nombre_duenio, celular_duenio, observaciones);
           
            //Perzonalizando mi JOptionPane.showMessageDialog
            UI = null;
            UI.put("OptionPane.background", new Color(221,255,221));
            UI.put("Panel.background", new Color(221,255,221));
            JOptionPane.showMessageDialog(this, "Se registro con exito!");
        
        
        }
        catch(NumberFormatException e)
        {   //Perzonalizando mi JOptionPane.showMessageDialog
            UI = null;
            UI.put("OptionPane.background", new Color(255,221,221));
            UI.put("Panel.background", new Color(255,221,221));
            JOptionPane.showMessageDialog(this, "Complete los campos para guardar un registro!");

        }

    }//GEN-LAST:event_btnGuardarMouseClicked
//Desplazamiento de mi ventana, en la parte superior
    int xx,xy;
    private void jPanel01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel01MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel01MousePressed

    private void jPanel01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel01MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel01MouseDragged

//Accion para cerrar mi ventana
    private void jLabelCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarVentanaMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarVentanaMouseClicked

//Accion para minimizar mi ventana
    private void jLabelCerrarVentana1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarVentana1MouseClicked
        
        this.setState(FormularioPeluqueria.ICONIFIED);
  
    }//GEN-LAST:event_jLabelCerrarVentana1MouseClicked
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnLimpiar1;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel jLabeNombreDuenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAlergico;
    private javax.swing.JLabel jLabelAtencionEspecial;
    private javax.swing.JLabel jLabelCelDuenio;
    private javax.swing.JLabel jLabelCerrarVentana;
    private javax.swing.JLabel jLabelCerrarVentana1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelCliente2;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelLimpiar1;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel03;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textCelDuenio;
    private javax.swing.JTextField textClienteN;
    private javax.swing.JTextField textColor;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombreDuenio;
    private javax.swing.JTextField textRaza;
    // End of variables declaration//GEN-END:variables
}

//Class para agregar imagen en la parte superior de mi formulario
class FondoPAnel extends JPanel {
    //Crenado mi variable imagen
    private Image imagen;
    
    @Override
    public void paint(Graphics g) {
       //Guardando en una variable mi imagen
       imagen = new ImageIcon(getClass().getResource("/img/imgPanel.png")).getImage();
       //posicion y dimencion de mi imagen
       g.drawImage(imagen, -25, 10, 310, 135 ,this);

       setOpaque(false);
       super.paint(g);    
    } 

}
