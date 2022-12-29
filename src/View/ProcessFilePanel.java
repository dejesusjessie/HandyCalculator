package View;

import Controller.BandwidthCalculator;
import Controller.BinaryCalculator;
import Controller.Calculator;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class ProcessFilePanel extends JPanel {

    //Panel
    JPanel processFileMainPanel = new JPanel();
    JPanel processFileTitlePanel = new JPanel();
    JPanel processFileSubtitlePanel = new JPanel();
    JPanel processFileFileChooserPanel = new JPanel();

    //Label
    JLabel processFileTitleLabel = new JLabel();
    JLabel processFileSubtitleLabel = new JLabel();
    JLabel processFileEnterFileLabel = new JLabel();

    //Button
    JButton processFileUploadButton = new JButton();

    //Text Field
    JTextField processFileUploadValueField = new JTextField();


    public ProcessFilePanel() {
        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());
        this.add(processFileMainPanel);
        displayProcessFileMainPanel();
    }

    private void displayProcessFileMainPanel() {

        ///////////////Main Binary Conversion Panel/////////////
        processFileMainPanel.setBackground(Color.WHITE);
        processFileMainPanel.setLayout(new GridLayout(4, 1));
        processFileMainPanel.add(processFileTitlePanel);
        processFileMainPanel.add(processFileSubtitlePanel);
        processFileMainPanel.add(processFileFileChooserPanel);


        /////////////Title Panel/////////////
        processFileTitlePanel.setBackground(Color.WHITE);
        processFileTitlePanel.setLayout(new BorderLayout());
        processFileTitleLabel.setText("Process File");
        processFileTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        processFileTitleLabel.setFont(new Font("Comic Sans", Font.BOLD, 20));
        processFileTitlePanel.add(processFileTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        processFileSubtitlePanel.setBackground(Color.WHITE);
        processFileSubtitleLabel.setText("Process File");
        processFileSubtitleLabel.setFont(new Font("Comic Sans", Font.ITALIC, 12));
        processFileSubtitlePanel.add(processFileSubtitleLabel);

        ////////////Upload File////////////////
        processFileFileChooserPanel.setBackground(Color.WHITE);
        processFileUploadValueField.setColumns(20);
        processFileEnterFileLabel.setText("Enter File: ");
        processFileUploadButton.setText("Upload File");
        processFileUploadButton.addActionListener(e->{
            Decimal decimalValue = new Decimal();
            Binary binaryValue = new Binary();
            Decimal initialDecimalValue = new Decimal();
            Hexadecimal hexValue = new Hexadecimal();
            Calculator calculator = new BinaryCalculator();
            SizeUnit sizeUnitValue = new SizeUnit();
            RateUnit rateUnitValue = new RateUnit();
            BandwidthCalculator bandwidthCalculator = new BandwidthCalculator();
            FrequencyUnit values = new FrequencyUnit();
            String user;
            String result;
            String valueOne;
            String valueTwo;
            Binary operandOne;
            Binary operandTwo;
            Hexadecimal operandOne1;
            Hexadecimal operandTwo2;
            var userValue = "";
            var userSize = "";
            var userRate = "";
            var userRateUnit = "";
            var userViews = "";
            var userFrequency = "";
            var userPages = "";
            var userRedundancy = "";
            var target = "";
            double GigPerMonth;
            String writeFile = "result.txt";
            String readFile = processFileUploadValueField.getText().trim();
            File input = new File(readFile);
            Scanner scanner = null;
            try {
                scanner = new Scanner(input);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
                String fail = "Error! File Not Found!";
                JOptionPane.showMessageDialog(null,fail);
            }
            PrintStream writer = null;

            try{
                writer = new PrintStream(writeFile);
                while (true) {
                    assert scanner != null;
                    if (!scanner.hasNext()) break;
                    String word = scanner.next();
                    String nextWord = scanner.next();
                    String nextNextWord = scanner.next();
                    String nextNextNextWord = scanner.next();
                    if (word.equalsIgnoreCase("calculate") || word.equalsIgnoreCase("convert")) {
                        if (nextWord.equalsIgnoreCase("binary")) {
                            if (nextNextWord.matches("[-+*/]")) {
                                valueOne = nextNextNextWord;
                                valueTwo = scanner.next();
                                binaryValue.convertToDecimal(valueOne);
                                result = binaryValue.getDecimalValueOfBinary();
                                operandOne = new Binary(result);
                                binaryValue.convertToDecimal(valueTwo);
                                result = binaryValue.getDecimalValueOfBinary();
                                operandTwo = new Binary(result);
                                calculator.calculateResult(operandOne, operandTwo, nextNextWord);
                                result = calculator.getResult();
                                initialDecimalValue.convertToBinary(result);
                                result = initialDecimalValue.getBinaryValueOfDecimal();
                                writer.println("The result of " + valueOne + " " + nextNextWord + " " + valueTwo
                                        + " = " + result);
                            }
                            else if (nextNextWord.equalsIgnoreCase("to")) {
                                if (nextNextNextWord.equalsIgnoreCase("decimal")) {
                                    user = scanner.next();
                                    binaryValue.convertToDecimal(user);
                                    result = binaryValue.getDecimalValueOfBinary();
                                    writer.println("The Binary value of " + user + " in Decimal is: " + result);

                                }
                            }
                        }
                        else if (nextWord.equalsIgnoreCase("hexadecimal")) {
                            if (nextNextWord.matches("[-+*/]")) {
                                valueOne = nextNextNextWord;
                                valueTwo = scanner.next();
                                hexValue.convertToDecimal(valueOne);
                                result = hexValue.getDecimalValueOfHex();
                                operandOne1 = new Hexadecimal(result);
                                hexValue.convertToDecimal(valueTwo);
                                result = hexValue.getDecimalValueOfHex();
                                operandTwo2 = new Hexadecimal(result);
                                calculator.calculateResult(operandOne1, operandTwo2, nextNextWord);
                                result = calculator.getResult();
                                initialDecimalValue.convertToHex(result);
                                result = initialDecimalValue.getHexValueOfDecimal();
                                writer.println("The result of " + valueOne + " " + nextNextWord + " " + valueTwo
                                        + " = " + result);
                            }
                            else if (nextNextWord.equalsIgnoreCase("to")) {
                                String nextAction = scanner.next();
                                if (nextAction.equalsIgnoreCase("decimal")) {
                                    user = scanner.next();
                                    hexValue.convertToDecimal(user);
                                    result = hexValue.getDecimalValueOfHex();
                                    writer.println("The Hexadecimal value of " + user + " in Decimal is: " + result);
                                }
                            }
                        }
                        else if (nextWord.equalsIgnoreCase("decimal")) {
                            if (nextNextWord.equalsIgnoreCase("to")) {
                                if (nextNextNextWord.equalsIgnoreCase("binary")) {
                                    user = scanner.next();
                                    decimalValue.convertToBinary(user);
                                    result = decimalValue.getBinaryValueOfDecimal();
                                    writer.println("The Decimal value of " + user + " in Binary is: " + result);

                                }
                                else if (nextNextNextWord.equalsIgnoreCase("hexadecimal")) {
                                    user = scanner.next();
                                    decimalValue.convertToHex(user);
                                    result = decimalValue.getHexValueOfDecimal();
                                    writer.println("The Decimal value of " + user + " in Hexadecimal is: " + result);
                                }
                            }
                        }
                        else if (nextWord.equalsIgnoreCase("data")) {
                            if (nextNextNextWord.equalsIgnoreCase("to")) {
                                target = scanner.next();
                                userValue = scanner.next();
                                userSize = "bit";
                                sizeUnitValue.convertDataUnit(userValue, userSize, target);
                                result = sizeUnitValue.getConversionValue();
                                writer.println("The data storage of " + userValue + " " + userSize + " is equivalent to " +
                                        result + " " + target);
                            }
                        }
                        else if (nextWord.equalsIgnoreCase("download/upload")) {
                            userValue = nextNextNextWord;
                            userSize = scanner.next();
                            userRate = scanner.next();
                            userRateUnit = scanner.next();
                            bandwidthCalculator.calculateUploadDownloadTime(userValue, userSize, userRate, userRateUnit);
                            result = bandwidthCalculator.getCalculateUploadDownload();
                            writer.println("Download or upload time needed is approximately: " + result);

                        }
                        else if (nextWord.equalsIgnoreCase("website")) {
                            if (nextNextWord.equalsIgnoreCase("bandwidth")) {
                                userViews = nextNextNextWord;
                                String userIgnore = scanner.next();
                                userFrequency = userIgnore + " " + scanner.next();
                                userPages = scanner.next();
                                userSize = scanner.next();
                                userRedundancy = scanner.next();

                                values.websiteBandwidth(userViews, userFrequency, userPages, userSize, userRedundancy);
                                GigPerMonth = values.getBandwidthCalculation();
                                result = String.valueOf(GigPerMonth * 8000 / 2.628e+6); //Megabit per month
                                writer.println("With redundancy factor of " + userRedundancy + ", the bandwidth needed is appox." +
                                        result + " Mbit/s or " + GigPerMonth + " GB per month");
                            }
                        }
                        else if (nextWord.equalsIgnoreCase("monthly")) {
                            if (nextNextWord.equalsIgnoreCase("usage")) {
                                scanner.next();
                                userValue = scanner.next();
                                userSize = scanner.next();
                                userRate = scanner.next();
                                rateUnitValue.convertMonthlyToRateUnit(userValue, userSize, userRate);
                                result = rateUnitValue.getConversionMonthlyValue();
                                writer.println("The rate of " + userValue + " " + userSize + " is approx. " + result +
                                        " " + userRate);
                            }
                        }

                    }
                }
            }
            catch (Exception ignored){
                String success = "File successfully processed!\n File saved in source folder: result.txt ";
                JOptionPane.showMessageDialog(null,success);
            }

            assert writer != null;
            writer.close();



        });
        processFileFileChooserPanel.add(processFileEnterFileLabel);
        processFileFileChooserPanel.add(processFileUploadValueField);
        processFileFileChooserPanel.add(processFileUploadButton);



    }
}