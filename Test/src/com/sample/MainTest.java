package com.sample;

import java.util.Scanner;

class Fortune extends Thread{
	public void run(){
		while(true){
			System.out.println("good things will happen");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class MainTest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Fortune fortune = new Fortune();
		fortune.start();
		System.out.println("enter anything ");
		scan.nextLine();
		System.out.println("you have just entered something");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("main thread ends!!!!");
	}

}
