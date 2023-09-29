import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int one = Integer.parseInt(st.nextToken());
		int two = Integer.parseInt(st.nextToken());	
		int three = Integer.parseInt(st.nextToken());

		int prize;
		
		if(one == two && two == three) 
			prize = 10000 + one * 1000;
		else if(one == two || one == three) 
			prize = 1000 + one * 100;
		else if(two == three) 
			prize = 1000 + two * 100;
		else 
			prize = Math.max(one, Math.max(two, three)) * 100;
		
		System.out.print(prize);
	}
}
