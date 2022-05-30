package circledemo;

import java.util.Scanner;

public class Circle {
    double radius;
    String colorl;
    double hight;

    public double getHight() {
        return radius*radius;
    }


    public double getArea(){
        return Math.PI;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap Ban Kinh: ");
        radius = input.nextFloat();
    }
    public double getRadius() {
        return radius;
    }

    public String getColorl() {
        return colorl;
    }
    public float chuvihinhtron(){
        return (float) (2 * getArea()*radius);
    }


}
