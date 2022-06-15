package thuchanhjava;


import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double balance,rate,calculateInterest;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so tien ban muon vay($): ");
        balance= scanner.nextDouble();
        System.out.println("Nhap lai suat ngan hang: ");
        rate=scanner.nextDouble();
        calculateInterest=balance * (rate/1200);
        System.out.println("So tien lai ngan hang($): "+calculateInterest);
    }
}