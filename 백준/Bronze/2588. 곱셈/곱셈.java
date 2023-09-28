import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		
		int C = B % 10;
		int D = (B % 100) / 10;
		int E = B / 100;
		
		System.out.println(A*C);
		System.out.println(A*D);
		System.out.println(A*E);
		System.out.println(A*B);
	}
}
