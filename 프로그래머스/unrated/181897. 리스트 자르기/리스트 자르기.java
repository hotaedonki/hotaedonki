import java.util.*;
class Solution {
    public ArrayList solution(int n, int[] s, int[] num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(n == 1) for(int i = 0; i <= s[1]; i++) list.add(num[i]);
        if(n == 2) for(int i = s[0]; i < num.length; i++) list.add(num[i]);
        if(n == 3) for(int i = s[0]; i <= s[1]; i++) list.add(num[i]);
        if(n == 4) for(int i = s[0]; i <= s[1]; i += s[2]) list.add(num[i]);
        return list;
    }
}