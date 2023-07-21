class Solution {
    public int solution(int[][] dots) {
        int len = 0;
		for (int i = 1; i < dots.length; i++) {
		    len += i;
		}

		int[][] answer = new int[len][2];
		int index = 0;
		for (int i = 0; i < dots.length-1; i++) {
		    for (int j = i + 1; j < dots.length; j++) {
		        answer[index][0] = dots[i][0] - dots[j][0];
		        answer[index][1] = dots[i][1] - dots[j][1];
		        index++;
		    }
		}
		int cnt = 0;
		int one = 0;
		int two = 0;
		int three = 0;
			for (int i = 0; i < answer.length; i++) {
			    for (int j = i + 1; j < answer.length; j++) {
			        if (answer[i][0] == answer[j][0] && answer[i][1] == answer[j][1]) {
			            cnt = 1;
			            break;
			        }
			        else if (answer[i][0] == answer[j][0]) {
			        	one++;
			        	if(one >= 3) {
			        		cnt = 1;
			        		break;
			        	}
			        }
			        else if (answer[i][1] == answer[j][1]) {
			        	two++;
			        	if(two >= 3) {
			        		cnt = 1;
			        		break;
			        	}
			        }
			        else if (answer[i][0] == answer[i][1]) {
			        	three++;
			        	if(three >= 3) {
			        		cnt = 1;
			        		break;
			        	}
			        }
			    }
			    if (cnt == 1) {
			        break;
			    }
			}
        return cnt;
    }
}