package Tuan02;

import java.util.Scanner;

/**
 * bai02
 */
public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("\nNhap n: ");
        n = scanner.nextInt();
        int dem =0;
        for (int i = 2; i < n; i++) {
            if(n%i==0) 
                dem++;
        }
        if(dem==0) {
            System.out.println(n + " la so nguyen to\n");
        }
        else {
            System.out.println(n + " ko phai so nguyen to\n");
        }
    }
    
}