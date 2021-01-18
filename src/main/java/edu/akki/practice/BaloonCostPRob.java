package edu.akki.practice;

import java.util.Scanner;

public class BaloonCostPRob {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {

            int gc = sc.nextInt();
            int pc = sc.nextInt();

            int users = sc.nextInt();

            int app1 = 0, app2 = 0;
            for (int i = 0; i < users; i++) {
                int f = sc.nextInt();
                int s = sc.nextInt();

                app1 = app1 + (f * gc + s * pc);
                app2 = app2 + (f * pc + s * gc);
            }

            System.out.println(app1 > app2 ? app2 : app1);
        }
    }

}
