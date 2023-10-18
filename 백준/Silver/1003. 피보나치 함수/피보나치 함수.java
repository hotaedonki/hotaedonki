import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long[] answer = new long [2];
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            answer = fibo(N);
            bw.write(answer[0] + " " + answer[1] + "\n");
        }
        
        bw.flush();
    }

	public static long[] fibo(int n) {
		long[] fi = {1, 0};
		if(n == 0) return fi;
		if(n == 1) {
			fi[0] = 0;
			fi[1] = 1;
			return fi;
		}
		
		for (int i = 1; i < n + 1; i++) {
			long next = fi[1] + fi[0];
			fi[0] = fi[1];
			fi[1]= next;
		}
		
		return fi;
	}
}