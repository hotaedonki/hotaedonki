import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        //결과를 담을 배열
        int[] answer = new int [prices.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < prices.length; i++) {
           //1. 가격이 떨어진 경우에 떨어진 데까지 걸린 시간 입력
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            
            //2. stack에 매초의 시점에 해당하는 index추가
            stack.push(i);
        }
        
        //가격이 떨어지지 않은 요소들의 시간을 계산
        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - 1 - index;
        }
        
        return answer;
    }
}