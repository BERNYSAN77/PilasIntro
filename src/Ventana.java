import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;

    Pila pila1 = new Pila();
    public boolean balanceada(String cadena) {


        for (int f = 0; f < cadena.length(); f++)
            if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{')
                pila1.push(cadena.charAt(f));
            else if (cadena.charAt(f) == ')' || cadena.charAt(f) == ']' || cadena.charAt(f) == '}') {
                if (pila1.estaVacia())
                    return false;
                else if (cadena.charAt(f) == ')' && pila1.pop() != '(')
                    return false;
                else if (cadena.charAt(f) == ']' && pila1.pop() != '[')
                    return false;
                else if (cadena.charAt(f) == '}' && pila1.pop() != '{')
                    return false;
            }
        if (pila1.estaVacia())
            return true;
        else
            return false;
    }

    public Ventana() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = textField1.getText();
                if(balanceada(cadena)){
                    JOptionPane.showMessageDialog(null,"ok");
                }else{
                    JOptionPane.showMessageDialog(null,"no balanceada");
                    textArea1.setText(pila1.toString());
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
