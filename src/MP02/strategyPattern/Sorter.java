package MP02.strategyPattern;
public class Sorter {
	Comparable compare;
	
	public Sorter(Comparable comparable) {
		compare = comparable;
	}
	
	public void setComparable(Comparable comparable) {
		compare = comparable;
	}
	
	public void bubbleSort(Object[] data) { //파일인포 리스트
		for(int i=0; i<data.length-1; i++) {
			for(int j=0; j<data.length-i-1; j++) {
				if(compare.compareTo(data[j],data[j+1])>0) {
					Object temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					
				}
			}
			
		}
		
	}
}
