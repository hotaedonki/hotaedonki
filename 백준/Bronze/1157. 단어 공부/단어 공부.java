import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] alp = new int [26];
		String s = br.readLine().toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			alp[s.charAt(i) - 65]++;
		}
		
		int max = 0;
		char result = '?';
		for (int i = 0; i < alp.length; i++) {
		    if (alp[i] > max) {
		        max = alp[i];
		        result = (char) ('A' + i);
		    } else if (alp[i] == max) {
		        result = '?'; 
		    }
		}
		
		System.out.print(result);
	}
}
