import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] str = new String [numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        if(str[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : str) sb.append(s);
        
        return sb.toString();
        
    }
}