package edu.akki.practice;

import java.util.Scanner;
//Ankit is in maze. The command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.
public class MazeProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String inp = sc.nextLine();
            System.out.println(findOutput(inp));
        }
    }

    private static String findOutput(String inp) {
        String res = "";
        int x = 0;
        int y = 0;
        char[] c = inp.toCharArray();
        for (int i = 0; i < inp.length(); i++) {
            if (c[i] == 'L') {
                x = x-1;
            } else if (c[i] == 'R') {
                x = x+1;
            } else if (c[i] == 'U') {
                y = y+1;
            } else if (c[i] == 'D') {
                y = y-1;
            }
        }
        StringBuffer sb = new StringBuffer(res);
        return sb.append(x).append(" ").append(y).toString();
    }
}
