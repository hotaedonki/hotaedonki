import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		int[] grades = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			grades[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, grades[i]);
		}
		
		double fakeAverage = 0;
		for(int i = 0; i < N; i++) {
			fakeAverage += (double) grades[i] / (double) max * 100.0;
		}
		
		bw.write((fakeAverage / (double) N) + "");
		bw.flush();
	}
}