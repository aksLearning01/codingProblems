package edu.akki.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LovelyStringProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            String inp = sc.nextLine();
            System.out.println(checkForLovelyString(inp));
        }
    }

    private static String checkForLovelyString(String inp) {
        boolean flag = false;
        StringBuffer uc = new StringBuffer("");
        StringBuffer lc = new StringBuffer("");

        for (Character c : inp.toCharArray()) {
            int av = (int) c;
            if (((int) c <= 90) && ((int) c >= 65)) {
                uc.append(c);
            } else {
                lc.append(c);
            }
        }

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        if(uc.toString().contains("A") && uc.toString().contains("E") && uc.toString().contains("I") && uc.toString().contains("O") && uc.toString().contains("U")){
            return "lovely string";
        }else if(lc.toString().contains("a") && lc.toString().contains("e") && lc.toString().contains("i") && lc.toString().contains("o") && lc.toString().contains("u")){
            return "lovely string";
        }
         return "ugly string";
    }
}
