package actividad;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        Ventana miventana = new Ventana();
        frame.setContentPane(miventana.getVentana());
        frame.setVisible(true);
    }
}
