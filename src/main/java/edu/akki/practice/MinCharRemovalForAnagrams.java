package edu.akki.practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MinCharRemovalForAnagrams {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String inp1 = "";
        String inp2 = "";
        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                inp1 = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                inp2 = sc.nextLine();

                int count1[] = new int[26];
                int count2[] = new int[26];

                for (int p = 0; p < inp1.length(); p++) {
                    count1[inp1.charAt(p) - 'a']++;
                }

                for (int q= 0; q<inp2.length(); q++) {
                    count2[inp2.charAt(q) - 'a']++;
                }

                int res = 0;
                for (int c = 0; c< 26; c++) {
                    res = res + Math.abs(count1[c] - count2[c]);
                }
                System.out.println(res);
            }
        }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int testCases = Integer.parseInt(br.readLine());
//       List<Integer> resultList = new ArrayList<>();
//        List<Integer> inputList = new ArrayList<>();
//        for (int i = 1; i <= testCases; i++) {
//            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//            String x = br1.readLine();
//            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//            String y = br2.readLine();
//            if (x != null && y != null && x.length() > y.length()) {
//                resultList.add(checkAnalgram(x, y));
//            } else if (x != null && y != null && x.length() < y.length()) {
//                resultList.add(checkAnalgram(y, x));
//            } else if (x != null && y != null && x.length() == y.length()) {
//                resultList.add(checkAnalgram(y, x));
//            } else if (x == null && y != null) {
//                resultList.add(y.length());
//            } else if (x != null && y == null) {
//                resultList.add(x.length());
//            }else{
//                resultList.add(0);
//            }
//        }
//        for(Integer i:resultList){
//            System.out.println(i);
//        }
    }

    public static int checkAnalgram(String a, String b) throws Exception {

        int count1[] = new int[26];
        int count2[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count1[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            count2[b.charAt(i) - 'a']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            res = res + Math.abs(count1[i] - count2[i]);
        }
        return res;
    }

}

