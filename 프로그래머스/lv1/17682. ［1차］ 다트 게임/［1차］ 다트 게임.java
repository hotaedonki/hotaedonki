import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution { 
    public int solution(String dartResult) {
        Pattern pattern = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        int[] scores = new int[3];
        int idx = 0;

        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            char bonus = matcher.group(2).charAt(0);
            char option = matcher.group(3).isEmpty() ? ' ' : matcher.group(3).charAt(0);

            switch (bonus) {
                case 'S':
                    scores[idx] = score;
                    break;
                case 'D':
                    scores[idx] = (int) Math.pow(score, 2);
                    break;
                case 'T':
                    scores[idx] = (int) Math.pow(score, 3);
                    break;
            }

            if (option == '*') {
                if (idx > 0) scores[idx - 1] *= 2;
                scores[idx] *= 2;
            } else if (option == '#') {
                scores[idx] = -scores[idx];
            }

            idx++;
        }

        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += scores[i];
        }

        return total;
    }
}