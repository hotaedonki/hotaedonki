import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
				if (array[i] == n) {
                    answer = n;
                    break;
                }
				else if (array[i] > n) {
					if(i == 0) {
                        answer = array[i];
                        break;
                    }
					else if((array[i] - n) == (n - array[i - 1])) {
                        answer = array[i - 1];
                        break;
                    }
                    else if((array[i] - n) < (n - array[i - 1])) {
                        answer = array[i];
                        break;
                    }
					else {
                        answer = array[i - 1];
                        break;
                    }
				}
				else if(array[array.length - 1] < n) {
                    answer = array[array.length - 1];
                    break;
                }
                else continue;
			}
        return answer;
    }
}