package com.softset;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException  {

        InputStreamReader strreader=new InputStreamReader(System.in);
        BufferedReader reader= new BufferedReader(strreader);

        Scanner keyboard =new Scanner(System.in);
        System.out.println("List of tasks: ");

        System.out.println(" 1) Calculator + - / * ");
        System.out.println(" 2) 'How are you?' ");
        System.out.println(" 3) Char type");
        System.out.println(" 4) Check on positivity: ");
        System.out.println(" 5) If number in range [-5;5] ");
        System.out.println(" 6) Find minimum and maximum: ");

        System.out.println("Input number of task: ");
        int number = keyboard.nextInt();
        int a,b;
        float c,d,e;

        char first,second,third;
        //System.out.println();
        switch(number)
        {
            case 1:
                System.out.println("Input (integer) first number: ");
                a=keyboard.nextInt();
                System.out.println("Input (integer) second number: ");
                b=keyboard.nextInt();
                System.out.println("Addition: " + (a+b));
                System.out.println("Difference: "+(a-b));
                System.out.println("Multiplication: "+ (a*b));
                try
                {
                    float division;
                    division=a/b;
                    System.out.println("Division: "+ division);
                }catch(Exception ex)
                {
                    System.out.println("Division on 0 doesn`t work");
                }
                break;
            case 2:
                System.out.println("Hello dear User =3 How are you?");
                String answer = reader.readLine();
                System.out.println("I am "+ answer);
                break;
            case 3:
                System.out.println("Input CharType symbol: ");
                first=keyboard.next().charAt(0);
                System.out.println("Input CharType symbol: ");
                second=keyboard.next().charAt(0);
                System.out.println("Input CharType symbol: ");
                third=keyboard.next().charAt(0);
                System.out.println("You enter "+first+" "+second+" "+third);
                break;
            case 4:
                System.out.println("Input (integer) first number: ");
                a=keyboard.nextInt();
                System.out.println("Input (integer) second number: ");
                b=keyboard.nextInt();
                boolean positivity = false;
                System.out.println("BOTH Positive? ");
                if(a>0&&b>0)
                {
                    positivity=true;
                    System.out.println(positivity);
                }
                else
                    System.out.println(positivity);
                break;
            case 5:
                System.out.println("Check numbers in range[-5;5] ");
                System.out.println("Input (float) first number: ");
                c=keyboard.nextFloat();
                System.out.println("Input (float) second number: ");
                d=keyboard.nextFloat();
                System.out.println("Input (float) third number: ");
                e=keyboard.nextFloat();
                if(c>=-5&&c<=5)
                {
                    System.out.println(c + "is in range from -5 to 5 ");
                }
                else
                    System.out.println(c + "is not in range from -5 to 5 ");
                if(d>=-5&&d<=5)
                {
                    System.out.println(d + "is in range from -5 to 5 ");
                }
                else
                    System.out.println(d + "is not in range from -5 to 5 ");
                if(e>=-5&&e<=5)
                {
                    System.out.println(e + "is in range from -5 to 5 ");
                }
                else
                    System.out.println(e + "is not in range from -5 to 5 ");
                break;
            case 6:
                int[] Array=new int[3];

                for(int i =0;i<Array.length;i++)
                {
                    System.out.println("Input (integer) number: ");
                    Array[i]=keyboard.nextInt();
                }

                int min=Array[0];
                int max=Array[0];

                for(int i=0;i<Array.length;i++)
                {
                    if(Array[i]<min)min=Array[i];
                    if(Array[i]>max)max=Array[i];
                }
                System.out.println("MAXIMUN : "+max);
                System.out.println("MINIMUN : "+min);
                break;
            default:
                System.out.println("Hello Nazar ^-^ ");
                break;

        }


    }
}
