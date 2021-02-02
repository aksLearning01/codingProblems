package edu.akki.practice;

import java.util.Scanner;

//You will be given three numbers A,B,C .You can perform the following operation on these numbers any number of times.You can take any integer from A, B, C and you can add or substract 1 from it.
//
//        Each operation cost 1sec of time(say). Now you have to determine the minimum time required to change those numbers into an Arithmetic Progression.
//
//        i.e B-A=C-B
public class ArithmeticProgressionProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(tc--!=0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();

//            System.out.println(findAp(a,b,c));

            sb.append(((int) Math.ceil((double) Math.abs(2*b-a-c) / 2)));
            sb.append("\n");

//        long a = 4L;
//        long b = 2L;
//        System.out.println(a/b);
//        System.out.println((int) Math.ceil((double) a / b));

        }
        System.out.println(sb);

    }

    private static int findAp(int a, int b, int c) {
        int res= (2*b-a-c);
//        if(res%2==0)return Math.abs(res/2);
//        else return Math.abs(res/2 +1);

        return ((int) Math.ceil((double) Math.abs(2*b-a-c) / 2));
    }
}
