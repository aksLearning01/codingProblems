package edu.akki.practice;

//Given an array, , having  integers .Two elements of the array  and  are called similar iff  or  .
//        Also, the similarity follows transitivity. If  and  are similar and  and  are similar, then  and  are also similar.
//        Note: , , and  are all distinct.
//
//        You need to find number of pairs of indices  such that  and  is similar to .


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimilarPaitArrProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(findCount(a));
    }

    private static int findCount(int[] a) {
        Arrays.sort(a);
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==(a[i]+1) ){
                    count=count+1;
                    if(map.containsKey(i)){
                        map.put(i,map.get(i)+1);
                    } else {
                        map.put(i,1);
                    }
                    if(map.containsKey(j)){
                        map.put(j,map.get(j)+1);
                    } else {
                        map.put(j,1);
                    }
                }
           }
        }
        for (Integer k : map.keySet()){
            if(map.get(k) > 1){
                count = count + (map.get(k))/2;
            }
        }
        return count;
    }
}
