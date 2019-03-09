//volatile to stop thread when not stopped due to OS 

public class Counter extends Thread {
	
	private int counter = 0; 
	private volatile boolean stopThread = false;  
	
	public void run() {
		
		while (!stopThread) {
			System.out.println(counter);
			counter++; 
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
	
	public void stopCount() {
		
		stopThread = true; 
		
	}


}

	





