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
        int cnt = 0;
        
        for(int i = 0; i < T; i++) {
        	String s = br.readLine();
        	if(checkGroup(s)) cnt++;
        }
        
        System.out.println(cnt);
	}
	
	public static boolean checkGroup(String s) {
		if(s.length() == 1) return true;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.substring(i + 1).contains(s.charAt(i)+"") && s.charAt(i) != s.charAt(i+1)) return false;
		}
		return true;
	}
}