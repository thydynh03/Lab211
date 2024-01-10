package Common;

import java.util.Scanner;

public abstract class AbstractMenu {

    protected Scanner scanner;

    public AbstractMenu() {
        scanner = new Scanner(System.in);
    }

    public abstract void displayMenu();

    public abstract int getUserChoice(int numberOfOptions);

    public void closeScanner() {
        scanner.close();
    }
}
