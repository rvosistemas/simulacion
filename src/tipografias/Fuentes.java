/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipografias;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

//---- CLASE QUE SIRVE PARA USAR FUENTES O TIPOGRAFIAS PERSONALIZADAS Y QUE FUNCIONEN EN CUALQUIER PC

public class Fuentes {
    private Font font = null; // variable de la clase font para usar sus funciones
    //---se crea una variable que contenga el nombre exacto del tipo de letra 
    //--- el tipo de letra debe ser guardado en una paquete dentro del proyecto
    public String GOD = "GODOFWAR.TTF";
    public String ELF = "Dark elf.otf";
    public String HARRY = "HARRYP__.TTF";
    public String INKED = "iNked God.ttf";
    public String NARUTO = "njnaruto.ttf";

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
    public Font fuente( String fontName, int estilo, float tamanio)
    {// funcion que devuelve un tipo font y recibe como parametros nombre, estilo y tamaño de la fuente a usar
         try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
