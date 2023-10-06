package practice;

public class ComputeImpl implements Compute{

	@Override
	public int computePrintJobCost(PrintJob printjob) {
		int color = 0;
		int size = 0;
		
		String[] colorArr = {"Grayscale", "Color"};
		int[] colorIntArr = {5, 15};
		
		for(int i=0; i<2; i++) {
			if(printjob.getColorType().equals(colorArr[i])) {
				color = colorIntArr[i];
			}
		}
		
		String[] sizeArr = {"A4", "A5", "Letter", "Legal"};
		int[] sizeIntArr = {40, 20, 30, 25};
		
		for(int i=0; i<4; i++) {
			if(printjob.getPaperSize().equals(sizeArr[i])) {
				size = sizeIntArr[i];
			}
		}
		
		int cal = (color+size)*printjob.getCount();
		
		System.out.println(Math.round(cal/10)*10);
		return Math.round(cal/10)*10;
	}

	
}
