import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int prevScore = 0;
		int score = 0;
		char bonus;

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			
			if (Character.isDigit(c)) {
				score = c - '0';	

				if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
					score = 10;
					i++;
				}
			}
			
			else if (c == 'S' || c == 'D' || c == 'T') {
				bonus = c;
				switch (bonus) {
					case 'D':
						score = (int) Math.pow(score, 2);
						break;
					case 'T':
						score = (int) Math.pow(score, 3);
						break;
				}
			}
            
			else if (c == '*' || c == '#') {
				if (c == '*') {
					score *= 2;
					answer += prevScore; 
				} else {
					score *= -1;
				}
			}

			if (i == dartResult.length() - 1 || Character.isDigit(dartResult.charAt(i + 1))) {
				answer += score;
				prevScore = score;
				score = 0; 
			}
		}
		
		return answer;
    }
}