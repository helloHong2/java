package ch3.basic;

public class DigitSequence implements IntSequence{
	private int number;
	
	public DigitSequence(int n){
		number = n;
	}
	
	public boolean hasNext(){
		return number != 0;
	}
	
	public int next() {
		int result = number % 10;
		number /= 10;
		return result;
	}
	
	public int rest(){
		return number;
	}
	
	public static double average(IntSequence seq, int n){
		int count = 0;
		double sum = 0;
		while ( seq.hasNext() && count < n ){
			count ++;
			sum += seq.next();
		}
		return count == 0 ? 0 : sum / count;
	}
	
	public static void main(String[] args) {
		DigitSequence ds = new DigitSequence(1729);
		
		IntSequence digits = new DigitSequence(1729);
		double avg = average(digits, 100);
		System.out.println(avg);
		
		while(ds.hasNext()){			
			System.out.println(ds.next());
		}
	}
	
} //class end
