import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = (double)(-sc.nextInt() + sc.nextInt()) / 400;
        double wookJea = 1 / (1 + Math.pow(10, m));

        if (wookJea * Math.pow(10, 20) > 0) System.out.printf("%.20f", wookJea);
        else System.out.printf("%f", wookJea);
    }
}