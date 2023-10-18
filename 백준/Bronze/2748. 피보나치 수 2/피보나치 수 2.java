import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));
    }
	
	public static long fibo(int n) {
		if(n <= 1) return n;
		
		long prev = 0;
		long curr = 1;
		
		for (int i = 1; i < n; i++) {
			long next = prev + curr;
			prev = curr;
			curr = next;
		}
		
		return curr;
	}
}