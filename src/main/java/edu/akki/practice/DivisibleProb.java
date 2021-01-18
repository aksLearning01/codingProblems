package edu.akki.practice;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DivisibleProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            long t1 = sc.nextLong();

            list.add(t1);
        }

        System.out.println(find(list));

    }

    private static String find(List<Long> list) {
        StringBuffer sb = new StringBuffer();
        List<String> l = list.stream().map(x -> String.valueOf(x)).collect(Collectors.toList());
        List<String> fl = new ArrayList<String>(l.subList(0, (l.size() + 1)/2));
        List<String> sl = new ArrayList<String>(l.subList((l.size() + 1)/2, l.size()));
        fl.stream().forEach(x -> sb.append(x.charAt(0)));
        sl.stream().forEach(x -> sb.append(x.charAt(x.length() - 1)));

        BigInteger bi= new BigInteger(sb.toString());
        BigInteger x= bi.remainder(new BigInteger("11"));
        if (x.toString().equals("0")) return "OUI";
        else return "NON";
    }


//    private static String find(List<Long> list) {
//        int mid = list.size() / 2;
//
//StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < mid; i++) {
//            Long s = list.get(i);
//            String str1 = String.valueOf(s);
//            sb.append(str1.charAt(0));
//        }
//
//        for (int j = mid; j < list.size(); j++) {
//            Long s = list.get(j);
//            String str1 = String.valueOf(s);
//            sb.append(str1.charAt(str1.length() - 1));
//        }
//        Long val = Long.parseLong(sb.toString());
//        if (val % 11 == 0) return "OUI";
//        else return "NON";
//    }
}
