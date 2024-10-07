package views;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JFrameActividad {

    public static void main(String[] args) {
        //creacion del JFrame
        JFrame jFrameInterfaz = new JFrame();
        jFrameInterfaz.setSize(400, 400);
        //jFrameInterfaz.pack();
        jFrameInterfaz.setLocationRelativeTo(null);
        jFrameInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameInterfaz.setResizable(false);
        jFrameInterfaz.setTitle("Actividad con JFrame");

        //creacion de lista de elementos (JList)
        String[] opciones = {"Rosado", "Cyan", "Gris", "Verde", "Amarillo"};
        JList<String> lista = new JList<>(opciones);

        //añadir la lista dentro del JScrollPane
        JScrollPane jScrollPane = new JScrollPane(lista);
        jScrollPane.setBounds(150, 10, 100, 60);//posicionar el jscrollPane

        //añadir jscrollpane dentro del jframe
        jFrameInterfaz.setLayout(null);
        jFrameInterfaz.add(jScrollPane);

        lista.addListSelectionListener(e -> {
            //comprobar si aun se esta ajustando la seleccion
            if (!e.getValueIsAdjusting()) {
                String seleccion = lista.getSelectedValue();
            }
        });
        jFrameInterfaz.setVisible(true);
    }
}
