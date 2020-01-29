package com.company;

import java.util.Scanner;

/**
 * Created by admin on 10/25/2019.
 */
public class St {
    int score1;
    int score2;
    int score3;
    public void  c(String string){
        Scanner input = new Scanner(System.in);
        if (string.equals("nafiseh")){
            System.out.println("enter the score!");
            this.score1=input.nextInt();
            if (score1<10){
                System.out.println("you ve failed!");
            }
        }else if (string.equals(("ali")))
        {
            System.out.println("enter the score!");
            this.score2=input.nextInt();
            if (score1<10){
                System.out.println("you ve failed!");
            }
        }else if (string.equals("maryam"))
        {
            System.out.println("enter the score!");
            this.score3=input.nextInt();
            if (score1<10){
                System.out.println("you ve failed!");
            }
        }else {
            System.out.println("there isnt such a student! ");
        }
    }
}
