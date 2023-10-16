import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            int sum2 = i + sum;

            if (sum2 == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
