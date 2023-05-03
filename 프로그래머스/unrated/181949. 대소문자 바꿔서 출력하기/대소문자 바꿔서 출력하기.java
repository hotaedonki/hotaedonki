import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
                result += Character.toLowerCase(a.charAt(i));
            else if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
                result += Character.toUpperCase(a.charAt(i));
        }
        System.out.print(result);
    }
}