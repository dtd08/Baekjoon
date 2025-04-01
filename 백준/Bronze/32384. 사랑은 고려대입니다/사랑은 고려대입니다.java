import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            if (n == 1) System.out.println("LoveisKoreaUniversity");
            else System.out.print("LoveisKoreaUniversity ");

            n--;
        }
    }
}