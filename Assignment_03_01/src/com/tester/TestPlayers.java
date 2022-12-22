package com.tester;

import java.util.HashMap;
import java.util.Scanner;

import com.player.CricketPlayer;
import com.player.Players;
import com.player.PoloPlayer;
import com.player.TennisPlayer;

public class TestPlayers {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String>game = new HashMap<Integer,String>();
		game.put(1,"Cricket");
		game.put(2,"Tennis");
		game.put(3,"Polo");
		game.put(4,"Hockey");
		game.put(5,"Football");
		
		boolean exit = false;
	
		while(!exit) {
			
			int age;
			System.out.println("Enter age of player");
			age = sc.nextInt();
			Players p = new Players();
			p.fitnessneeds(age);
			System.out.println("Choose Game 1.Cricket 2.Tennis 3.Polo 4.Hockey 5.Football 10.Exit");
			
			switch(sc.nextInt()) {
			case 1:
			
				CricketPlayer player = new CricketPlayer();
				player.gameInfo();
				player.trainingCost();
				System.out.println();
				break;
			case 2:
				TennisPlayer player1 = new TennisPlayer();
				player1.gameInfo();
				player1.trainingCost();
				break;
			case 3:
				PoloPlayer player2 = new PoloPlayer();
				player2.gameInfo();
				player2.trainingCost();
				break;
			case 4:
				break;
			case 5:
				break;
			case 10:
				exit = true;
				break;
			}
		}
		
		
	}
}
