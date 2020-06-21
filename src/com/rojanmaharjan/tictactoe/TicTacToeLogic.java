package com.rojanmaharjan.tictactoe;

import java.util.Scanner;

public class TicTacToeLogic {
	public static void playGame(TicTacToeUI snakeui){
		for (int i = 1; i <10; i++) {
			String [][] board = snakeui.getMatrixUI();				
			if (i%2 == 0) {
				String player = "X";
				
				Scanner sc = new Scanner(System.in);
				snakeui.printBoard(board);
				System.out.println("Pick a spot");
				int spot = sc.nextInt();
				while (true) {
					if (snakeui.placeTic(spot, player)) {
						break;	
					} else {
						System.out.println("Spot already taken, pick another spot.");
					}
					spot = sc.nextInt();		
				};
				if (TicTacToeLogic.isWon(snakeui.getMatrix(), player)) {
					System.out.println("You won!");
					break;
				}
			} else {
				String player = "O";
				int spot = (int) Math.floor(Math.random() *9);
				while (true) {
					if (snakeui.placeTic(spot, player)) {
						break;							
					}
					spot = (int) Math.floor(Math.random() *9);
				};			
				if (TicTacToeLogic.isWon(snakeui.getMatrix(), player)) {
					System.out.println("CPU won!");
					break;
				}
			}
			if (i==9) {
				System.out.println("Its a draw");
				break;
			}
		}
	}
	
	public static boolean isWon(String[][] matrix, String player) {
		if (matrix [0][0] == player && matrix [0][1] == player && matrix [0][2] == player) {
			return true;
		} else if (matrix [1][0] == player && matrix [1][1] == player && matrix [1][2] == player) {
			return true;
		} else if (matrix [2][0] == player && matrix [2][1] == player && matrix [2][2] == player) {
			return true;
		} else if (matrix [0][0] == player && matrix [1][1] == player && matrix [2][2] == player) {
			return true;
		} else if (matrix [0][2] == player && matrix [1][1] == player && matrix [2][0] == player) {
			return true;
		}
		return false;		
	}
}
