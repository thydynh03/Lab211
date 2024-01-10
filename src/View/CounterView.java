package View;

import java.util.Map;
import java.util.Scanner;

public class CounterView {

    private Scanner scanner;

    public CounterView() {
        scanner = new Scanner(System.in);
    }

    public String getInputString() {
        System.out.print("Enter your content: ");
        return scanner.nextLine();
    }

    public void displayResult(Map<String, Integer> wordCounter, Map<Character, Integer> charCounter) {
        if (wordCounter != null) {
            System.out.println( wordCounter);
        }

        if (charCounter != null) {
            System.out.println( charCounter);
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
