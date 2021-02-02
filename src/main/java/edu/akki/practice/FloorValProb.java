package edu.akki.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloorValProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len= sc.nextInt();
        int nq= sc.nextInt();
        int[] arr= new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> res= new ArrayList<>();

        for(int j=0;j<nq;j++){
            int index1= sc.nextInt();
            int index2=sc.nextInt();

            res.add(findFloorVal(arr,index1,index2));

        }
        res.stream().forEach(System.out::println);
    }

    private static Integer findFloorVal(int[] arr, int index1, int index2) {
        int sum = 0, count = 0;
        for(int i = index1-1; i < index2; i++) {
            sum += arr[i];
            count++;
        }

        int mean = sum/count;
        return mean;
    }
}
