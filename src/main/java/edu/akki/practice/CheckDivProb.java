package edu.akki.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 10.

public class CheckDivProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len= sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(len>0){
            list.add(sc.nextInt());
            len--;
        }

        System.out.println(find(list));
    }

    private static String find(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for(Integer i:list){
            sb.append(findLastDigit(i));
        }
        String res=sb.toString();
        if(res.charAt(res.length()-1)=='0'){
            return "Yes";
        }else{
            return "No";
        }
    }

    private static char findLastDigit(Integer i) {
        String s=i.toString();
        return s.charAt(s.length()-1);

    }
}
