package com.bridgelab.workshop;

public class TikTakToe1 {
    static void board() {
        char[] arr = new char[10];
        for (int i = 1; i < 9; i++) {
            arr[i] = ' ';
        }
    }

    public static void main(String[] args) {
        board();
    }
}
