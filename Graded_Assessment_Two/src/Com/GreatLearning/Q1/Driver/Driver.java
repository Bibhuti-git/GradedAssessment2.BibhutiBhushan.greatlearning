package Com.GreatLearning.Q1.Driver;

import java.util.Scanner;

import Com.GreatLearning.Q1.Service.Service;

public class Driver {
	public static void main(String[] args) {
		// Declaring the variables
		int NoOfFloors;
		int [] Floors;
		Scanner sc= new Scanner (System.in);
		//Taking the height of the building
		System.out.println("ENTER THE TOTAL NUMBER OF FLOORS IN THE BUILDING");
		
		NoOfFloors= sc.nextInt();
		Floors= new int [NoOfFloors];
		
		for(int i=0;i<NoOfFloors;i++) {
			System.out.println("ENTER THE FLOOR SIZE GIVEN ON DAY:"+(i+1));
			Floors [ i]= sc.nextInt();
			
		}
		System.out.println();
		Service service= new Service();
		service.printConstructionTable(Floors);
		
	}

}
