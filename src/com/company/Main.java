package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)

    {
        // MINI Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;


        do {

            System.out.println("Guess my number :");
            userNumber = sc.nextInt();
            if (userNumber == myNumber)

            {

                System.out.println("Woohoo No guesses correctly");
                break;
            }

            else if(userNumber > myNumber){

                System.out.println("your no is too large");
            }
            else

            {
                System.out.println("your no is too small");

            }
        }while(userNumber>=0);

           System.out.print("my number was :");
           System.out.println(myNumber);
    }

}