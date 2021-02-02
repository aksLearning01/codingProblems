package edu.akki.practice;


/*Alice got a number written in seven segment format where each segment was creatted used a matchstick.
        Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.
        Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.
        Input Format:
        First line contains T (test cases).
        Next T lines contain a Number N.
        Output Format:
        Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SevenSegmentProb {

//    private static Map<Character, Integer> matchstickMap = new HashMap<>();
//
//    public static void main(String[] args) {
//        matchstickMap.put('1', 2);
//        matchstickMap.put('2', 5);
//        matchstickMap.put('3', 5);
//        matchstickMap.put('4', 4);
//        matchstickMap.put('5', 5);
//        matchstickMap.put('6', 6);
//        matchstickMap.put('7', 3);
//        matchstickMap.put('8', 7);
//        matchstickMap.put('9', 6);
//        matchstickMap.put('0', 6);
//
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < tc; i++) {
//            String inp = sc.nextLine();
//            System.out.println(printMax(inp, matchstickMap));
//        }
//    }
//
//    private static String printMax(String inp, Map<Character, Integer> matchstickMap) {
//        String res="";
//        int matchCount = 0;
//         for(int i=0;i<inp.length();i++){
//             matchCount= matchCount + matchstickMap.get(inp.charAt(i));
//         }
//         StringBuffer sb= new StringBuffer();
//
//         if(matchCount%2==0){
//             for(int k=0;k<matchCount/2;k++){
//                 sb.append("1");
//             }
//         }
//         else{
//             sb.append("7");
//             for(int k=0;k<matchCount/2-1;k++){
//                 sb.append("1");
//             }
//         }
//         res=sb.toString();
//        return res;
//    }

    public static void main(String args[] ) throws Exception {
    //Scanner s = new Scanner(System.in);
    int arr[]=new int[]{6,2,5,5,4,5,6,3,7,6};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test=Integer.parseInt(br.readLine());
    StringBuilder str=new StringBuilder("");
        while(test--!=0)
    {
        int count=0;
        String st=br.readLine();
        for(int i=0; i<st.length(); i++)
        {
            System.out.println(st.charAt(i));
            System.out.println(st.charAt(i)-'0');
            int x= st.charAt(i);
            count= count+arr[x];
        }
        if(count%2==1)
        {
            str.append("7");
            count-=3;
            for(int i=0; i<count; i+=2)
            {
                str.append("1");
            }
        }
        else
        {
            for(int i=0; i<count; i+=2)
            {
                str.append("1");
            }
        }
        str.append("\n");
    }
        System.out.println(str);

}
}
