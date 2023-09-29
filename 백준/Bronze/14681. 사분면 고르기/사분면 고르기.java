import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String x = bf.readLine();
		String y = bf.readLine();
		int xx = Integer.parseInt(x);
		int yy = Integer.parseInt(y);
		
		if(xx > 0 && yy > 0) System.out.print(1);
		else if(xx < 0 && yy > 0) System.out.print(2);
		else if(xx < 0 && yy < 0) System.out.print(3);
		else System.out.print(4);
	}
}
