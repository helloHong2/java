package ch2.exercise;

public class pb09_Main {
	public static void main(String[] args) {
		pb09 Car = new pb09(100, 500);
		
		System.out.println("[�ʱ� ����]");
		System.out.println( "���� �ڵ��� ȿ������ " + Car.getEfficiency() ); 
		System.out.println( "���� �Ÿ��� " + Car.getMiles() ); 
		System.out.println( "���� ������ " + Car.getGallon() ); 
		
		Car.charge(200);     
		System.out.println("\n");
		System.out.println("[200���� ����]");
		
		System.out.println( "���� �ڵ��� ȿ������ " + Car.getEfficiency() ); 
		System.out.println( "���� �Ÿ��� " + Car.getMiles() ); 
		System.out.println( "���� ������ " + Car.getGallon() ); 
		
		Car.drive(100);
		System.out.println("\n");
		System.out.println("[100���� �̵�]");
		
		System.out.println( "���� �ڵ��� ȿ������ " + Car.getEfficiency() ); 
		System.out.println( "���� �Ÿ��� " + Car.getMiles() ); 
		System.out.println( "���� ������ " + Car.getGallon() ); 
		
		
	}
}
