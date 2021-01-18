package edu.akki.practice;

import java.util.Scanner;

public class ProfilePicProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(findSuitable(h, w, length));
        }
    }

    private static String findSuitable(int h, int w, int l) {
//        if (h == l && h == w) {
//            return "ACCEPTED";
//        } else if (h > l  && h == w) {
//            return "ACCEPTED";
//        } else if (h < l && w < l) {
//            return "UPLOAD ANOTHER";
//        } else if (h > l && w > l && h != w) {
//            return "CROP IT";
//        } else {
//            return "UPLOAD ANOTHER";
//        }


        if(h<l || w<l){
            return "UPLOAD ANOTHER";
        }else if( h==w && (h>l || h==l)){
            return "ACCEPTED";
        }else if((h>l || w>l) && h!=w){
            return "CROP IT";
        }
        return "UPLOAD ANOTHER";
    }
}


//180
//        5
//        640 480
//        120 300
//        180 180
//        400 400
//        200 180

//    CROP IT
//    UPLOAD ANOTHER
//ACCEPTED
//        CROP IT
//        UPLOAD ANOTHER


//    CROP IT
//    UPLOAD ANOTHER
//    ACCEPTED
//            ACCEPTED
//    CROP IT