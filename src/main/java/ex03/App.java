package ex03;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();
        System.out.println("Who said the quote?");
        String Speaker = input.nextLine();

        System.out.println(Speaker + " said, "+"\"" + quote + "\"");
    }
}
