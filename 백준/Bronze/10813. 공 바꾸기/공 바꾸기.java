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
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			StringTokenizer change = new StringTokenizer(br.readLine());
			int one = Integer.parseInt(change.nextToken());
			int two = Integer.parseInt(change.nextToken());
			bubble(arr, one - 1 , two - 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		
	}
	
	public static int[] bubble(int[] arr, int one, int two) {
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
		
		return arr;	
	}
}
