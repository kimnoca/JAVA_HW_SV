import java.util.Scanner;
abstract class Converter {

	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String getSrcString(); // �߻� �޼ҵ�
	abstract protected String getDestString(); // �߻� �޼ҵ�
	protected double ratio; // ����
	public void run() {
			Scanner scanner = new Scanner(System.in);
			System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
			System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
			double val = scanner.nextDouble();
			double res = convert(val);
			System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
			scanner.close();
	}
}

class Won2Dollar extends Converter{
	Won2Dollar(double ratio){this.ratio = ratio;}
	protected double convert(double src) {return src/ratio;}
	protected String getSrcString() {return "��";}
	protected String getDestString() {return "�޷�";}
}


class Km2Mile extends Converter{
	Km2Mile(double ratio){this.ratio = ratio;}
	protected double convert(double src) {return src/ratio;}
	protected String getSrcString() {return "Km";}
	protected String getDestString() {return "Mile";}
}


public class Converter_main {

	public static void main(String[] args) {
//		 Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200��
//		 toDollar.run();
		 Km2Mile toMile = new Km2Mile(1.6);
		 toMile.run();

	}

}
