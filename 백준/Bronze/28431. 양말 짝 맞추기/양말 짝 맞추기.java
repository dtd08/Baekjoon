import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> socks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String sock = sc.next();
            if (socks.contains(sock)) socks.remove(sock);
            else socks.add(sock);
        }
        System.out.println(socks.get(0));
    }
}