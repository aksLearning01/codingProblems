package edu.akki.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HouseProb {
    public static void main(String[] args) {
        String s="HH.BH";


        int index = s.indexOf("'H'");
        while(index >= 0) {
            System.out.println(index);
            index = s.indexOf('H', index+1);
        }
        System.out.println(index);
//       HashMap<Character, List<Integer>> map = new HashMap<>();
//        for(Character c:s.toCharArray()) {
//            List<Integer> ls = new ArrayList<>();
//
//            for (int index = s.indexOf(c);
//                 index >= 0;
//                 index = s.indexOf(c, index + 1))
//        }
//            ls.add(s.indexOf(c));
//            if(map.containsKey(c)){
//                List<Integer> ls1= map.get(c);
//                ls1.add(s.indexOf(c));
//                map.put(c,ls1);
//            }else {
//                map.put(c, ls);
//            }
//        }
//
//      for(Character c:map.keySet()){
//          List<Integer > list= map.get(c);
//          boolean flag=list.stream().map(x->x+1-x).anyMatch(x->x==0);
//          System.out.println(flag);
//      }
    }
}
