package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private static char[] boardArray = new char[10];
    private static char player1Choice;
    private static char player2Choice;

    static Scanner scan = new Scanner(System.in);

    //UC1 Initialize Board
    public static void initBoard() {
        for (int i = 1; i < 10; i++) {
            boardArray[i] = ' ';
        }
    }

    //UC2 Get User Input
    public static void playerChoice() {

        System.out.println("Enter Player 1 choice (X / O) :");
        char choice = scan.next().toUpperCase().charAt(0);
        if (choice == 'X') {
            player1Choice = choice;
            player2Choice = 'O';
        } else if (choice == 'O') {
            player1Choice = choice;
            player2Choice = 'X';
        } else {
            System.out.println("Wrong Choice Entered.");
            playerChoice();
        }
    }

    //UC3 Show Board
    public static void showBoard() {
        System.out.println(" ----------- ");
        System.out.println("| " + boardArray[1] + " | " + boardArray[2] + " | " + boardArray[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardArray[4] + " | " + boardArray[5] + " | " + boardArray[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardArray[7] + " | " + boardArray[8] + " | " + boardArray[9] + " |");
        System.out.println(" ----------- ");
    }

    //UC4 User Input
    private static void getUserInput(int i) {
        System.out.println("Player " + i + " Enter the Position for Your Symbol :");
        int position = scan.nextInt();

        if (i == 1) {
            boardArray[position] = player1Choice;
        } else {
            boardArray[position] = player2Choice;
        }
    }
    private static int flipToss() {
        Random toss = new Random();
        int tossValue = toss.nextInt(2)+1;
        return tossValue;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe Game Program");
        initBoard();
        playerChoice();
        showBoard();


    }
}




