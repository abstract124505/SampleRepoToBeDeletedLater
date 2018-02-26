package com.sample;



public class SampleThreadTest {

	public static void main(String[] args) {
        //even thread 
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<=10;i=i+2){
					System.out.print(i+" ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
       //odd thread
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<10;i=i+2){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print(i+" ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
