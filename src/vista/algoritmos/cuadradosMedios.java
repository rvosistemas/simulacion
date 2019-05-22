/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.algoritmos;

import java.math.BigDecimal;
import java.math.BigInteger;
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
public class cuadradosMedios extends javax.swing.JInternalFrame {

    // --- VARIABLES ------------crea variables para el modelo de la tabla y el tipo de fuente del formulario

    private final Fuentes tipoFuente; // para llamar el metodo de tipografias personalizadas
    private DefaultTableModel modelo; // se crea modelo para tabla
    private DefaultTableModel modelo2; // se crea modelo2 para tabla 2
    
    Workbook wb; // para trabajar importar y/o exportar archivos en xls
    
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int contAccion = 0;
    
    public cuadradosMedios() {
        initComponents();
        
        
        // SE PERSONALIZA TODO EL TEXTO CON FUENTES DEL PAQUETE TIPOGRAFIA
        tipoFuente = new Fuentes(); // crea tipo de fuente para usar atributos y procedimientos
        ///----------------///----- ETIQUETAS -----///---------------///
        etiq_tituloCuadradosMedios_.setFont(tipoFuente.fuente(tipoFuente.GOD,0,24));
        ///----------------///----- TABLA MENU -----///---------------///
        tabla_cuadradosMedios_.setEnabled(false);
        tabla_numerosAleatorios_.setEnabled(false);
         ///----------------///----- CUADROS DE TEXTO -----///---------------///
        txt_semilla_.setEnabled(true);
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiq_tituloCuadradosMedios_ = new javax.swing.JLabel();
        etiq_cantidadNumeros_ = new javax.swing.JLabel();
        txt_cantidadNumeros_ = new javax.swing.JTextField();
        etiq_semilla_ = new javax.swing.JLabel();
        txt_semilla_ = new javax.swing.JTextField();
        etiq_cantidadDigitos_ = new javax.swing.JLabel();
        txt_cantidadDigitos_ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuadradosMedios_ = new javax.swing.JTable();
        btn_calcular_ = new javax.swing.JButton();
        btn_aleatorio_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_numerosAleatorios_ = new javax.swing.JTable();
        btn_exportar_ = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        etiq_tituloCuadradosMedios_.setText("CUADRADOS MEDIOS");

        etiq_cantidadNumeros_.setText("Cantidad de numeros:");

        etiq_semilla_.setText("Semilla:");

        etiq_cantidadDigitos_.setText("Cantidad Digitos:");

        tabla_cuadradosMedios_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(tabla_cuadradosMedios_);

        btn_calcular_.setText("Calcular");
        btn_calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_ActionPerformed(evt);
            }
        });

        btn_aleatorio_.setText("Aleatorio");
        btn_aleatorio_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aleatorio_ActionPerformed(evt);
            }
        });

        tabla_numerosAleatorios_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "R"
            }
        ));
        jScrollPane2.setViewportView(tabla_numerosAleatorios_);

        btn_exportar_.setText("EXPORTAR a EXCEL");
        btn_exportar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_calcular_)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exportar_))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiq_tituloCuadradosMedios_)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiq_cantidadNumeros_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cantidadNumeros_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiq_semilla_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_semilla_, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiq_cantidadDigitos_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cantidadDigitos_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(btn_aleatorio_)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiq_tituloCuadradosMedios_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiq_cantidadNumeros_)
                    .addComponent(txt_cantidadNumeros_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiq_semilla_)
                    .addComponent(txt_semilla_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiq_cantidadDigitos_)
                    .addComponent(txt_cantidadDigitos_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btn_aleatorio_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calcular_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_exportar_)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 // ----------- BOTONES -------------------------------------------/////////////////////////////////
    private void btn_calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_ActionPerformed
        
        if( !"".equals(txt_cantidadDigitos_.getText()) && !"".equals(txt_cantidadNumeros_.getText()) && !"".equals(txt_semilla_.getText()) ){
            
            if( isNumeric(txt_cantidadDigitos_.getText()) && isNumeric(txt_cantidadNumeros_.getText()) && isNumeric(txt_semilla_.getText()) ){
            
                if( Double.parseDouble(txt_cantidadDigitos_.getText()) > 3 && Double.parseDouble(txt_cantidadNumeros_.getText()) > 0  && Double.parseDouble(txt_semilla_.getText()) > 0 ){

                    int cantNum = Integer.parseInt(txt_cantidadNumeros_.getText());
                    int semilla = Integer.parseInt(txt_semilla_.getText());
                    int cantDigitos = Integer.parseInt(txt_cantidadDigitos_.getText());
                    int digitos = 0;

                    modelo = new DefaultTableModel();
                    modelo2 = new DefaultTableModel();
                    tabla_cuadradosMedios_.setModel(modelo);
                    tabla_numerosAleatorios_.setModel(modelo2);

                    modelo.addColumn("#");
                    modelo.addColumn("X");
                    modelo.addColumn("Y");

                    modelo2.addColumn("#");
                    modelo2.addColumn("R");

                    while( semilla !=0 ) //cuenta los digitos de un numero
                    {
                        semilla = semilla/10;
                        digitos++;
                    }

                    System.out.println("cantidad digitos en semilla "+digitos+" pedidos usuario "+cantDigitos);

                    if(digitos == cantDigitos){

                        //llenar la tabla con la fila de objetos
                        for(int fila=0;fila<=cantNum;fila++){ // recorrido de filas 

                            BigInteger numeros[] = new BigInteger[3]; // los objetos que van en la fila
                            BigDecimal numeros2[] = new BigDecimal[2];
                            String sNumeros[] = new String[3];
                            String sNumeros2[] = new String[2];

                            for(int col=0;col<5;col++){ // recorrido de columnas 
                                System.out.println("fila "+fila+" columna "+col); 
                                switch(col) {
                                    case 0:// la columna del numero
                                        numeros[col] = new BigInteger( String.valueOf(fila) );
                                        sNumeros[col] = String.valueOf(numeros[col]);
                                        System.out.println("valor en arreglo "+sNumeros[col]);    
                                    break;
                                    case 1:// la columna del numero x o semillas
                                        if(fila==0){
                                            numeros[col] = new BigInteger(txt_semilla_.getText());
                                            sNumeros[col] = String.valueOf(numeros[col]);
                                            System.out.println("valor en arreglo "+sNumeros[col]); 
                                        }else{
                                            BigInteger aux = new BigInteger( modelo.getValueAt(fila-1, col+1).toString());
                                            numeros[col] = extraerNumeros( aux , cantDigitos);
                                            sNumeros[col] = String.valueOf(numeros[col]);
                                            System.out.println("valor en arreglo "+sNumeros[col]); 
                                        }
                                    break;
                                    case 2: // la columna del numero y 
                                        if(fila==0){
                                            BigInteger aux = new BigInteger( txt_semilla_.getText());
                                            numeros[col] = new BigInteger(aux.multiply(aux).toString()); //elevado al cuadrado
                                            sNumeros[col] = String.valueOf(numeros[col]);
                                            System.out.println("valor en arreglo "+sNumeros[col]); 
                                        }else{
                                            BigInteger aux = new BigInteger( numeros[col-1].toString() );
                                            numeros[col] = new BigInteger(aux.multiply(aux).toString()); //elevado al cuadrado
                                            sNumeros[col] = String.valueOf(numeros[col]);
                                            System.out.println("valor en arreglo "+sNumeros[col]); 
                                        }
                                    break;
                                    case 3: // la columna del numero 
                                        numeros2[0] = new BigDecimal( String.valueOf(fila) );
                                        sNumeros2[0] = String.valueOf(numeros2[0]);
                                        System.out.println("valor en arreglo "+sNumeros2[0]);  
                                    break;
                                    case 4: // la columna del numero r
                                        if(fila==0){
                                            numeros2[1] = new BigDecimal("0");
                                            sNumeros2[1] = String.valueOf(numeros2[1]);
                                            System.out.println("valor en arreglo "+sNumeros2[1]); 
                                        }else{
                                            BigDecimal a,bigDiv;
                                            a = new BigDecimal("10");
                                            bigDiv = a.pow(cuentaDigitos( Integer.parseInt( numeros[col-3].toString() ) ));
                                            System.out.println("el divisor es "+bigDiv);
                                            BigDecimal aux = new BigDecimal( numeros[col-3].toString() );
                                            numeros2[1] = aux.divide(bigDiv); 
                                            sNumeros2[1] = String.valueOf(numeros2[1]);
                                            System.out.println("valor en arreglo "+sNumeros2[1]); 
                                        }
                                    break;
                                    default:
                                  // code block
                                }
                            }

                            modelo.addRow(sNumeros); //agregando datos a la fila

                            modelo2.addRow(sNumeros2); //agregando datos a la fila


                        }

                    }else{
                        JOptionPane.showMessageDialog(rootPane, "EL numero digitos de la semilla no coniciden con la cantidad especificada en digitos");
                    }           

                }else{
                    JOptionPane.showMessageDialog(rootPane, "debe llenar las casilla digito mayor a 3 y las demas mayor a cero");
                }

            }else{
                JOptionPane.showMessageDialog(rootPane, "Los campos deben ser numeros enteros");
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "debe llenar todas las casillas");
        }
       
    }//GEN-LAST:event_btn_calcular_ActionPerformed

    private void btn_aleatorio_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aleatorio_ActionPerformed
        if( !"".equals(txt_cantidadDigitos_.getText()) && isNumeric(txt_cantidadDigitos_.getText()) && Double.parseDouble(txt_cantidadDigitos_.getText()) > 0  ){
            System.out.println("aleatorio");
            double aux = Math.pow(10,Double.parseDouble(txt_cantidadDigitos_.getText()));
            System.out.println("aux "+aux);
            double aux2 = Math.pow(10,(Double.parseDouble(txt_cantidadDigitos_.getText()))-1 );
            System.out.println("aux2 "+aux2);
            double N = aux-1;
            double M = aux2;
            System.out.println("aleatorio entre "+M+" y "+N);
            int valorEntero = (int) Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
            System.out.println("aleatorio es "+valorEntero);
            txt_semilla_.setText(String.valueOf(valorEntero));
        }else{
            JOptionPane.showMessageDialog(rootPane, "llene la casilla de cantidad de digitos");
        }
    }//GEN-LAST:event_btn_aleatorio_ActionPerformed

    private void btn_exportar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportar_ActionPerformed
     
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
    }//GEN-LAST:event_btn_exportar_ActionPerformed
  
    // ----------- FUNCIONES Y PROCEDIMIENTOS -------------------------------------------/////////////////////////////////
    public String exportar(File archivo, JTable tablaD){
        String respuesta = "No se realizo con exito la exportacion";
        
        int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        
        if( archivo.getName().endsWith("xls") ){
            wb = new HSSFWorkbook();
        }else{
            wb = new XSSFWorkbook();
        }
        
        Sheet hoja = wb.createSheet("cuadradosMedios");
        
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
    
    private static BigInteger extraerNumeros(BigInteger numElevado,int cantDigitos) // se certifica con esto de que sean numeros en la celda de la tabla
    {
        int digitos = numElevado.toString().length() ; // cuenta cuantos digitos tiene;
        //int digitos = numElevado.bitCount();
        
        //System.out.println("digitos numero elevado en extraer numeros "+digitos); 
        String caracteres = numElevado.toString(); 
        char[] arrayNumExtraido = new char[cantDigitos];
        int posNumExtraido = 0;
        
        int ini = (digitos-cantDigitos)/2;
        int fin = cantDigitos+ini;
        
        System.out.println("extraer numeros inicial "+ini+" final "+fin+" digitos num elev "+digitos); 

        if(esPar(digitos)){ // Digitos es la cantidad que componen al numero elevado           
            if( esPar(cantDigitos) ){ // cantNum el numero de digito ingresado por usuario               
                //System.out.println("extraer numeros inicial "+ini+" final "+fin); 
                for (int i =ini; i < fin; i++)
                {
                    arrayNumExtraido[posNumExtraido] = caracteres.charAt(i);
                    //System.out.println("extraer charat "+caracteres.charAt(i)+" posicion "+i);
                    posNumExtraido++;
                }                                
            }else{               
                 for (int i =ini; i < fin; i++)
                {
                    arrayNumExtraido[posNumExtraido] = caracteres.charAt(i);
                    //System.out.println("extraer charat "+caracteres.charAt(i)+" posicion "+i);
                    posNumExtraido++;
                }              
            }
            
        }else{
            if( esPar(cantDigitos) ){ // cantNum el numero de digito ingresado por usuario            
                 for (int i =ini; i < fin; i++)
                {
                    arrayNumExtraido[posNumExtraido] = caracteres.charAt(i);
                    //System.out.println("extraer charat "+caracteres.charAt(i)+" posicion "+i);
                    posNumExtraido++;
                }               
            }else{             
                 for (int i =ini; i < fin; i++)
                {
                    arrayNumExtraido[posNumExtraido] = caracteres.charAt(i);
                    //System.out.println("extraer charat "+caracteres.charAt(i)+" posicion "+i);
                    posNumExtraido++;
                }            
            }
        }
        return new BigInteger(String.valueOf(arrayNumExtraido));
    }
    
    private static int cuentaDigitos(int numero) // se certifica con esto de que sean numeros en la celda de la tabla
    {
        int digitos = 0;
        while( numero !=0 ) //cuenta los digitos de un numero
            {
                numero = numero/10;
                digitos++;
            }
        return digitos;
    }  
    
    public static boolean esPar(int numero) {
        //Si el resto de numero entre 2 es 0, el numero es par
        return numero % 2 == 0;
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
    private javax.swing.JButton btn_aleatorio_;
    private javax.swing.JButton btn_calcular_;
    public javax.swing.JButton btn_exportar_;
    private javax.swing.JLabel etiq_cantidadDigitos_;
    private javax.swing.JLabel etiq_cantidadNumeros_;
    private javax.swing.JLabel etiq_semilla_;
    private javax.swing.JLabel etiq_tituloCuadradosMedios_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_cuadradosMedios_;
    public javax.swing.JTable tabla_numerosAleatorios_;
    private javax.swing.JTextField txt_cantidadDigitos_;
    private javax.swing.JTextField txt_cantidadNumeros_;
    private javax.swing.JTextField txt_semilla_;
    // End of variables declaration//GEN-END:variables

}
