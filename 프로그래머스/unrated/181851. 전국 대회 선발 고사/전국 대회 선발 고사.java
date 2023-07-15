import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
    ArrayList<Integer> possible = new ArrayList<Integer>();
	int one = 0, two = 0, three = 0;
		for(int i = 0; i < rank.length; i++) {
			if(attendance[i]) possible.add(rank[i]); 
		}
		Collections.sort(possible);
		for(int i = 0; i < rank.length; i++) {
			if(possible.get(0) == rank[i]) one = i;
			else if(possible.get(1) == rank[i]) two = i;
			else if(possible.get(2) == rank[i]) three = i;
		}
        return (one * 10000) + (two * 100) + three;
    }
}