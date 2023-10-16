import java.util.Set;
import java.util.HashSet;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        paper("", numbers);
        return set.size();
    }
    
    public void paper(String s, String numbers) {
        if(!s.equals("")) {
            int num = Integer.valueOf(s);
            if(isPrime(num)) {
                set.add(num);
            }
        }
        int n = numbers.length();
        for(int i = 0; i < n; i++) {
            paper(s + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1, n));
        }
    }
    
    public boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num <= 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        
        int i = 5;
        //약수가 있다면 반드시 해당 수의 제곱근 이하의 수에 존재한다.
        while(i * i <= num) {
            if(num % i == 0 || num % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }
}