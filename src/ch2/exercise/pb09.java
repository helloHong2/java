package ch2.exercise;

/**
 * x ���� ���� �̵��ϸ� ������ �Һ��ϴ� �ڵ����� �𵨸��ϴ� Car Ŭ������ �����϶�.
 * ������ ����(mile)��ŭ ����̺��ϴ� �޼���, ������ ����ŭ ���� ��ũ�� ������ ä��� �޼���,
 * ������ ���� ������ ���� �Ÿ��� ���ϴ� �޼��带 �����϶�.
 * �����ڿ� ������ ���� ����(miles/gallons)�� ���� ȿ������ �����϶�.
 * �Һ� Ŭ������ ������ �ϴ°�? �׷��ų� �׷��� ���� ������ �����϶�.
 */

/* 
 * �Һ� Ŭ������ ������ ������, �������� �־��� ���ǿ� ���� �޼����� ���� ���ΰ� �ʿ���ٰ� �Ǵ��Ͽ���. 
 *  
 */
public final class pb09 {
	 private double miles;
	 private double gallon;
	 private double efficiency;
	 
	 public pb09() {
		 miles = 0;
		 gallon = 0;
		 efficiency = 0;
	 }
	 
	 public pb09(double miles, double gallon) {
		 this.efficiency = miles / gallon;
		 this.miles = miles;
		 this.gallon = gallon;
	 }
	 
	 public double drive(double mile) {
		this.miles += mile;	
		this.efficiency = miles / this.gallon;
		
		try{
			
			this.gallon = this.gallon - (mile / this.efficiency);
			
		}catch(Exception e){			
			System.out.println("���ܹ߻�");
			e.printStackTrace(System.out);
		}
		 
		 return miles;
	 }
	 
	 public double charge(double gallon){
		 this.gallon += gallon;
		 this.efficiency = miles / gallon;
		 
		 return gallon;
	 }
	 	 
	 
	 
	 /* 
	  * getter method
	  */
	 
	 public double getGallon(){
		 return gallon;
	 }
	 
	 public double getMiles(){
		 return miles;
	 }
	 
	 public double getEfficiency(){
		 return efficiency;
	 }
	
}
