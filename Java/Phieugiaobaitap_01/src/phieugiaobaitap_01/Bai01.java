package phieugiaobaitap_01;

import java.util.Scanner;

/*
@author Nguyễn Văn Phương

Bài 1: Cài đặt và vẽ lưu đồ thuật toán cho chương trình kiểm tra một số n có
phải nguyên tố hay không?
 */
public class Bai01 {

    public static boolean songuyento(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        n = sc.nextInt();

        if (songuyento(n)) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không phải là số nguyên tố");
        }

    }

}
