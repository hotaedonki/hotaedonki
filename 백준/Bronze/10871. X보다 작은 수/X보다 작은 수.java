import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer nx = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nx.nextToken());
		int X = Integer.parseInt(nx.nextToken());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int token = Integer.parseInt(st.nextToken());
			if(token < X) {
				sb.append(token + " ");
			}
		}
		System.out.print(sb.substring(0, sb.length()-1));
	}
}