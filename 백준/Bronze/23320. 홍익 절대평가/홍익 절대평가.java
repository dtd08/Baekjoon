import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        int [] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] xy = br.readLine().split(" ");

        int idx = 0;
        int cnt = 0;
        while (idx < N) {
            if (A[idx++] < Integer.parseInt(xy[1])) cnt++;
        }

        System.out.println((N * Integer.parseInt(xy[0]) / 100) + " " + (A.length-cnt));

        br.close();
    }
}

/* gpt가 짜 준 더 간결한 코드

    int threshold = Integer.parseInt(xy[1]);
    long cnt = Arrays.stream(A).filter(x -> x >= threshold).count();

    System.out.println((N * Integer.parseInt(xy[0]) / 100) + " " + cnt);
 */