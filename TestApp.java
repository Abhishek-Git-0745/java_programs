package com.sit.elevator;

import java.util.Scanner;

class Elevator{
	int current = 1;
	static Scanner sc = new Scanner(System.in);
	void display() {
		System.out.println("Enter the operation you want to perform");
		System.out.println("S : Select the floor \nF : Fire alarm \nQ : Quit ");
		System.out.print("-->");
		char choice = Elevator.sc.next().charAt(0);
		
		switch(choice) {
		case 'S':
			selectFloor();
			break;
		case 'F':
			fireAlarm();
			break;
		case 'Q':
			System.out.println("Thanks You! have a good day.");
	}
	}
	void selectFloor() {
		
		System.out.print("Enter the floor that you would like to go :");
		int floor = sc.nextInt();
		if(floor>10 || floor<0) {
			System.out.println("Enter valid floor number ");
			selectFloor();
		}else {
			if(current<floor) {
				for(int i=current;i<=floor;i++) {
					System.out.print(i+"...");
				}
				System.out.println("Ding9*!");
				current = floor;
				display();
				
			}
			else {
				for(int i=current;i>=floor;i--) {
					System.out.print(i+"..");
					System.out.println("Ding!");
				current = floor;
				display();
			}
			}
		}
	}
	
	void fireAlarm() {
		System.out.println("Danger! leave the building as possible ");
		System.out.println("You are going first floor soon");
		for(int i=current;i>=1;i--) {
			System.out.print(i+"..");
		}
		System.out.println();
		System.out.println("leave the building and be safe");
		display();
	}
	
}


public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator e1 = new Elevator();
		e1.display();
		
		
			
			
		}
	}


