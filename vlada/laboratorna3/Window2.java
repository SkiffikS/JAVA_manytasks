package laboratorna3;

import javax.swing.*;
public class Window2
{
    public static void main(String[] args)
    {
        showWindow2(); 
    }
    public static void showWindow2()
    {

        JFrame frame2 = new JFrame("Парний тиждень");
        frame2.setBounds(100,100,400,400);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.getContentPane().setLayout(null);

        JButton button3 = new JButton("Понеділок");
        button3.setBounds(150,10,100,50);
        JButton button4 = new JButton("Вівторок");
        button4.setBounds(150,80,100,50);
        JButton button5 = new JButton("Середа");
        button5.setBounds(150,150,100,50);
        JButton button6 = new JButton("Четвер");
        button6.setBounds(150,220,100,50);
        JButton button7 = new JButton("П'ятниця");
        button7.setBounds(150,290,100,50);

        frame2.getContentPane().add(button3);
        frame2.getContentPane().add(button4);
        frame2.getContentPane().add(button5);
        frame2.getContentPane().add(button6);
        frame2.getContentPane().add(button7);

        frame2.setVisible(true);
        button3.addActionListener(arg0 -> {
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
        button4.addActionListener(arg0 -> {
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
            message += "Дисципліна: ЦОВ\n";
            message += "Час проведення: 14:25\n";
            message += "Місце проведення: 6308\n";
            message += "Викладач: Сегін А.І.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "Вівторок", JOptionPane.PLAIN_MESSAGE);
        });
        button5.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Іноземна мова\n";
            message += "Час проведення: 9:35\n";
            message += "Місце проведення: 6101\n";
            message += "Викладач: Штохман Л.М.\n";
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
        button6.addActionListener(arg0 -> {
            String message = "";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: ЦОВ\n";
            message += "Час проведення: 12:50\n";
            message += "Місце проведення: 6303\n";
            message += "Викладач: Сегін А.І.\n";
            message += "-----------------------------------------------------------------\n";
            message += "Дисципліна: Мережеве Програмування\n";
            message += "Час проведення: 14:25\n";
            message += "Місце проведення: 6304\n";
            message += "Викладач: Батько Ю.М.\n";
            message += "-----------------------------------------------------------------\n";
            JOptionPane.showMessageDialog(null, message, "Четвер", JOptionPane.PLAIN_MESSAGE);
        });
        button7.addActionListener(arg0 -> {
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
