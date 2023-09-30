import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int [9];
		
		for(int i = 1; i < 10; i++) {
			int cnt = Integer.parseInt(br.readLine());
			map.put(cnt, i);
			arr[i-1] = cnt;	
		}
		
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[8]) + "\n");
		bw.write(String.valueOf(map.get(arr[8])));
		
		bw.flush();
	}
}