package View;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;


public class MainFrame extends JFrame {

    //Buttons
    JButton binaryButton, decimalButton, hexButton, bandwidthButton, processFileButton;

    //Panels
    JPanel displayPanel = new JPanel();
    JPanel menuBarPanel = new JPanel();
    JPanel initialPanel = new JPanel();

    //Class Objects
    BinaryPanel binaryPanel = new BinaryPanel();
    HexadecimalPanel hexadecimalPanel = new HexadecimalPanel();
    DecimalPanel decimalPanel = new DecimalPanel();
    BandwidthPanel bandwidthPanel = new BandwidthPanel();
    ProcessFilePanel processFilePanel = new ProcessFilePanel();

    //Layout Manager
    CardLayout cardlayout = new CardLayout();


    public MainFrame() throws FileNotFoundException {
        this.setTitle("Handy Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setSize(600, 400);
        this.add(displayPanel, BorderLayout.CENTER);
        this.add(menuBarPanel, BorderLayout.WEST);
        displayMainPanel(); //displays panels
        this.setVisible(true);
    }

    private void displayMainPanel() {

        //Display Panel
        displayPanel.setLayout(cardlayout);
        displayPanel.add(initialPanel, "initial"); //blank
        displayPanel.add(binaryPanel, "binary");
        displayPanel.add(hexadecimalPanel, "hexadecimal");
        displayPanel.add(decimalPanel, "decimal");
        displayPanel.add(bandwidthPanel, "bandwidth");
        displayPanel.add(processFilePanel, "file");
        cardlayout.show(displayPanel, "initial");

        //Menu bar
        menuBarPanel.setBackground(Color.WHITE);
        menuBarPanel.setLayout(new GridLayout(5, 1, 3, 3));

        //Decimal Button
        decimalButton = new JButton("Decimal");
        decimalButton.addActionListener(e -> cardlayout.show(displayPanel,"decimal"));
        menuBarPanel.add(decimalButton);

        //Binary Button
        binaryButton = new JButton("Binary");
        binaryButton.addActionListener(e -> cardlayout.show(displayPanel,"binary"));
        menuBarPanel.add(binaryButton);

        //Hex Button
        hexButton = new JButton("Hexadecimal");
        hexButton.addActionListener(e -> cardlayout.show(displayPanel,"hexadecimal"));
        menuBarPanel.add(hexButton);

        //Bandwidth Button
        bandwidthButton = new JButton("Bandwidth");
        bandwidthButton.addActionListener(e -> cardlayout.show(displayPanel,"bandwidth"));
        menuBarPanel.add(bandwidthButton);

        //Process File Button
        processFileButton = new JButton("Process File");
        processFileButton.addActionListener(e -> cardlayout.show(displayPanel,"file"));
        menuBarPanel.add(processFileButton);

    }
    public static void main(String[] args) throws FileNotFoundException {

        //Force switch to universal UI theming.
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        new MainFrame();
    }
}
