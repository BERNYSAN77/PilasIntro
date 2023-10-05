package palindromo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPal {
    private JPanel Palindromo;
    private JTextField textField1;
    private JButton Comprobar;
    private JTextArea textArea1;
    PilaChar pal = new PilaChar();

    public static void main(String[] args) {
        JFrame frame = new JFrame("PrincipalPal");
        frame.setContentPane(new PrincipalPal().Palindromo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public boolean isPalindromo(String texto){
        for(int i = 0; i < texto.length();i++){
            pal.push(texto.charAt(i));

        }
        System.out.println(pal.toString());
        System.out.println(texto);
        System.out.println("son iguales: "+texto.equals(pal.toString()));
        return texto.equals(pal.toString());


    }

    public PrincipalPal() {
        Comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                if (isPalindromo(texto)) {
                    JOptionPane.showMessageDialog(null, "es palindromo");
                    String mensaje = "Texto ingresado: "+texto+"\nResultado pila: "+ pal.toString();
                    textArea1.setText(mensaje);


                }else
                    JOptionPane.showMessageDialog(null, "no es palindromo");
            }

        });
    }



}
