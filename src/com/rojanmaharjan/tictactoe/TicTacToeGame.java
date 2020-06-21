package com.rojanmaharjan.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		TicTacToeUI snakeui = new TicTacToeUI();
		TicTacToeLogic.playGame(snakeui);
		}
}
