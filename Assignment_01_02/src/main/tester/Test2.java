package main.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import main.bisleri.BisleriData;
import main.customexceptions.BisleriCustomException;

public class Test2 {

	public static void main(String[] args) throws BisleriCustomException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of objects wants to create");
		BisleriData[] bottels = new BisleriData[sc.nextInt()];
		int count = 0;
		
		String filepath = "C:\\Users\\shrikrishna.k\\Documents\\Z_Training\\JAVA\\Eclipse\\Assignment_01_02/failure.txt";
		FileWriter errorText = new FileWriter(filepath,true);
		for (int i = 0; i < bottels.length; i++) {
			System.out.println("Enter cost of " + (i + 1) + " bootle");
			double cost = sc.nextDouble();
			System.out.println("Enter capacity " + (i + 1) + " bottle");
			double capacity = sc.nextDouble();
			System.out.println("Enter how many bottle to supplied");
			double bottleSupplied = sc.nextDouble();
			bottels[i] = new BisleriData(cost, capacity, bottleSupplied);
			
			try {
				 
				if(cost !=20) {
					count = count+1;
					errorText.write("Bottle Cost Should be 20\n");
					//throw new BisleriCustomException("Wrong bootle cost");
				}
				if(capacity >15) {
					count = count+1;
					errorText.write("Bottle capacity should be less than 20\n");
					//throw new BisleriCustomException("Wrong bottle capacity");
				}
			}finally {
				
			}
			
		}

		
		errorText.close();
		//System.out.println("number of exceptions are = "+count);
		FileReader read = new FileReader("C:\\\\Users\\\\shrikrishna.k\\\\Documents\\\\Z_Training\\\\JAVA\\\\Eclipse\\\\Assignment_01_02/failure.txt");
		int lineCount =0;
		BufferedReader br = new BufferedReader(read);
		String s;
		while((s=br.readLine()) !=null) {
			lineCount++;
		}
		read.close();
		System.out.println("Total number of exceptions are "+(lineCount));
	}

}
