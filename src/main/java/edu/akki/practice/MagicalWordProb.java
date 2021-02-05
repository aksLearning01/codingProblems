package edu.akki.practice;

import java.util.Scanner;

public class MagicalWordProb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int len= sc.nextInt();
            sc.nextLine();
            String inp = sc.nextLine();
            System.out.println(findMagicalWord(inp,len));
        }

    }

    private static String findMagicalWord(String inp, int len) {
        String res="";

        for(int i=0;i<inp.length();i++){
            int val=(int)inp.charAt(i);

        }



        return res;
    }
    /*private int findPrime(Integer in){
        for (int num = in;num<=2; num--)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
               return num;
        }

    }*/
}
