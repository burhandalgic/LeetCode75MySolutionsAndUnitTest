package LeetCode75._26_394_DecodeString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public String decodeString(String s) {
        StringBuilder builder = new StringBuilder();
        print(s, builder);
        return builder.toString();
    }

    boolean isNumber(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0')
            return true;
        return false;
    }

    void print(String s, StringBuilder stringBuilder) {
        int len = s.length();
        for (int i = 0; i < len; i++) {

            if (!isNumber(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            } else {
                int firstNumber = i;
                while (true) {
                    i++;
                    if (isNumber(s.charAt(i))) {
                        continue;
                    } else {
                        break;
                    }
                }
                int loop = Integer.parseInt(s.substring(firstNumber, i));
                int startSquareCount = 1;
                i++;
                int startIndexNewString = i;
                int finishIndexNewString;


                while (true) {

                    if (s.charAt(i) == '[') {
                        startSquareCount++;
                        i++;
                        continue;
                    }
                    if (s.charAt(i) == ']') {
                        startSquareCount--;

                        if (startSquareCount == 0) {
                            finishIndexNewString = i;
                            break;
                        } else {
                            i++;
                        }

                    } else {
                        i++;
                    }
                }


                String newString = s.substring(startIndexNewString, finishIndexNewString);
                for (int j = 0; j < loop; j++) {
                    print(newString, stringBuilder);
                }
            }


        }

    }


}