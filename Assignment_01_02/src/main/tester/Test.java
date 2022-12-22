package main.tester;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import main.bisleri.BisleriData;
import main.customexceptions.BisleriCustomException;

public class Test {

	public static void main(String[] args) throws BisleriCustomException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of objects wants to create");
		BisleriData[] bottels = new BisleriData[sc.nextInt()];
		int count = 0;
		System.out.println("Enter bottle cost,capacity,supplied bottels");
		FileWriter errorText = new FileWriter("faliure.txt"); 
		for (int i = 0; i < bottels.length; i++) {
			System.out.println("Enter bootle cost of " + (i + 1) + " bootle");
			double cost = sc.nextDouble();
			if(cost !=20) {
				count = count+1;
				//throw new BisleriCustomException("Wrong bootle cost");
			}
			System.out.println("Enter capacity " + (i + 1) + " bottle");
			double capacity = sc.nextDouble();
			if(capacity >15) {
				count = count+1;
				//throw new BisleriCustomException("Wrong bottle capacity");
			}
			System.out.println("Enter how many bottle to supplied");
			double bottleSupplied = sc.nextDouble();
			bottels[i] = new BisleriData(cost, capacity, bottleSupplied);
			
			
		}
//		for (int i = 0; i < bottels.length; i++) {
//
//			System.out.println(bottels[i].getBottleCost()+" "+bottels[i].getCapacityLiters()+" "+bottels[i].getBottleSupplied());
//		}

		System.out.println("count = "+count);
	}

}
