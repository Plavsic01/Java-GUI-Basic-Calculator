import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorEngine implements ActionListener  {

    private GUI gui;
    private String firstNumber = "";
    private String operationSymbol = "";
    public CalculatorEngine(GUI gui) {
        this.gui = gui;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        String displayText = gui.getDisplayFieldText();

        String tempNumber = displayText;

        switch (btn.getText()){
            case "0","1","2","3","4","5","6","7","8","9":
                tempNumber += btn.getText();
                gui.setDisplayFieldText(tempNumber);
                break;

            case "+":
                operationSymbol = "+";
                firstNumber = tempNumber;
                tempNumber = "";
                gui.setDisplayFieldText("");
                break;

            case "-":
                operationSymbol = "-";
                firstNumber = tempNumber;
                tempNumber = "";
                gui.setDisplayFieldText("");
                break;

            case "*":
                operationSymbol = "*";
                firstNumber = tempNumber;
                tempNumber = "";
                gui.setDisplayFieldText("");
                break;

            case "/":
                operationSymbol = "/";
                firstNumber = tempNumber;
                tempNumber = "";
                gui.setDisplayFieldText("");
                break;


            case "=":
                String secondNumber = gui.getDisplayFieldText();

                String result = calculation(operationSymbol,firstNumber,secondNumber);
                firstNumber = result;
                gui.setDisplayFieldText(result);
                break;

            case "C":
                gui.setDisplayFieldText("");
                firstNumber = "";
                operationSymbol = "";
                break;
        }


    }

    private String calculation(String operation,String firstNum,String secondNum){

        double result = 0;

        switch (operation){
            case "+":
                result = Double.valueOf(firstNum) + Double.valueOf(secondNum);
                break;

            case "-":
                result = Double.valueOf(firstNum) - Double.valueOf(secondNum);
                break;

            case "*":
                result = Double.valueOf(firstNum) * Double.valueOf(secondNum);
                break;

            case "/":
                result = Double.valueOf(firstNum) / Double.valueOf(secondNum);
                break;

        }

        return Double.toString(result);
    }

}
