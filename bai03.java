package Tuan02;

import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPhuong trinh bac 2 co dang:");
        System.out.println("ax^2+bx+c=0");
        float a, b, c;
        System.out.println("nhap vao a:");
        a = scanner.nextFloat();
        System.out.println("nhap vao b:");
        b = scanner.nextFloat();
        System.out.println("nhap vao c:");
        c = scanner.nextFloat();
        if(a==0) {
            if(b==0) {
                System.out.println("PT co vo so nghiem");
            }
            else {
                System.out.println("PT co mot nghiem x=" + -c/b);
            }
        }
        else {
            float denta = b*b-4*a*c;
            if(denta<0) {
                System.out.println("PT vo nghiem");
            }
            else if (denta==0) {
                System.out.println("Phuong trinh co nghiem kep x1= x2 = "+ -b/2*a);
            }
            else {
                System.out.println("PT co 2 nghiem");
                float x1 = -b+(float)Math.sqrt(denta)/2*a;
                float x2 = -b-(float)Math.sqrt(denta)/2*a;
                System.out.printf("x1=%.3f\nx2= %.3f \n", x1, x2);
            }
        }
    }
}
