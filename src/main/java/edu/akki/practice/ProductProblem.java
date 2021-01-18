package edu.akki.practice;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer n= sc.nextInt();
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println(findProduct(l));
    }

    public static Long findProduct(List<Integer> ll) {
        Long product = 1l;
        int x= 1000000000+7;
        for(Integer l:ll) {
            product = (product*l)%x;
        }
        return product;
    }
}
