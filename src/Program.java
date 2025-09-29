import java.util.ArrayList;

public class Program {

    ArrayList<Double> numbers = new ArrayList<>();
    char operator;

    public void runProgram() {

        boolean isOperating = true;

        while (isOperating) {

            MenuMethods.mainMenu();

            switch (MenuMethods.charInput()) {
                case '1':

                    operator = '+';

                    MenuMethods.fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        MenuMethods.printResult(numbers, operator);
                    }
                    isOperating = MenuMethods.terminateContinue();

                    break;

                case '2':

                    operator = '-';

                    MenuMethods.fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        MenuMethods.printResult(numbers, operator);
                    }

                    isOperating = MenuMethods.terminateContinue();

                    break;

                case '3':

                    operator = '*';

                    MenuMethods.fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        MenuMethods.printResult(numbers, operator);
                    }

                    isOperating = MenuMethods.terminateContinue();

                    break;

                case '4':

                    operator = '/';

                    MenuMethods.fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        MenuMethods.printResult(numbers, operator);
                    }

                    isOperating = MenuMethods.terminateContinue();

                    break;

                case '5':

                    operator = '%';

                    MenuMethods.fillArrList(numbers, operator);

                    if (!numbers.isEmpty()) {
                        MenuMethods.printResult(numbers, operator);
                    }

                    isOperating = MenuMethods.terminateContinue();

                    break;

                case 'A':

                    isOperating = false;
                    MenuMethods.shutdownMsg();
                    break;

                default:

                    System.out.println(MenuMethods.redText + "FEL: Välj ett val ur listan.");

            }
        }
    }
}
