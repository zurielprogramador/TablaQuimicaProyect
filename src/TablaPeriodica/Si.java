/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaPeriodica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Zuriel PC
 */
public class Si extends javax.swing.JFrame {
imagenfondo Imagen=new imagenfondo();
    /**
     * Creates new form Si
     */
    public Si() {
        this.setContentPane(Imagen);
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextArea1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesElementos/silicio.jpg"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla.png"))); // NOI18N
        jButton7.setText("Ir a la Tabla");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla2.png"))); // NOI18N
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PROTONES");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PROTONES");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel39.setText("               6");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel40.setText("               2");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBPARTICULAS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TablaPeriodica/prg.jpg"))); // NOI18N

        jLabel10.setText("CONFIGURACIÓN ELECTRÓNICA:");

        jLabel16.setText("1.8");

        jLabel9.setText("RADIO ATÓMICO (Å):");

        jLabel15.setText("+4  ");

        jLabel29.setText("2.33");

        jLabel30.setText("14");

        jLabel19.setText("1.32");

        jLabel31.setText("2680");

        jLabel20.setText("[Ne]3s23p2  ");

        jLabel11.setText("PRIMER POTENCIAL DE IONIZACIÓN(eV):");

        jLabel33.setText("8.15");

        jLabel22.setText("MASA ATÓMICA (g/mol):");

        jLabel13.setText("28.086");

        jLabel23.setText("DENSIDAD (g/ml):");

        jLabel14.setText("4");

        jLabel34.setText("SERIE QUIMÍCA:");

        jLabel24.setText("PUNTO DE EBULLICIÓN (ºC):");

        jLabel21.setText("Jons Berzelius en 1823  ");

        jLabel32.setText("1410  ");

        jLabel12.setText("Silicio");

        jLabel26.setText("DESCUBRIDOR:");

        jLabel4.setText("NOMBRE:");

        jLabel27.setText("ESTADO:");

        jLabel5.setText("VALENCIA:");

        jLabel7.setText("ELECTRONEGATIVIDAD:");

        jLabel6.setText("ESTADO DE OXIDACIÓN:");

        jLabel28.setText("Sólido");

        jLabel25.setText("PUNTO DE FUSIÓN (ºC): ");

        jLabel35.setText("Metaloides");

        jLabel3.setText("NÚMERO ATÓMICO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel7))
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel11))))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(370, 370, 370)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(791, 791, 791)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel24))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel25))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel21))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextArea1PropertyChange
        // TODO add your handling code here:

        jTextArea1.setText("El uso del actinio es casi \n"
            + "exclusivo para investigaciones científicas. \n"
            + "La radiactividad del actinio es del orden de \n"
            + "150 veces la del radio, haciéndolo útil como \n"
            + "fuente de neutrones; al margen de ello, no tiene \n"
            + "aplicaciones industriales significativas.");
    }//GEN-LAST:event_jTextArea1PropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        principal2 abrir=new  principal2();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Si.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Si.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Si.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Si.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Si().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
class imagenfondo extends JPanel{
    private Image imagen;
    public void paint(Graphics g){
        imagen=new ImageIcon(getClass().getResource("prg.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }}}
