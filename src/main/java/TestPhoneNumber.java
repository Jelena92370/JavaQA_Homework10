import java.util.Scanner;

public class TestPhoneNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberChecker numberChecker = new NumberChecker();
        while (true) {
            System.out.println("Please input number : ");
            String input = scanner.nextLine();

            if ("exit".equals(input)) {
                break;
            }
            boolean isCorrect = numberChecker.isCorrectNumber(input);
            System.out.println("The number " + input + " is correct phone number= " + isCorrect);

        }
        }

}

