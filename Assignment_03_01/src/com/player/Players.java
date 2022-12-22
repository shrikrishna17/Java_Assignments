package com.player;

import com.Exceptions.PlayersException;

public class Players {

	public void fitnessneeds(int age){
		try {
			if(age<12)
				throw new PlayersException("Age should be greater than 12 years");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gameInfo() {
		
	}
}
