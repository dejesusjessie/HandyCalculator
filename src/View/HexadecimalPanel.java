package View;

import Controller.BinaryCalculator;
import Controller.Calculator;
import Model.Hexadecimal;
import Model.Decimal;


import javax.swing.*;
import java.awt.*;

public class HexadecimalPanel extends JPanel {

    //Conversion Panels
    JPanel hexadecimalConversionMainPanel = new JPanel();
    JPanel conversionTitlePanel = new JPanel();
    JPanel conversionSubtitlePanel = new JPanel();
    JPanel conversionComputationPanel = new JPanel();
    JPanel conversionResultPanel = new JPanel();


    //Calculation Panels
    JPanel hexadecimalCalculatorMainPanel = new JPanel();
    JPanel calculatorTitlePanel = new JPanel();
    JPanel calculatorSubtitlePanel = new JPanel();
    JPanel calculatorComputationPanel = new JPanel();
    JPanel calculatorResultPanel = new JPanel();


    //Conversion Labels
    JLabel conversionTitleLabel = new JLabel();
    JLabel conversionSubtitleLabel = new JLabel();
    JLabel conversionHexadecimalValueLabel = new JLabel();
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

    public HexadecimalPanel(){
        this.setLayout(new BorderLayout());
        this.add(tabbedPane);
        displayHexadecimalConversionMainPanel();
        displayHexadecimalCalculatorMainPanel();
    }

    private void displayHexadecimalConversionMainPanel() {

        ///////////////Main hexadecimal Conversion Panel/////////////
        hexadecimalConversionMainPanel.setLayout(new GridLayout(4,1));
        hexadecimalConversionMainPanel.add(conversionTitlePanel);
        hexadecimalConversionMainPanel.add(conversionSubtitlePanel);
        hexadecimalConversionMainPanel.add(conversionComputationPanel);
        hexadecimalConversionMainPanel.add(conversionResultPanel);
        tabbedPane.add("Hexadecimal Conversion", hexadecimalConversionMainPanel);

        /////////////Title Panel/////////////
        conversionTitlePanel.setBackground(Color.WHITE);
        conversionTitlePanel.setLayout(new BorderLayout());
        conversionTitleLabel.setText("Hexadecimal Conversion");
        conversionTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        conversionTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        conversionTitlePanel.add(conversionTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        conversionSubtitlePanel.setBackground(Color.WHITE);
        conversionSubtitleLabel.setText("Convert Hexadecimal values to Decimal values");
        conversionSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        conversionSubtitlePanel.add(conversionSubtitleLabel);

        /////////////Computation Panel/////////////
        conversionComputationPanel.setBackground(Color.WHITE);
        conversionComputationPanel.setLayout(new FlowLayout());
        conversionHexadecimalValueLabel.setText("Hexadecimal value:");
        conversionValueField.setColumns(25);
        conversionEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        conversionEqualsQuestionMarkLabel.setText("= ?");
        convertButton = new JButton("        Convert        ");
        convertButton.addActionListener(e -> {
            Hexadecimal hexValue = new Hexadecimal();
            String value = conversionValueField.getText().trim();

            if(value.matches("^[0-9a-fA-F]+$")){
                hexValue.convertToDecimal(value);
                String result = hexValue.getDecimalValueOfHex();
                conversionResultTextArea.setText("Decimal Value: " + result);
            } else{
                conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                conversionResultTextArea.setForeground(Color.RED);
                conversionResultTextArea.setText("Invalid value! Enter hexadecimal values! [0-9] [A-F]");
            }
        });                            //ActionListener
        conversionClearButton.setText("      Clear      ");
        conversionClearButton.addActionListener(e->{
            conversionValueField.setText("");
            conversionResultTextArea.setText("");
        });                      //ActionListener
        conversionComputationPanel.add(conversionHexadecimalValueLabel);
        conversionComputationPanel.add(conversionValueField);
        conversionComputationPanel.add(conversionEqualsQuestionMarkLabel);
        conversionComputationPanel.add(convertButton);
        conversionComputationPanel.add(conversionClearButton);

        //Result Panel
        conversionResultPanel.setBackground(Color.WHITE);
        conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
        conversionResultTextArea.setForeground(new Color(79, 121, 66));
        conversionResultPanel.add(conversionResultTextArea);


    }
    private void displayHexadecimalCalculatorMainPanel (){

        ///////////////Main hexadecimal Calculator Panel/////////////
        hexadecimalCalculatorMainPanel.setLayout(new GridLayout(4,1));
        hexadecimalCalculatorMainPanel.add(calculatorTitlePanel);
        hexadecimalCalculatorMainPanel.add(calculatorSubtitlePanel);
        hexadecimalCalculatorMainPanel.add(calculatorComputationPanel);
        hexadecimalCalculatorMainPanel.add(calculatorResultPanel);
        tabbedPane.add("Hexadecimal Calculator", hexadecimalCalculatorMainPanel);

        /////////////Title Panel/////////////
        calculatorTitlePanel.setBackground(Color.WHITE);
        calculatorTitlePanel.setLayout(new BorderLayout());
        calculatorTitleLabel.setText("Hexadecimal Calculator");
        calculatorTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        calculatorTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        calculatorTitlePanel.add(calculatorTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        calculatorSubtitlePanel.setBackground(Color.WHITE);
        calculatorSubtitleLabel.setText("Add, subtract, multiply or divide Hexadecimal values");
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
            Hexadecimal hexValue = new Hexadecimal();
            Calculator calculator = new BinaryCalculator();
            Decimal initialDecimalValue = new Decimal();
            Hexadecimal operandOne;
            Hexadecimal operandTwo;


            String valueOne = calculatorOperandOneField.getText().trim();
            String valueTwo = calculatorOperandTwoField.getText().trim();
            String operator = (String) operatorBox.getSelectedItem();
            String result;

            if (!valueOne.matches("^[0-9a-fA-F]+$") || !valueTwo.matches("^[0-9a-fA-F]+$")) {
                calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                calculatorResultTextArea.setForeground(Color.RED);
                calculatorResultTextArea.setText("Invalid value! Enter hexadecimal values! [0-9] [A-F]");
            } else {
                hexValue.convertToDecimal(valueOne);
                result = hexValue.getDecimalValueOfHex();
                operandOne = new Hexadecimal(result);
                hexValue.convertToDecimal(valueTwo);
                result = hexValue.getDecimalValueOfHex();
                operandTwo = new Hexadecimal(result);
                assert operator != null;
                if((operator.equals("/") && (valueTwo.equals("0")))){
                    calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                    calculatorResultTextArea.setForeground(Color.RED);
                    calculatorResultTextArea.setText("Calculation is invalid!");
                }else {
                    calculator.calculateResult(operandOne, operandTwo, operator);
                    String resultInDecimal = calculator.getResult();
                    initialDecimalValue.convertToHex(resultInDecimal);
                    result = initialDecimalValue.getHexValueOfDecimal();
                    int decimalResult = Integer.parseInt(resultInDecimal);


                    calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                    if (decimalResult >= 0) {
                        calculatorResultTextArea.setForeground(new Color(79, 121, 66));
                        calculatorResultTextArea.setText("Result: " + result);
                    }else{
                        calculatorResultTextArea.setForeground(Color.RED);
                        calculatorResultTextArea.setText("Calculation is invalid!");
                    }
                }
            }


        });                        //ActionListener
        calculatorClearButton.setText("      Clear      ");
        calculatorClearButton.addActionListener(e->{
            calculatorOperandOneField.setText("");
            calculatorOperandTwoField.setText("");
            calculatorResultTextArea.setText("");
        });                    //ActionLister
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
