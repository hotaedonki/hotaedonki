import java.util.*;
class Solution {
    public ArrayList solution(int[] number, String direction) {
       ArrayList<Integer> list = new ArrayList<>();
		if(direction.equals("right")) {
			list.add(number[number.length-1]);
			for(int i = 0; i < number.length-1; i++) 
				list.add(number[i]);
		}
		else {
			for(int i = 1; i < number.length; i++)
				list.add(number[i]);
			list.add(number[0]);
		}
        return list;
    }
}