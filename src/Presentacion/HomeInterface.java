package Presentacion;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class HomeInterface extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlUsuario = new javax.swing.JPanel();
        btnUserLogin = new javax.swing.JButton();
        btnUserRegister = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        pnlDebug = new javax.swing.JPanel();
        pnlview = new javax.swing.JPanel();

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
        pnlTitulo.setMaximumSize(new java.awt.Dimension(600, 180));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(600, 180));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(600, 180));

        jPanel5.setBackground(new java.awt.Color(0, 0, 49));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Índice De Desigualdad En América Latina");
        jLabel1.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/ACOLMAC_Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        pnlPrincipal.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 186, 600, -1));

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

        pnlPrincipal.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 600, 400));

        pnlDebug.setBackground(new java.awt.Color(0, 255, 255));
        pnlDebug.setMaximumSize(new java.awt.Dimension(600, 120));
        pnlDebug.setMinimumSize(new java.awt.Dimension(600, 120));
        pnlDebug.setPreferredSize(new java.awt.Dimension(600, 120));

        javax.swing.GroupLayout pnlDebugLayout = new javax.swing.GroupLayout(pnlDebug);
        pnlDebug.setLayout(pnlDebugLayout);
        pnlDebugLayout.setHorizontalGroup(
            pnlDebugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlDebugLayout.setVerticalGroup(
            pnlDebugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlDebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 600, -1));

        pnlview.setBackground(new java.awt.Color(102, 255, 255));
        pnlview.setMaximumSize(new java.awt.Dimension(600, 10));
        pnlview.setMinimumSize(new java.awt.Dimension(600, 10));
        pnlview.setPreferredSize(new java.awt.Dimension(600, 10));

        javax.swing.GroupLayout pnlviewLayout = new javax.swing.GroupLayout(pnlview);
        pnlview.setLayout(pnlviewLayout);
        pnlviewLayout.setHorizontalGroup(
            pnlviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlviewLayout.setVerticalGroup(
            pnlviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 600, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        
        UserLogin userLogin = new UserLogin();
        userLogin.setSize(600, 400);
        userLogin.setLocation(0,0);
        
        pnlContenedor.removeAll();
        pnlContenedor.add(userLogin, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        
    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void btnUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JButton btnUserRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDebug;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnlview;
    // End of variables declaration//GEN-END:variables

public HomeInterface() {
        initComponents();
        
        HomePresentation homePresentation = new HomePresentation();
        homePresentation.setSize(600, 400);
        homePresentation.setLocation(0,0);
        
        pnlContenedor.removeAll();
        pnlContenedor.add(homePresentation, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();        
    }
    
    public JPanel getPanelPrincipal () {
        
        return this.pnlPrincipal;
        
    }
    
    public JPanel getPanelTitulo () {
        
        return this.pnlTitulo;
    }
    
    public JPanel getPanelUsuario () {
        
        return this.pnlUsuario;
    }
    
    public JPanel getPanelContenedor () {
        
        return this.pnlContenedor;
    }
    
    public JPanel getPanelDebug () {
        
        return this.pnlDebug;
    }
    
    public JPanel getPanelView () {
        
        return this.pnlview;
    }
}    
