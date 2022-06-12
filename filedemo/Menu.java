package filedemo;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public static void menu() {
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print student info in descending order or mark");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws IOException {

        ReadFileData read = new ReadFileData();
        Scanner sc = new Scanner(System.in);
        menu();
        read.getEmployee();
        while (true) {
            int choice;
            System.out.println("#: ");
            choice = sc.nextInt();
            if (choice == 1) {
                read.addEmployee();
                menu();
            } else if (choice == 2) {
                menu();
            } else if (choice == 3) {
                read.getEmployeeName();
                menu();
            } else if (choice == 4) {
                read.getEmployeeId();
                menu();
            } else if (choice == 5) {
                read.showList();
                menu();
            } else if (choice == 6) {
                System.exit(0);
            }
        }
    }
}
