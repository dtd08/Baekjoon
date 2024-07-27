import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();

        if (!n.remainder(new BigInteger("2")).equals(new BigInteger("0"))) {
            System.out.println("evoLmoCicS");
        } else {
            System.out.println("SciComLove");
        }

    }
}