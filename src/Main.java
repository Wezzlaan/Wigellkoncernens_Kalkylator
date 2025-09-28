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
        double result;
        char operator;

        System.out.println("\n[1]: Addition\n[2]: Subtraktion\n[3]: Multiplikation\n[4]: Division\n[5]: Modulus\n[A]: Avsluta. ");

        switch (charInput())
        {
            case '1':
                operator = '+';
                while (true)
                {
                    System.out.print("Ange tal eller '=': ");
                    Double input = numInput();

                    if (input == null)
                    {
                        break;
                    }
                    numbers.add(input);

                }
                //KALKYLERING
                Calculator calculator = new Calculator(numbers, operator);

                try
                {
                    result = calculator.calculate();
                    System.out.println(result);

                    //System.out.println((int) result); //FÖR MODULUS
                }
                catch (ArithmeticException e)
                {
                    System.out.println(e.getMessage());

                }
                break;

            case '2':
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

    public static final String redText= "\u001B[91m";
    public static final String resetText = "\u001B[0m";
}