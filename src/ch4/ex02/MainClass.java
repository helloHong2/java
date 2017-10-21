package ex02;


public class MainClass {
	public static void main(String[] args) {
		Point p = new Point();
		LabeledPoint lp = new LabeledPoint();
		MainClass main = new MainClass(); 
		
		boolean bool_result;		
		
		bool_result = lp.equals( (Object)lp );
		System.out.println("1. " + bool_result);		
		System.out.println("");

		
		bool_result = lp.equals( (Object)main );
		System.out.println("2. " + bool_result);
		
		
		lp.setLabel("Text1");		
		System.out.println("");		
		System.out.println("3. " + lp.toString());
		
	}
}
