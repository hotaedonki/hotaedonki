import java.util.*;
class Solution {
    public ArrayList solution(String[] quiz) {
    ArrayList<String> list = new ArrayList<String>();
    int left = 0;
    int right = 0;
    int result = 0;
    String pm = "";
        for(int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            left = Integer.parseInt(split[0]);
            right = Integer.parseInt(split[2]);
            result = Integer.parseInt(split[4]);
                if(split[1].equals("-")) pm = "-";
                else pm = "+";

            if((pm.equals("+") && left + right == result) 
                    || pm.equals("-") && left - right == result) list.add("O");
            else list.add("X");
        }
        return list;
    }
}