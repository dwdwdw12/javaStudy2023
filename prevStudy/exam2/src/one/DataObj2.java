package one;

import java.util.Objects;

public class DataObj2 {
	public int data1 = 200;
	public char data2 = 'A';
	
	@Override			//data1만 hashcord equals
	public int hashCode() {
		return Objects.hash(data1);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObj2 other = (DataObj2) obj;
		return data1 == other.data1;
	}
	
}
