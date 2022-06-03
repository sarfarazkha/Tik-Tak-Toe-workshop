package com.bridgelab.workshop;


import java.util.Scanner;

public class TikTakToe6 {
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard,int pos, String user){
        char symbol =' ';
        if(user.equals("player")){
            symbol='X';
        }
        else
            symbol='O';
        switch (pos){
            case 1:
                if(gameBoard[0][0] == ' ') {
                    gameBoard[0][0]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 2:
                if(gameBoard[0][2] == ' ') {
                    gameBoard[0][2]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 3:
                if(gameBoard[0][4] == ' ') {
                    gameBoard[0][4]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 4:
                if(gameBoard[2][0] == ' ') {
                    gameBoard[2][0]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 5:
                if(gameBoard[2][2] == ' ') {
                    gameBoard[2][2]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 6:
                if(gameBoard[2][4] == ' ') {
                    gameBoard[2][4]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 7:
                if(gameBoard[4][0] == ' ') {
                    gameBoard[4][0]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 8:
                if(gameBoard[4][2] == ' ') {
                    gameBoard[4][2]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
            case 9:
                if(gameBoard[4][4] == ' ') {
                    gameBoard[4][4]= symbol;
                }
                else
                    System.out.print("Position is not empty");
                break;
        }
        printGameBoard(gameBoard);
    }

    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Welcome to the tic tac toe");
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);
        System.out.println("Enter the position between 1 to 9");
        int pos = SC.nextInt();
        String user = SC.nextLine();
        int random = (int) (Math.random()*2);        // to check the toss to win
        if(random == 0){
            user = "player";
        }
        else
            user = "CPU";
        placePiece(gameBoard,pos,user);
    }
}