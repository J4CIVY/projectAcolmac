
package Presentacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import Logica.ConsultaApiPaisesDTO;


public class GuardarArchivo extends javax.swing.JPanel {

    public GuardarArchivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 50));
        setMinimumSize(new java.awt.Dimension(600, 50));
        setPreferredSize(new java.awt.Dimension(600, 50));

        panel1.setMaximumSize(new java.awt.Dimension(600, 50));
        panel1.setMinimumSize(new java.awt.Dimension(600, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 49));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese El Nombre Del Documento");
        jLabel1.setMaximumSize(new java.awt.Dimension(140, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(140, 15));
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 15));

        txtNombreArchivo.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        txtNombreArchivo.setForeground(new java.awt.Color(0, 0, 49));
        txtNombreArchivo.setMaximumSize(new java.awt.Dimension(140, 15));
        txtNombreArchivo.setMinimumSize(new java.awt.Dimension(140, 15));
        txtNombreArchivo.setPreferredSize(new java.awt.Dimension(140, 15));
        txtNombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArchivoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 49));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(80, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione La Extencion");
        jLabel2.setMaximumSize(new java.awt.Dimension(140, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(140, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 15));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 49));
        jRadioButton1.setText("TXT");
        jRadioButton1.setMaximumSize(new java.awt.Dimension(45, 15));
        jRadioButton1.setMinimumSize(new java.awt.Dimension(45, 15));
        jRadioButton1.setPreferredSize(new java.awt.Dimension(45, 15));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 49));
        jRadioButton2.setText("DATA");
        jRadioButton2.setMaximumSize(new java.awt.Dimension(53, 20));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(53, 20));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(50, 15));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 49));
        jRadioButton3.setText("TEXT");
        jRadioButton3.setMaximumSize(new java.awt.Dimension(48, 15));
        jRadioButton3.setMinimumSize(new java.awt.Dimension(48, 15));
        jRadioButton3.setPreferredSize(new java.awt.Dimension(48, 15));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtNombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArchivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables

public void escribirArchivo(){
    
    String nombre = txtNombreArchivo.getText();
    File archivo;
        if (jRadioButton1.equals(true)){
            try {
                archivo = new File(nombre + ".txt");
                Filtro filtro = new Filtro();
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(filtro.getViewNombre().getText());
                escritor.write(filtro.getViewNombreOficial().getText());
                escritor.write(filtro.getViewCapital().getText());
                escritor.write(filtro.getViewGini2019().getText());
                escritor.write(filtro.getViewCodigoCoi().getText());
                escritor.write(filtro.getViewPoblacion().getText());
                escritor.write(filtro.getViewContinente().getText());
                escritor.write(filtro.getViewZonaHoraria().getText());
                escritor.close();   
                System.out.println("Archivo creado exitosamente.");
            } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
            }
        } else if (jRadioButton2.equals(true)){
            try {
                archivo = new File(nombre + ".text");
                Filtro filtro = new Filtro();
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(filtro.getViewNombre().getText());
                escritor.write(filtro.getViewNombreOficial().getText());
                escritor.write(filtro.getViewCapital().getText());
                escritor.write(filtro.getViewGini2019().getText());
                escritor.write(filtro.getViewCodigoCoi().getText());
                escritor.write(filtro.getViewPoblacion().getText());
                escritor.write(filtro.getViewContinente().getText());
                escritor.write(filtro.getViewZonaHoraria().getText());
                escritor.close();   
                System.out.println("Archivo creado exitosamente.");
            } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
            }
        } else if(jRadioButton3.equals(true)){
            try {
                archivo = new File(nombre + ".data");
                Filtro filtro = new Filtro();
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(filtro.getViewNombre().getText());
                escritor.write(filtro.getViewNombreOficial().getText());
                escritor.write(filtro.getViewCapital().getText());
                escritor.write(filtro.getViewGini2019().getText());
                escritor.write(filtro.getViewCodigoCoi().getText());
                escritor.write(filtro.getViewPoblacion().getText());
                escritor.write(filtro.getViewContinente().getText());
                escritor.write(filtro.getViewZonaHoraria().getText());
                escritor.close();   
                System.out.println("Archivo creado exitosamente.");
            } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
            }
        }else {
            jLabel3.setText("Seleccione Extension");
        }
            
    }
    
}
