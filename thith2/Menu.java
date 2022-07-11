package thith2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choiceNumber;
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("1. Add book records");
            System.out.println("2. Save");
            System.out.println("3. Display book records");
            System.out.println("4. Exit");

            do {
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 4));

            switch (choiceNumber) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("You choose the exit function. Bye!");
                    System.exit(0);
                    break;
            }
        }
    }
}
