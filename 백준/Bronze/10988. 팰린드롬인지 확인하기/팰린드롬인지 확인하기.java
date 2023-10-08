import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		sb.append(s).reverse();
		
		if(sb.toString().equals(s)) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
}
