package com.player;

public class CricketPlayer extends Players{

	
	
	@Override
	public void gameInfo() {
		System.out.println("This is Cricket game..");
		
	}

	public void trainingCost()
    {
        Service s = new Service();
        int cost = s.GetSupportstaff() + s.GetTransportation() + s.GetBreakfast();
        System.out.println("training cost :" + cost);
    }
}
