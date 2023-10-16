import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        boolean zero = false;
        
        for(int i = 0; i < N; i++) {
        	String M = String.valueOf(i);
        	int sumM = 0;
        	for(int j = 0; j < M.length(); j++) {
        		sumM += Integer.parseInt(M.charAt(j)+"");
        	}
        	if(N == i + sumM) {
        		System.out.println(i);
        		zero = true;
        		break;
        	}
        }
        if(!zero) {
        	System.out.println(0);
        }
	}
}