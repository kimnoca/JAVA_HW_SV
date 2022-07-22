class TV{
	private int size;
	public TV(int size) {this.size = size;}
	public int getSize() {return size;}
}

class ColorTV extends TV{
	private int color;
	public int getColor() {return color;}
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println( getSize() + "inch" + getColor() + "color");
	}
}


class IPTV extends ColorTV{
	private String ip;
	IPTV(String ip, int size, int color){
		super(size,color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("MY IP Address " + ip + " "+ getSize() + "inch " + getColor() + "color");
	}
}


public class TV_main {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("localhost" , 32 , 2048);
		iptv.printProperty();

	}

}
