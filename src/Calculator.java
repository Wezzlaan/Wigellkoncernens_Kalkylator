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
}