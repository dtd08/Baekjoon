import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // 과자 가격
        int n = sc.nextInt(); // 과자 개수
        int m = sc.nextInt(); // 가진 돈

        int giveMe = k * n - m;

        System.out.println(Math.max(giveMe, 0));
    }
}