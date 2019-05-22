/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelania;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

//------- CLASE PARA PONER IMAGEN DE FONDO A LOS JFRAMES -------------

public class fondo extends javax.swing.JPanel {

    private String dirIma=null; //direccion de la imagen que vamos usar
    
    public fondo(){    
        this.setSize(400,280); // tamaño con el que saldra
    }
    
    public fondo(String urlImagen){    
        this.setSize(400,280); // tamaño con el que saldra
        this.dirIma=urlImagen; // agrega la direccion traida desde el jframe para anexarla al constructor y su propia variable de direccion
    }
        
    @Override
    public void paint(Graphics g){ // clase predeterminada para repintar el jframe
        Dimension tamanio = getSize(); //obitiene el tamaño incializado en el constructor
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource(dirIma));  // obtiene la imagen dando la direccion de la misma      
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);  // aqui se envia la imagen con sus respectivos atributos      
        setOpaque(false);
        super.paintComponent(g);
    }
    
}

