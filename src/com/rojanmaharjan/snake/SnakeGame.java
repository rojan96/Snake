package com.rojanmaharjan.snake;

import java.util.Scanner;

public class SnakeGame {
	public static void main(String[] args) {
		
		while (true) {
			SnakeUI snakeui = new SnakeUI();
			for (String[] elementRow: snakeui.getMatrix()) {
				for (String element: elementRow) {
					System.out.print(element);
				}
				System.out.println();
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Pick a spot");
			int spot = sc.nextInt();
			snakeui.placeTic(spot, "X");
		}
	}
}
