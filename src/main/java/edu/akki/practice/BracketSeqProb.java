package edu.akki.practice;


import java.util.*;

//A bracket sequence is a string that contains only characters '(' and ')'.
//
//        A correct bracket sequence is a bracket sequence that can be transformed into a correct arithmetic expression by inserting characters '1' and '+' between the original characters of the sequence. For example, bracket sequences '()()' and '(())' are correct. The resulting expressions of these sequences are: '(1)+(1)' and '((1+1)+1)'. However, '(', ')(', and '(' are incorrect bracket sequences.
//
//        You are given a bracket sequence , where  denotes the type of 's bracket (open or close). It is not mandatory that  is necessarily correct. Your task is to determine the number of 's such that  is a correct bracket sequence.
public class BracketSeqProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(determine(s));

    }

    private static int determine(String s) {
        int count = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        map.put('(', new ArrayList<>());
        map.put(')', new ArrayList<>());
        for (int i = 0; i < s.length(); i++) {
            List<Integer> list = map.get(s.charAt(i));
            list.add(i);
            map.put(s.charAt(i), list);
        }
        List<Integer> listFor1 = map.get('(');
        List<Integer> listFor2 = map.get(')');

        for (Integer i : listFor1) {
            for (Integer j : listFor2) {
                if (i < j) {
                    count++;
                }
            }
        }
        return count;
    }


}
