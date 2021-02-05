package edu.akki.practice;

import java.util.*;

public class MagicProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(find(list));
    }

    private static int find(List<Integer> l) {
        int sum = 0;
        int res = 0;
        int index = 0;
        Map<Integer, Integer> choice = new HashMap<>();
        for (int i = l.size() - 1; i >= 0; i--) {
            sum = l.stream().mapToInt(p -> p).sum();
            sum = sum - l.get(i);
            if (sum % 7 == 0) {
                choice.put(i, l.get(i));
                index = i;
            }
            sum = 0;
        }
        //find the key against the smallest value of the map
        int minKey = choice.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        return minKey;
    }
}
