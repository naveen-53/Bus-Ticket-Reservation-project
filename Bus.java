package busResv;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no , boolean ac , int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusno() { return busno;}
	
	public boolean isAc() { return ac;}
	
	public int getcap() { return capacity;}
	
	public void setAc(boolean val) { ac= val;}
	
	public void setcap(int cap) { capacity = cap;}
	
	

}
