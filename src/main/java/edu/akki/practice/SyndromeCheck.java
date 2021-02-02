package edu.akki.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SyndromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int inp = sc.nextInt();
            list.add(inp);
        }
        List<Integer> result = check(list);
        for(Integer x: result){
            System.out.print(x +" ");
        }
    }

    private static List<Integer> check(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer c : list) {
            result.add(checkForDecimalSynd(c));
        }
        return result;

    }

    private static int checkForDecimalSynd(Integer n) {
        int count = 0;
        while (n > 0) {
            //check for decimal
            boolean flag = false;
            String k = String.valueOf(n);
            String rev = new StringBuffer(k).reverse().toString();
            if (rev.equalsIgnoreCase(k)) {
                flag = true;
            }

            //check for binary
            if (flag && n % 2 != 0) {
                count++;
            }
            n--;
        }
        return count;
    }

}
