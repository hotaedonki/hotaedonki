import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<strArr.length; i++){
            if(strArr[i].contains("ad"))
                continue;
            else list.add(strArr[i]);
        }
        return list;
    }
}