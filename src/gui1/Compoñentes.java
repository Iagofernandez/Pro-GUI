
package gui1;
import java.awt.Color;
 import javax.swing.*;
/**
 *
 * @author ifernandezblanco
 */
public class Compoñentes{
    //declaracion de las variables que emplearemos
    //tenemos para crear una ventana
    //un panel, dos botones, una etiqueta y una linea de texto
    JFrame marco;
    JPanel panel;
    JButton boton, boton2;
    JLabel etiqueta;
    JTextField liTexto;
    JComboBox caja;
    
    public void crearVentana3(){
        
//instanciamos los objetos que creamos 
        //los objetos son las variables que creamos antes
        
        marco = new JFrame("ventana");
        panel = new JPanel();
        boton = new JButton("boton 1");
        boton2 = new JButton("boton 2");
        etiqueta = new JLabel("");
        liTexto = new JTextField(30);
       
        
        //le damos caracteristicas a a los componentes
         marco.setSize(900, 500);
         panel.setSize(800, 400);
         panel.setBackground(Color.cyan);
         etiqueta.setText("Nome");
         
         etiqueta.setBounds(50, 100, 50, 10);
       
         liTexto.setBounds(100, 100, 300, 20);
         liTexto.setText("Nombre?");
         
         boton.setBounds(200, 300, 100, 50);
         boton2.setBounds(400, 300, 100,50);
         

         
         panel.setLayout(null);
         

         //engadimos os componenetes
          panel.add(etiqueta);
         panel.add(liTexto);
         panel.add(boton);
         panel.add(boton2);
         marco.add(panel);
        
         
         marco.setVisible(true);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
