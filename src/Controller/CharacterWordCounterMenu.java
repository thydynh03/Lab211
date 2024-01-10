package Controller;

import Common.AbstractMenu;
import java.util.Map;

public class CharacterWordCounterMenu extends AbstractMenu {

    private CounterController controller;

    public CharacterWordCounterMenu(CounterController controller) {
        this.controller = controller;
    }

    @Override
    public void displayMenu() {
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Dem ki tu");
            System.out.println("2. Dem tu");
            System.out.println("0. Thoat");
            System.out.print("Chon mot lua chon: ");

            choice = getUserChoice(2);

            switch (choice) {
                case 1:
                    controller.performCharacterCount();
                    break;
                case 2:
                    controller.performWordCount();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh. Hen gap lai!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);

        closeScanner();
    }

    @Override
    public int getUserChoice(int numberOfOptions) {
        int choice;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Lua chon khong hop le. Vui long nhap mot so.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 0 || choice > numberOfOptions);

        return choice;
    }
}
