import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> students	= new ArrayList<>();
		for(int i = 0; i < 30; i++) {
			students.add(i+1);
		}
		
		for(int i = 0; i < 28; i++) {
			int student = Integer.parseInt(br.readLine());			
			students.remove((Integer) student);
		}
		
		bw.write(students.get(0) + "\n");
		bw.write(students.get(1) + "");
		
		bw.flush();
	}
}