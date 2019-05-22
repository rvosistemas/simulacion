
package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tipografias.Fuentes;
import vista.algoritmos.BlumBlum;
import vista.algoritmos.congruencialAditivo;
import vista.algoritmos.congruencialCuadratico;
import vista.algoritmos.congruencialMultiplicativo;
import vista.algoritmos.cuadradosMedios;
import vista.algoritmos.lineal;
import vista.algoritmos.multiplicadorConstante;
import vista.algoritmos.productosMedios;
import vista.pruebas.chiCuadrado;
import vista.pruebas.corridasArribaYAbajo;
import vista.pruebas.corridasArribaYAbajoMedia;
import vista.pruebas.kolmogorovSmirnov;
import vista.pruebas.media;
import vista.pruebas.poker;
import vista.pruebas.varianza;

/**
 *
 * @author dark_
 */
public class HOME extends javax.swing.JFrame {
    // --- VARIABLES ------------crea variables para el modelo de la tabla y el tipo de fuente del formulario
    private DefaultTableModel modelo; // se crea modelo para tabla
    private final Fuentes tipoFuente; // para llamar el metodo de tipografias personalizadas
    
    public HOME() {//constructor
        initComponents();

        // SE PERSONALIZA TODO EL TEXTO CON FUENTES DEL PAQUETE TIPOGRAFIA
        tipoFuente = new Fuentes(); // crea tipo de fuente para usar atributos y procedimientos
        ///----------------///----- PESTAÑAS MENU -----///---------------///
        menu_algoritmos_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,16));
        menu_pruebas_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,16));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        PanelEscritorio_ = new javax.swing.JDesktopPane();
        etiq_fondo_ = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_algoritmos_ = new javax.swing.JMenu();
        Menu_algoritmosNoCongruenciales_ = new javax.swing.JMenu();
        ItemMenu_cuadradosMedios_ = new javax.swing.JMenuItem();
        ItemMenu_productosMedios_ = new javax.swing.JMenuItem();
        ItemMenu_multiplicadorConstante_ = new javax.swing.JMenuItem();
        Menu_algoritmosCongruenciales_ = new javax.swing.JMenu();
        ItemMenu_congruencialMultiplicativo_ = new javax.swing.JMenuItem();
        ItemMenu_congruencialAditivo_ = new javax.swing.JMenuItem();
        ItemMenu_congruencialCuadratico_ = new javax.swing.JMenuItem();
        ItemMenu_algoritmoLineal_ = new javax.swing.JMenuItem();
        ItemMenu_blumBlum_ = new javax.swing.JMenuItem();
        menu_pruebas_ = new javax.swing.JMenu();
        Menu_pruebasPropiedades_ = new javax.swing.JMenu();
        ItemMenu_pruebaMedia_ = new javax.swing.JMenuItem();
        ItemMenu_pruebaVarianza_ = new javax.swing.JMenuItem();
        Menu_pruebasUniformidad_ = new javax.swing.JMenu();
        ItemMenu_pruebaChiCuadrado_ = new javax.swing.JMenuItem();
        ItemMenu_KormogorovSmirnof_ = new javax.swing.JMenuItem();
        Menu_pruebasIndependencia_ = new javax.swing.JMenu();
        ItemMenu_CorridasArribaAbajo_ = new javax.swing.JMenuItem();
        ItemMenu_CorridasArribaAbajoMedia_ = new javax.swing.JMenuItem();
        ItemMenu_poker_ = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEscritorio_.setBackground(new java.awt.Color(153, 153, 153));

        etiq_fondo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        PanelEscritorio_.add(etiq_fondo_);
        etiq_fondo_.setBounds(0, 0, 490, 460);

        getContentPane().add(PanelEscritorio_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        menu_algoritmos_.setText("ALGORITMOS ");

        Menu_algoritmosNoCongruenciales_.setText("Algoritmos No Congruenciales");

        ItemMenu_cuadradosMedios_.setText("Cuadrados Medios");
        ItemMenu_cuadradosMedios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_cuadradosMedios_ActionPerformed(evt);
            }
        });
        Menu_algoritmosNoCongruenciales_.add(ItemMenu_cuadradosMedios_);

        ItemMenu_productosMedios_.setText("Productos Medios");
        ItemMenu_productosMedios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_productosMedios_ActionPerformed(evt);
            }
        });
        Menu_algoritmosNoCongruenciales_.add(ItemMenu_productosMedios_);

        ItemMenu_multiplicadorConstante_.setText("Multiplicador Constante");
        ItemMenu_multiplicadorConstante_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_multiplicadorConstante_ActionPerformed(evt);
            }
        });
        Menu_algoritmosNoCongruenciales_.add(ItemMenu_multiplicadorConstante_);

        menu_algoritmos_.add(Menu_algoritmosNoCongruenciales_);

        Menu_algoritmosCongruenciales_.setText("Algoritmos Congruenciales");

        ItemMenu_congruencialMultiplicativo_.setText("Congruencial Multiplicativo");
        ItemMenu_congruencialMultiplicativo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_congruencialMultiplicativo_ActionPerformed(evt);
            }
        });
        Menu_algoritmosCongruenciales_.add(ItemMenu_congruencialMultiplicativo_);

        ItemMenu_congruencialAditivo_.setText("Congruencial Aditivo");
        ItemMenu_congruencialAditivo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_congruencialAditivo_ActionPerformed(evt);
            }
        });
        Menu_algoritmosCongruenciales_.add(ItemMenu_congruencialAditivo_);

        ItemMenu_congruencialCuadratico_.setText("Congruencial Cuadratico");
        ItemMenu_congruencialCuadratico_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_congruencialCuadratico_ActionPerformed(evt);
            }
        });
        Menu_algoritmosCongruenciales_.add(ItemMenu_congruencialCuadratico_);

        ItemMenu_algoritmoLineal_.setText("Algoritmo Lineal");
        ItemMenu_algoritmoLineal_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_algoritmoLineal_ActionPerformed(evt);
            }
        });
        Menu_algoritmosCongruenciales_.add(ItemMenu_algoritmoLineal_);

        ItemMenu_blumBlum_.setText("Blum Blum");
        ItemMenu_blumBlum_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_blumBlum_ActionPerformed(evt);
            }
        });
        Menu_algoritmosCongruenciales_.add(ItemMenu_blumBlum_);

        menu_algoritmos_.add(Menu_algoritmosCongruenciales_);

        jMenuBar1.add(menu_algoritmos_);

        menu_pruebas_.setText("PRUEBAS");

        Menu_pruebasPropiedades_.setText("Propiedades");

        ItemMenu_pruebaMedia_.setText("Media");
        ItemMenu_pruebaMedia_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_pruebaMedia_ActionPerformed(evt);
            }
        });
        Menu_pruebasPropiedades_.add(ItemMenu_pruebaMedia_);

        ItemMenu_pruebaVarianza_.setText("Varianza");
        ItemMenu_pruebaVarianza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_pruebaVarianza_ActionPerformed(evt);
            }
        });
        Menu_pruebasPropiedades_.add(ItemMenu_pruebaVarianza_);

        menu_pruebas_.add(Menu_pruebasPropiedades_);

        Menu_pruebasUniformidad_.setText("Uniformidad");

        ItemMenu_pruebaChiCuadrado_.setText("Chi Cuadrado");
        ItemMenu_pruebaChiCuadrado_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_pruebaChiCuadrado_ActionPerformed(evt);
            }
        });
        Menu_pruebasUniformidad_.add(ItemMenu_pruebaChiCuadrado_);

        ItemMenu_KormogorovSmirnof_.setText("Kormogorov y Smirnof");
        ItemMenu_KormogorovSmirnof_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_KormogorovSmirnof_ActionPerformed(evt);
            }
        });
        Menu_pruebasUniformidad_.add(ItemMenu_KormogorovSmirnof_);

        menu_pruebas_.add(Menu_pruebasUniformidad_);

        Menu_pruebasIndependencia_.setText("Indepedencia");

        ItemMenu_CorridasArribaAbajo_.setText("Corridas arriba y abajo");
        ItemMenu_CorridasArribaAbajo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_CorridasArribaAbajo_ActionPerformed(evt);
            }
        });
        Menu_pruebasIndependencia_.add(ItemMenu_CorridasArribaAbajo_);

        ItemMenu_CorridasArribaAbajoMedia_.setText("Corridas arriba y abajo media");
        ItemMenu_CorridasArribaAbajoMedia_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_CorridasArribaAbajoMedia_ActionPerformed(evt);
            }
        });
        Menu_pruebasIndependencia_.add(ItemMenu_CorridasArribaAbajoMedia_);

        ItemMenu_poker_.setText("Poker");
        ItemMenu_poker_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenu_poker_ActionPerformed(evt);
            }
        });
        Menu_pruebasIndependencia_.add(ItemMenu_poker_);

        menu_pruebas_.add(Menu_pruebasIndependencia_);

        jMenuBar1.add(menu_pruebas_);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ----------- FUNCIONES Y PROCEDIMIENTOS -------------------------------------------/////////////////////////////////
    private void cerrar(){ // para pedir confirmacion al cerrar la ventana
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        { 
            DESPEDIDA D = new DESPEDIDA(); // crea un objeto para el siguiente formulario
            D.setVisible(true);//hace visible el siguiente formulario 
            this.dispose(); // oculta este formulario
        }else{
        }
    }    
            
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void ItemMenu_cuadradosMedios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_cuadradosMedios_ActionPerformed
        cuadradosMedios CuadMed = new cuadradosMedios();
        PanelEscritorio_.add(CuadMed);
        CuadMed.show();
    }//GEN-LAST:event_ItemMenu_cuadradosMedios_ActionPerformed

    private void ItemMenu_productosMedios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_productosMedios_ActionPerformed
        productosMedios prodMed = new productosMedios();
        PanelEscritorio_.add(prodMed);
        prodMed.show();
    }//GEN-LAST:event_ItemMenu_productosMedios_ActionPerformed

    private void ItemMenu_multiplicadorConstante_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_multiplicadorConstante_ActionPerformed
        multiplicadorConstante multiCons = new multiplicadorConstante();
        PanelEscritorio_.add(multiCons);
        multiCons.show();
    }//GEN-LAST:event_ItemMenu_multiplicadorConstante_ActionPerformed

    private void ItemMenu_algoritmoLineal_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_algoritmoLineal_ActionPerformed
        lineal lin = new lineal();
        PanelEscritorio_.add(lin);
        lin.show();
    }//GEN-LAST:event_ItemMenu_algoritmoLineal_ActionPerformed

    private void ItemMenu_congruencialCuadratico_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_congruencialCuadratico_ActionPerformed
        congruencialCuadratico conCua = new congruencialCuadratico();
        PanelEscritorio_.add(conCua);
        conCua.show();
    }//GEN-LAST:event_ItemMenu_congruencialCuadratico_ActionPerformed

    private void ItemMenu_congruencialMultiplicativo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_congruencialMultiplicativo_ActionPerformed
        congruencialMultiplicativo conMulti = new congruencialMultiplicativo();
        PanelEscritorio_.add(conMulti);
        conMulti.show();
    }//GEN-LAST:event_ItemMenu_congruencialMultiplicativo_ActionPerformed

    private void ItemMenu_congruencialAditivo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_congruencialAditivo_ActionPerformed
        congruencialAditivo conAdiv = new congruencialAditivo();
        PanelEscritorio_.add(conAdiv);
        conAdiv.show();
    }//GEN-LAST:event_ItemMenu_congruencialAditivo_ActionPerformed

    private void ItemMenu_blumBlum_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_blumBlum_ActionPerformed
        BlumBlum bb = new BlumBlum();
        PanelEscritorio_.add(bb);
        bb.show();    }//GEN-LAST:event_ItemMenu_blumBlum_ActionPerformed

    private void ItemMenu_CorridasArribaAbajo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_CorridasArribaAbajo_ActionPerformed
        corridasArribaYAbajo aYb = new corridasArribaYAbajo();
        PanelEscritorio_.add(aYb);
        aYb.show();
    }//GEN-LAST:event_ItemMenu_CorridasArribaAbajo_ActionPerformed

    private void ItemMenu_pruebaChiCuadrado_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_pruebaChiCuadrado_ActionPerformed
        chiCuadrado chi = new chiCuadrado();
        PanelEscritorio_.add(chi);
        chi.show();
    }//GEN-LAST:event_ItemMenu_pruebaChiCuadrado_ActionPerformed

    private void ItemMenu_pruebaMedia_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_pruebaMedia_ActionPerformed
        media me = new media();
        PanelEscritorio_.add(me);
        me.show();
    }//GEN-LAST:event_ItemMenu_pruebaMedia_ActionPerformed

    private void ItemMenu_pruebaVarianza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_pruebaVarianza_ActionPerformed
        varianza var = new varianza();
        PanelEscritorio_.add(var);
        var.show();
    }//GEN-LAST:event_ItemMenu_pruebaVarianza_ActionPerformed

    private void ItemMenu_CorridasArribaAbajoMedia_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_CorridasArribaAbajoMedia_ActionPerformed
        corridasArribaYAbajoMedia aYbM = new corridasArribaYAbajoMedia();
        PanelEscritorio_.add(aYbM);
        aYbM.show();
    }//GEN-LAST:event_ItemMenu_CorridasArribaAbajoMedia_ActionPerformed

    private void ItemMenu_KormogorovSmirnof_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_KormogorovSmirnof_ActionPerformed
        kolmogorovSmirnov ks = new kolmogorovSmirnov();
        PanelEscritorio_.add(ks);
        ks.show();
    }//GEN-LAST:event_ItemMenu_KormogorovSmirnof_ActionPerformed

    private void ItemMenu_poker_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenu_poker_ActionPerformed
        poker pk = new poker();
        PanelEscritorio_.add(pk); 
        pk.show();
    }//GEN-LAST:event_ItemMenu_poker_ActionPerformed
     
    
    
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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HOME().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenu_CorridasArribaAbajoMedia_;
    private javax.swing.JMenuItem ItemMenu_CorridasArribaAbajo_;
    private javax.swing.JMenuItem ItemMenu_KormogorovSmirnof_;
    private javax.swing.JMenuItem ItemMenu_algoritmoLineal_;
    private javax.swing.JMenuItem ItemMenu_blumBlum_;
    private javax.swing.JMenuItem ItemMenu_congruencialAditivo_;
    private javax.swing.JMenuItem ItemMenu_congruencialCuadratico_;
    private javax.swing.JMenuItem ItemMenu_congruencialMultiplicativo_;
    private javax.swing.JMenuItem ItemMenu_cuadradosMedios_;
    private javax.swing.JMenuItem ItemMenu_multiplicadorConstante_;
    private javax.swing.JMenuItem ItemMenu_poker_;
    private javax.swing.JMenuItem ItemMenu_productosMedios_;
    private javax.swing.JMenuItem ItemMenu_pruebaChiCuadrado_;
    private javax.swing.JMenuItem ItemMenu_pruebaMedia_;
    private javax.swing.JMenuItem ItemMenu_pruebaVarianza_;
    private javax.swing.JMenu Menu_algoritmosCongruenciales_;
    private javax.swing.JMenu Menu_algoritmosNoCongruenciales_;
    private javax.swing.JMenu Menu_pruebasIndependencia_;
    private javax.swing.JMenu Menu_pruebasPropiedades_;
    private javax.swing.JMenu Menu_pruebasUniformidad_;
    private javax.swing.JDesktopPane PanelEscritorio_;
    private javax.swing.JLabel etiq_fondo_;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu_algoritmos_;
    private javax.swing.JMenu menu_pruebas_;
    // End of variables declaration//GEN-END:variables
}
