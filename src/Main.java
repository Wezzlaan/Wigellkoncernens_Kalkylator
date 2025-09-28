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
        numbers.add(10.1);
        numbers.add(1.0);
        //numbers.add(0.0);

        char operator = '%';

        Calculator calculator = new Calculator(numbers, operator);

        try {
            result = calculator.calculate();
            System.out.println((int) result);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
}