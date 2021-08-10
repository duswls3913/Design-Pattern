package MP02.strategyPattern;
import java.util.Date;

public class FileInfo {
	String name;
	String type;
	int size;
	Date modifiedDate;
	
	
	public FileInfo(String name, String type, int size, Date modifiedDate) { //»ý¼ºÀÚ
		this.name = name;
		this.type = type;
		this.size = size;
		this.modifiedDate = modifiedDate;		
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public String toString() {
		return "name: "+name+"\n"+"type: "+type+"\n"+"size: "+size+"\n"+"modifiedDate: "+modifiedDate;
		
	}

}
