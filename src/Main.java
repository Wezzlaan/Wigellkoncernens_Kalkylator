import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*=====================================
        * PLACEHOLDER FÖR ATT TESTA FUNKTIONER
        * =====================================*/
        ArrayList<Double> numbers = new ArrayList<>();
        char operator;

        boolean isOperating = true;

        while (isOperating) {

            mainMenu();

            switch (charInput()) {
                case '1':

                    operator = '+';

                    fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        printResult(numbers, operator);
                    }
                    isOperating = terminateContinue();

                    break;

                case '2':

                    operator = '-';

                    fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        printResult(numbers, operator);
                    }

                    isOperating = terminateContinue();

                    break;

                case '3':

                    operator = '*';

                    fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        printResult(numbers, operator);
                    }

                    isOperating = terminateContinue();

                    break;

                case '4':

                    operator = '/';

                    fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        printResult(numbers, operator);
                    }

                    isOperating = terminateContinue();

                    break;

                case '5':

                    operator = '%';

                    fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        printResult(numbers, operator);
                    }

                    isOperating = terminateContinue();

                    break;

                case 'A':

                    isOperating = false;
                    break;

                default:

                    System.out.println(redText + "FEL: Välj ett val ur listan.");

            }
        }

    }

    //HANTERAR INMATNING AV SIFFROR
    public static Double numInput()
    {
        String input = scanner.nextLine().trim();

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
            throw new NumberFormatException(redText + "FEL: Endast siffror eller '='. OBS: Använd '.' för decimal." + resetText);
        }
    }

    //HANTERAR INMATNING AV CHAR.
    public static char charInput()
    {
        String input = scanner.nextLine().trim();

        if (input.isEmpty())
        {
            throw new IllegalArgumentException("Du måste skriva något.");
        }

        return input.toUpperCase().charAt(0);
    }
    
    public static void printResult(ArrayList<Double> numbers, char operator)
    {
        Calculator calculator = new Calculator(numbers, operator);

        try
        {
            double result = calculator.calculate();
            System.out.println(greenText + "\nResultat: " + cyanText + result + resetText);
        }
        catch (ArithmeticException e)
        {
            System.out.println(redText + e.getMessage() + resetText);

        }
    }

    public static void fillArrList(ArrayList<Double> numbers, char operator)
    {
        numbers.clear();

        System.out.println(blueText + "\n===================================");
        System.out.println("            [" + getOperator(operator) + "]");
        System.out.println(blueText + "===================================" + resetText);

        System.out.println(darkYellowText + "När du är klar med dina siffror, \nange '=' för resultat av uträkning." + resetText);

        while (true)
        {
            try {
                System.out.print("\nAnge tal eller '=': ");
                Double input = numInput();

                if (input == null) {
                    break;
                }
                numbers.add(input);
            } catch (Exception e) {
                System.out.println(redText + e.getMessage() + resetText);
            }
        }
    }

    public static void mainMenu()
    {
        System.out.println(cyanText + "===================================");
        System.out.println(greenText + "         || KALKYLATOR ||           ");
        System.out.println(cyanText + "===================================" + resetText);
        System.out.println(darkYellowText + "Välj ett räknesätt och skriv sedan in \nde talen du vill ha med i uträkningen: ");
        System.out.println(blueText + "\n         [1]: Addition" +
                           cyanText + "\n         [2]: Subtraktion" +
                           greenText + "\n         [3]: Multiplikation" +
                           yellowText + "\n         [4]: Division" +
                           whiteText + "\n         [5]: Modulus" +
                           redText + "\n         [A]: Avsluta" + resetText);

        System.out.print("\nSkriv här: ");
    }

    public static String getOperator(char operator)
    {
        switch (operator)
        {
            case '+':
                return "ADDITION";
            case '-':
                return "SUBTRAKTION";
            case '*':
                return "MULTIPLIKATION";
            case '/':
                return "DIVISION";
            case '%':
                return "MODULUS";
            default:
                return null;
        }
    }

    public static boolean terminateContinue()
    {
        System.out.print("\nVill du " + greenText + "[F]ortsätta" + resetText +
                            " eller " + redText + "[A]vsluta? " + resetText + "Ange f/a: ");
        char choice = charInput();

        if (choice == 'F')
        {
            return true;
        }
        else if (choice == 'A')
        {
            shutdown();
            return false;
        }
        else
        {
            throw new IllegalArgumentException("Ogiltigt val.");
        }

    }

    public static void shutdown()
    {
        System.out.println(cyanText + "\n=====================");
        System.out.println("Välkommen åter! (◕‿◕) ");
        System.out.println(cyanText + "=====================" + resetText);
    }


    public static final String redText= "\u001B[91m";
    public static final String resetText = "\u001B[0m";
    public static final String greenText  = "\u001B[92m";
    public static final String cyanText   = "\u001B[96m";
    public static final String blueText   = "\u001B[94m";
    public static final String yellowText = "\u001B[93m";
    public static final String whiteText  = "\u001B[97m";
    public static final String darkYellowText = "\u001B[33m";
}