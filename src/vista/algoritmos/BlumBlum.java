/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.algoritmos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tipografias.Fuentes;

//librerias para exportar en excel
import java.io.*;
//import java.util.*;
import javax.swing.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

//librerias que deberian ir en el controlador de excel
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dark_
 */
public class BlumBlum extends javax.swing.JInternalFrame {

    
    // --- VARIABLES ------------crea variables para el modelo de la tabla y el tipo de fuente del formulario

    private final Fuentes tipoFuente; // para llamar el metodo de tipografias personalizadas
    private DefaultTableModel modelo; // se crea modelo para tabla
    private DefaultTableModel modelo2; // se crea modelo2 para tabla 2
    
    Workbook wb; // para trabajar importar y/o exportar archivos en xls
    
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int contAccion = 0;
    
    public BlumBlum() {
        initComponents();
        
        // SE PERSONALIZA TODO EL TEXTO CON FUENTES DEL PAQUETE TIPOGRAFIA
        tipoFuente = new Fuentes(); // crea tipo de fuente para usar atributos y procedimientos
        ///----------------///----- ETIQUETAS -----///---------------///
        etiq_tituloBlumBlum_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,24));
        etiq_formula_.setVisible(false);
        etiq_formula_.setEnabled(false);
        etiq_formulaGeneral_.setVisible(false);
        etiq_formulaGeneral_.setEnabled(false);
        ///----------------///----- BOTONES -----///---------------///
        

        ///----------------///----- TABLA MENU -----///---------------///
        tabla_BlumBlum_.setEnabled(false);
        tabla_numerosAleatorios_.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiq_tituloBlumBlum_ = new javax.swing.JLabel();
        txt_g_ = new javax.swing.JTextField();
        etiq_semilla_ = new javax.swing.JLabel();
        btn_calcular_ = new javax.swing.JButton();
        txt_m_ = new javax.swing.JTextField();
        etiq_formula_ = new javax.swing.JLabel();
        txt_semilla_ = new javax.swing.JTextField();
        etiq_formulaGeneral_ = new javax.swing.JLabel();
        btn_calcularG_ = new javax.swing.JButton();
        btn_calcularM_ = new javax.swing.JButton();
        etiq_m_ = new javax.swing.JLabel();
        etiq_g_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_BlumBlum_ = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_numerosAleatorios_ = new javax.swing.JTable();
        btn_exportar_1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        etiq_tituloBlumBlum_.setText("ALGORITMO BLUM BLUM");

        etiq_semilla_.setText("Semilla:");

        btn_calcular_.setText("Calcular");
        btn_calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_ActionPerformed(evt);
            }
        });

        etiq_formula_.setText("FORMULA");

        etiq_formulaGeneral_.setText("FORMULA GENERAL");

        btn_calcularG_.setText("Calcular G");
        btn_calcularG_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularG_ActionPerformed(evt);
            }
        });

        btn_calcularM_.setText("Calcular M");
        btn_calcularM_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularM_ActionPerformed(evt);
            }
        });

        etiq_m_.setText("M:");

        etiq_g_.setText("G:");

        tabla_BlumBlum_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "X"
            }
        ));
        jScrollPane1.setViewportView(tabla_BlumBlum_);

        tabla_numerosAleatorios_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "R"
            }
        ));
        jScrollPane2.setViewportView(tabla_numerosAleatorios_);

        btn_exportar_1.setText("EXPORTAR a EXCEL");
        btn_exportar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportar_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etiq_semilla_)
                        .addGap(19, 19, 19)
                        .addComponent(txt_semilla_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiq_tituloBlumBlum_)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiq_formulaGeneral_)
                                        .addGap(103, 103, 103))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiq_formula_)
                                        .addGap(149, 149, 149))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiq_g_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_g_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_calcularM_)
                                .addGap(26, 26, 26)
                                .addComponent(etiq_m_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_m_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_calcularG_))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btn_calcular_)
                                .addGap(142, 142, 142))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btn_exportar_1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etiq_tituloBlumBlum_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_semilla_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiq_semilla_))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_m_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiq_m_)
                    .addComponent(btn_calcularG_)
                    .addComponent(btn_calcularM_)
                    .addComponent(txt_g_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiq_g_))
                .addGap(15, 15, 15)
                .addComponent(etiq_formula_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiq_formulaGeneral_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_calcular_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exportar_1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_ActionPerformed
        if ( validarTxtVacios() && validarTxtNumericos() && validarTxtPositivos()  ) {
 
            int m = Integer.parseInt( txt_m_.getText() );// SI GENERA ERROR CON VALORES FLOTANTES ES MEJOR CASTEAR (int)
            int semilla = Integer.parseInt( txt_semilla_.getText() );
            
            boolean condicion = true;

            if( condicion ){

                int finFilas = 2;

                modelo = new DefaultTableModel();
                modelo2 = new DefaultTableModel();
                tabla_BlumBlum_.setModel(modelo);
                tabla_numerosAleatorios_.setModel(modelo2);

                modelo.addColumn("#");
                modelo.addColumn("X");

                modelo2.addColumn("#");
                modelo2.addColumn("R");

                //llenar la tabla con la fila de objetos
                for(int fila=0;fila<finFilas;fila++){ // recorrido de filas

                    String sNumeros[] = new String[2]; // convierte en cadenas para parasarlos al modelo de la tabla
                    String sNumeros2[] = new String[2]; // convierte en cadenas para parasarlos al modelo de la tabla

                    for(int col=0;col<5;col++){ // recorrido de columnas
                        System.out.println("fila "+fila+" columna "+col);
                        switch(col) {
                            case 0:// la columna del numero
                                sNumeros[col] = String.valueOf( fila+1 );
                                //System.out.println("valor en arreglo "+sNumeros[col]);
                                break;
                            case 1:// la columna del numero x o semillas
                                if(fila==0){
                                    int xElevDos = (int) Math.pow( semilla, 2 );
                                    int x = ( xElevDos )%m;
                                    sNumeros[col] = String.valueOf(x);
                                    System.out.println("valor en arreglo "+sNumeros[col]);
                                }else{
                                    int aux = Integer.parseInt( modelo.getValueAt(fila-1, 1).toString());
                                    int xElevDos = (int) Math.pow( aux , 2 );
                                    int x = ( xElevDos )%m;
                                    sNumeros[col] = String.valueOf(x);
                                    System.out.println("valor en arreglo "+sNumeros[col]);
                                }
                                break;
                            case 2: // la columna del numero
                                sNumeros2[0] = String.valueOf(fila+1);
                                //System.out.println("valor en arreglo "+sNumeros2[0]);
                                break;
                            case 3: // la columna del numero r

                                float r = Float.parseFloat(sNumeros[1] )/(m-1);
                                sNumeros2[1] = String.valueOf(r);
                                System.out.println("valor en arreglo "+sNumeros2[1]);

                                break;
                            default:
                            // code block
                        }
                    }

                    modelo.addRow(sNumeros); //agregando datos a la fila

                    modelo2.addRow(sNumeros2); //agregando datos a la fila

                    // verificar numero repetidos
                    int rep = 0;
                    if(fila > 0){
                        for(int i=0;i<modelo.getRowCount()-1;i++){
                            System.out.println(" valor i "+i+" cantidad filas "+modelo.getRowCount());
                            System.out.println(" valor de fila "+fila+" columna 1 "+modelo.getValueAt(i, 1));
                            System.out.println(" valor del array en columna 1 "+sNumeros[1]);
                            if ( modelo.getValueAt(i,1).toString().equals(sNumeros[1]) ) {
                                System.out.println(" encontro un repetido");
                                rep++;
                            } else {
                                System.out.println("NO encontro un repetido");
                                finFilas++;
                            }
                        }
                    }
                    if(rep>0){
                        break;
                    }

                }
            }else{
                JOptionPane.showMessageDialog(rootPane, " Para calcular (a) deber ser PAR y (c) IMPAR y la ecuacion (b-1)%4 con (b) debe ser igual a 1");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, " Las casillas deben estar llenas, ser numericas y positivas ");
        }
    }//GEN-LAST:event_btn_calcular_ActionPerformed

    private void btn_calcularG_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularG_ActionPerformed
        if ( validarIndividual( txt_m_.getText() ) ) { // Math.log10(num) / Math.log10(base)

            double log = Math.log10( Integer.parseInt(txt_m_.getText()) ) / Math.log10(2);

            //System.out.println(" lo que esta en log "+log+" pasado a entero "+ logInt);
            if (  log - Math.floor( log ) == 0 ) {

                int logInt = (int) log;

                txt_g_.setText( String.valueOf(logInt) );

            } else {

                JOptionPane.showMessageDialog( rootPane, " La variable M es ERRONEA ya que G debe ser entero y da como resultado: "+log );

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, " Debe existir la variable M ");
        }
    }//GEN-LAST:event_btn_calcularG_ActionPerformed

    private void btn_calcularM_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularM_ActionPerformed
        if ( validarIndividual( txt_g_.getText() ) ) {
            double g = Double.parseDouble( txt_g_.getText());

            if (  g - Math.floor( g ) == 0 ) {
                System.out.println(" dice q g es entero "+g);
                int m = (int) Math.pow(2,g);
                System.out.println(" int m casteado "+m);
                txt_m_.setText( String.valueOf(m) );
            } else {

                JOptionPane.showMessageDialog( rootPane, " La variable M no se puede calcular ya que G debe ser entero y da como resultado: "+g );
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, " Debe existir la variable G ");
        }
    }//GEN-LAST:event_btn_calcularM_ActionPerformed

    private void btn_exportar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportar_1ActionPerformed

        contAccion++;
        if( contAccion == 1 ){ agregarFiltro(); }

        if( selecArchivo.showDialog( null, "Exportar" ) == JFileChooser.APPROVE_OPTION ){
            archivo = selecArchivo.getSelectedFile();
            if( archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")  ){
                JOptionPane.showMessageDialog(null, exportar(archivo, tabla_numerosAleatorios_ ) );
            }else{
                JOptionPane.showMessageDialog(null, "Digite al final del nombre del archivo un formato EXCEL valido. Ejemplo ( archivo.xls o archivo.xlsx )." );
            }
        }
    }//GEN-LAST:event_btn_exportar_1ActionPerformed

    // ----------- FUNCIONES Y PROCEDIMIENTOS -------------------------------------------/////////////////////////////////

    public String exportar(File archivo, JTable tablaD){
        String respuesta = "No se realizo con exito la exportacion";
        
        int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        
        if( archivo.getName().endsWith("xls") ){
            wb = new HSSFWorkbook();
        }else{
            wb = new XSSFWorkbook();
        }
        
        Sheet hoja = wb.createSheet("algoritmoBlumBLum");
        
        try{           
            for (int i = -1; i < numFila; i++) {               
                Row fila = hoja.createRow(i+1);               
                for (int j = 0; j < numColumna; j++) {                   
                    Cell celda = fila.createCell(j);                   
                    if (i==-1) {                       
                        celda.setCellValue( String.valueOf( tablaD.getColumnName(j) ) );                     
                    } else {                     
                        celda.setCellValue( String.valueOf( tablaD.getValueAt(i, j) ) );                     
                    }                   
                    wb.write(new  FileOutputStream(archivo) );
                }
            }           
            respuesta = "Exportacion exitosa";
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, "Error al exportar archivo excel: -> "+e);
        }
        
        return respuesta;  
    }
    
    public void agregarFiltro(){     
        selecArchivo.setFileFilter( new FileNameExtensionFilter( "Excel (*.xls)","xls" )  );
        selecArchivo.setFileFilter( new FileNameExtensionFilter( "Excel (*.xlsx)","xlsx" )  );       
    }   
    
    private  boolean validarTxtVacios(){
        boolean vacio = true;
      
        if( txt_g_.getText().isEmpty() ) return false;
        if( txt_m_.getText().isEmpty() ) return false;
        if( txt_semilla_.getText().isEmpty() ) return false;

        return vacio;
    }
    
    private  boolean validarTxtPositivos(){
        boolean vacio = true;
      
        if( Integer.parseInt(txt_g_.getText()) < 0 ) return false;
        if( Integer.parseInt(txt_m_.getText()) < 0 ) return false;
        if( Integer.parseInt(txt_semilla_.getText()) < 0 ) return false;

        return vacio;
    }
    
    private  boolean validarTxtNumericos(){
        boolean vacio = true;
     
        if( !isNumeric( txt_g_.getText()) ) return false;
        if( !isNumeric( txt_m_.getText()) ) return false;
        if( !isNumeric( txt_semilla_.getText()) ) return false;

        return vacio;
    }
    
    private static boolean validarIndividual( String validar ){
        boolean valido = true;
        
        if( !isNumeric( validar ) ) return false;
        if( Integer.parseInt( validar ) < 0 ) return false;
        if( validar.isEmpty() ) return false;
        
        return valido;
    }
    
    private static boolean isNumeric(String cadena) // se certifica con esto de que sean numeros en la celda de la tabla
    {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcularG_;
    private javax.swing.JButton btn_calcularM_;
    private javax.swing.JButton btn_calcular_;
    public javax.swing.JButton btn_exportar_1;
    private javax.swing.JLabel etiq_formulaGeneral_;
    private javax.swing.JLabel etiq_formula_;
    private javax.swing.JLabel etiq_g_;
    private javax.swing.JLabel etiq_m_;
    private javax.swing.JLabel etiq_semilla_;
    private javax.swing.JLabel etiq_tituloBlumBlum_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_BlumBlum_;
    private javax.swing.JTable tabla_numerosAleatorios_;
    private javax.swing.JTextField txt_g_;
    private javax.swing.JTextField txt_m_;
    private javax.swing.JTextField txt_semilla_;
    // End of variables declaration//GEN-END:variables
}