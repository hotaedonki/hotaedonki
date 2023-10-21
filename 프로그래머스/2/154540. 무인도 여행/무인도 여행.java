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
					int sum = dfs(i, j, maps, visited);
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
	
	public static int dfs(int x, int y, String[] maps, boolean[][] visited) {
		if(x < 0 || y < 0 || x > maps.length - 1 || y > maps[0].length() - 1 || maps[x].charAt(y) == 'X' || visited[x][y]) return 0;
		
		int sum = 0;
		visited[x][y] = true;
		sum += maps[x].charAt(y) - '0';
		
		for(int i = 0; i < 4; i++) {
			sum += dfs(x + dx[i], y + dy[i], maps, visited);
		}
		
		return sum;
	}
}
