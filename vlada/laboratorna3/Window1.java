package laboratorna3;
import javax.swing.*;
  
public class Window1
    {
        public static void main(String[] args)
        {
            showWindow1(); 
        }
    public static void showWindow1()
{
        JFrame frame = new JFrame("Виберіть парний/непарний тиждень");
        frame.setBounds(100,100,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JButton button1 = new JButton("Парний");
        button1.setBounds(150,100,100,50);
        JButton button2 = new JButton("Непарний");
        button2.setBounds(150,200,100,50);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        button1.addActionListener(arg0 -> {
            frame.setVisible(false);
            Window2.showWindow2();
        });
        button2.addActionListener(arg0 -> {
            frame.setVisible(false);
            Window3.showWindow3();
        });
        frame.setVisible(true);

}
}