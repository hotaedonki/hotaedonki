import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int cnt = 0;
		ArrayList<Integer> lineOne = new ArrayList<Integer>();
		ArrayList<Integer> lineTwo = new ArrayList<Integer>();
		ArrayList<Integer> lineThree = new ArrayList<Integer>();
		for(int i = lines[0][0]; i < lines[0][1]; i++)
			lineOne.add(i);
		for(int i = lines[1][0]; i < lines[1][1]; i++)
			lineTwo.add(i);
		for(int i = lines[2][0]; i < lines[2][1]; i++)
			lineThree.add(i);
		for(int i = 0; i < lineOne.size(); i++)
			if(lineTwo.contains(Integer.valueOf(lineOne.get(i)))) 
				cnt++;
		for(int i = 0; i < lineTwo.size(); i++)
			if(lineThree.contains(Integer.valueOf(lineTwo.get(i))))
				if(lineOne.contains(Integer.valueOf(lineTwo.get(i)))) {
				}
				else { 
					cnt++;
				}
		for(int i = 0; i < lineThree.size(); i++)
			if(lineOne.contains(Integer.valueOf(lineThree.get(i))))
				if(lineTwo.contains(Integer.valueOf(lineThree.get(i)))) {
				}
				else { 
					cnt++;
				}
        return cnt;
    }
}