package edu.akki.practice;

import java.util.Scanner;

/*Harry wants to find Voldemort's potion making book but he is confused about how to get it.

        The book has a special ISBN(International Standard Book Number) which is  unique numeric book identifier only for Voldemort's book printed on it. The ISBN is based upon a 10-digit code. The ISBN is valid if:
        1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
        Help Harry to find the book!*/

public class PotionMakingBookProb {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        if (inp.length() != 10) {
            System.out.println("Illegal ISBN");
        } else
            System.out.println(find(inp));

    }

    private static String find(String inp) {
        String finalRes = "";
        int res = 0;
        for (int i = 0; i < inp.length(); i++) {
            int n = i + 1;
            int digit = Integer.parseInt(inp.substring(i, i + 1));
            int num = n * digit;
            res = res + num;
        }
        if (res % 11 == 0) {
            finalRes = "Legal ISBN";
        } else {
            finalRes = "Illegal ISBN";
        }
        return finalRes;
    }
}
