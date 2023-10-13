class Solution {
    private static final String[] SOUNDS = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int cnt = 0;
        for (String b : babbling) {
            if (isValid(b)) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isValid(String b) {
        String currentWord = b;
        String lastSound = "";
        while (!currentWord.isEmpty()) {
            boolean matched = false;
            for (String sound : SOUNDS) {
                if (!sound.equals(lastSound) && currentWord.startsWith(sound)) {
                    currentWord = currentWord.replaceFirst(sound, "");
                    lastSound = sound;
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                return false;
            }
        }
        return true;
    }
}