package com.bridgelab.workshop;


import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TikTakToe2 {
    static void board() {
        char[] arr = new char[10];
        for (int i = 1; i < 9; i++) {
            arr[i] = ' ';
        }

    }
    static void input () {

        System.out.println("enter X and O as a input");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if (input == 'X') {
            System.out.println("the value is X");
        }
        else if(input=='O')
        {
            System.out.println("the value is O");
        }
        else
        {
            System.out.println("enter a valid input");
        }
    }
    public static void main(String[] args) {
        board();
        input();
    }
}