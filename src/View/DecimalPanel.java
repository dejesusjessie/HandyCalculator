package View;

import Controller.BinaryCalculator;
import Controller.Calculator;
import Model.Binary;
import Model.Decimal;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class DecimalPanel extends JPanel {

    //Conversion Panels
    JPanel decimalConversionMainPanel = new JPanel();
    JPanel conversionTitlePanel = new JPanel();
    JPanel conversionSubtitlePanel = new JPanel();
    JPanel conversionComputationPanel = new JPanel();
    JPanel conversionResultPanel = new JPanel();


    //Calculation Panels
    JPanel decimalCalculatorMainPanel = new JPanel();
    JPanel calculatorTitlePanel = new JPanel();
    JPanel calculatorSubtitlePanel = new JPanel();
    JPanel calculatorComputationPanel = new JPanel();
    JPanel calculatorResultPanel = new JPanel();


    //Conversion Labels
    JLabel conversionTitleLabel = new JLabel();
    JLabel conversionSubtitleLabel = new JLabel();
    JLabel conversionDecimalValue = new JLabel();
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
    JComboBox<String> conversionBox = new JComboBox<>();
    JComboBox<String> operatorBox = new JComboBox<>();

    public DecimalPanel() {
        this.setLayout(new BorderLayout());

        this.add(tabbedPane);
        displayDecimalConversionMainPanel();
        displayDecimalCalculatorMainPanel();
    }
    private void displayDecimalConversionMainPanel() {

        ///////////////Main Decimal Conversion Panel/////////////
        decimalConversionMainPanel.setLayout(new GridLayout(4,1));
        decimalConversionMainPanel.add(conversionTitlePanel);
        decimalConversionMainPanel.add(conversionSubtitlePanel);
        decimalConversionMainPanel.add(conversionComputationPanel);
        decimalConversionMainPanel.add(conversionResultPanel);
        tabbedPane.add("Decimal Conversion", decimalConversionMainPanel);

        /////////////Title Panel/////////////
        conversionTitlePanel.setBackground(Color.WHITE);
        conversionTitlePanel.setLayout(new BorderLayout());
        conversionTitleLabel.setText("Decimal Conversion");
        conversionTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        conversionTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        conversionTitlePanel.add(conversionTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        conversionSubtitlePanel.setBackground(Color.WHITE);
        conversionSubtitleLabel.setText("Convert Decimal values to Binary or Hexadecimal values");
        conversionSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        conversionSubtitlePanel.add(conversionSubtitleLabel);

        /////////////Computation Panel/////////////
        conversionComputationPanel.setBackground(Color.WHITE);
        conversionComputationPanel.setLayout(new FlowLayout());
        conversionDecimalValue.setText("Decimal value:");
        conversionValueField.setColumns(15);
        String [] convertTo = {"To Binary", "To Hexadecimal"};
        conversionBox.setModel(new DefaultComboBoxModel<>(convertTo));
        conversionEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        conversionEqualsQuestionMarkLabel.setText("= ?");
        convertButton = new JButton("        Convert        ");
        convertButton.addActionListener(e -> {
            Decimal decimalValue = new Decimal();
            String value = conversionValueField.getText().trim();
            String selected = (String)conversionBox.getSelectedItem();
            String result;

            if(!(value.equals(""))){
                switch(Objects.requireNonNull(selected)){
                    case "To Hexadecimal"->{
                        if(value.matches("^[0-1]+$")){
                            decimalValue.convertToHex(value);
                            result = decimalValue.getHexValueOfDecimal();
                            conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                            conversionResultTextArea.setForeground(new Color(79, 121, 66));
                            conversionResultTextArea.setText("Hexadecimal Value: " + result);
                        }else{
                            conversionResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                            conversionResultTextArea.setForeground(Color.RED);
                            conversionResultTextArea.setText("Enter hexadecimal values! [0-9] [A-F]");
                        }
                    }
                    case "To Binary"->{
                        if(value.matches("^[0-9a-fA-F]+$")){
                            decimalValue.convertToBinary(value);
                            result = decimalValue.getBinaryValueOfDecimal();
                            conversionResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                            conversionResultTextArea.setForeground(new Color(79, 121, 66));
                            conversionResultTextArea.setText("Binary Value: " + result);
                        }else{
                            conversionResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                            conversionResultTextArea.setForeground(Color.RED);
                            conversionResultTextArea.setText("Invalid value! Enter positive Binary values [0s or 1s]!");
                        }
                    }
                    default -> {}
                }
            }else{
                conversionResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                conversionResultTextArea.setForeground(Color.RED);
                conversionResultTextArea.setText("Invalid Entry. Enter values!");
            }




        });                            //ActionListener
        conversionClearButton.setText("      Clear      ");
        conversionClearButton.addActionListener(e->{
            conversionValueField.setText("");
            conversionResultTextArea.setText("");
        });                      //ActionListener
        conversionComputationPanel.add(conversionDecimalValue);
        conversionComputationPanel.add(conversionValueField);
        conversionComputationPanel.add(conversionBox);
        conversionComputationPanel.add(conversionEqualsQuestionMarkLabel);
        conversionComputationPanel.add(convertButton);
        conversionComputationPanel.add(conversionClearButton);

        //Result Panel
        conversionResultPanel.setBackground(Color.WHITE);
        conversionResultPanel.add(conversionResultTextArea);


    }
    private void displayDecimalCalculatorMainPanel (){

        ///////////////Main Decimal Calculator Panel/////////////
        decimalCalculatorMainPanel.setLayout(new GridLayout(4,1));
        decimalCalculatorMainPanel.add(calculatorTitlePanel);
        decimalCalculatorMainPanel.add(calculatorSubtitlePanel);
        decimalCalculatorMainPanel.add(calculatorComputationPanel);
        decimalCalculatorMainPanel.add(calculatorResultPanel);
        tabbedPane.add("Decimal Calculator", decimalCalculatorMainPanel);

        /////////////Title Panel/////////////
        calculatorTitlePanel.setBackground(Color.WHITE);
        calculatorTitlePanel.setLayout(new BorderLayout());
        calculatorTitleLabel.setText("Decimal Calculator");
        calculatorTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        calculatorTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        calculatorTitlePanel.add(calculatorTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        calculatorSubtitlePanel.setBackground(Color.WHITE);
        calculatorSubtitleLabel.setText("Add, subtract, multiply or divide Decimal values");
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
            Calculator calculator = new BinaryCalculator();
            Binary operandOne;
            Binary operandTwo;
            String valueOne = calculatorOperandOneField.getText();
            String valueTwo = calculatorOperandTwoField.getText();
            String operator = (String)operatorBox.getSelectedItem();
            String result;

            if(!(valueOne.equals(""))||!(valueTwo.equals(""))) {
                operandOne = new Binary(valueOne);
                operandTwo = new Binary(valueTwo);
                assert operator != null;
                if ((operator.equals("/") && (valueTwo.equals("0")))) {
                    calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                    calculatorResultTextArea.setForeground(Color.RED);
                    calculatorResultTextArea.setText("Invalid Calculation! Try Again!");
                } else {
                    calculator.calculateResult(operandOne, operandTwo, operator);
                    result = calculator.getResult();
                    calculatorResultTextArea.setText("Result: " + result);
                }
            }else{
                calculatorResultTextArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
                calculatorResultTextArea.setForeground(Color.RED);
                calculatorResultTextArea.setText("Invalid Entry. Please enter numeric values!");
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
        calculatorResultTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
        calculatorResultTextArea.setForeground(new Color(79, 121, 66));
        calculatorResultPanel.add(calculatorResultTextArea);


    }
}
