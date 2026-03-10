package mainpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class App {
    public static void main(String[] args) throws Exception {
        Define def = new Define();

        JFrame frame = new JFrame("JAVAttack");
        frame.setVisible(true);
        frame.setSize(def.getBoardWidth(), def.getBoardHeight());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //      // Setup panel with text field
        // JPanel setupPanel = new JPanel(new FlowLayout());
        // JLabel label = new JLabel("Enter your player name: ");
        // JTextField nameField = new JTextField(15);




        // nameField.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         String playerName = nameField.getText().trim();
        //         if (playerName.isEmpty()) {
        //             playerName = "Player1"; // default fallback
        //         }
        //         JOptionPane.showMessageDialog(setupPanel,
        //                 "You entered: " + playerName);
               
        //     }
        // });
        
        // setupPanel.add(label);
        // setupPanel.add(nameField);
        // setupPanel.setVisible(true);


        JAVAttack javAttack = new JAVAttack();
        frame.add(javAttack);
        frame.pack();
        javAttack.requestFocus();
        frame.setVisible(true);
    }
}
