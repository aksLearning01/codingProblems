package edu.akki.practice;


import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(convert(n));
    }


    public static String convert(String s) {
        StringBuffer sb = new StringBuffer();
        for (Character c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

}
