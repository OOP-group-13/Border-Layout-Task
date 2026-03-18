import javax.swing.*;
import java.awt.*;

public class BorderLayoutTask {

    public BorderLayoutTask() {
        JFrame BorderFrame = new JFrame("BorderLayout Demo");
        BorderFrame.setSize(600, 400);
        BorderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderFrame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        BorderFrame.add(titleLabel, BorderLayout.NORTH);

        JPanel JPanelOne = new JPanel();
        JPanelOne.setLayout(new GridLayout(3, 1));
        JButton JButtonOne = new JButton("Option 1");
        JButton JButtonTwo = new JButton("Option 2");
        JButton JButtonThree = new JButton("Option 3");
        JPanelOne.add(JButtonOne);
        JPanelOne.add(JButtonTwo);
        JPanelOne.add(JButtonThree);
        BorderFrame.add(JPanelOne, BorderLayout.WEST);

        JTextArea JTextAreaOne = new JTextArea();
        JScrollPane JScrollPaneOne = new JScrollPane(JTextAreaOne);
        BorderFrame.add(JScrollPaneOne, BorderLayout.CENTER);

        JButton JButtonFour = new JButton("Submit");
        BorderFrame.add(JButtonFour, BorderLayout.SOUTH);

        BorderFrame.setVisible(true);
    }

}
