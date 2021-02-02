package edu.akki.practice;


import java.util.Scanner;

/*Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
        Help Goki find his friends.

        INPUT
        First line of the input contains an integer N denoting the number of people.

        Next line contains a single integer X - denoting the minimum skill required to be Goki's friend.

        Next n lines contain one integer Y - denoting the skill of ith person.*/
public class GokiSkillProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int minSkillReq = sc.nextInt();

        for (int i = 0; i < no; i++) {
            int inp = sc.nextInt();
            if (inp >= minSkillReq) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
