package View;

import Controller.BandwidthCalculator;
import Model.FrequencyUnit;
import Model.RateUnit;
import Model.SizeUnit;
import javax.swing.*;
import java.awt.*;

public class BandwidthPanel extends JPanel{

    //-------------------------------Panels--------------------------------//

    //Data Unit Converter Panels
    JPanel dataUnitConverterMainPanel = new JPanel();
    JPanel dataUnitConverterTitlePanel = new JPanel();
    JPanel dataUnitConverterSubtitlePanel = new JPanel();
    JPanel dataUnitConverterComputationPanel = new JPanel();
    JPanel dataUnitConverterResultPanel = new JPanel();


    //Hosting Bandwidth Converter Panel
    JPanel hostingBandwidthConverterMainPanel = new JPanel();
    JPanel hostingBandwidthConverterTitlePanel = new JPanel();
    JPanel hostingBandwidthConverterSubtitlePanel = new JPanel();
    JPanel hostingBandwidthConverterComputationPanel = new JPanel();
    JPanel hostingBandwidthConverterResultPanel = new JPanel();

    //Download/Upload Time Calculator Panel
    JPanel downloadUploadTimeCalculatorMainPanel = new JPanel();
    JPanel downloadUploadTimeCalculatorTitlePanel = new JPanel();
    JPanel downloadUploadTimeCalculatorSubtitlePanel = new JPanel();
    JPanel downloadUploadTimeCalculatorComputationPanel = new JPanel();
    JPanel downloadUploadTimeCalculatorResultPanel= new JPanel();

    //Website Bandwidth Calculator Panel
    JPanel websiteBandwidthCalculatorMainPanel = new JPanel();
    JPanel websiteBandwidthCalculatorTitlePanel = new JPanel();
    JPanel websiteBandwidthCalculatorSubtitlePanel = new JPanel();
    JPanel websiteBandwidthCalculatorComputationPanel = new JPanel();
    JPanel websiteBandwidthCalculatorResultPanel = new JPanel();

    //-------------------------------Labels--------------------------------//
    //Data Converter Label
    JLabel dataUnitConverterTitleLabel = new JLabel();
    JLabel dataUnitConverterSubtitleLabel = new JLabel();
    JLabel dataUnitConverterEqualsQuestionMarkLabel = new JLabel();
    JLabel dataUnitConverterToLabel = new JLabel();


    //Hosting Bandwidth Converter Label
    JLabel hostingBandwidthConverterTitleLabel = new JLabel();
    JLabel hostingBandwidthConverterSubtitleLabel = new JLabel();
    JLabel hostingBandwidthConverterMonthlyUsageLabel = new JLabel();
    JLabel hostingBandwidthConverterBandwidthLabel = new JLabel();
    JLabel hostingBandwidthConverterEqualsQuestionMarkLabel = new JLabel();


    //Download/Upload Time Calculator Label
    JLabel downloadUploadTimeCalculatorTitleLabel = new JLabel();
    JLabel downloadUploadTimeCalculatorSubtitleLabel = new JLabel();
    JLabel downloadUploadTimeCalculatorFileSizeLabel = new JLabel();
    JLabel downloadUploadTimeCalculatorBandwidthLabel = new JLabel();
    JLabel downloadUploadTimeCalculatorResultLabel = new JLabel();

    //Website Bandwidth Calculator Label
    JLabel websiteBandwidthCalculatorTitleLabel = new JLabel();
    JLabel websiteBandwidthCalculatorSubtitleLabel = new JLabel();
    JLabel websiteBandwidthCalculatorPageViewsLabel = new JLabel();
    JLabel websiteBandwidthCalculatorAveragePageSizeLabel = new JLabel();
    JLabel websiteBandwidthCalculatorRedundancyFactorLabel = new JLabel();
    JLabel websiteBandwidthCalculatorResultLabel = new JLabel();


    //-----------------------------Text Fields--------------------------------//

    //Data Converter Text Field
    JTextField dataUnitConverterSizeValueField = new JTextField();

    //Hosting Bandwidth Converter Field
    JTextField hosingBandwidthConverterMonthlyValueField = new JTextField();
    JTextField hosingBandwidthConverterBandwidthValueField = new JTextField();

    //Download/Upload Time Calculator Field
    JTextField downloadUploadTimeCalculatorFileSizeValueField = new JTextField();
    JTextField downloadUploadTimeCalculatorBandwidthValueField = new JTextField();

    //Website Bandwidth Calculator Field
    JTextField websiteBandwidthCalculatorPageViewsField = new JTextField();
    JTextField websiteBandwidthCalculatorAveragePageSizeField = new JTextField();
    JTextField websiteBandwidthCalculatorRedundancyFactorField = new JTextField();

    //-----------------------------Text Fields--------------------------------//

    //Data Converter Text Button
    JButton dataUnitConverterConvertButton = new JButton();
    JButton dataUnitConverterClearButton = new JButton();

    //Hosting Bandwidth Converter Button
    JButton hostingBandwidthConverterCalculateButton = new JButton();
    JButton hostingBandwidthConverterClearButton = new JButton();

    //Download/Upload Time Calculator Button
    JButton downloadUploadTimeCalculatorCalculateButton = new JButton();
    JButton downloadUploadTimeCalculatorClearButton = new JButton();

    //Website Bandwidth Calculator Button
    JButton websiteBandwidthCalculatorCalculateButton = new JButton();
    JButton websiteBandwidthCalculatorClearButton = new JButton();

    //------------------------------Combo Box---------------------------------//

    //Data converter combo box
    JComboBox<Object> dataUnitConverterSizeValueComboBox = new JComboBox<>();
    JComboBox<String> dataUnitConverterSizeValueComboBox2 = new JComboBox<>();

    //Hosting Bandwidth converter combo box
    JComboBox<Object> hostingBandwidthConverterSizeUnitComboBox = new JComboBox<>();
    JComboBox<Object> hostingBandwidthConverterRateUnitComboBox = new JComboBox<>();

    //Download/Upload Time Calculator combo box
    JComboBox<Object> downloadUploadTimeCalculatorFileSizeUnitComboBox = new JComboBox<>();
    JComboBox<Object> downloadUploadTimeCalculatorBandwidthValueUnitComboBox = new JComboBox<>();

    //Website Bandwidth Calculator combo box
    JComboBox<Object> websiteBandwidthCalculatorPageViewsComboBox = new JComboBox<>();
    JComboBox<Object> websiteBandwidthCalculatorPageSizeUnitValueUnitComboBox = new JComboBox<>();

    //------------------------------Text Area---------------------------------//

    //Data converter combo box
    JTextArea dataUnitConverterTextArea = new JTextArea();

    //Hosting Bandwidth converter combo box
    JTextArea hostingBandwidthConverterTextArea = new JTextArea();

    //Tab Pane
    JTabbedPane tabbedPane = new JTabbedPane();

    public BandwidthPanel(){
        this.setLayout(new BorderLayout());
        this.add(tabbedPane);
        displayDataUnitConverterPanel();
        displayHostingBandwidthConverterPanel();
        displayDownloadUploadTimeCalculatorPanel();
        displayWebsiteBandwidthCalculatorPanel();

    }

    private void displayDataUnitConverterPanel() {

        ///////////////Main Data Unit Conversion Panel/////////////
        dataUnitConverterMainPanel.setLayout(new GridLayout(4,1));
        dataUnitConverterMainPanel.add(dataUnitConverterTitlePanel);
        dataUnitConverterMainPanel.add(dataUnitConverterSubtitlePanel);
        dataUnitConverterMainPanel.add(dataUnitConverterComputationPanel);
        dataUnitConverterMainPanel.add(dataUnitConverterResultPanel);
        dataUnitConverterMainPanel.revalidate();
        tabbedPane.add("Data Unit Converter", dataUnitConverterMainPanel);

        /////////////Title Panel/////////////
        dataUnitConverterTitlePanel.setBackground(Color.WHITE);
        dataUnitConverterTitlePanel.setLayout(new BorderLayout());
        dataUnitConverterTitleLabel.setText("Data Unit Converter");
        dataUnitConverterTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dataUnitConverterTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        dataUnitConverterTitlePanel.add(dataUnitConverterTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        dataUnitConverterSubtitlePanel.setBackground(Color.WHITE);
        dataUnitConverterSubtitleLabel.setText("Conversion between different units of data size");
        dataUnitConverterSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        dataUnitConverterSubtitlePanel.add(dataUnitConverterSubtitleLabel);

        /////////////Computation Panel/////////////
        dataUnitConverterComputationPanel.setBackground(Color.WHITE);
        dataUnitConverterComputationPanel.setLayout(new FlowLayout());
        dataUnitConverterSizeValueField.setColumns(10);
        String [] convertTo = {"bits","kilobits", "megabits","gigabits", "terabits","Bytes",
                "Kilobytes", "Megabytes","Gigabytes", "Terabytes"};
        dataUnitConverterEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        dataUnitConverterSizeValueComboBox.setModel(new DefaultComboBoxModel<>(convertTo));
        dataUnitConverterToLabel.setText("to");
        dataUnitConverterSizeValueComboBox2.setModel(new DefaultComboBoxModel<>(convertTo));
        dataUnitConverterSizeValueComboBox.setSelectedIndex(5);
        dataUnitConverterEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        dataUnitConverterEqualsQuestionMarkLabel.setText("= ?");
        dataUnitConverterConvertButton = new JButton("        Convert        ");
        dataUnitConverterSizeValueComboBox.addItemListener(e->{
            String userSize = (String)dataUnitConverterSizeValueComboBox.getSelectedItem();
            String target = (String)dataUnitConverterSizeValueComboBox2.getSelectedItem();
            assert userSize != null;

            dataUnitConverterSizeValueComboBox2.setEnabled(!userSize.equals(target));

        });
        dataUnitConverterConvertButton.addActionListener(e -> {
            SizeUnit sizeUnitValue = new SizeUnit();
            String userValue = dataUnitConverterSizeValueField.getText().trim();
            String userSize = (String)dataUnitConverterSizeValueComboBox.getSelectedItem();
            String target = (String)dataUnitConverterSizeValueComboBox2.getSelectedItem();
            String result = "";

            assert userSize != null;


            if(userSize.equals(target)){
                dataUnitConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                dataUnitConverterTextArea.setForeground(new Color(79, 121, 66));
                result = "Result: " + userValue + " " + userSize + " equals " + userValue;
            }
            if(userValue.length()>0) {
                int value = Integer.parseInt(userValue);
                if(!(value < 0)) {
                    sizeUnitValue.convertDataUnit(userValue, target, userSize);
                    dataUnitConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                    dataUnitConverterTextArea.setForeground(new Color(79, 121, 66));
                    result = "Result: " + userValue + " " + target + " = " + sizeUnitValue.getConversionValue()
                    + " " + userSize;
                }
                else{
                    dataUnitConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                    dataUnitConverterTextArea.setForeground(Color.RED);
                    result = "Invalid Entry! Positive values only!";
                }
            }else if(userValue.equals("")){
                dataUnitConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                dataUnitConverterTextArea.setForeground(Color.RED);
                result = "Invalid Entry! Enter numeric value!";
            }
            dataUnitConverterTextArea.setText(result);

        });                            //ActionListener
        dataUnitConverterClearButton.setText("      Clear      ");
        dataUnitConverterClearButton.addActionListener(e->{
            dataUnitConverterSizeValueField.setText("");
            dataUnitConverterTextArea.setText("");
        });                                 //ActionListener
        dataUnitConverterComputationPanel.add(dataUnitConverterSizeValueField);
        dataUnitConverterComputationPanel.add(dataUnitConverterSizeValueComboBox2);
        dataUnitConverterComputationPanel.add(dataUnitConverterToLabel);
        dataUnitConverterComputationPanel.add(dataUnitConverterSizeValueComboBox);
        dataUnitConverterComputationPanel.add(dataUnitConverterEqualsQuestionMarkLabel);
        dataUnitConverterComputationPanel.add(dataUnitConverterConvertButton);
        dataUnitConverterComputationPanel.add(dataUnitConverterClearButton);

        //Result Panel
        dataUnitConverterResultPanel.setBackground(Color.WHITE);
        dataUnitConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
        dataUnitConverterTextArea.setForeground(new Color(79, 121, 66));
        dataUnitConverterResultPanel.add(dataUnitConverterTextArea);

        tabbedPane.add("Data Unit Converter", dataUnitConverterMainPanel);
    }
    private void displayHostingBandwidthConverterPanel() {

        ///////////////Main Binary Conversion Panel/////////////
        hostingBandwidthConverterMainPanel.setLayout(new GridLayout(4,1));
        hostingBandwidthConverterMainPanel.add(hostingBandwidthConverterTitlePanel);
        hostingBandwidthConverterMainPanel.add(hostingBandwidthConverterSubtitlePanel);
        hostingBandwidthConverterMainPanel.add(hostingBandwidthConverterComputationPanel);
        hostingBandwidthConverterMainPanel.add(hostingBandwidthConverterResultPanel);
        tabbedPane.add("Binary Conversion", hostingBandwidthConverterMainPanel);

        /////////////Title Panel/////////////
        hostingBandwidthConverterTitlePanel.setBackground(Color.WHITE);
        hostingBandwidthConverterTitlePanel.setLayout(new BorderLayout());
        hostingBandwidthConverterTitleLabel.setText("Hosting Bandwidth Conversion");
        hostingBandwidthConverterTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hostingBandwidthConverterTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        hostingBandwidthConverterTitlePanel.add(hostingBandwidthConverterTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        hostingBandwidthConverterSubtitlePanel.setBackground(Color.WHITE);
        hostingBandwidthConverterSubtitleLabel.setText("Convert between monthly data usage and its equivalent bandwidth");
        hostingBandwidthConverterSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        hostingBandwidthConverterSubtitlePanel.add(hostingBandwidthConverterSubtitleLabel);

        /////////////Computation Panel////////////
        hostingBandwidthConverterComputationPanel.setBackground(Color.WHITE);
        FlowLayout flow = new FlowLayout();
        hostingBandwidthConverterComputationPanel.setLayout(flow);
        flow.setHgap(0);
        flow.setVgap(0);
        hostingBandwidthConverterMonthlyUsageLabel.setText("Monthly usage: ");
        hosingBandwidthConverterMonthlyValueField.setColumns(20);
        String [] conversionOne = {"Bytes", "Kilobytes", "Megabytes","Gigabytes", "Terabytes"};
        hostingBandwidthConverterEqualsQuestionMarkLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        hostingBandwidthConverterSizeUnitComboBox.setModel(new DefaultComboBoxModel<>(conversionOne));
        String [] conversionTwo  = {"Bit/s", "Kbit/s", "MBit/s","Gbit/s", "Tbit/s"};
        hostingBandwidthConverterBandwidthLabel.setText("Bandwidth: ");
        hosingBandwidthConverterBandwidthValueField.setColumns(20);
        hostingBandwidthConverterRateUnitComboBox.setModel(new DefaultComboBoxModel<>(conversionTwo));
        hostingBandwidthConverterCalculateButton = new JButton("        Convert        ");
        hostingBandwidthConverterCalculateButton.addActionListener(e -> {
            RateUnit rateUnitValue = new RateUnit();
            String userSizeValue = hosingBandwidthConverterMonthlyValueField.getText().trim();
            String userRateValue = hosingBandwidthConverterBandwidthValueField.getText().trim();
            String userSize = (String)hostingBandwidthConverterSizeUnitComboBox.getSelectedItem();
            String userRate = (String)hostingBandwidthConverterRateUnitComboBox.getSelectedItem();
            String result;

            if(!(userSizeValue.isEmpty()) && (userSizeValue.matches("[0-9]+"))){
                rateUnitValue.convertMonthlyToRateUnit(userSizeValue, userSize, userRate);
                result = rateUnitValue.getConversionMonthlyValue();
                hostingBandwidthConverterTextArea.setFont(new Font("Comic Sans", Font.BOLD, 11));
                hostingBandwidthConverterTextArea.setForeground(new Color(79, 121, 66));
                hostingBandwidthConverterTextArea.setText("Result: " + userSizeValue + " " + userSize +
                        " per month is equivalent to " + result + " " + userRate);
            }
            else if(!(userRateValue.isEmpty()) && (userSizeValue.matches("[0-9]+"))) {
                rateUnitValue.convertRateUnitToMonthly(userRateValue, userRate, userSize);
                result = rateUnitValue.getConversionRateUnit();
                hostingBandwidthConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 11));
                hostingBandwidthConverterTextArea.setForeground(new Color(79, 121, 66));
                hostingBandwidthConverterTextArea.setText("Result: " + userRateValue + " " + userRate +
                        " is equivalent to " + result + " " + userSize + " per month.");
            }
            else{
                hostingBandwidthConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 12));
                hostingBandwidthConverterTextArea.setForeground(Color.RED);
                hostingBandwidthConverterTextArea.setText("Invalid Entry. Enter positive numeric values!");
            }




        });                            //ActionListener
        hostingBandwidthConverterClearButton.setText("      Clear      ");
        hostingBandwidthConverterClearButton.addActionListener(e->{
            hosingBandwidthConverterMonthlyValueField.setText("");
            hosingBandwidthConverterBandwidthValueField.setText("");
            hostingBandwidthConverterTextArea.setText("");
        });                               //ActionListener
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterMonthlyUsageLabel);
        hostingBandwidthConverterComputationPanel.add(hosingBandwidthConverterMonthlyValueField);
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterSizeUnitComboBox);
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterBandwidthLabel);
        hostingBandwidthConverterComputationPanel.add(hosingBandwidthConverterBandwidthValueField);
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterRateUnitComboBox);
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterCalculateButton);
        hostingBandwidthConverterComputationPanel.add(hostingBandwidthConverterClearButton);

        //Result Panel
        hostingBandwidthConverterResultPanel.setBackground(Color.WHITE);
        hostingBandwidthConverterTextArea.setFont(new Font("Comic Sans",Font.BOLD, 11));
        hostingBandwidthConverterTextArea.setForeground(new Color(79, 121, 66));
        hostingBandwidthConverterResultPanel.add(hostingBandwidthConverterTextArea);

        tabbedPane.add("Hosting Bandwidth Converter", hostingBandwidthConverterMainPanel);
    }
    private void displayDownloadUploadTimeCalculatorPanel() {

        ///////////////Main Download/Upload Time Calculator Panel/////////////
        downloadUploadTimeCalculatorMainPanel.setLayout(new GridLayout(4,1));
        downloadUploadTimeCalculatorMainPanel.add(downloadUploadTimeCalculatorTitlePanel);
        downloadUploadTimeCalculatorMainPanel.add(downloadUploadTimeCalculatorSubtitlePanel);
        downloadUploadTimeCalculatorMainPanel.add(downloadUploadTimeCalculatorComputationPanel);
        downloadUploadTimeCalculatorMainPanel.add(downloadUploadTimeCalculatorResultPanel);
        tabbedPane.add("Binary Conversion", downloadUploadTimeCalculatorMainPanel);

        /////////////Title Panel/////////////
        downloadUploadTimeCalculatorTitlePanel.setBackground(Color.WHITE);
        downloadUploadTimeCalculatorTitlePanel.setLayout(new BorderLayout());
        downloadUploadTimeCalculatorTitleLabel.setText("Download/Upload Time Calculator");
        downloadUploadTimeCalculatorTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        downloadUploadTimeCalculatorTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        downloadUploadTimeCalculatorTitlePanel.add(downloadUploadTimeCalculatorTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        downloadUploadTimeCalculatorSubtitlePanel.setBackground(Color.WHITE);
        downloadUploadTimeCalculatorSubtitleLabel.setText("Calculates download/upload time");
        downloadUploadTimeCalculatorSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        downloadUploadTimeCalculatorSubtitlePanel.add(downloadUploadTimeCalculatorSubtitleLabel);

        /////////////Computation Panel/////////////
        downloadUploadTimeCalculatorComputationPanel.setBackground(Color.WHITE);
        FlowLayout flow = new FlowLayout();
        downloadUploadTimeCalculatorComputationPanel.setLayout(flow);
        flow.setVgap(0);
        flow.setHgap(0);
        downloadUploadTimeCalculatorFileSizeLabel.setText("          File Size: ");
        downloadUploadTimeCalculatorFileSizeValueField.setColumns(20);
        String [] conversionOne = {"Bytes", "Kilobytes", "Megabytes","Gigabytes", "Terabytes"};
        downloadUploadTimeCalculatorFileSizeUnitComboBox.setModel(new DefaultComboBoxModel<>(conversionOne));
        downloadUploadTimeCalculatorBandwidthLabel.setText("Bandwidth: ");
        downloadUploadTimeCalculatorBandwidthValueField.setColumns(20);
        String [] conversionTwo  = {"Bit/s", "Kbit/s", "MBit/s","Gbit/s", "Tbit/s"};
        downloadUploadTimeCalculatorBandwidthValueUnitComboBox.setModel(new DefaultComboBoxModel<>(conversionTwo));
        downloadUploadTimeCalculatorCalculateButton = new JButton("        Calculate        ");
        downloadUploadTimeCalculatorCalculateButton.addActionListener(e -> {
            BandwidthCalculator bandwidthCalculator = new BandwidthCalculator();
            String fileSize = downloadUploadTimeCalculatorFileSizeValueField.getText().trim();
            String fileSizeUnit = (String)downloadUploadTimeCalculatorFileSizeUnitComboBox.getSelectedItem();
            String bandwidth = downloadUploadTimeCalculatorBandwidthValueField.getText().trim();
            String bandwidthUnit = (String)downloadUploadTimeCalculatorBandwidthValueUnitComboBox.getSelectedItem();
            String result;

            if(!(fileSize.isEmpty()) && fileSize.matches("[0-9]+")) {
                if (bandwidth.matches("[0-9]+") && !(bandwidth.isEmpty())) {
                    assert fileSizeUnit != null;
                    bandwidthCalculator.calculateUploadDownloadTime(fileSize, fileSizeUnit, bandwidth, bandwidthUnit);
                    result = bandwidthCalculator.getCalculateUploadDownload();
                    downloadUploadTimeCalculatorResultLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
                    downloadUploadTimeCalculatorResultLabel.setForeground(new Color(79, 121, 66));
                    downloadUploadTimeCalculatorResultLabel.setText("Download/Upload Time needed is: ~" + result);
                }
            }else {
                downloadUploadTimeCalculatorResultLabel.setFont(new Font("Comic Sans", Font.BOLD, 12));
                downloadUploadTimeCalculatorResultLabel.setForeground(Color.RED);
                downloadUploadTimeCalculatorResultLabel.setText("Invalid Entry. Please enter positive number values!");
            }


        });                            //ActionListener
        downloadUploadTimeCalculatorClearButton.setText("      Clear      ");
        downloadUploadTimeCalculatorClearButton.addActionListener(e->{
            downloadUploadTimeCalculatorFileSizeValueField.setText("");
            downloadUploadTimeCalculatorBandwidthValueField.setText("");
            downloadUploadTimeCalculatorResultLabel.setText("");

        });                      //ActionListener
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorFileSizeLabel);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorFileSizeValueField);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorFileSizeUnitComboBox);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorBandwidthLabel);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorBandwidthValueField);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorBandwidthValueUnitComboBox);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorCalculateButton);
        downloadUploadTimeCalculatorComputationPanel.add(downloadUploadTimeCalculatorClearButton);

        //Result Panel
        downloadUploadTimeCalculatorResultPanel.setBackground(Color.WHITE);
        downloadUploadTimeCalculatorResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        downloadUploadTimeCalculatorResultLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
        downloadUploadTimeCalculatorResultLabel.setForeground(new Color(79, 121, 66));
        downloadUploadTimeCalculatorResultPanel.add(downloadUploadTimeCalculatorResultLabel);

        tabbedPane.add("Download/Upload Time Calculator", downloadUploadTimeCalculatorMainPanel);
    }
    private void displayWebsiteBandwidthCalculatorPanel() {

        ///////////////Main Binary Conversion Panel/////////////
        websiteBandwidthCalculatorMainPanel.setLayout(new GridLayout(4,1));
        websiteBandwidthCalculatorMainPanel.add(websiteBandwidthCalculatorTitlePanel);
        websiteBandwidthCalculatorMainPanel.add(websiteBandwidthCalculatorSubtitlePanel);
        websiteBandwidthCalculatorMainPanel.add(websiteBandwidthCalculatorComputationPanel);
        websiteBandwidthCalculatorMainPanel.add(websiteBandwidthCalculatorResultPanel);
        tabbedPane.add("Website Bandwidth Calculator", websiteBandwidthCalculatorMainPanel);

        /////////////Title Panel/////////////
        websiteBandwidthCalculatorTitlePanel.setBackground(Color.WHITE);
        websiteBandwidthCalculatorTitlePanel.setLayout(new BorderLayout());
        websiteBandwidthCalculatorTitleLabel.setText("Website Bandwidth Calculator");
        websiteBandwidthCalculatorTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        websiteBandwidthCalculatorTitleLabel.setFont(new Font("Comic Sans",Font.BOLD, 20));
        websiteBandwidthCalculatorTitlePanel.add(websiteBandwidthCalculatorTitleLabel, BorderLayout.SOUTH);


        /////////////Subtitle Panel/////////////
        websiteBandwidthCalculatorSubtitlePanel.setBackground(Color.WHITE);
        websiteBandwidthCalculatorSubtitleLabel.setText("Converts between monthly data usage and its equivalent bandwidth");
        websiteBandwidthCalculatorSubtitleLabel.setFont(new Font("Comic Sans",Font.ITALIC, 12));
        websiteBandwidthCalculatorSubtitlePanel.add(websiteBandwidthCalculatorSubtitleLabel);

        /////////////Computation Panel/////////////
        websiteBandwidthCalculatorComputationPanel.setBackground(Color.WHITE);
        FlowLayout flow = new FlowLayout();
        websiteBandwidthCalculatorComputationPanel.setLayout(flow);
        flow.setHgap(3);
        flow.setVgap(0);
        websiteBandwidthCalculatorPageViewsLabel.setText("           Page views: ");
        websiteBandwidthCalculatorPageViewsField.setColumns(15);
        String [] frequency = {"Per Second", "Per Minute", "Per Hour","Per Day", "Per Week","Per Month","Per Year"};
        websiteBandwidthCalculatorPageViewsComboBox.setModel(new DefaultComboBoxModel<>(frequency));
        websiteBandwidthCalculatorAveragePageSizeLabel.setText("     Average Page Size: ");
        websiteBandwidthCalculatorAveragePageSizeField.setColumns(15);
        String [] conversion = {"Bytes", "Kilobytes", "Megabytes","Gigabytes", "Terabytes"};
        websiteBandwidthCalculatorPageSizeUnitValueUnitComboBox.setModel(new DefaultComboBoxModel<>(conversion));
        websiteBandwidthCalculatorRedundancyFactorLabel.setText("Redundancy Factor: ");
        websiteBandwidthCalculatorRedundancyFactorField.setColumns(5);
        websiteBandwidthCalculatorCalculateButton = new JButton("Convert");
        websiteBandwidthCalculatorCalculateButton.addActionListener(e -> {

            FrequencyUnit values = new FrequencyUnit();
            String pageViews = websiteBandwidthCalculatorPageViewsField.getText().trim();
            String frequencyUnit = (String)websiteBandwidthCalculatorPageViewsComboBox.getSelectedItem();
            String averagePageSize = websiteBandwidthCalculatorAveragePageSizeField.getText().trim();
            String averagePageSizeUnit = (String)websiteBandwidthCalculatorPageSizeUnitValueUnitComboBox.getSelectedItem();
            String redundancyFactor = websiteBandwidthCalculatorRedundancyFactorField.getText().trim();
            double GigPerMonth;
            String result;

            if(!(pageViews.isEmpty()) && pageViews.matches("[0-9]+")) {
                if (averagePageSize.matches("[0-9]+") && !(averagePageSize.isEmpty())) {
                    if (redundancyFactor.matches("[0-9]+") && !(redundancyFactor.isEmpty())) {
                        int redundancy = Integer.parseInt(redundancyFactor);
                        if (redundancy >0) {
                            values.websiteBandwidth(pageViews, frequencyUnit, averagePageSize, averagePageSizeUnit, redundancyFactor);
                            GigPerMonth = values.getBandwidthCalculation();
                            result = String.valueOf(GigPerMonth * 8000 / 2.628e+6); //Megabit per month
                            websiteBandwidthCalculatorResultLabel.setFont(new Font("Comic Sans", Font.BOLD, 12));
                            websiteBandwidthCalculatorResultLabel.setForeground(new Color(79, 121, 66));
                            websiteBandwidthCalculatorResultLabel.setText("Bandwidth need is: ~" + result + " Mbit/s or ~" + GigPerMonth
                                    + " GB per month.");
                        }else{
                            websiteBandwidthCalculatorResultLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
                            websiteBandwidthCalculatorResultLabel.setForeground(Color.RED);
                            websiteBandwidthCalculatorResultLabel.setText("Redundancy value must be > 0!");

                        }
                    }
                }
            }else{
                websiteBandwidthCalculatorResultLabel.setFont(new Font("Comic Sans",Font.BOLD, 12));
                websiteBandwidthCalculatorResultLabel.setForeground(Color.RED);
                websiteBandwidthCalculatorResultLabel.setText("Invalid Entry! Enter positive numeric values!");
            }

        });                            //ActionListener
        websiteBandwidthCalculatorClearButton.setText("Clear");
        websiteBandwidthCalculatorClearButton.addActionListener(e->{
            websiteBandwidthCalculatorPageViewsField.setText("");
            websiteBandwidthCalculatorAveragePageSizeField.setText("");
            websiteBandwidthCalculatorRedundancyFactorField.setText("");
            websiteBandwidthCalculatorResultLabel.setText("");

        });                      //ActionListener
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorPageViewsLabel);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorPageViewsField);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorPageViewsComboBox);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorAveragePageSizeLabel);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorAveragePageSizeField);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorPageSizeUnitValueUnitComboBox);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorRedundancyFactorLabel);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorRedundancyFactorField);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorCalculateButton);
        websiteBandwidthCalculatorComputationPanel.add(websiteBandwidthCalculatorClearButton);

        //Result Panel
        websiteBandwidthCalculatorResultPanel.setBackground(Color.WHITE);
        websiteBandwidthCalculatorResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        websiteBandwidthCalculatorResultPanel.add(websiteBandwidthCalculatorResultLabel);

        tabbedPane.add("Website Bandwidth Calculator", websiteBandwidthCalculatorMainPanel);
    }




}
