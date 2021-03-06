/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.pruebas;

import javax.swing.JOptionPane;
import tipografias.Fuentes;

//librerias para exportar en excel
import java.io.*;
//import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.hssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.*;

//librerias que deberian ir en el controlador de excel
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dark_
 */
public class kolmogorovSmirnov extends javax.swing.JInternalFrame {

    // --- VARIABLES ------------crea variables para el modelo de la tabla y el tipo de fuente del formulario
    private final Fuentes tipoFuente; // para llamar el metodo de tipografias personalizadas

    Workbook wb; // para trabajar importar y/o exportar archivos en xls

    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int contAccion = 0;

    /**
     * Creates new form kolmogorovSmirnov
     */
    public kolmogorovSmirnov() {
        initComponents();

        // SE PERSONALIZA TODO EL TEXTO CON FUENTES DEL PAQUETE TIPOGRAFIA
        tipoFuente = new Fuentes(); // crea tipo de fuente para usar atributos y procedimientos
        ///----------------///----- ETIQUETAS -----///---------------///
        etiq_tituloKS_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,24));
        etiq_resultado_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,18));
        etiq_valorMax_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,12));
        etiq_resultado_.setVisible(false);
        etiq_valorMax_.setVisible(false);
        etiq_info_.setVisible(false);
        etiq_aceptacion_.setVisible(false);
        etiq_buscarKS1_.setVisible(false);
        etiq_buscarKS2_.setVisible(false);
        etiq_buscarKS3_.setVisible(false);
        etiq_colKS_.setVisible(false);
        etiq_filaKS_.setVisible(false);
        ///----------------///----- TABLAS -----///---------------///
        tabla_numerosAleatorios_.setVisible(false);
        ///----------------///----- TEXTO -----///---------------///
        txt_aceptacion_.setVisible(false);
        txt_KS_.setVisible(false);
        ///----------------///----- BOTONES -----///---------------///
        btn_calcular_.setVisible(false);
        btn_resultado_.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiq_tituloKS_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_numerosAleatorios_ = new javax.swing.JTable();
        btn_importar_ = new javax.swing.JButton();
        etiq_valorMax_ = new javax.swing.JLabel();
        etiq_info_ = new javax.swing.JLabel();
        etiq_aceptacion_ = new javax.swing.JLabel();
        txt_aceptacion_ = new javax.swing.JTextField();
        btn_calcular_ = new javax.swing.JButton();
        etiq_buscarKS1_ = new javax.swing.JLabel();
        etiq_buscarKS2_ = new javax.swing.JLabel();
        etiq_buscarKS3_ = new javax.swing.JLabel();
        etiq_filaKS_ = new javax.swing.JLabel();
        btn_resultado_ = new javax.swing.JButton();
        etiq_resultado_ = new javax.swing.JLabel();
        etiq_colKS_ = new javax.swing.JLabel();
        txt_KS_ = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        etiq_tituloKS_.setText("KOSMOGOROV - SMIRNOV");

        tabla_numerosAleatorios_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_numerosAleatorios_.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_numerosAleatorios_);

        btn_importar_.setText("IMPORTAR desde EXCEL");
        btn_importar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importar_ActionPerformed(evt);
            }
        });

        etiq_valorMax_.setText("max");

        etiq_info_.setText("EL valor maximo luego de calcular es de :");

        etiq_aceptacion_.setText("Digite el nivel de aceptacion (solo numero no escribir %): ");

        btn_calcular_.setText("Calcular");
        btn_calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_ActionPerformed(evt);
            }
        });

        etiq_buscarKS1_.setText("Lla columna es el numero mas cercano a:");

        etiq_buscarKS2_.setText("y la fila es el numero mas cercano a:");

        etiq_buscarKS3_.setText("Valor encontrado en tabla KS:");

        etiq_filaKS_.setText("fila M");

        btn_resultado_.setText("Resultado");
        btn_resultado_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultado_ActionPerformed(evt);
            }
        });

        etiq_resultado_.setText("RESULTADO");

        etiq_colKS_.setText("col M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiq_tituloKS_))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiq_aceptacion_)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txt_aceptacion_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_calcular_))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiq_info_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiq_valorMax_))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(etiq_resultado_))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiq_buscarKS3_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_KS_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_resultado_))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiq_buscarKS1_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiq_colKS_))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiq_buscarKS2_)
                                .addGap(18, 18, 18)
                                .addComponent(etiq_filaKS_))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_importar_)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiq_tituloKS_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_importar_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiq_info_)
                    .addComponent(etiq_valorMax_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiq_aceptacion_)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_aceptacion_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiq_buscarKS1_)
                    .addComponent(etiq_colKS_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiq_buscarKS2_)
                    .addComponent(etiq_filaKS_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiq_buscarKS3_)
                    .addComponent(btn_resultado_)
                    .addComponent(txt_KS_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiq_resultado_)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_importar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importar_ActionPerformed

        contAccion++;
        if (contAccion == 1) {
            agregarFiltro();
        }

        if (selecArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = selecArchivo.getSelectedFile();
            if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                JOptionPane.showMessageDialog(null, importar(archivo, tabla_numerosAleatorios_));
            } else {
                JOptionPane.showMessageDialog(null, "Elija un formato de Excel valido");
            }
        }
    }//GEN-LAST:event_btn_importar_ActionPerformed

    private void btn_calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_ActionPerformed
        if( "".equals(txt_aceptacion_.getText()) ){
            JOptionPane.showMessageDialog(null, "Debe digitar el valor del nivel de confianza/aceptacion");
        }else{
            etiq_buscarKS1_.setVisible(true);
            etiq_buscarKS2_.setVisible(true);
            etiq_buscarKS3_.setVisible(true);
            double  col =  (100 - Double.parseDouble( txt_aceptacion_.getText() ) )/100;
            etiq_colKS_.setText( String.valueOf(col) );
            etiq_colKS_.setVisible(true);
            int  fil = tabla_numerosAleatorios_.getRowCount();
            etiq_filaKS_.setText( String.valueOf(fil) );
            etiq_filaKS_.setVisible(true);
            txt_KS_.setVisible(true);
            btn_resultado_.setVisible(true);
        }
    }//GEN-LAST:event_btn_calcular_ActionPerformed

    private void btn_resultado_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultado_ActionPerformed
        if( "".equals(txt_KS_.getText()) ){
            JOptionPane.showMessageDialog(null, "Debe digitar el valor encontrado en tabla KS");
        }else{
            double valorTxt = Double.parseDouble( txt_KS_.getText() );
            double max = Double.parseDouble( etiq_valorMax_.getText());
            if(  max > valorTxt ){
                JOptionPane.showMessageDialog(null, "El valor maximo calculado: es: "+max+" y es mayor que el valor encontrado en tabla KS: "+valorTxt+", \n por lo tanto es RECHAZADO");
                etiq_resultado_.setText("RECHAZADO, el valor maximo encontrado "+max);
                etiq_resultado_.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "El valor maximo calculado es: "+valorTxt+" y es menor que el valor encontrado: "+valorTxt+", \n por lo tanto es ACEPTADO");
                etiq_resultado_.setText("ACEPTADO!, el valor maximo encontrado "+max);
                etiq_resultado_.setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_resultado_ActionPerformed

    // ----------- FUNCIONES Y PROCEDIMIENTOS -------------------------------------------/////////////////////////////////
    public void calcular() {

        ArrayList<Double> numImportados = new ArrayList<>();
        ArrayList<Double> numFormula = new ArrayList<>();
        int numFilas = tabla_numerosAleatorios_.getRowCount();
        double filas = (double) numFilas;
        
        for (int i = 0; i < numFilas; i++) {
            numImportados.add(Double.parseDouble(tabla_numerosAleatorios_.getValueAt(i, 1).toString()));
        }

        Collections.sort(numImportados);// orden los numero del array de menor a mayor
        
        double cantDivN = 0;
        
        for (int i = 0; i < numFilas; i++) {
            cantDivN = (i+1)/filas;
            numFormula.add( Math.abs( cantDivN - numImportados.get(i) ) );
            System.out.println("posicion: " + i + " numero: " + numFormula.get(i));
        }
        
        double mayor = 0;
        
        for (int i = 0; i < numFilas; i++) {
            if ( numFormula.get(i) > mayor ) {
                mayor = numFormula.get(i);
            }
        }
        
        etiq_valorMax_.setText( String.valueOf(mayor) );
        etiq_valorMax_.setVisible(true);
        etiq_info_.setVisible(true);
        
        etiq_aceptacion_.setVisible(true);
        txt_aceptacion_.setVisible(true);
        btn_calcular_.setVisible(true);
        
    }

    public String importar(File archivo, JTable tablaD) {

        String respuesta = "No se realizo con exito la importacion";
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);

        try {
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = -1;
            while (filaIterator.hasNext()) {
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
                Object[] listaColumna = new Object[5];
                int indiceColumna = -1;
                while (columnaIterator.hasNext()) {
                    indiceColumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if (indiceFila == 0) {
                        modeloT.addColumn(celda.getStringCellValue());
                    } else {
                        if (celda != null) {
                            switch (celda.getCellType()) {
                                case NUMERIC:
                                    listaColumna[indiceColumna] = (int) Math.round(celda.getNumericCellValue());
                                    break;
                                case STRING:
                                    listaColumna[indiceColumna] = celda.getStringCellValue();
                                    break;
                                case BOOLEAN:
                                    listaColumna[indiceColumna] = celda.getBooleanCellValue();
                                    break;
                                default:
                                    listaColumna[indiceColumna] = celda.getDateCellValue();
                                    break;
                            }
                        }
                    }
                }
                if (indiceFila != 0) {
                    modeloT.addRow(listaColumna);
                }
            }

            respuesta = "Importacion exitosa";
            tabla_numerosAleatorios_.setVisible(true);
            calcular();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al importar datos desde archivo excel: -> " + e);
        }

        return respuesta;
    }

    public void agregarFiltro() {
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular_;
    public javax.swing.JButton btn_importar_;
    private javax.swing.JButton btn_resultado_;
    private javax.swing.JLabel etiq_aceptacion_;
    private javax.swing.JLabel etiq_buscarKS1_;
    private javax.swing.JLabel etiq_buscarKS2_;
    private javax.swing.JLabel etiq_buscarKS3_;
    private javax.swing.JLabel etiq_colKS_;
    private javax.swing.JLabel etiq_filaKS_;
    private javax.swing.JLabel etiq_info_;
    private javax.swing.JLabel etiq_resultado_;
    private javax.swing.JLabel etiq_tituloKS_;
    private javax.swing.JLabel etiq_valorMax_;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_numerosAleatorios_;
    private javax.swing.JTextField txt_KS_;
    private javax.swing.JTextField txt_aceptacion_;
    // End of variables declaration//GEN-END:variables
}
