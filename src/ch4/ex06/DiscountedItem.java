package ex06;

import java.util.Objects;

public class DiscountedItem extends Item{
	
	private final static double ratio = 0.5; // 50% 할인
	private String description;
	private double price;
	
	public DiscountedItem(String description, double price) {
		
		this.description = description;
		this.price = price;
	}
	
	public boolean equals(Object otherObject){
		
		if (otherObject instanceof Item) super.equals(otherObject);
		if (otherObject instanceof DiscountedItem){
			
			DiscountedItem other = (DiscountedItem) otherObject;
			setDiscount(other);			
			super.equals(otherObject);		
		}
		return false;
	}

	public void setDiscount(DiscountedItem other){
		other.price = other.price * (1-ratio);
	}
}
