package views;

import javax.swing.*;

public class JFrameActividad {

    public static void main(String[] args) {
        //creacion del JFrame
        JFrame jFrameInterfaz = new JFrame();
        jFrameInterfaz.setSize(400, 400);
        jFrameInterfaz.setLocationRelativeTo(null);
        jFrameInterfaz.setVisible(true);
        jFrameInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameInterfaz.setResizable(false);

        //creacion de lista de elementos (JList)
        String[] opciones = {"opcion1", "opcion2", "opcion3", "opcion4"};
        JList<String> lista = new JList<>(opciones);

    }
}
