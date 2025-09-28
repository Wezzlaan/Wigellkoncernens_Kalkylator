import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*=====================================
        * PLACEHOLDER FÖR ATT TESTA FUNKTIONER
        * =====================================*/
        ArrayList<Double> numbers = new ArrayList<>();
        char operator;

        System.out.println("\n[1]: Addition\n[2]: Subtraktion\n[3]: Multiplikation\n[4]: Division\n[5]: Modulus\n[A]: Avsluta.\n ");

        switch (charInput())
        {
            case '1':

                operator = '+';

                fillArrList(numbers);

                printResult(numbers, operator);

                break;

            case '2':

                operator = '-';

                fillArrList(numbers);

                printResult(numbers, operator);

                break;

            case '3':

                operator = '*';

                fillArrList(numbers);

                printResult(numbers, operator);

                break;

            case '4':

                operator = '/';

                fillArrList(numbers);

                printResult(numbers, operator);

                break;

            case '5':

                operator = '%';

                fillArrList(numbers);

                printResult(numbers, operator);

                break;

            case 'A':

                System.out.println(cyanText + "\n=====================");
                System.out.println("Välkommen åter! (◕‿◕) ");
                System.out.println(cyanText + "=====================" + resetText);
                break;

        }

    }

    //HANTERAR INMATNING AV SIFFROR
    public static Double numInput()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("="))
        {
            return null;
        }
        try
        {
            return Double.parseDouble(input); // Omvandlar String till Double.
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException(redText + "FEL: Endast siffror eller '='." + resetText);
        }
    }

    //HANTERAR INMATNING AV CHAR.
    public static char charInput()
    {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().toUpperCase().charAt(0);
    }
    
    public static void printResult(ArrayList<Double> numbers, char operator)
    {
        Calculator calculator = new Calculator(numbers, operator);

        try
        {
            double result = calculator.calculate();
            System.out.println(greenText + "\nResultat: " + result + resetText);
        }
        catch (ArithmeticException e)
        {
            System.out.println(redText + e.getMessage() + resetText);

        }
    }

    public static void fillArrList(ArrayList<Double> numbers)
    {
        while (true)
        {
            System.out.print("\nAnge tal eller '=': ");
            Double input = numInput();

            if (input == null)
            {
                break;
            }
            numbers.add(input);
        }
    }
    
    public static final String redText= "\u001B[91m";
    public static final String resetText = "\u001B[0m";
    public static final String greenText  = "\u001B[92m";
    public static final String cyanText   = "\u001B[96m";
    
}