package phieugiaobaitap_01;

import java.util.Scanner;

/*
@author Nguyễn Văn Phương

Bài 2: Cài đặt và vẽ lưu đồ thuật toán cho chương trình giải phương trình bậc
2, có tính tới nghiệm phức
 */
public class Bai02 {

    private static Scanner sc = new Scanner(System.in);

    public static void giaiPtBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        int delta = (int)(b * b - 4 * a * c);
        float x1;
        float x2;

        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.printf("x1 = %.2f + %.2fi", -b / (2 * a), (Math.sqrt(-delta) / (2 * a)));
            System.out.printf("\nx2 = %.2f - %.2fi",-b / (2 * a), (Math.sqrt(-delta) / (2 * a)));
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = Bai02.sc.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = Bai02.sc.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = sc.nextFloat();
        Bai02.giaiPtBac2(a, b, c);
    }
}
