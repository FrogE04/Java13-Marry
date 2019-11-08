package com.example.lib13;
import java.util.Scanner;
public class MyClass {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter gender ");
            System.out.println(" 1 is Man/ 2 is Woman ");
            System.out.println("Enter Your age : ");
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            if((i==1)&&(j>=18))
                System.out.println("You can marry ! ");
            if((i==1)&&(j<18))
                System.out.println("You can't marry ! ");
            if((i==2)&&(j>=18))
                System.out.println("You can marry ! ");
            if((i==2)&&(j<18))
                System.out.println("You can't marry ! ");
        }
}
