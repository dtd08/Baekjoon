import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = new BigInteger(sc.next()); // 가로
        BigInteger m = new BigInteger(sc.next()); // 세로

        System.out.println(n.multiply(m).divide(new BigInteger("2")));
    }
}
