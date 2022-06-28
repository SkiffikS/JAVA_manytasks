package laboratorna3;
import javax.swing.*;
public class Window3
{
    public static void main(String[] args)
    {
        showWindow3(); 
    }

    public static void showWindow3()
    {
        JFrame frame3 = new JFrame("Не парний тиждень");
        frame3.setBounds(100,100,400,400);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.getContentPane().setLayout(null);

        JButton button8 = new JButton("Понеділок");
        button8.setBounds(150,10,100,50);
        JButton button9 = new JButton("Вівторок");
        button9.setBounds(150,80,100,50);
        JButton button10 = new JButton("Середа");
        button10.setBounds(150,150,100,50);
        JButton button11 = new JButton("Четвер");
        button11.setBounds(150,220,100,50);
        JButton button12 = new JButton("П'ятниця");
        button12.setBounds(150,290,100,50);

        frame3.getContentPane().add(button8);
        frame3.getContentPane().add(button9);
        frame3.getContentPane().add(button10);
        frame3.getContentPane().add(button11);
        frame3.getContentPane().add(button12);
        frame3.setVisible(true);

        button8.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Операційні системи\n";
            message += "Час проведення: 9:35\n";
            message += "Місце проведення: 6308\n";
            message += "Викладач: Гумений П.В.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: ТІМС\n";
            message += "Час проведення: 11:10\n";
            message += "Місце проведення: 6308\n";
            message += "Викладач: Возняк О.Г.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Вища Математика\n";
            message += "Час проведення: 12:50\n";
            message += "Місце проведення: 6308\n";
            message += "Викладач: Боднар Д.І.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "Понеділок", JOptionPane.PLAIN_MESSAGE);
        });
        button9.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Мережеве Програмування\n";
            message += "Час проведення: 11:10\n";
            message += "Місце проведення: 6303\n";
            message += "Викладач: Батько Ю.М.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Комп'ютерна схемотехніка\n";
            message += "Час проведення: 12:50\n";
            message += "Місце проведення: 6303\n";
            message += "Викладач: Паздрій І.Р.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "Вівторок", JOptionPane.PLAIN_MESSAGE);
        });
        button10.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Комп'ютерна схемотехніка\n";
            message += "Час проведення: 11:10\n";
            message += "Місце проведення: 6306\n";
            message += "Викладач: Ігнатьєв І.В.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Вища Математика\n";
            message += "Час проведення: 12:50\n";
            message += "Місце проведення: 6303\n";
            message += "Викладач: Боднар Д.І.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "Середа", JOptionPane.PLAIN_MESSAGE);
        });
        button11.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Мережеве Програмування\n";
            message += "Час проведення: 14:25\n";
            message += "Місце проведення: 6304\n";
            message += "Викладач: Батько Ю.М.\n";
            message += "-----------------------------------------------------------------\n";
        JOptionPane.showMessageDialog(null, message, "Четвер", JOptionPane.PLAIN_MESSAGE);
        });
        button12.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: ТІМС\n";
            message += "Час проведення: 8:00\n";
            message += "Місце проведення: 6308\n";
            message += "Викладач: Возняк О.Г.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Операційні системи\n";
            message += "Час проведення: 9:35\n";
            message += "Місце проведення: 6303\n";
            message += "Викладач: Давлетова А.Я.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "П'ятниця", JOptionPane.PLAIN_MESSAGE);
        });
    }

}
