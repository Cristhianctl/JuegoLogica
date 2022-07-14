package principal;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MenuInicio extends javax.swing.JFrame{

    FondoPanel fondo = new FondoPanel();
    
    
    public MenuInicio() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnjugar = new javax.swing.JButton();
        btnsalirp = new javax.swing.JButton();
        btncreditos = new javax.swing.JButton();
        btnayuda = new javax.swing.JButton();
        btncontri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        btnjugar.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        btnjugar.setForeground(new java.awt.Color(255, 153, 0));
        btnjugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play32.png"))); // NOI18N
        btnjugar.setText("JUGAR");
        btnjugar.setContentAreaFilled(false);
        btnjugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnjugar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnjugar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play32.png"))); // NOI18N
        btnjugar.setRolloverEnabled(true);
        btnjugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play48.png"))); // NOI18N
        btnjugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnjugarMouseClicked(evt);
            }
        });
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        btnsalirp.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        btnsalirp.setForeground(new java.awt.Color(255, 153, 0));
        btnsalirp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit32.png"))); // NOI18N
        btnsalirp.setText("SALIR");
        btnsalirp.setContentAreaFilled(false);
        btnsalirp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnsalirp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit32.png"))); // NOI18N
        btnsalirp.setRolloverEnabled(true);
        btnsalirp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit48.png"))); // NOI18N
        btnsalirp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirpActionPerformed(evt);
            }
        });

        btncreditos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncreditos.setForeground(new java.awt.Color(224, 120, 19));
        btncreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cred32.png"))); // NOI18N
        btncreditos.setText("Creditos");
        btncreditos.setContentAreaFilled(false);
        btncreditos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncreditos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cred32.png"))); // NOI18N
        btncreditos.setRolloverEnabled(true);
        btncreditos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cred48.png"))); // NOI18N
        btncreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreditosActionPerformed(evt);
            }
        });

        btnayuda.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        btnayuda.setForeground(new java.awt.Color(224, 120, 19));
        btnayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hepl32.png"))); // NOI18N
        btnayuda.setText("Ayuda");
        btnayuda.setContentAreaFilled(false);
        btnayuda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnayuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hepl32.png"))); // NOI18N
        btnayuda.setRolloverEnabled(true);
        btnayuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hepl48.png"))); // NOI18N
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });

        btncontri.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncontri.setForeground(new java.awt.Color(224, 120, 19));
        btncontri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plant32.png"))); // NOI18N
        btncontri.setText("Contribuye");
        btncontri.setContentAreaFilled(false);
        btncontri.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncontri.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plant32.png"))); // NOI18N
        btncontri.setRolloverEnabled(true);
        btncontri.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plant48.png"))); // NOI18N
        btncontri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalirp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncontri, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalirp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreditos)
                    .addComponent(btncontri))
                .addGap(59, 59, 59))
        );

        btncreditos.getAccessibleContext().setAccessibleName("220");
        btncreditos.getAccessibleContext().setAccessibleDescription("50");
        btncontri.getAccessibleContext().setAccessibleName("220");
        btncontri.getAccessibleContext().setAccessibleDescription("50");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Botones de Ayuda y Creditos
    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        Ayuda ayuda = new  Ayuda(this, false);
        ayuda.setLocationRelativeTo(null);
        ayuda.setVisible(true);
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btncreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreditosActionPerformed
        Creditos cred = new Creditos(this, false);
        cred.setLocationRelativeTo(null);
        cred.setVisible(true);
    }//GEN-LAST:event_btncreditosActionPerformed

    //Boton salir.
    private void btnsalirpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirpActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirpActionPerformed

    //Poner Nombre del Jugador
    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        NamePlayer dialog = new NamePlayer(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnjugarActionPerformed

    private void btnjugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjugarMouseClicked
         AudioClip sonido;
         sonido = java.applet.Applet.newAudioClip(getClass().getResource("imagenes/sonidoguitarra.wav"));
         sonido.play();
    }//GEN-LAST:event_btnjugarMouseClicked

    private void btncontriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontriActionPerformed
        this.hide();
        Contribuye contri = new Contribuye();
        contri.setLocationRelativeTo(null);
        contri.setVisible(true);
    }//GEN-LAST:event_btncontriActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btncontri;
    private javax.swing.JButton btncreditos;
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnsalirp;
    // End of variables declaration//GEN-END:variables
 
    
    //Fondo de Panel
    class FondoPanel extends  JPanel{
        private  Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondop.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
