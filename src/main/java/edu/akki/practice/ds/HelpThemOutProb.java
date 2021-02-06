package edu.akki.practice.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelpThemOutProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        while(size>0){
            int x= sc.nextInt();
            list.add(x);
            size--;
        }
        Integer sum=0;
        HelpThemOutProb obj = new HelpThemOutProb();
        System.out.println(obj.print(list,sum));
    }

    public  int print(List<Integer> list,int sum) {
        if(!list.isEmpty() && list.stream().allMatch(x->x==0)) {
            return sum;
        } else {
                //when all the elements are even, then just perform one operation and go to next step
                if(list.stream().allMatch(x->x%2==0)){
                    List<Integer> newEvenList = list.stream().map(x->x/2).collect(Collectors.toList());
                    sum=sum+1;
                    return  print(newEvenList,sum);
                }else{
                    List<Integer> oddList = list.stream().filter(x->x%2!=0).map(x->x-1).collect(Collectors.toList());
                    List<Integer> evenOptList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
                    sum=sum+oddList.size();
                    oddList.addAll(evenOptList);
                    return print(oddList,sum);
                }
        }
    }
}
