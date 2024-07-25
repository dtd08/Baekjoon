import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double W = sc.nextDouble();
        double H = sc.nextDouble();

        System.out.println(Math.round((W * H / 2) * 10) / 10.0);
    }
}