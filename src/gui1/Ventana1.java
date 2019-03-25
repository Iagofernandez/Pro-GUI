
package gui1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class Ventana1 {
    // creamos un nuevo JFRAME
    JFrame marco;
    JDialog ventanaSecun;
    JPanel panel;
    //metodo para originar una ventana
    public void crearVentana1(){
        
//instanciamos un objeto marco 
        //tipo JFrame
        // nos permite darle un titulo, siempre string
        marco = new JFrame("pantalla 1");
       
        //esto nos permite dar un tamaño a la ventana
        marco.setBounds(100,100, 400, 200);
        
//creamos ventana secundaria JDIALOG
     ventanaSecun = new JDialog(marco);//asocio a la variable marco   
     ventanaSecun.setBounds(150, 150, 200, 100);
        ventanaSecun.setVisible(true);
        
       //instancio un panel
       panel = new JPanel();
       panel.setBackground(Color.red);
       
//esto añade el panel al marco
       marco.add(panel);

//las ventanas de por si son invisibles
        //este set nos hace visible la ventana
        marco.setVisible(true);
        
//no permite redimensionar
//        marco.setResizable(false);
        
//redimensiona la ventana a tamaño maximo
//        marco.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
//para cerrar el programa al darle a la aspa
        //si no sigue corriendo
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        //ToolKit y imagen
        //llamado a unas herramientas para añadir una imagen
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        //aqui le decimos que imagen queremos tener
        Image icono = pantalla.getImage("nome.jpg");
        //la añade
        marco.setIconImage(icono);
    }
}
