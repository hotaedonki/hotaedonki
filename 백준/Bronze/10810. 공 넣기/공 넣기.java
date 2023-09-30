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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [N];
		for(int i = 0; i < M; i++) {
			StringTokenizer condition = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(condition.nextToken());
			int second = Integer.parseInt(condition.nextToken());
			int number = Integer.parseInt(condition.nextToken());
			
			for(int j = first; j < second + 1; j++) {
				arr[j - 1] = number; 
			}
		}
		
		for(int a : arr) {
			bw.write(a + " ");
		}
		bw.flush();
		
	}
}
