package com.serenity;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {

//        System.out.println("Hey!!");
//
//        //variables
//        //primitive
//
//        int a = 1234567890;
//        long b = 12345678900L;
//        float c = 1.2f;
//        byte d = 66;
//        boolean e = true;
//        char f = 's';
//        double g = 2.33333;
//        short h = 4;
//
//
//        //non-primitive
//        //String
//
//        String p = new String("Palak");
//        String s = new String("Srinath");
//
//        System.out.println(p + " " + s);
//
//        String z = p + " " + s;
//
//        System.out.println(z);
//
//        System.out.println("Length of the string is : " + z.length());
//
//        System.out.println("Character at position number third is "+ z.charAt(2) );
//
//        System.out.println("Replacing the characters "+ z.replace("Srinath", "Srinath Veguru"));
//
//        System.out.println(z.substring(6,13));
//
//        System.out.println(z);
//
//
//        //Arrays
//
//        int[] rank = new int[6];
//        String[] names = new String[10];
//
//        rank[0] = 1;
//        rank[1] = 2;
//
//        names[0] = "Palak";
//        names[1] = "Srinath";
//
//        System.out.println("Rank of " + names[1] + " is : " + rank[0]);
//        System.out.println("Rank of " + names[0] + " is : " + rank[1]);
//
//        //System.out.println(names.length);
//
//        //Arrays.sort(names);
//
//        String[] i = {"old", "new"};
//        //System.out.println(i.length);
//
//        //2D Arrays
//
//        int[][] y = {{1, 2, 3}, {4, 7}, {6, 9}};
////        System.out.println(y.length);
////        System.out.println(y[1][0]);
//
//
//
//        //switch
//        Scanner sc = new Scanner(System.in);
//        //System.out.println("Enter your birth month in digit : ");
//        int month = sc.nextInt();
//
//        switch(month){
//            case 1:
//                System.out.println("Your birth month is January");
//                break;
//            case 2:
//                System.out.println("Your birth month is February");
//                break;
//            case 3:
//                System.out.println("Your birth month is March");
//                break;
//            case 10:
//                System.out.println("Your birth month is October");
//                break;
//            case 4:
//                System.out.println("Your birth month is April");
//                break;
//            default:
//                System.out.println("Your birth month is May-Dec except October");
//
//        }
//
//
//        for (int j = 10; j > 0; j--){
//            //System.out.println(j);
//        }

//        int n = 1;
//        while (n <= 10){
//            System.out.println(n);
//            n++;
//        }


//        int t = 100;
//        do{
//            System.out.println(t);
//            t--;
//        }while (t >= 1);
//    }


//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//
//        do {
//            System.out.println("Enter a number greater than 0 : ");
//            input = sc.nextInt();
//            System.out.println("Your number is : " + input );
//        } while (input > 0);
//
//        System.out.println("BYE BYE !!");

//        int i = 0;
//        while (true){
//
//            if(i == 55){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//            if (i == 101){
//                break;
//            }

//    }

        //Mini Project


       int a = (int) (Math.random()*100);
       System.out.println("----- Check if your number matches the lucky number -----");

       Scanner sc = new Scanner (System.in);


       while(true){
           System.out.print("Enter a number : ");
           int b = sc.nextInt();
           if (b < 0){
               System.out.println(" You have entered an invalid number. GAME OVER !!!");
               break;
           }
           else if (b < a){
               System.out.println("Your number is smaller than the lucky number. Try again !!");
           }
           else if (b > a){
               System.out.println("Your number is bigger than the lucky number. Try again !!");
           }
           else{
               System.out.println("You have entered " + b + " and the lucky number is " + a +". Congratulations !!!");
               break;
           }

       }


        // First 10 even numbers


        // for (int i=1; i<=10; i++){
        //     if(i%2 == 0)
        //         System.out.println(i);
        // }


    }
}
