import java.util.*;
class Solution {
    public ArrayList solution(int[] numlist, int n) {
        int cnt = 0;
        int min = 0;
        int[] count = new int [numlist.length];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < numlist.length; i++) {
            min = Math.abs(numlist[i]-n);

            for(int j = 0; j < numlist.length; j++) {
                if(min > Math.abs(numlist[j]-n)) {
                    cnt++;
                }
                else if(min == Math.abs(numlist[j]-n)) {
                    if(i == j);
                    else if(numlist[i] < numlist[j]) cnt++;
                }
            }
            count[i] = cnt;
            cnt = 0;
        }
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < count.length; j++) {
                if(i == count[j]) {
                    result.add(numlist[j]);
                    break;
                }
            }
        }
        return result;
    }
}