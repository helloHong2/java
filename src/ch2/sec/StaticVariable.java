package ch2.sec;
	public class StaticVariable  {
	    int count = 0;
	    
	    //instance
	    StaticVariable() {
	        this.count++;
	        System.out.println(this.count);
	    }

	    public static void main(String[] args) {
	    	StaticVariable c1 = new StaticVariable();
	        StaticVariable c2 = new StaticVariable();
	    }
	}