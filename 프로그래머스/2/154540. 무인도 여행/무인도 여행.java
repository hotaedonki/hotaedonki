import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int[] solution(String[] maps) {
		int n = maps.length;
		int m = maps[0].length();
		
		boolean[][] visited = new boolean[n][m];
		List<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(maps[i].charAt(j) != 'X' && !visited[i][j]) {
					int sum = bfs(i, j, maps, visited);
					answer.add(sum);
				}
			}
		}
		
		if(answer.isEmpty()) {
			return new int[] {-1};
		}
		
		Collections.sort(answer);
		return answer.stream().mapToInt(i -> i).toArray();
		
	}
	
	public static int bfs(int x, int y, String[] maps, boolean[][] visited) {
		int n = maps.length;
		int m = maps[0].length();
		int sum = 0;
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int curX = current[0];
			int curY = current[1];
			sum += maps[curX].charAt(curY) - '0';
			
			for(int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
					visited[nx][ny] = true;
					queue.offer(new int[] {nx, ny});
				}
			}
		}
		return sum;
	}
}
