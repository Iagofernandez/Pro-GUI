
package gui1;

import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
//tambien se puede indicar que extiende de JFrame
public class Ventana2 extends JFrame {
    //segundo manera para crear ventanas JFRAME
    //metodo mas directo
    //metodo para Crear VEntana
    public void crearVentana2(){
        //dar tamaño
        setSize(800, 600);
        //acomodar a nuestros gustos
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana 2");
        this.setVisible(true);
    }
}
