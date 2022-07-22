class Point {
	private int x, y;
	public Point() {} //��� ����
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	public void setX() { this.x = x; }
	public void setY() { this.y = y; }
	protected void move(int x, int y) { this.x =x; this.y = y; }
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y ,String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String Str = color + "����" + "(" + getX() + "," + getY() + ")����" ;	
		return Str;
}

}
class Point3D extends Point{
	private int z;
	public Point3D(int x, int y , int z) {
		super(x,y);
		this.z = z;
	}
	protected void move(int x, int y, int z) {
		move(x,y);
		this.z = z; 
	}
	protected int moveUp() {
		return this.z = z+1;
	}
	protected int moveDown() {
		return this.z = z-1;
	}
	public String toString() {
		String Str = "(" + getX() + "," + getY() + "," + z +")����" ;	
		return Str;
	}
	
}

class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0 || y<0 ) {
			super.move(-x, -y);
		}
	}
	protected void move(int x, int y) {
		if(x>0 && y>0) {
			super.move(x, y);
		}
	}
	public String toString() {
		String Str = "("+getX()+","+getY()+")�� ��";
		return Str;
	}
}


public class Point_main {
	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str+"�Դϴ�. ");
// ------------------------------------------------------------------
//		ColorPoint zeroPoint = new ColorPoint(); // (0,0) ��ġ�� BLACK �� ��
//		System.out.println(zeroPoint.toString() + "�Դϴ�.");
//		ColorPoint cp = new ColorPoint(10, 10); // (10,10) ��ġ�� BLACK �� ��
//		cp.setXY(5,5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"�Դϴ�.");
// ------------------------------------------------------------------
//		Point3D p = new Point3D(1,2,3); // 1,2,3�� ���� x, y, z���� ��.
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveUp(); // z ������ ���� �̵�
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveDown(); // z ������ �Ʒ��� �̵�
//		p.move(10, 10); // x, y ������ �̵�
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.move(100, 200, 300); // x, y, z������ �̵�
//		System.out.println(p.toString()+"�Դϴ�.");
// ------------------------------------------------------------------
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"�Դϴ�.");
		p.move(-5,5); // ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString()+"�Դϴ�.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"�Դϴ�.");
	}
}
