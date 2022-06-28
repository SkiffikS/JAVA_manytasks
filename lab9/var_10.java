import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class var_10 extends JFrame {

    private Toolkit toolkit;

    public var_10() {
        setTitle("Sound");
        setSize(300, 200);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        JLabel lbl1 = new JLabel("Pressure");
        lbl1.setBounds(30, 20, 80, 30);
        JLabel lbl2 = new JLabel("Density");
        lbl2.setBounds(30, 55, 110, 30);
        JLabel lbl3 = new JLabel("Speed sound");
        lbl3.setBounds(30, 90, 80, 30);
        final JTextField txt1 = new JTextField(5);
        txt1.setBounds(145, 20, 50, 30);
        txt1.setText("0");
        final JTextField txt2 = new JTextField(5);
        txt2.setBounds(145, 55, 50, 30);
        txt2.setText("0");
        final JTextField txt3 = new JTextField(5);
        txt3.setBounds(145, 90, 50, 30);

        JButton comp = new JButton("Compute");
        comp.setBounds(30, 125, 110, 30);
        comp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int K = Integer.parseInt(txt1.getText());
                int p = Integer.parseInt(txt2.getText());
                double result = Math.sqrt(K / p);
                String result1 = String.format("%.0f", result);
                txt3.setText(String.valueOf(result1 ));
            }
        });

        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(txt1);
        panel.add(txt2);
        panel.add(txt3);
        panel.add(comp);
    }

    public static void main(String[] args) {
        var_10 buttons = new var_10();
        buttons.setVisible(true);
    }
}

