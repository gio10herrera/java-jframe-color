package views;

import javax.swing.*;
import java.awt.*;

public class JFrameActividad {

    public static void main(String[] args) {
        //creacion del JFrame
        JFrame jFrameInterfaz = new JFrame();
        jFrameInterfaz.setSize(400, 400);
        //jFrameInterfaz.pack();
        jFrameInterfaz.setLocationRelativeTo(null);
        jFrameInterfaz.setVisible(true);
        jFrameInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameInterfaz.setResizable(false);

        //creacion de lista de elementos (JList)
        String[] opciones = {"opcion1", "opcion2", "opcion3", "opcion4"};
        JList<String> lista = new JList<>(opciones);

        //añadir la lista dentro del JScrollPane
        JScrollPane jScrollPane = new JScrollPane(lista);
        jScrollPane.setBounds(10, 10, 100, 60);//posicionar el jscrollPane

        //añadir jscrollpane dentro del jframe
        jFrameInterfaz.add(jScrollPane);
        jFrameInterfaz.setLayout(null);


    }
}
