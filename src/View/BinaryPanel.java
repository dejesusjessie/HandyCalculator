package View;

import Controller.BinaryCalculator;
import Controller.Calculator;
import Model.Binary;
import Model.Decimal;

import javax.swing.*;
import java.awt.*;


public class BinaryPanel extends JPanel {

    //Conversion Panels
    JPanel binaryConversionMainPanel = new JPanel();
    JPanel conversionTitlePanel = new JPanel();
    JPanel conversionSubtitlePanel = new JPanel();
    JPanel conversionComputationPanel = new JPanel();
    JPanel conversionResultPanel = new JPanel();


    //Calculation Panels
    JPanel binaryCalculatorMainPanel = new JPanel();
    JPanel calculatorTitlePanel = new JPanel();
    JPanel calculatorSubtitlePanel = new JPanel();
    JPanel calculatorComputationPanel = new JPanel();
    JPanel calculatorResultPanel = new JPanel();


    //Conversion Labels
    JLabel conversionTitleLabel = new JLabel();
    JLabel conversionSubtitleLabel = new JLabel();
    JLabel conversionBinaryValueLabel = new JLabel();
    JLabel conversionEqualsQuestionMarkLabel = new JLabel();



    //Calculation Labels
    JLabel calculatorTitleLabel = new JLabel();
    JLabel calculatorSubtitleLabel = new JLabel();

    //Buttons
    JButton convertButton = new JButton();
    JButton calculateButton = new JButton();
    JButton conversionClearButton = new JButton();
    JButton calculatorClearButton = new JButton();

    //Conversion Text Field
    JTextField conversionValueField = new JTextField();
    JTextField calculatorOperandOneField = new JTextField();
    JTextField calculatorOperandTwoField = new JTextField();

    //Conversion Text Area
    JTextArea conversionResultTextArea = new JTextArea();

    //Calculator Text Area
    JTextArea calculatorResultTextArea = new JTextArea();


    //Tab Pane
    JTabbedPane tabbedPane = new JTabbedPane();

    //Combo Box
    JComboBox<String> operatorBox = new JComboBox<>();

    public BinaryPanel() {
        this.setLayout(new BorderLayout());
        this.add(tabbedPane);
        displayBinaryConversionMainPanel();
        displayBinaryCalculatorMainPanel();
    }
    private void displayBinaryConversionMainPanel() {

        ///////////////Main Binary Conversion Panel/////////////
        binaryConversionMainPanel.setLayout(new GridLayout(4,1));
        binaryConversionMainPanel.add(conversionTitlePanel);
        binaryConversionMainPanel.add(conversionSubtitlePanel);
        binaryConversionMainPanel.add(conversionComputationPanel);
        binaryConversionMainPanel.add(conversionResultPanel);
        tabbedPane.add("Binary Conversion", binaryConversionMainPanel);

        /////////////Title Panel/////////////
        conversionTitlePanel.setBackground(Color.WHITE);
        conversionTitlePanel.setLayout(new BorderLayout());
        conversionTitleLabel.setText("Binary Conversion");
        conversionTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        conversionTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        conversionTitlePanel.add(conversionTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        conversionSubtitlePanel.setBackground(Color.WHITE);
        conversionSubtitleLabel.setText("Convert Binary values to Decimal values");
        conversionSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        conversionSubtitlePanel.add(conversionSubtitleLabel);

        /////////////Computation Panel/////////////
        conversionComputationPanel.setBackground(Color.WHITE);
        conversionComputationPanel.setLayout(new FlowLayout());
        conversionBinaryValueLabel.setText("Binary value:");
        conversionValueField.setColumns(25);
        conversionEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        conversionEqualsQuestionMarkLabel.setText("= ?");
        convertButton = new JButton("        Convert        ");
        convertButton.addActionListener(e -> {
            Binary binaryValue = new Binary();
            String Value = conversionValueField.getText().trim();


            if (!Value.matches("^[0-1]+$") || Value.length() <= 0) {
                conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                conversionResultTextArea.setForeground(Color.RED);
                conversionResultTextArea.setText("Invalid value! Enter positive Binary values [0s or 1s]!");
            } else {
                binaryValue.convertToDecimal(Value);
                String result = binaryValue.getDecimalValueOfBinary();
                conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                conversionResultTextArea.setForeground(new Color(79, 121, 66));
                conversionResultTextArea.setText("Decimal Value: " + result);
            }

        });                            //ActionListener
        conversionClearButton.setText("      Clear      ");
        conversionClearButton.addActionListener(e->{
            conversionValueField.setText("");
            conversionResultTextArea.setText("");
        });                      //ActionListener
        conversionComputationPanel.add(conversionBinaryValueLabel);
        conversionComputationPanel.add(conversionValueField);
        conversionComputationPanel.add(conversionEqualsQuestionMarkLabel);
        conversionComputationPanel.add(convertButton);
        conversionComputationPanel.add(conversionClearButton);

        //Result Panel
        conversionResultPanel.setBackground(Color.WHITE);
        conversionResultPanel.add(conversionResultTextArea);
    }
    private void displayBinaryCalculatorMainPanel (){

        ///////////////Main Binary Calculator Panel/////////////
        binaryCalculatorMainPanel.setLayout(new GridLayout(4,1));
        binaryCalculatorMainPanel.add(calculatorTitlePanel);
        binaryCalculatorMainPanel.add(calculatorSubtitlePanel);
        binaryCalculatorMainPanel.add(calculatorComputationPanel);
        binaryCalculatorMainPanel.add(calculatorResultPanel);
        tabbedPane.add("Binary Calculator", binaryCalculatorMainPanel);

        /////////////Title Panel/////////////
        calculatorTitlePanel.setBackground(Color.WHITE);
        calculatorTitlePanel.setLayout(new BorderLayout());
        calculatorTitleLabel.setText("Binary Calculator");
        calculatorTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        calculatorTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        calculatorTitlePanel.add(calculatorTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        calculatorSubtitlePanel.setBackground(Color.WHITE);
        calculatorSubtitleLabel.setText("Add, subtract, multiply or divide Binary values");
        calculatorSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        calculatorSubtitlePanel.add(calculatorSubtitleLabel);

        /////////////Computation Panel/////////////
        calculatorComputationPanel.setBackground(Color.WHITE);
        calculatorComputationPanel.setLayout(new FlowLayout());
        calculatorOperandOneField.setColumns(15);
        calculatorOperandTwoField.setColumns(15);
        String [] operators = {"+", "-", "*", "/"};
        operatorBox.setModel(new DefaultComboBoxModel<>(operators));
        calculateButton = new JButton("      Calculate      ");
        calculateButton.addActionListener(e -> {
            Binary binaryValue = new Binary();
            Calculator calculator = new BinaryCalculator();
            Decimal initialDecimalValue = new Decimal();
            Binary operandOne;
            Binary operandTwo;


            String valueOne = calculatorOperandOneField.getText();
            String valueTwo = calculatorOperandTwoField.getText();
            String operator = (String)operatorBox.getSelectedItem();
            String result;

            if(valueOne.matches("^[0-1]+$") && valueTwo.matches("^[0-1]+$")){
                binaryValue.convertToDecimal(valueOne);
                result = binaryValue.getDecimalValueOfBinary();
                operandOne = new Binary(result);
                binaryValue.convertToDecimal(valueTwo);
                result = binaryValue.getDecimalValueOfBinary();
                operandTwo = new Binary(result);
                assert operator != null;
                if((operator.equals("/") && (valueTwo.equals("0")))){
                    calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                    calculatorResultTextArea.setForeground(Color.RED);
                    calculatorResultTextArea.setText("Calculation is invalid!");
                }else {
                    calculator.calculateResult(operandOne, operandTwo, operator);
                    String resultInDecimal = calculator.getResult();
                    initialDecimalValue.convertToBinary(resultInDecimal);
                    result = initialDecimalValue.getBinaryValueOfDecimal();
                    int decimalResult = Integer.parseInt(resultInDecimal);

                    calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                    if (decimalResult >= 0) {
                        calculatorResultTextArea.setForeground(new Color(79, 121, 66));
                        calculatorResultTextArea.setText("Result: " + result);

                    } else {
                        calculatorResultTextArea.setForeground(Color.RED);
                        calculatorResultTextArea.setText("Calculation is invalid!");
                    }
                }

            }
            else{
                calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                calculatorResultTextArea.setForeground(Color.RED);
                calculatorResultTextArea.setText("Invalid value! Enter positive Binary values [0s or 1s]!");
            }

        });                        //ActionListener
        calculatorClearButton.setText("      Clear      ");
        calculatorClearButton.addActionListener(e->{
            calculatorOperandOneField.setText("");
            calculatorOperandTwoField.setText("");
            calculatorResultTextArea.setText("");
        });                    //ActionListener
        calculatorComputationPanel.add(calculatorOperandOneField);
        calculatorComputationPanel.add(operatorBox);
        calculatorComputationPanel.add(calculatorOperandTwoField);
        calculatorComputationPanel.add(calculateButton);
        calculatorComputationPanel.add(calculatorClearButton);

        //Result Panel
        calculatorResultPanel.setBackground(Color.WHITE);
        calculatorResultPanel.add(calculatorResultTextArea);


    }
}
