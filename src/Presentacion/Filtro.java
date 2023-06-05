package Presentacion;

import Logica.ConsultaApiPaisesDTO;
import Logica.ApiBaseDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Filtro extends javax.swing.JPanel {

    public Filtro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlFiltro = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        Indice = new javax.swing.JLabel();
        txtMostrarPaisFiltrado = new javax.swing.JLabel();
        ttlNombre = new javax.swing.JLabel();
        viewNombre = new javax.swing.JLabel();
        ttlNombreOficial = new javax.swing.JLabel();
        viewNombreOficial = new javax.swing.JLabel();
        ttlCapital = new javax.swing.JLabel();
        viewCapital = new javax.swing.JLabel();
        ttlGini2019 = new javax.swing.JLabel();
        viewGini2019 = new javax.swing.JLabel();
        ttlCodigoCoi = new javax.swing.JLabel();
        viewCodigoCoi = new javax.swing.JLabel();
        ttlPoblacion = new javax.swing.JLabel();
        viewPoblacion = new javax.swing.JLabel();
        ttlZonaHoraria = new javax.swing.JLabel();
        viewZonaHoraria = new javax.swing.JLabel();
        ttlContinente = new javax.swing.JLabel();
        viewContinente = new javax.swing.JLabel();
        pnlAcciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlView = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setMaximumSize(new java.awt.Dimension(600, 50));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(600, 50));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(600, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/ACOLMAC_Logo_White(2).png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        pnlFiltro.setBackground(new java.awt.Color(255, 255, 255));

        txtFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setMinimumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setPreferredSize(new java.awt.Dimension(200, 20));

        btnBuscar.setText("Buscar GINI");
        btnBuscar.setMaximumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setMinimumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 20));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Introduzca El Nombre Del País Que Desea Consultar");

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 100));

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));

        Indice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Indice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Indice.setText("Índice De Desigualdad De");

        txtMostrarPaisFiltrado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMostrarPaisFiltrado.setText("Paises");

        ttlNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlNombre.setText("Nombre");
        ttlNombre.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlNombre.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlNombre.setPreferredSize(new java.awt.Dimension(90, 15));

        viewNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewNombre.setForeground(new java.awt.Color(0, 0, 49));
        viewNombre.setMaximumSize(new java.awt.Dimension(150, 15));
        viewNombre.setMinimumSize(new java.awt.Dimension(150, 15));
        viewNombre.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlNombreOficial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlNombreOficial.setText("Nombre Oficial");
        ttlNombreOficial.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlNombreOficial.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlNombreOficial.setPreferredSize(new java.awt.Dimension(90, 15));

        viewNombreOficial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewNombreOficial.setForeground(new java.awt.Color(0, 0, 49));
        viewNombreOficial.setMaximumSize(new java.awt.Dimension(150, 15));
        viewNombreOficial.setMinimumSize(new java.awt.Dimension(150, 15));
        viewNombreOficial.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlCapital.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlCapital.setForeground(new java.awt.Color(0, 0, 49));
        ttlCapital.setText("Capital");

        viewCapital.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewCapital.setForeground(new java.awt.Color(0, 0, 49));
        viewCapital.setMaximumSize(new java.awt.Dimension(150, 15));
        viewCapital.setMinimumSize(new java.awt.Dimension(150, 15));
        viewCapital.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlGini2019.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlGini2019.setText("Gini (UN 2019)");
        ttlGini2019.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlGini2019.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlGini2019.setPreferredSize(new java.awt.Dimension(90, 15));

        viewGini2019.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewGini2019.setForeground(new java.awt.Color(0, 0, 49));
        viewGini2019.setMaximumSize(new java.awt.Dimension(150, 15));
        viewGini2019.setMinimumSize(new java.awt.Dimension(150, 15));
        viewGini2019.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlCodigoCoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlCodigoCoi.setText("Codigo COI");
        ttlCodigoCoi.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlCodigoCoi.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlCodigoCoi.setPreferredSize(new java.awt.Dimension(90, 15));

        viewCodigoCoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewCodigoCoi.setMaximumSize(new java.awt.Dimension(150, 15));
        viewCodigoCoi.setMinimumSize(new java.awt.Dimension(150, 15));
        viewCodigoCoi.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlPoblacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlPoblacion.setForeground(new java.awt.Color(0, 0, 49));
        ttlPoblacion.setText("Poblacion");

        viewPoblacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewPoblacion.setMaximumSize(new java.awt.Dimension(150, 15));
        viewPoblacion.setMinimumSize(new java.awt.Dimension(150, 15));
        viewPoblacion.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlZonaHoraria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlZonaHoraria.setForeground(new java.awt.Color(0, 0, 49));
        ttlZonaHoraria.setText("Zona Horaria");

        viewZonaHoraria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewZonaHoraria.setMaximumSize(new java.awt.Dimension(150, 15));
        viewZonaHoraria.setMinimumSize(new java.awt.Dimension(150, 15));
        viewZonaHoraria.setPreferredSize(new java.awt.Dimension(150, 15));

        ttlContinente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlContinente.setForeground(new java.awt.Color(0, 0, 49));
        ttlContinente.setText("Continente");

        viewContinente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewContinente.setMaximumSize(new java.awt.Dimension(150, 15));
        viewContinente.setMinimumSize(new java.awt.Dimension(150, 15));
        viewContinente.setPreferredSize(new java.awt.Dimension(150, 15));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttlCapital)
                                    .addComponent(ttlGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                                        .addComponent(viewGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ttlContinente))
                                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                                        .addComponent(viewCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ttlZonaHoraria))))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ttlPoblacion))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewZonaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Indice, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMostrarPaisFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Indice)
                    .addComponent(txtMostrarPaisFiltrado))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttlPoblacion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttlCapital)
                            .addComponent(viewCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttlZonaHoraria, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viewGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ttlGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ttlContinente)))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(viewZonaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 150));

        jButton1.setText("Guardar Los Datos Obtenidos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAccionesLayout = new javax.swing.GroupLayout(pnlAcciones);
        pnlAcciones.setLayout(pnlAccionesLayout);
        pnlAccionesLayout.setHorizontalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccionesLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        pnlAccionesLayout.setVerticalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAccionesLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pnlPrincipal.add(pnlAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 600, 90));

        pnlView.setBackground(new java.awt.Color(102, 255, 255));

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

        pnlPrincipal.add(pnlView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 600, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarGini();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ApiBaseDTO apiBaseDTO = new ApiBaseDTO();
        ConsultaApiPaisesDTO consultaApiPaisesDTO = new ConsultaApiPaisesDTO();
        apiBaseDTO.guardarDatosApi(viewNombre.getText(), viewNombreOficial.getText(), viewCapital.getText(), viewGini2019.getText(), viewCodigoCoi.getText(), viewPoblacion.getText(), viewZonaHoraria.getText(), viewContinente.getText());

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Indice;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlAcciones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlView;
    private javax.swing.JLabel ttlCapital;
    private javax.swing.JLabel ttlCodigoCoi;
    private javax.swing.JLabel ttlContinente;
    private javax.swing.JLabel ttlGini2019;
    private javax.swing.JLabel ttlNombre;
    private javax.swing.JLabel ttlNombreOficial;
    private javax.swing.JLabel ttlPoblacion;
    private javax.swing.JLabel ttlZonaHoraria;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtMostrarPaisFiltrado;
    private javax.swing.JLabel viewCapital;
    private javax.swing.JLabel viewCodigoCoi;
    private javax.swing.JLabel viewContinente;
    private javax.swing.JLabel viewGini2019;
    private javax.swing.JLabel viewNombre;
    private javax.swing.JLabel viewNombreOficial;
    private javax.swing.JLabel viewPoblacion;
    private javax.swing.JLabel viewZonaHoraria;
    // End of variables declaration//GEN-END:variables

    public JPanel getPnlContenedor() {

        return this.pnlContenedor;

    }

    public JLabel getViewNombre() {

        return this.viewNombre;
    }

    public void buscarGini() {
        try {
            ConsultaApiPaisesDTO consultaApiPaisesDTO = new ConsultaApiPaisesDTO();
            String resultadoConsulta = consultaApiPaisesDTO.getPaisInfo(txtFiltro.getText());
            txtMostrarPaisFiltrado.setText(txtFiltro.getText());
            viewNombre.setText(consultaApiPaisesDTO.getPaisRegularNombre());
            viewNombreOficial.setText(consultaApiPaisesDTO.getPaisOfficialNombre());
            viewCapital.setText(consultaApiPaisesDTO.getPaisCapital());
            viewCodigoCoi.setText(consultaApiPaisesDTO.getPaisCOICodigo());
            viewPoblacion.setText(consultaApiPaisesDTO.getPaisPoblacion());
            viewContinente.setText(consultaApiPaisesDTO.getPaisContinente());
            viewZonaHoraria.setText(consultaApiPaisesDTO.getPaisZonaHoraria());
            viewGini2019.setText(consultaApiPaisesDTO.getPaisGiniIndice());

        } catch (IOException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarGini() {

    }
}
