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
        numbers.add(2.0);
        numbers.add(5.0);
        numbers.add(-3.2);

        char operator = '*';

        Calculator calculator = new Calculator(numbers, operator);

        result = calculator.calculate();

        System.out.println(result);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}