/* code 3 :- 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

        JLabel lbl1 = new JLabel("Number 1:");
        JTextField txt1 = new JTextField();

        JLabel lbl2 = new JLabel("Number 2:");
        JTextField txt2 = new JTextField();

        JLabel lblResult = new JLabel("Result:");
        JTextField txtResult = new JTextField();
        txtResult.setEditable(false);

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");

        panel.add(lbl1); panel.add(txt1);
        panel.add(lbl2); panel.add(txt2);
        panel.add(lblResult); panel.add(txtResult);
        panel.add(add); panel.add(sub);
        panel.add(mul); panel.add(div);

        // Button actions
        ActionListener operation = e -> {
            try {
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText());
                double result = 0;

                if (e.getSource() == add) result = num1 + num2;
                else if (e.getSource() == sub) result = num1 - num2;
                else if (e.getSource() == mul) result = num1 * num2;
                else if (e.getSource() == div) result = num2 != 0 ? num1 / num2 : 0;

                txtResult.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                txtResult.setText("Invalid Input");
            }
        };

        add.addActionListener(operation);
        sub.addActionListener(operation);
        mul.addActionListener(operation);
        div.addActionListener(operation);

        frame.add(panel);
        frame.setVisible(true);
    }
}
*/
/* code 2 :- 
import javax.swing.*;

public class Swing_first {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Welcome to Swing!");
        JButton button = new JButton("Click Me");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
*/
/* 
// Code 1 :- 
import javax.swing.JFrame;
import javax.swing.JLabel;

class Swing_first extends JFrame {
    public static void frame () {
        JFrame frame = new JFrame("My Swing Application");
        JLabel label = new JLabel("enter here"); 
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        label.setSize(500,250);


    }
    public static void main(String[] args) {
        Swing_first.frame();
    }
}      
    //  Explanation of setDefaultCloseOperation :-
    //  JFrame.EXIT_ON_CLOSE (Value = 3): This option will terminate the entire application when the window is closed. In other words, it stops the Java Virtual Machine (JVM) that is running the application. This is useful when the JFrame represents the main window of the application and you want to close the application entirely when it’s closed.
    //  JFrame.HIDE_ON_CLOSE (Value = 1): This option hides the JFrame when the user closes it but does not terminate the application. The JFrame will become invisible, but the application will continue running in the background. This can be helpful if you plan to reopen the same frame or if there are other windows open.
    //  JFrame.DISPOSE_ON_CLOSE (Value = 2): This option releases the resources used by the JFrame and hides the window when it is closed. However, it does not terminate the application. This is typically used for secondary windows that don’t need to remain in memory after they’re closed.
    //  JFrame.DO_NOTHING_ON_CLOSE (Value = 0): This option prevents any action from being taken when the close button is clicked. The frame stays open, and you would need to programmatically control its closure if needed. This option is useful if you want to display a confirmation dialog or perform some action before closing the window
        
*/