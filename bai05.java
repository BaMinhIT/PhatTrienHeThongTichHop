package Tuan02;

import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang:");
        int n = sc.nextInt();
        

        float a[]= new float[n]; // Khai báo mảng a gồm n phần tử số nguyên
                System.out.println("Nhap n phan tu cua mang: ");

        for(int i=0;i<n;i++) {
            a[i]= sc.nextFloat();      // Gán giá trị cho từng phần tử trong mảng
        }
        float sum = 0;
        System.out.println("Mang vua nhap: ");
        for(int i=0;i<n;i++)  {           // Dùng vòng lặp for, in các phần tử ra màn hình
            System.out.printf("%.2f \n",a[i]);
            if (a[i]>0) {
                sum = sum +a[i];
            } 
        }
        System.out.printf("Tong cac so > 0 = %.2f \n", sum);

    
    }
}
