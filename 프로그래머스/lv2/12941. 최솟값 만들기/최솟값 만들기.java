import java.util.*;
class Solution
{
    public int solution(int []a, int []b) {
    int answer = 0;
    Arrays.parallelSort(a);
	Arrays.parallelSort(b);
	    for(int i = 0; i < a.length; i++) {
			answer += (a[i]*b[b.length-i-1]);
	    }
        return answer;
    }
}