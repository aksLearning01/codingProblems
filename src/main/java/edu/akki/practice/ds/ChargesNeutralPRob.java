package edu.akki.practice.ds;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChargesNeutralPRob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String inp = sc.nextLine();
        String res = find(inp);
        System.out.println(res.length());
        System.out.println(res);
    }

    public static String find(String inp) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        StringBuffer sb = new StringBuffer();
        //Converting given string to char array
        char[] strArray = inp.toCharArray();
        //checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        List<Character> list = charCountMap.keySet().stream().filter(x -> charCountMap.get(x) % 2 != 0).collect(Collectors.toList());
        return list.stream().map(Object::toString)
                .collect(Collectors.joining(""));

    }
}
