package leetCode;

import java.util.HashMap;

public class RomanToInteger_LeetCode {
    public int romanToInt(String s) {
        int output = 0;
        int currentValue = 0;
        HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            currentValue = romanValues.get(s.charAt(i));
            if (currentValue * 4 < output) {
                output -= currentValue;
            } else {
                output += currentValue;
            }
        }
        return output;
    }
}
