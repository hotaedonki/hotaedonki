import java.util.*;
class Solution {
    public String solution(String letter) {
        ArrayList<String> list = new ArrayList<String>();
        String[] a = letter.split(" ");
        int[] num = new int [a.length];    
        char[] c = new char [a.length];
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
				".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
				"-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String mosList : mos)
			list.add(mosList);
        for(int i = 0; i < a.length; i++)
			num[i] = list.indexOf(a[i]);
        for(int i = 0; i < a.length; i++)
			c[i] = (char)(num[i] + 97);
        for(char b : c)
            answer += b;
        
        return answer;
    }
}