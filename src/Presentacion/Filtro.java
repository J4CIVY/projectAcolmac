package Presentacion;

import Logica.ConsultaApiPaisesDTO;
import Logica.ApiBaseDTO;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Filtro extends javax.swing.JPanel {

    public Filtro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        pnlFiltro = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Indice = new javax.swing.JLabel();
        txtMostrarPaisFiltrado = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
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
        pnlView = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setMaximumSize(new java.awt.Dimension(600, 50));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(600, 50));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(600, 50));

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlFiltro.setBackground(new java.awt.Color(255, 255, 255));
        pnlFiltro.setMaximumSize(new java.awt.Dimension(600, 150));
        pnlFiltro.setMinimumSize(new java.awt.Dimension(600, 150));
        pnlFiltro.setPreferredSize(new java.awt.Dimension(600, 150));

        txtFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setMinimumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setPreferredSize(new java.awt.Dimension(200, 20));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 49));
        btnBuscar.setText("Buscar GINI");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setMinimumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 20));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 49));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Introduzca El Nombre Del País Que Desea Consultar");

        Indice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Indice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Indice.setText("Índice De Desigualdad De");

        txtMostrarPaisFiltrado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMostrarPaisFiltrado.setText("Paises");

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(Indice, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMostrarPaisFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Indice)
                    .addComponent(txtMostrarPaisFiltrado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setMaximumSize(new java.awt.Dimension(600, 300));
        pnlContenedor.setMinimumSize(new java.awt.Dimension(600, 300));
        pnlContenedor.setPreferredSize(new java.awt.Dimension(600, 300));

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
                .addGap(19, 19, 19)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlContinente)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttlZonaHoraria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewZonaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttlCapital))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttlGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttlPoblacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(viewGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlCapital)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlGini2019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlPoblacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlZonaHoraria)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttlContinente))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(viewZonaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAcciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlAcciones.setMaximumSize(new java.awt.Dimension(600, 100));
        pnlAcciones.setMinimumSize(new java.awt.Dimension(600, 100));
        pnlAcciones.setPreferredSize(new java.awt.Dimension(600, 100));

        javax.swing.GroupLayout pnlAccionesLayout = new javax.swing.GroupLayout(pnlAcciones);
        pnlAcciones.setLayout(pnlAccionesLayout);
        pnlAccionesLayout.setHorizontalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlAccionesLayout.setVerticalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Indice;
    private javax.swing.JButton btnBuscar;
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
            pnlAcciones.setVisible(true);
            
            opcionesGuardado opcionGuardado = new opcionesGuardado();
            opcionGuardado.setSize(400, 70);
            opcionGuardado.setLocation(0, 0);

            pnlAcciones.removeAll();
            pnlAcciones.revalidate();
            pnlAcciones.repaint();
            pnlAcciones.add(opcionGuardado, BorderLayout.CENTER);
            pnlAcciones.revalidate();
            pnlAcciones.repaint();

        } catch (IOException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarConsultaGiniBD(){
        ApiBaseDTO apiBaseDTO = new ApiBaseDTO();
        ConsultaApiPaisesDTO consultaApiPaisesDTO = new ConsultaApiPaisesDTO();
        apiBaseDTO.guardarDatosApi(viewNombre.getText(), viewNombreOficial.getText(), viewCapital.getText(), viewGini2019.getText(), viewCodigoCoi.getText(), viewPoblacion.getText(), viewZonaHoraria.getText(), viewContinente.getText());
    }
    
    public JLabel getViewNombre(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewNombreOficial(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewCapital(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewCodigoCoi(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewPoblacion(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewContinente(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewZonaHoraria(){
        
        return this.viewNombre;
        
    }
    
    public JLabel getViewGini2019(){
        
        return this.viewNombre;
        
    }
}
