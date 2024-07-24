import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        for (int j = 0; j < 5; j++) {
            score += sc.nextInt();
        }
        System.out.println(score);
    }
}