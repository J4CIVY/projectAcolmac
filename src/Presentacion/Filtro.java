package Presentacion;

import Logica.ConsultaApiPaisesDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlFiltro = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        optFiltro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ttlNombre = new javax.swing.JLabel();
        ttlNombreOficial = new javax.swing.JLabel();
        ttlCodigoCoi = new javax.swing.JLabel();
        ttlUsoHorario = new javax.swing.JLabel();
        viewNombre = new javax.swing.JLabel();
        viewNombreOficial = new javax.swing.JLabel();
        viewCodigoCoi = new javax.swing.JLabel();
        viewUsoHorario = new javax.swing.JLabel();
        pnlAcciones = new javax.swing.JPanel();
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/ACOLMAC_Logo_White(2).png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        pnlFiltro.setBackground(new java.awt.Color(255, 255, 255));

        txtFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setMinimumSize(new java.awt.Dimension(200, 20));
        txtFiltro.setPreferredSize(new java.awt.Dimension(200, 20));

        optFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        optFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        optFiltro.setMaximumSize(new java.awt.Dimension(200, 20));
        optFiltro.setMinimumSize(new java.awt.Dimension(200, 20));
        optFiltro.setPreferredSize(new java.awt.Dimension(200, 20));

        btnBuscar.setText("Buscar GINI");
        btnBuscar.setMaximumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setMinimumSize(new java.awt.Dimension(150, 20));
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 20));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 100));

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("INFORMACIÓN GENERAL DEL PAÍS");

        ttlNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlNombre.setText("Nombre");
        ttlNombre.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlNombre.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlNombre.setPreferredSize(new java.awt.Dimension(90, 15));

        ttlNombreOficial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlNombreOficial.setText("Nombre Oficial");
        ttlNombreOficial.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlNombreOficial.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlNombreOficial.setPreferredSize(new java.awt.Dimension(90, 15));

        ttlCodigoCoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlCodigoCoi.setText("Codigo COI");
        ttlCodigoCoi.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlCodigoCoi.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlCodigoCoi.setPreferredSize(new java.awt.Dimension(90, 15));

        ttlUsoHorario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ttlUsoHorario.setText("Uso Horario");
        ttlUsoHorario.setMaximumSize(new java.awt.Dimension(90, 15));
        ttlUsoHorario.setMinimumSize(new java.awt.Dimension(90, 15));
        ttlUsoHorario.setPreferredSize(new java.awt.Dimension(90, 15));

        viewNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewNombre.setText("Nombre");
        viewNombre.setMaximumSize(new java.awt.Dimension(90, 15));
        viewNombre.setMinimumSize(new java.awt.Dimension(90, 15));
        viewNombre.setPreferredSize(new java.awt.Dimension(90, 15));

        viewNombreOficial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewNombreOficial.setText("Nombre");
        viewNombreOficial.setMaximumSize(new java.awt.Dimension(90, 15));
        viewNombreOficial.setMinimumSize(new java.awt.Dimension(90, 15));
        viewNombreOficial.setPreferredSize(new java.awt.Dimension(90, 15));

        viewCodigoCoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewCodigoCoi.setText("Nombre");
        viewCodigoCoi.setMaximumSize(new java.awt.Dimension(90, 15));
        viewCodigoCoi.setMinimumSize(new java.awt.Dimension(90, 15));
        viewCodigoCoi.setPreferredSize(new java.awt.Dimension(90, 15));

        viewUsoHorario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewUsoHorario.setText("Nombre");
        viewUsoHorario.setMaximumSize(new java.awt.Dimension(90, 15));
        viewUsoHorario.setMinimumSize(new java.awt.Dimension(90, 15));
        viewUsoHorario.setPreferredSize(new java.awt.Dimension(90, 15));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(ttlUsoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewUsoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttlNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewNombreOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttlCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCodigoCoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttlUsoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewUsoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 150));

        javax.swing.GroupLayout pnlAccionesLayout = new javax.swing.GroupLayout(pnlAcciones);
        pnlAcciones.setLayout(pnlAccionesLayout);
        pnlAccionesLayout.setHorizontalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlAccionesLayout.setVerticalGroup(
            pnlAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
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
        try {
            ConsultaApiPaisesDTO consultaApiPaisesDTO = new ConsultaApiPaisesDTO();
            String resultadoConsulta = consultaApiPaisesDTO.getPaisInfo(txtFiltro.getText());
            viewNombre.setText(resultadoConsulta);
        } catch (IOException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> optFiltro;
    private javax.swing.JPanel pnlAcciones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlView;
    private javax.swing.JLabel ttlCodigoCoi;
    private javax.swing.JLabel ttlNombre;
    private javax.swing.JLabel ttlNombreOficial;
    private javax.swing.JLabel ttlUsoHorario;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel viewCodigoCoi;
    private javax.swing.JLabel viewNombre;
    private javax.swing.JLabel viewNombreOficial;
    private javax.swing.JLabel viewUsoHorario;
    // End of variables declaration//GEN-END:variables

    public JPanel getPnlContenedor() {

        return this.pnlContenedor;

    }

}
