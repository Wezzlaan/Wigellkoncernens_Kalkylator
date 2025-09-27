import java.util.ArrayList;

public class Calculator {

    private ArrayList<Double> numbers = new ArrayList<Double>();
    private char operator;

    Calculator(ArrayList<Double> numbers, char operator)
    {
        this.numbers = numbers;
        this.operator = operator;
    }

    public double calculate()
    {
        switch (operator)
        {
            case '+':
                return add();
            case '-':
                return subtract();
            case '*':
                return multiply();
            case '/':
                return divide();
            default:
                throw new IllegalArgumentException("Ogiltig operator: " + operator);
        }
    }

    public double add()
    {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++)
        {
            sum += numbers.get(i);
        }
        return sum;
    }

    public double subtract()
    {
        double difference = numbers.get(0); //Initieras difference till 0 så blir exempelvis uträkningen fel. Exempel: 2 - 2 räknas ut som 0 - 2 - 2. Svaret blir -4 istället för 0.

        for (int i = 1; i < numbers.size(); i++) //i = 1 eftersom första värdet i array redan är initierat i difference.
        {
            difference -= numbers.get(i);
        }
        return difference;
    }

    public double multiply()
    {
        double product = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            product *= numbers.get(i);
        }
        return product;
    }

    public double divide()
    {
        double quotient = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            double current = numbers.get(i); //Håller nuvarande tal i ArrayList för att kunna kollas för '0'.

            if (current == 0.0) { //Man kan ej dividera med 0.
                throw new ArithmeticException("Division med 0 är ej möjligt.");
            }

            quotient /= current;

        }
        return quotient;
    }
}