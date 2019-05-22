/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import java.awt.BorderLayout; 
import miscelania.fondo;
import tipografias.Fuentes;

/**
 *
 * @author dark_
 */
public class INICIO extends javax.swing.JFrame {

    private final Fuentes tipoFuente;
    
    public INICIO() {
        initComponents();
        this.setLocationRelativeTo(null);
        //-- inicializa las fuentes con el tipo de letra personalizado llama el metodo desde paquete tipografias clase fuentes
        tipoFuente = new Fuentes();
        etiq_asignacion.setFont(tipoFuente.fuente(tipoFuente.GOD,0,24));
        etiq_i8.setFont(tipoFuente.fuente(tipoFuente.GOD,0,24));
        etiq_integrantes.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_itp.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_plata.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_richard.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_vane.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_william.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiq_integrantes = new javax.swing.JLabel();
        etiq_itp = new javax.swing.JLabel();
        etiq_asignacion = new javax.swing.JLabel();
        etiq_richard = new javax.swing.JLabel();
        etiq_vane = new javax.swing.JLabel();
        etiq_william = new javax.swing.JLabel();
        etiq_plata = new javax.swing.JLabel();
        etiq_i8 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        etiq_i9 = new javax.swing.JLabel();
        etiq_asignacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        etiq_integrantes.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_integrantes.setText("INTEGRANTES:");

        etiq_itp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITP2.png"))); // NOI18N

        etiq_asignacion.setFont(new java.awt.Font("GodOfWar", 1, 18)); // NOI18N
        etiq_asignacion.setText("ALGORITMOS ");

        etiq_richard.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_richard.setText("Richard vivas");

        etiq_vane.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_vane.setText("vanesa rodriguez");

        etiq_william.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_william.setText("william calvache");

        etiq_plata.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_plata.setText("yeison plata");

        etiq_i8.setFont(new java.awt.Font("GodOfWar", 1, 18)); // NOI18N
        etiq_i8.setText("ingenieria de sistemas ");

        btn_iniciar.setBackground(new java.awt.Color(0, 102, 204));
        btn_iniciar.setFont(new java.awt.Font("GodOfWar", 0, 14)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setText("INICIAR");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        etiq_i9.setFont(new java.awt.Font("GodOfWar", 1, 14)); // NOI18N
        etiq_i9.setText("DECIMO SEMESTRE");

        etiq_asignacion1.setFont(new java.awt.Font("GodOfWar", 1, 18)); // NOI18N
        etiq_asignacion1.setText("DE SIMULACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiq_itp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiq_richard)
                            .addComponent(etiq_integrantes)
                            .addComponent(etiq_plata)
                            .addComponent(etiq_william)
                            .addComponent(etiq_vane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiq_asignacion1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(etiq_asignacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btn_iniciar))
                            .addComponent(etiq_i8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(etiq_i9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiq_asignacion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etiq_integrantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiq_richard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiq_william)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiq_plata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiq_vane))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiq_asignacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiq_itp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiq_i8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiq_i9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_iniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar(){ // para pedir confirmacion al cerrar una ventana
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        {
            System.exit(0);// cierra totalmente la aplicacion
        }else{
        }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar(); // al cerrar la ventana invoca este procedimiento
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fondo f = new fondo("/imagenes/abstract_cube-118973.jpg"); // crea instancia objeto fondo y envia direccion de la imagen a usar
        this.add(f,BorderLayout.CENTER); // cuando la ventana sea abierta lo pinta con la imagen
        f.repaint(); // ejecuta la accion de colocar fondo al jframe
    }//GEN-LAST:event_formWindowOpened

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        
        HOME h = new HOME(); // crea un objeto para el siguiente formulario
        h.setVisible(true);//hace visible el siguiente formulario
        this.dispose(); // oculta este formulario
    }//GEN-LAST:event_btn_iniciarActionPerformed

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
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel etiq_asignacion;
    private javax.swing.JLabel etiq_asignacion1;
    private javax.swing.JLabel etiq_i8;
    private javax.swing.JLabel etiq_i9;
    private javax.swing.JLabel etiq_integrantes;
    private javax.swing.JLabel etiq_itp;
    private javax.swing.JLabel etiq_plata;
    private javax.swing.JLabel etiq_richard;
    private javax.swing.JLabel etiq_vane;
    private javax.swing.JLabel etiq_william;
    // End of variables declaration//GEN-END:variables
}
