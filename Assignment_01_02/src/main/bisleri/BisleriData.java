package main.bisleri;

public class BisleriData {
	public double bottleCost; 
	public double capacityLiters;
	public double bottleSupplied;
	
	 public BisleriData() {
		super();
	}
	public BisleriData(double bottleCost, double capacityLiters, double bottleSupplied) {
		super();
		this.bottleCost = bottleCost;
		this.capacityLiters = capacityLiters;
		this.bottleSupplied = bottleSupplied;
	}
	public double getBottleCost() {
		return bottleCost;
	}
	public void setBottleCost(double bottleCost) {
		this.bottleCost = bottleCost;
	}
	public double getCapacityLiters() {
		return capacityLiters;
	}
	public void setCapacityLiters(double capacityLiters) {
		this.capacityLiters = capacityLiters;
	}
	public double getBottleSupplied() {
		return bottleSupplied;
	}
	public void setBottleSupplied(double bottleSupplied) {
		this.bottleSupplied = bottleSupplied;
	}
	@Override
	public String toString() {
		return "BisleriData [bottleCost=" + bottleCost + ", capacityLiters=" + capacityLiters + ", bottleSupplied="
				+ bottleSupplied + "]";
	} 
	 
	 
}
