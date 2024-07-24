import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static BigInteger factorial(int start, int end) {
        BigInteger result = BigInteger.valueOf(start);

        if (start < end) { // n으로 0이나 1이 들어오면 1이 반환됨
            int mid = (start + end) / 2;
            result = factorial(start, mid).multiply(factorial(mid+1, end));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(1, N));
    }
}
