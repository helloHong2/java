package ch2.exercise;

public class pb09_Main {
	public static void main(String[] args) {
		pb09 Car = new pb09(100, 500);
		
		System.out.println("[초기 상태]");
		System.out.println( "현재 자동차 효율성은 " + Car.getEfficiency() ); 
		System.out.println( "현재 거리는 " + Car.getMiles() ); 
		System.out.println( "현재 갤런은 " + Car.getGallon() ); 
		
		Car.charge(200);     
		System.out.println("\n");
		System.out.println("[200갤런 충전]");
		
		System.out.println( "현재 자동차 효율성은 " + Car.getEfficiency() ); 
		System.out.println( "현재 거리는 " + Car.getMiles() ); 
		System.out.println( "현재 갤런은 " + Car.getGallon() ); 
		
		Car.drive(100);
		System.out.println("\n");
		System.out.println("[100마일 이동]");
		
		System.out.println( "현재 자동차 효율성은 " + Car.getEfficiency() ); 
		System.out.println( "현재 거리는 " + Car.getMiles() ); 
		System.out.println( "현재 갤런은 " + Car.getGallon() ); 
		
		
	}
}
