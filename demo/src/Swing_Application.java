import javax.swing.*;
import java.awt.*;

public class Swing_Application {
    private JLabel jlab;
    private Swing_Application(){
        JFrame jfrm = new JFrame("Simple swing application");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//parameter can be DISPOSE_ON_CLOSE, HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE
        //installing two buttons
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        //install listeners on two buttons
        left.addActionListener(e -> jlab.setText("Pressed left button"));
        right.addActionListener(e -> jlab.setText("Pressed right button"));
        //add two buttons on panel
        jfrm.add(left);
        jfrm.add(right);

        jlab = new JLabel("Press button");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }
    public static void main (String args []){
        SwingUtilities.invokeLater(Swing_Application::new);
    }
}
