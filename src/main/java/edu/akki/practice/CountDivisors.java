package edu.akki.practice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int r= sc.nextInt();
        int k= sc.nextInt();

        System.out.println(find(l,r,k));
    }

    private static long find(int l, int r, int k) {
        List<Integer> list = IntStream.rangeClosed(l,r).boxed().collect(Collectors.toList());
        return (int) list.stream().filter(p->p%k==0).count();
    }
}
