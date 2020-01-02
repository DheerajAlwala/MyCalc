import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    private double total1=0.0;
    private double total2=0.0;
    private JPanel JavaCalculator;
    private JTextField TextDisplay;
    private JTextField TextField;
    private JButton button1;
    private JButton a1Button;
    private JButton button3;
    private JButton button4;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton CANCELButton;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button16;
    private JButton button17;
    private JButton ACButton;
    private JButton button2;

    public Demo() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText= a1Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText=a2Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText=a3Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText=a4Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a4ButtonText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText=a5Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText=a6Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText=a7Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText=a8Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText=a9Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a9ButtonText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0ButtonText=a0Button.getText() + TextDisplay.getText();
                TextDisplay.setText(a0ButtonText);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1+=Double.parseDouble(TextDisplay.getText());
                TextDisplay.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=total1+Double.parseDouble(TextDisplay.getText());
                total1=0.0;
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0.0;
                TextDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=total1-Double.parseDouble(TextDisplay.getText());
                total1=0.0;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=total1*Double.parseDouble(TextDisplay.getText());
                total1=0.0;
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                total2=total1/Double.parseDouble(TextDisplay.getText());
                total1=0.0;
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new Demo().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
