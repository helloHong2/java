package ch2.exercise;

/**
 * x 축을 따라 이동하며 가스를 소비하는 자동차를 모델링하는 Car 클래스를 구현하라.
 * 지정한 마일(mile)만큼 드라이브하는 메서드, 지정한 수만큼 가스 탱크에 갤런을 채우는 메서드,
 * 원점과 연료 레벨로 현재 거리를 구하는 메서드를 구현하라.
 * 생성자에 갤런당 마일 단위(miles/gallons)로 연료 효율성을 지정하라.
 * 불변 클래스로 만들어야 하는가? 그렇거나 그렇지 않은 이유를 제시하라.
 */

/* 
 * 불변 클래스로 선언한 이유는, 문제에서 주어진 조건에 대해 메서드의 재사용 여부가 필요없다고 판단하였음. 
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
			System.out.println("예외발생");
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
