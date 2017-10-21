package ex03;

public class MainClass {
	public static void main(String[] args) {		
		LabeledPoint lp = new LabeledPoint();
		
		//LabeledPoint 클래스 인스턴스 변수에 대해 private 제어자 변경 후 외부 클래스에서는 접근이 안된다.
		System.out.println(lp.getX);
		System.out.println(lp.getY);
		System.out.println(lp.getLabel);		
		 
	}
}
