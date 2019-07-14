package edu.akki.practice;


import java.util.StringJoiner;

/**
 * Utility class to find various operations for different purposes
 */
public class Util1 {

    /**
     * Method to determine to get the middle word from a string in java
     * only if , the string is odd, if not, returns the string as is.
     *
     * @return String
     */
    public String getMiddleThreeFromString(final String input) {
        String result = "";
        if (input.length() % 2 == 0 || input.length() <= 3) {
            result = input;
        } else {
            result = input.substring((input.length() / 2) - 1, (input.length() / 2) + 2);
        }
        return result;
    }

    /**
     * /**
     * * You are driving a little too fast, and a police officer stops you.
     * * Write code to compute the fine you would have to pay.
     * * If your speed is 60 or less, the result is 0 since there is no fine.
     * * If speed is between 61 and 80 inclusive, the fine is 100 dollars.
     * * If speed is 81 or more, the result is 200.
     * * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
     * * <br>
     *
     * @param speed
     * @param holiday
     * @return Integer
     */
    public Integer speedingFine(Integer speed, Boolean holiday) {
        Integer fineAmt = 0;
        Integer speedMin = 60;
        Integer speedMax = 80;

        if ((holiday && speed <= (speedMin + 5)) || (!holiday && speed <= (speedMin))) {
            fineAmt = 0;
        } else if (holiday && (speed > (speedMin + 5) && speed <= (speedMax + 5)) || (!holiday && (speed > (speedMin) && speed <= (speedMax)))) {
            fineAmt = 100;
        } else if ((holiday && speed > speedMax + 5) || (!holiday && speed > speedMax)) {
            fineAmt = 200;
        }

        return fineAmt;
    }


    /**
     * Given three ints, a b c, return true if it is possible to add two of
     * the ints to get the third. There should only be a single line of code in the method body.<br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     * twoSumOne(1, 2, 3)   <b>---></b> true <br>
     * twoSumOne(3, 1, 2)    <b>---></b> true <br>
     * twoSumOne(3, 2, 2) <b>---></b> false <br>
     */
    public boolean twoSumOne(int a, int b, int c) {
        Boolean result = false;
        if (a + b == c || b + c == a || c + a == b) result = true;
        return result;

    }


    /**
     * Given a string that contains a single pair of brackets, compute recursively a new string made of
     * only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".
     */

    public static String insideBrackets(String str) {
        String result = "";
        if (str.indexOf("[") != -1 && str.indexOf("]") != -1) {
            result = str.substring(str.indexOf("["), str.indexOf("]") + 1);
        }
        return result;
    }


    /**
     * Given a string, compute recursively a new string where identical chars
     * that are adjacent in the original string are separated from each other by a "-".
     *
     * @param input
     * @param i
     */
    public String repeatHyphen(String input) {
        String output = "";
        if (input.equals("") || input.length() == 1) {
            output = input;
        } else if (input.charAt(0) == input.charAt(1)) {
            output = input.charAt(0) + "-" + repeatHyphen(input.substring(1));
        } else {
            output = input.charAt(0) + repeatHyphen(input.substring(1));
        }
        return output;
    }

    /**
     * Given a string, compute recursively a new string where all the
     * lowercase 'o' chars have been moved to the end of the string.
     */
    public String endoo(String s) {
        String output = "";
        if (s.length() == 1) {
            output = s;
        } else if (s.charAt(0) == 'o') {
            output = endoo(s.substring(1)) + s.charAt(0);

        } else {
            output = s.charAt(0) + endoo(s.substring(1));
        }
        return output;


    }

    /**
     * Given a string, compute   the number of times
     * substring appears in the string.
     * <br>
     *
     * @param str
     * @param subStr
     * @return
     */
    public static int countOccurence(String str, String subStr) {
        //    return (str.length() -str.replace(subStr,"").length())/subStr.length();
        return (str.split(subStr, -1).length - 1);
    }


    public static void partitionArray() {
     /*   String inp = "The length of last words at my desk1";
        String[] x= inp.split(" ");
        String lastStr=x[x.length-1];
        System.out.println(lastStr.length());*/

        StringJoiner sj=new StringJoiner(" ","{","}");
        sj.add("This is my sentence formation.").add("some sample cases");
        System.out.println(sj.toString());

    }

    public static void main(String[] args) {
        partitionArray();
    }

}


