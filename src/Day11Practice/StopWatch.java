package Day11Practice;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	private boolean running;
	
    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }
	public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            running = false;
            long elapsedTime = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed Time: " + elapsedTime + " milliseconds.");
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch stwch= new StopWatch();
		stwch.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stwch.stop();
	

	}

}
