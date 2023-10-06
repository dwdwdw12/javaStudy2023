package practice;

public class MainClass {

	public static void main(String[] args) {
		
		PrintJob job1 = new PrintJob("Color", "A4", 4);
		PrintJob job2 = new PrintJob( "Grayscale", "Legal", 53);
		PrintJob job3 = new PrintJob("Color", "A5", 40);
		
		Compute compute = new ComputeImpl();
		
		compute.computePrintJobCost(job1);
		compute.computePrintJobCost(job2);
		compute.computePrintJobCost(job3);
		
	}
	
}
