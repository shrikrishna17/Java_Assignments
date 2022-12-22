package com.player;

public class TennisPlayer extends Players{

	@Override
	public void gameInfo() {
		System.out.println("this is Tenis Game");

		
	}
	
	public void trainingCost()
    {
        Service s = new Service();
        int cost = s.GetSupportstaff() + s.GetTransportation() + s.GetBreakfast();
        System.out.println("training cost is:" + cost);
    }
}
