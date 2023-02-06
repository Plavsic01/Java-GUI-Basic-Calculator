import javax.swing.*;
import java.awt.*;


public class GUI extends JPanel {

    private JTextField displayField;
    private JButton button0;
    private JButton button2;
    private JButton button3;
    private JButton button1;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonEqual;

    private JButton buttonDivision;
    private JButton buttonMultiply;
    private JButton buttonClear;

    private JButton buttonSubtraction;
    private JButton buttonAddition;
    GridBagConstraints gbc = new GridBagConstraints();

    public GUI(){
        setLayout(new GridBagLayout());
        displayField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.gridheight = 1;
        gbc.gridwidth = 5;

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;

        add(displayField,gbc);

        button7 = new JButton("7");
        gbc.gridx = 0;
        gbc.gridy = 1;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        add(button7,gbc);

        button8 = new JButton("8");
        gbc.gridx = 1;
        gbc.gridy = 1;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button8,gbc);

        button9 = new JButton("9");
        gbc.gridx = 2;
        gbc.gridy = 1;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button9,gbc);

        buttonDivision = new JButton("/");
        gbc.gridx = 3;
        gbc.gridy = 1;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(buttonDivision,gbc);


        button4 = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 2;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button4,gbc);

        button5 = new JButton("5");
        gbc.gridx = 1;
        gbc.gridy = 2;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button5,gbc);

        button6 = new JButton("6");
        gbc.gridx = 2;
        gbc.gridy = 2;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button6,gbc);

        buttonMultiply = new JButton("*");
        gbc.gridx = 3;
        gbc.gridy = 2;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(buttonMultiply,gbc);

        buttonClear = new JButton("C");
        gbc.gridx = 4;
        gbc.gridy = 1;

        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        add(buttonClear,gbc);


        button1 = new JButton("1");
        gbc.gridx = 0;
        gbc.gridy = 3;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button1,gbc);


        button2 = new JButton("2");
        gbc.gridx = 1;
        gbc.gridy = 3;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button2,gbc);

        button3 = new JButton("3");
        gbc.gridx = 2;
        gbc.gridy = 3;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(button3,gbc);


        buttonSubtraction = new JButton("-");
        gbc.gridx = 3;
        gbc.gridy = 3;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(buttonSubtraction,gbc);


        buttonEqual = new JButton("=");
        gbc.gridx = 4;
        gbc.gridy = 3;

        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        add(buttonEqual,gbc);


        button0 = new JButton("0");
        gbc.gridx = 0;
        gbc.gridy = 4;

        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        add(button0,gbc);



        buttonAddition = new JButton("+");
        gbc.gridx = 3;
        gbc.gridy = 4;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(buttonAddition,gbc);

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);

        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);



        buttonAddition.addActionListener(calculatorEngine);
        buttonSubtraction.addActionListener(calculatorEngine);
        buttonMultiply.addActionListener(calculatorEngine);
        buttonDivision.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonClear.addActionListener(calculatorEngine);

    }

    public JTextField getDisplayField(){
        return displayField;
    }
    public String getDisplayFieldText() {
        return displayField.getText();
    }

    public void setDisplayFieldText(String displayField) {
        this.displayField.setText(displayField);
    }

}
