/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class ThreadExample  implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			if(i==5) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadExample th = new ThreadExample();
		Thread t1 = new Thread(th);
		t1.run();
	}


}
