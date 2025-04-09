import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double max = Math.max((double)a/c, (double)b/d);
        if (max%1 > 0) max++;
        
        System.out.println(l - (int)max);
    }
}
