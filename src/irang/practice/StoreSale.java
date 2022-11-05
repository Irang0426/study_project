package irang.practice;

import java.util.Scanner;

public class StoreSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int answer = 0;
        if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }

        System.out.println("지불할 금액은 " + answer + "원 입니다.");
    }
}
