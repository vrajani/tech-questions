package pl.vrajani.solution.crackingTheCodingInterview.uniqueChars;

public class Solution1 {

    public static void main(String[] args) {
        int val = 92;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= 10; i ++){

            switch (i){
                case 0:
                    sb.append(getNumberValue(val%10, true));
                case 1:
                    //sb.append(getTeenNumberValue(val%10, false));
                case 2:
                    sb.append(getNumberValue(val%10, true)).append("hundred ");
                case 3:
                    sb.append(getNumberValue(val%10, true)).append("thousand ");
                case 4:
                    sb.append(getNumberValue(val%10, false));
                case 5:
                    sb.append(getNumberValue(val%10, true));
                case 6:
                    sb.append(getNumberValue(val%10, true));
                case 7:
                    sb.append(getNumberValue(val%10, false));
                case 8:
                    sb.append(getNumberValue(val%10, true));
                case 9:
                    sb.append(getNumberValue(val%10, true));
                case 10:
                    sb.append(getNumberValue(val%10, false));

            }

            val = val/10;

        }
        System.out.println(sb.toString());
    }

    private static String getNumberValue(int i, boolean organic) {
        switch (i){
            case 1:
                return "one";
            case 2:
                return organic? "two" : "twenty";
            case 3:
                return organic? "three" : "thirty";
            case 4:
                return organic ? "four" : "fourty";
            case 5:
                return organic ? "five" : "fifty";
            case 6:
                return organic ? "six" : "sixty";
            case 7:
                return organic ? "seven" : "seventy";
            case 8:
                return organic ? "eight" : "eighty";
            case 9:
                return organic ? "nine" : "ninety";

        }
        return "";
    }
}
/**
 * 52021 -
 * 5200 - one
 * 520  - one
 * 52   - one
 * 5    - two thousand one
 *      - fifty two thousand one
 */



/// 345321045 - 1,4,7,10