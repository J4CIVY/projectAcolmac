package Presentacion;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import java.util.*;

public final class HomeInterface extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        contTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlFechaHora = new javax.swing.JPanel();
        pnlFecha = new javax.swing.JPanel();
        txtHora = new javax.swing.JLabel();
        eventFecha = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pnlUsuario = new javax.swing.JPanel();
        btnUserLogin = new javax.swing.JButton();
        btnUserRegister = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        pnlDebug = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 750));
        setMinimumSize(new java.awt.Dimension(600, 750));
        setName("FrmPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(600, 750));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(600, 750));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(600, 750));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(0, 0, 49));
        pnlTitulo.setMaximumSize(new java.awt.Dimension(600, 80));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(600, 80));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(600, 80));

        contTitulo.setBackground(new java.awt.Color(0, 0, 49));
        contTitulo.setMaximumSize(new java.awt.Dimension(480, 60));
        contTitulo.setMinimumSize(new java.awt.Dimension(480, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Índice De Desigualdad En América Latina");
        jLabel1.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/ACOLMAC_Logo.png"))); // NOI18N

        javax.swing.GroupLayout contTituloLayout = new javax.swing.GroupLayout(contTitulo);
        contTitulo.setLayout(contTituloLayout);
        contTituloLayout.setHorizontalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        contTituloLayout.setVerticalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        pnlFechaHora.setBackground(new java.awt.Color(0, 0, 49));
        pnlFechaHora.setMaximumSize(new java.awt.Dimension(290, 40));
        pnlFechaHora.setMinimumSize(new java.awt.Dimension(290, 40));
        pnlFechaHora.setPreferredSize(new java.awt.Dimension(290, 40));

        pnlFecha.setBackground(new java.awt.Color(0, 0, 49));
        pnlFecha.setMaximumSize(new java.awt.Dimension(70, 35));
        pnlFecha.setMinimumSize(new java.awt.Dimension(70, 35));
        pnlFecha.setPreferredSize(new java.awt.Dimension(70, 35));

        txtHora.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setText("El Día De Hoy Es:");

        eventFecha.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        eventFecha.setForeground(new java.awt.Color(255, 255, 255));
        eventFecha.setText("DD/MM/YYYY");

        javax.swing.GroupLayout pnlFechaLayout = new javax.swing.GroupLayout(pnlFecha);
        pnlFecha.setLayout(pnlFechaLayout);
        pnlFechaLayout.setHorizontalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHora)
                    .addComponent(eventFecha))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        pnlFechaLayout.setVerticalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLayout.createSequentialGroup()
                .addComponent(txtHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eventFecha)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFechaHoraLayout = new javax.swing.GroupLayout(pnlFechaHora);
        pnlFechaHora.setLayout(pnlFechaHoraLayout);
        pnlFechaHoraLayout.setHorizontalGroup(
            pnlFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFechaHoraLayout.setVerticalGroup(
            pnlFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFechaHoraLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(pnlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setMaximumSize(new java.awt.Dimension(290, 40));
        jPanel7.setMinimumSize(new java.awt.Dimension(290, 40));
        jPanel7.setPreferredSize(new java.awt.Dimension(290, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addComponent(pnlFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        pnlUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlUsuario.setMaximumSize(new java.awt.Dimension(600, 40));
        pnlUsuario.setMinimumSize(new java.awt.Dimension(600, 40));
        pnlUsuario.setPreferredSize(new java.awt.Dimension(600, 40));

        btnUserLogin.setText("Iniciar Sesión");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        btnUserRegister.setText("Registrarse");
        btnUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserLogin)
                    .addComponent(btnUserRegister))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 40));

        pnlContenedor.setMaximumSize(new java.awt.Dimension(600, 400));
        pnlContenedor.setMinimumSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 400));

        pnlDebug.setBackground(new java.awt.Color(0, 255, 255));
        pnlDebug.setMaximumSize(new java.awt.Dimension(600, 150));
        pnlDebug.setMinimumSize(new java.awt.Dimension(600, 150));
        pnlDebug.setPreferredSize(new java.awt.Dimension(600, 150));

        javax.swing.GroupLayout pnlDebugLayout = new javax.swing.GroupLayout(pnlDebug);
        pnlDebug.setLayout(pnlDebugLayout);
        pnlDebugLayout.setHorizontalGroup(
            pnlDebugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlDebugLayout.setVerticalGroup(
            pnlDebugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlDebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 600, 170));

        pnlView.setBackground(new java.awt.Color(102, 255, 255));
        pnlView.setMaximumSize(new java.awt.Dimension(600, 10));
        pnlView.setMinimumSize(new java.awt.Dimension(600, 10));
        pnlView.setPreferredSize(new java.awt.Dimension(600, 10));

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 600, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed

        UserLogin userLogin = new UserLogin();
        userLogin.setSize(600, 400);
        userLogin.setLocation(0, 0);

        pnlContenedor.removeAll();
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        pnlContenedor.add(userLogin, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();

    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void btnUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegisterActionPerformed

        UserRegister userRegister = new UserRegister();
        userRegister.setSize(600, 400);
        userRegister.setLocation(0, 0);

        pnlContenedor.removeAll();
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        pnlContenedor.add(userRegister, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();

    }//GEN-LAST:event_btnUserRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JButton btnUserRegister;
    private javax.swing.JPanel contTitulo;
    private javax.swing.JLabel eventFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDebug;
    private javax.swing.JPanel pnlFecha;
    private javax.swing.JPanel pnlFechaHora;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnlView;
    private javax.swing.JLabel txtHora;
    // End of variables declaration//GEN-END:variables

    public HomeInterface() {
        initComponents();

        eventFecha.setText(fecha());

        HomePresentation homePresentation = new HomePresentation();
        homePresentation.setSize(600, 400);
        homePresentation.setLocation(0, 0);

        pnlContenedor.removeAll();
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        pnlContenedor.add(homePresentation, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }

    public static String fecha() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        return dateFormat.format(date);
    }

    public JPanel getPanelPrincipal() {

        return this.pnlPrincipal;

    }

    public JPanel getPanelTitulo() {

        return this.pnlTitulo;
    }

    public JPanel getPanelUsuario() {

        return this.pnlUsuario;
    }

    public JPanel getPanelContenedor() {

        return this.pnlContenedor;
    }

    public JPanel getPanelDebug() {

        return this.pnlDebug;
    }

    public JPanel getPanelView() {

        return this.pnlView;
    }
}
