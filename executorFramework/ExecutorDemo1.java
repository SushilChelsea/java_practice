import java.util.concurrent.*;
class PrintJob implements Runnable {
	String name;
	PrintJob(String name) { this.name = name;	}
	public void run() {
		System.out.println(name + "...job started by Thread: " + Thread.currentThread().getName());
		try {	Thread.sleep(6000);	} catch(InterruptedException e) {}
		System.out.println(name + "...job completed by Thread: " + Thread.currentThread().getName());
	}
}
public class ExecutorDemo1 {
	public static void main(String[] args) {
		PrintJob[] jobs = {	new PrintJob("Durga"),
							new PrintJob("Ravin"),
							new PrintJob("Shiva"),
							new PrintJob("Pawan"),
							new PrintJob("Sudip"),
							new PrintJob("Anesh")
							};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job: jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}