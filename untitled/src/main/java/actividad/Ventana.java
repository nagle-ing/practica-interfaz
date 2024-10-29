package actividad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JButton button1;
    private JPanel ventana;
    private JTextField textusuario;
    private JButton enviar;
    private JLabel saludousuario;
    private JTextField txtusuario;
    private JPasswordField txtcontrasena;
    private JButton ingresarButton;
    private JCheckBox vercontrasena;

    public Ventana() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hola perros");

            }
        });
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textusuario.getText();
                String saludo="bienvenido " + usuario;
                saludousuario.setText(saludo);
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomusuario= txtusuario.getText();
                String contraseña= String.valueOf( txtcontrasena.getPassword());
                if (nomusuario.equals("juan") && contraseña.equals("123")){
                    JOptionPane.showMessageDialog(null, "veridico mi rey");
                }else {
                    JOptionPane.showMessageDialog(null,"muy equivocado rey");
                }

            }
        });
        vercontrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if( vercontrasena.isSelected()){
                   txtcontrasena.setEchoChar((char)0);
               }else {
                   txtcontrasena.setEchoChar('*');
               }

            }
        });
    }

    public JPanel getVentana() {
        return ventana;
    }
}
