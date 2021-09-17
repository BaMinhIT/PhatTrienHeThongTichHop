package Tuan02;

import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        System.out.println("Nhap vao N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong = "+sum);
    }
}
