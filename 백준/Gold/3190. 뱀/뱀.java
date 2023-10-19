import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static int[] dx = {0, 1, 0, -1}; 
    public static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        
        int[][] map = new int [N][N];
        
        for(int i = 0; i < K; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	map[x - 1][y - 1] = 1;
        }
        
        int L = Integer.parseInt(br.readLine());
        
        Map<Integer, String> time = new HashMap<>();
        for(int i = 0; i < L; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	String c = st.nextToken();
        	time.put(x, c);
        }
        
        Deque<Position> snake = new LinkedList<>();
        snake.add(new Position(0, 0));
        int dir = 0;
        int x = 0, y = 0;
        int seconds = 0;

        while (true) {
            seconds++;
            x += dx[dir];
            y += dy[dir];

            if (x < 0 || x >= N || y < 0 || y >= N || contains(snake, x, y)) {
                System.out.println(seconds);
                return;
            }

            snake.addFirst(new Position(x, y));
            if (map[x][y] == 1) {
                map[x][y] = 0;
            } else {
                snake.removeLast();
            }

            if (time.containsKey(seconds)) {
                dir = turn(dir, time.get(seconds));
            }
        }
    }

    public static boolean contains(Deque<Position> snake, int x, int y) {
        for (Position pos : snake) {
            if (pos.x == x && pos.y == y) return true;
        }
        return false;
    }

    public static int turn(int dir, String c) {
        if (c.equals("L")) {
            dir = (dir + 3) % 4;
        } else {
            dir = (dir + 1) % 4;
        }
        return dir;
    }

    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}