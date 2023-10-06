package practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class PrintJob {
	
	private String colorType;
	private String paperSize;
	int count;
	
	public PrintJob(String colorType, String paperSize, int count) {
		super();
		this.colorType = colorType;
		this.paperSize = paperSize;
		this.count = count;
	}

	@Override
	public String toString() {
		return "PrintJob [colorType=" + colorType + ", paperSize=" + paperSize + ", count=" + count + "]";
	}
	
	
	
}
