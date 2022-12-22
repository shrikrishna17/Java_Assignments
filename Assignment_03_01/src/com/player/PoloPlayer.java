package com.player;

public class PoloPlayer extends Players{

	@Override
	public void gameInfo() {
		System.out.println("this is polo game..");
		
		
	}
	public void trainingCost()
    {
        Service s = new Service();
        int cost = s.GetSupportstaff() + s.GetTransportation() + s.GetBreakfast();
        System.out.println("training cost :" + cost);
    }
}
