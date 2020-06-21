package com.rojanmaharjan.tictactoe;

import java.util.ArrayList;

public class TicTacToeUI {
	private String [][] matrix=  {{" "," "," "},{" "," "," "},{" "," "," "}};
	private ArrayList <Integer> spotsTaken = new ArrayList<>();

	public String[][] getMatrix() {
		return matrix;
	}
	
	public String[][] getMatrixUI() {
		String matrixUI [][] = {
				{this.matrix[0][0], " | ", this.matrix[0][1], " | ", this.matrix[0][2]}, 
				{"-","---","-","---","-"},
				{this.matrix[1][0], " | ", this.matrix[1][1], " | ", this.matrix[1][2]}, 
				{"-","---","-","---","-"},
				{this.matrix[2][0], " | ", this.matrix[2][1], " | ", this.matrix[2][2]}, 
				};
		return matrixUI;
	}
	
	
	public boolean placeTic(int position, String player) {
		
		if (spotsTaken.contains(position)) {
			return false;
		} else {
			switch (position) {
			case 1:
				this.matrix[0][0] = player;
				break;
			case 2:
				this.matrix[0][1] = player;
				break;
			case 3:
				this.matrix[0][2] = player;
				break;
			case 4:
				this.matrix[1][0] = player;
				break;
			case 5:
				this.matrix[1][1] = player;
				break;
			case 6:
				this.matrix[1][2] = player;
				break;
			case 7:
				this.matrix[2][0] = player;
				break;
			case 8:
				this.matrix[2][1] = player;
				break;
			case 9:
				this.matrix[2][2] = player;
				break;
			default:
				break;
		}
			spotsTaken.add(position);
			return true;
		}

	}

	public void printBoard(String [][] board) {
		for (String[] elementRow: board) {
			for (String element: elementRow) {
				System.out.print(element);
			}
			System.out.println();				
		}
	}
}
