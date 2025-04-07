package ex02;

public abstract class TV {

	private String model;
	private int size;
	private int channel;
	
	public TV() {}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	
	public abstract void channelUp(int volume);
	public abstract void channelDown(int volume);
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}


	
	public void channelUp() {
		System.out.println();
	}
	
	public  void chnnerlDown() {
		
	}
	
}
