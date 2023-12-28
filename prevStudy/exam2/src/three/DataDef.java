package three;

import java.util.Objects;

public class DataDef {
	public int i;
	public String si;
	
	public DataDef(int i, String si) {
		super();
		this.i = i;
		this.si = si;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(i, si);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		DataDef other = (DataDef) obj;
//		return i == other.i && Objects.equals(si, other.si);
//	}
		
	@Override									// i 만 적용
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {			
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataDef other = (DataDef) obj;
		return i == other.i;
	}
	
}
