package nabil.first;

public class pc {
	private int ram;
	private int hd;
	private String model;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public pc(int ram, int hd, String model) {
		super();
		this.ram = ram;
		this.hd = hd;
		this.model = model;
	}
	
	
	

}
