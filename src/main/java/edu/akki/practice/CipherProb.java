package edu.akki.practice;


import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Indian army is going to do a surprise attack on one of its enemies country. The President of India, the Supreme Commander of the Indian Army will be sending an alert message to all its commanding centers. As enemy would be monitoring the message, Indian army is going to encrypt(cipher) the message using basic encryption technique. A decoding key 'K' (number) would be sent secretly.

        You are assigned to develop a cipher program to encrypt the message. Your cipher must rotate every character in the message by a fixed number making it unreadable by enemies.

        Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number '0<=N<=1000'. Encrypt and print the resulting string.

        Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, remain unencrypted.*/
public class CipherProb {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String newS = "";
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);
            if (val <= 122 && val >= 97) {
                // store the duplicate
              //  int dup = k;
                // if k-th ahead character exceed 'z'
                if (val + k > 122) {
                    k -= (122 - val);
                    k = k % 26;
                    newS += (char) (96 + k);
                } else {
                    newS += (char) (val + k);
                }
             //   k = dup;
            } else if (val >= 65 && val <= 90) {
                int dup = k;
                // if k-th ahead character exceed 'z'
                if (val + k > 90) {
                    k -= (90 - val);
                    k = k % 26;
                    newS += (char) (64 + k);
                } else {
                    newS += (char) (val + k);
                }
                k = dup;
            }else if (val>=48 && val<=57){
                int dup = k;
                // if k-th ahead character exceed 'z'
                if (val + k > 57) {
                    k -= (57 - val);
                    k = k % 26;
                    newS += (char) (47+ k);
                } else {
                    newS += (char) (val + k);
                }
                k = dup;
            } else {
                newS += s.charAt(i);
            }
        }
        System.out.println(newS);
    }*/

    public static void main(String[] args) {
       /* String inp="My name is ";
        int val = (int)inp.charAt(4);
        System.out.println(val);*/
       Scanner sc = new Scanner(System.in);
        String inp =sc.nextLine();
        int key = sc.nextInt();

        System.out.println(findCypher(inp,key));

    }

    private static String findCypher(String inp, int key) {
        StringBuffer sb = new StringBuffer();
        //find if the character is a number
        //0-9 ascii val is 48-57
        //A-Z ascii value is 97 -122
        //a-z ascii value is 65-90

        //the only character allowed are in the range between
        List<Integer> range = IntStream.range(48, 58).boxed().collect(Collectors.toList());
        List<Integer> range2 = IntStream.range(65, 91).boxed().collect(Collectors.toList());
        List<Integer> range3 = IntStream.range(97, 123).boxed().collect(Collectors.toList());

        Stream<Integer> combinedStream = Stream.of(range, range2, range3)
                .flatMap(Collection::stream);
        List<Integer> collectionCombined =
                combinedStream.collect(Collectors.toList());
        for (int i = 0; i < inp.length(); i++) {
            //find ascii val for that character
            int val = (int) inp.charAt(i);
            Integer searchedBeforeCyphering = collectionCombined.stream().filter(x -> x == val).findAny().orElse(null);
            if (searchedBeforeCyphering != null) {
                final int newVal = val + key;
                Integer searched = collectionCombined.stream().filter(x -> x == newVal).findAny().orElse(null);
                if (searched == null) {
                    //change the track f=to get value differently
                    if(newVal <65 && newVal >57){
                        int newVal1= newVal-64;
                        sb.append((char) newVal1);
                    }else if (newVal <97 && newVal >90){
                        int newVal1= newVal-64;
                        sb.append((char) newVal1);
                    }
                } else {
                    sb.append((char) newVal);
                }

        }else{
            sb.append((char) val);
        }
    }
        return sb.toString();
    }

}
