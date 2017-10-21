package ex03;

import java.util.Objects;

public class Point {
	
	protected double x;
	protected double y;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}	
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getPointX(){
		return this.x; 
	}
	
	public double getPointY(){
		return this.y; 
	}
	
	public String toString(){
		//return super.toString();
		return getClass().getName();
		
	}
		
	public boolean equals(Object otherObject){		
		if( !(otherObject instanceof Point) ) {System.out.println("[stauts] instanceof = false"); return false;}		
		if( otherObject == null ) {System.out.println("[stauts] otherObject is Null"); return false;}
		if( this == otherObject ) { 
			int thisHashCD = hashCode(this);
			int otherHashCD = hashCode(otherObject);			
			System.out.println("[stauts] thisHashCD: "+thisHashCD+" / otherHashCD: "+otherHashCD);
			return true; 
		}
		//if( getClass() != otherObject.getClass() ) return false;		 		
		return false;		
	}
	
	public int hashCode(Object object){
		return Objects.hash(object);
	}
	
}
