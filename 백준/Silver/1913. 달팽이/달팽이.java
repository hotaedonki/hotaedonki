import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int place = Integer.parseInt(br.readLine());
        
        int[][] insect = new int[N][N];
        int top = 0, left = 0, bottom = N - 1, right = N - 1;
        int good = N*N;
        int x = 0, y = 0;
        
        while(top <= bottom && left <= right) {
	        for(int i = top; i < bottom + 1; i++) {
	        	insect[i][left] = good--;
	        	if(good + 1 == place) {
	        		x = i; 
	        		y = left;
	        	}
	        }
	        left++;
	        
	        for(int i = left; i < right + 1; i++) {
	        	insect[bottom][i] = good--;
	        	if(good + 1 == place) {
	        		x = bottom; 
	        		y = i;
	        	}
	        }
	        bottom--;
	        
	        for(int i = bottom; i > top - 1; i--) {
	        	insect[i][right] = good--;
	        	if(good + 1 == place) {
	        		x = i; 
	        		y = right;
	        	}
	        }
	        right--;
	        
	        for(int i = right; i > left - 1; i--) {
	        	insect[top][i] = good--;
	        	if(good + 1 == place) {
	        		x = top; 
	        		y = i;
	        	}
	        }
	        top++;
        }
        
        for(int i = 0; i < insect.length; i++) {
        	for(int j = 0; j < insect[i].length; j++) {
        		bw.write(insect[i][j] + " ");
        	}
        	bw.write("\n");
        }
        
        bw.write((x + 1) + " " + (y + 1));
        bw.flush();
        br.close();
        bw.close();
    }
}