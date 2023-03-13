package phieugiaobaitap_01;

import java.util.Scanner;

/*
    @author Nguyễn Văn Phương
    Bài 3: Viết chương trình tính n!
 */
public class Bai03 {
    
    public static long GiaiThua(int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
                answer *= i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        n = sc.nextInt();
        System.out.println(n + "! = " + GiaiThua(n) );
    }
}
