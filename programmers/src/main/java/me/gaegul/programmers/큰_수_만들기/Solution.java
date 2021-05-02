package me.gaegul.programmers.큰_수_만들기;

public class Solution {

    public String solution(String number, int k) {
        char maxChar;
        int position = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < number.length() - k; i++) {
            maxChar = '0';

            for (int j = position; j <= i + k; j++) {
                if (maxChar < number.charAt(j)) {
                    maxChar = number.charAt(j);
                    position = j + 1;
                }
            }
            answer.append(maxChar);
        }

        return answer.toString();
    }
}
