import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger S = new BigInteger("0");

        for (int i = 0; i < 3; i++) {
            int N = sc.nextInt();
            for (int j = 0; j < N; j++){
                S = S.add(new BigInteger(sc.next()));
            }

            int res = S.compareTo(new BigInteger("0"));
            S = S.subtract(S);

            System.out.println((res == 0) ? "0" : (res < 0) ? "-" : "+");
        }
    }
}
