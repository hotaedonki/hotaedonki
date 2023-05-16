import java.util.*;
class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> list = new ArrayList<String>();
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        for(String str : answer){
        if(!str.isEmpty())
            list.add(str);
        }
        Arrays.sort(answer);
        return list;
    }
}