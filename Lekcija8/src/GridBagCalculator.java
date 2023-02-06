import javax.swing.*;

public class GridBagCalculator extends JFrame {

    public static void main(String[] args) {
        new GridBagCalculator();
    }

    public GridBagCalculator(){

        add(new GUI());
        setSize(400,400);
        setPreferredSize(getSize());
        setTitle("Calculator");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
