import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int rows, int columns, int[][] queries) {
        int[][] matrix = new int[rows][columns];
        List<Integer> result = new ArrayList<>();

        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = cnt++;
            }
        }

        for(int[] query : queries) {
        	int x1 = query[0] - 1;
        	int y1 = query[1] - 1;
        	int x2 = query[2] - 1;
        	int y2 = query[3] - 1;
        	
        	//교체 값을 담아둘 변수
        	int changeValue = matrix[x1 + 1][y1];
        	//최소값을 담을 변수
        	int minValue = changeValue;
        	
        	for(int i = y1; i < y2 + 1; i++) {
        		int temp = matrix[x1][i];
        		matrix[x1][i] = changeValue;
        		changeValue = temp;
        		minValue = Math.min(temp, minValue);
        	}
        	
        	for(int i = x1 + 1; i < x2 + 1; i++) {
        		int temp = matrix[i][y2];
        		matrix[i][y2] = changeValue;
        		changeValue = temp;
        		minValue = Math.min(temp, minValue);
        	}
        	
        	for(int i = y2 - 1; i > y1 - 1; i--) {
        		int temp = matrix[x2][i];
        		matrix[x2][i] = changeValue;
        		changeValue = temp;
        		minValue = Math.min(temp, minValue);
        	}
        	
        	for(int i = x2 - 1; i > x1 - 1; i--) {
        		int temp = matrix[i][y1];
        		matrix[i][y1] = changeValue;
        		changeValue = temp;
        		minValue = Math.min(temp, minValue);
        	}
        	
        	result.add(minValue);
        }
        
        return result;
    }
}