import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String[] uos = {"U", "O", "S"};

        System.out.println(uos[(x-1)%3]);
    }
}