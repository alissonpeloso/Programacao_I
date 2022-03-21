import java.awt.event.*;
import javax.swing.*;

class Tamanho {
    public int largura = 400;
    public int altura = 400;
}

public class Teste {
    public static void main(String arg[]) {
        Tamanho t = new Tamanho();

        JFrame f = new JFrame("Minha primeira janela");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(t.largura, t.altura);
        f.setVisible(true);

        JFrame f2 = new JFrame("Segunda janela");
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(100, 100);
        f2.setVisible(true);   

        JButton botao = new JButton("Aperte");

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.largura = t.largura + 10;
                t.altura = t.altura + 10;
                f2.setSize(t.largura, t.altura);
            }
        });

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Oi, eu estou ouvindo!");
            }
        });

        f.add(botao);
    }
}