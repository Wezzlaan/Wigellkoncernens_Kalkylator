import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*=====================================
        * PLACEHOLDER FÖR ATT TESTA FUNKTIONER
        * =====================================*/
        ArrayList<Double> numbers = new ArrayList<Double>();
        double result;

        //Lägger till tal i ArrayList
        numbers.add(9.0);
        numbers.add(3.0);
        //numbers.add(0.0);

        char operator = '/';

        Calculator calculator = new Calculator(numbers, operator);

        try {
            result = calculator.calculate();
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}