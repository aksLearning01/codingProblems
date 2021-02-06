package edu.akki.practice.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecursionProb {

    public static void main(String[] args) {
        int sum = 0;
        int n = 8;
        List<Integer> list = Arrays.asList(7,8,9);
        RecursionProb o= new RecursionProb();
        int res = o.find(0, list);
        System.out.println(res);
    }

    public  int find(Integer sum, List<Integer> list) {
        if (!list.isEmpty() && list.stream().allMatch(list.get(0)::equals) && list.get(0)==0) {
            return sum;
        } else {
            //divide the list into even and odd one
            List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).filter(x->x!=0).map(x -> x / 2).collect(Collectors.toList());
            List<Integer> oddList = list.stream().filter(x -> x % 2 != 0).map(x -> x - 1).collect(Collectors.toList());

            if(evenList.size()>0){
                sum=sum+1;
            }
            if(oddList.size()>0){
                sum=sum+oddList.size();
            }
            evenList.addAll(oddList);
            return find(sum, evenList) ;
        }
    }

    /*public static int find(int sum,int n,List<Integer> list){
        if(n==0){
            return 0;
        }else {
            if(n%2==0){
         //       sum=sum+1;
                if()
                return  1+find(sum,n/2);
            }else{
            //    sum=sum+1;
                return 1+find(sum,n-1);
            }
        }
    }*/


}
