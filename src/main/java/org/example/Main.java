package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(delitel(x, y));
        }
    }
    public static Integer delitel(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return delitel(b, a%b);
        }
    }

}