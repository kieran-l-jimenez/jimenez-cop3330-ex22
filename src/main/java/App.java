import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Comparing Numbers" output
 * Enter the first number: 1
 * Enter the second number: 51
 * Enter the third number: 2
 * The largest number is 51.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int biggestNum, temp, temp2;

        System.out.print("Enter the first number: ");
        biggestNum = in.nextInt();

        System.out.print("Enter the second number: ");
        temp = in.nextInt();
        if(temp == biggestNum)
            System.exit(-1);
        if(biggestNum < temp)
            biggestNum = temp;

        System.out.print("Enter the third number: ");
        temp2 = in.nextInt();
        if(temp2 == biggestNum || temp == temp2)
            System.exit(-1);
        if(biggestNum < temp2)
            biggestNum = temp2;

        System.out.println("The largest number is " + biggestNum + ".");
    }

}