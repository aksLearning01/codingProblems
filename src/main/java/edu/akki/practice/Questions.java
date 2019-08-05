package edu.akki.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Questions {

    /**
     * Method to check if two strings are anagrams or not
     *
     * @param inp
     * @return
     */
    public boolean checkForAnagrams(String inp) {
        return (new StringBuffer(inp).reverse().toString().equals(inp));
    }

    /**
     * Method to replace input string with replacement string for all spaces
     *
     * @param inp
     * @param rep
     * @return
     */
    public static String replacement(String inp, String rep) {
        return inp.trim().replace(" ", rep);
    }


    /**
     * Method to determine if string contains all unique characters
     *
     * @param inp
     */
    public Boolean findUniqueness(final String inp) {
        boolean flag = true;
        for (int i = 0; i < inp.length(); i++) {
            for (int j = i + 1; j < inp.length(); j++) {
                if (inp.charAt(i) == inp.charAt(j)) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public Boolean findUniquenessWithLesscomplexity(final String inp) {
        boolean flag = true;
        char[] c = inp.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != c[i + 1]) {
                continue;
            } else {
                flag = false;
                break;
            }

        }
        return flag;
    }


    public boolean checkForPermutations(String inp1, String inp2) {
        char[] c1 = inp1.toCharArray();
        char[] c2 = inp2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }


    public static boolean permutationPalindromCheck(String input) {
        boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();
        input = input.replaceAll("\\s", "");
        System.out.println("Input is as :" + input);
        char[] ca = input.toLowerCase().toCharArray();
        int count = 0;
        for (char c : ca) {
            if (map.containsKey(c)) {
                int occCount = map.get(c);
                map.put(c, occCount + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character> set = map.keySet();
        int countOfOddOcc = 0;
        for (Character c : set) {
            if (map.get(c) % 2 != 0 && c != ' ') {
                countOfOddOcc++;
            }
        }
        if ((input.length() % 2 != 0 && countOfOddOcc == 1) || (input.length() % 2 == 0 && countOfOddOcc == 0)) {
            flag = true;
        }
        return flag;
    }

    public boolean palindrome(String inp) {
        StringBuffer sb = new StringBuffer(inp);
        String output = sb.reverse().toString();
        if (inp.equals(output)) {
            return true;
        } else
            return false;
    }


    public static boolean checkOneWay(String inp1, String inp2) {
        boolean flag = false;
        char[] c1 = inp1.toLowerCase().toCharArray();
        char[] c2 = inp2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        //case 1: replacement
        int replacement = 0;
        if (inp1.length() == inp2.length()) {
            int count = 0;
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c2.length; j++) {
                    if (c1[i] == c2[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == inp1.length() - 1) {
                replacement = 1;
            }
        }


        // Case:2 -- Insert a character
        int insertion = 0;
        if (inp1.length() - inp2.length() == 1) {

            int count = 0;
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c2.length; j++) {
                    if (c1[i] == c2[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == inp2.length()) {
                insertion = 1;
            }
        }

        //Case-3 :: Removal of element
        int removal = 0;
        if (inp2.length() - inp1.length() == 1) {
            int count = 0;
            for (int i = 0; i < c2.length; i++) {
                for (int j = 0; j < c1.length; j++) {
                    if (c1[i] == c2[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == inp2.length()) {
                removal = 1;
            }

        }


        if (insertion + removal + replacement == 1) {
            flag = true;
        }

        return flag;
    }

    public static void matrixRotation(int[][] a) {

        int N = 4;

        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {

                // Swap elements of each cycle
                // in clockwise direction
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
        //print the matrix again
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
                //
            }
            System.out.println();
        }


    }


    public static void chunkArr(int[] a, int size) {
        for (int i = 0; i < a.length; i = i + size) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, Math.min(a.length, i + size))));

        }

    }

    public static String capitalise(String inp) {
        StringBuffer sb = new StringBuffer();
        char[] c = inp.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                sb.append(c[i]);
                i++;
                sb.append(Character.toUpperCase(c[i]));

            } else {
                sb.append(c[i]);
            }
        }
        return (sb.toString());

    }

    public static void stepShape(int n) {
        String x = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    x = x + "#";
                } else {
                    x = x + " ";
                }


            }
            System.out.println(x);
            System.out.println();
        }


    }

    public static void pyramid(int n) {
        double midD = Math.floor((2 * n - 1) / 2);
        int mid = (int) midD;
        for (int i = 0; i < n; i++) {
            String level = "";
            for (int j = 0; j < 2 * n - 1; j++) {
                if (mid - i <= j && mid + i >= j) {
                    level = level + "#";
                } else {
                    level = level + " ";
                }
            }
            System.out.println(level);
            System.out.println();
        }
    }


    public static int vowelsNo(String str) {
        str=str.toLowerCase();
        int result = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u') {
                result++;
            }
        }
        return result;


    }


    public static void main(String[] args) {
      /*  int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        matrixRotation(arr);*/


        /*HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm.size());

        for (Integer name : hm.keySet()) {

            System.out.println(name + " " + hm.get(name));

        }

        int[] a = {1, 2, 3, 4, 5};
        chunkArr(a, 3);*/


        /*System.out.println(capitalise("This is my app"));*/

        System.out.println(vowelsNo("aoanksea"));
    }
}



