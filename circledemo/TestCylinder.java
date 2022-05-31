package circledemo;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String args[]){
        Circle circle=new Circle();
        Cylinder cd= new Cylinder();
        int choose;
        Scanner input= new Scanner(System.in);
        do{
            showMenu();
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Chu vi hinh tron: "+circle.chuvihinhtron());
                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:System.out.println("Nhap Sai!");
                break;
            }
        }while (choose != 3);
    }
    static void showMenu(){
        System.out.println(" ");
        System.out.println("Choose: ");
    }

}
