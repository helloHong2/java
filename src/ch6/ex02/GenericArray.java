package ch6.ex02;

import java.util.Arrays;

public class GenericArray<E> {
	private E[] values;
	
	public GenericArray(E[] values) {
		this.values = values;
	}
	
	public void push(E data, int idx, int size) {
		try{
			values[idx] = data;
			/*if (values.length <= idx) {
				E[] tempArray = new E[size];	// �迭�� ũ�⸦ ������ų ���, ���׸� ������ Ÿ�� E[]���� �ν��Ͻ��� ������ �� ����. Object[]�� ������ ���� ��밡��. Object[] tempArray = new Object[size]; 
			    int length = values.length ;
			    
			    for (int j = 0; j < length; j++) {
			        tempArray[j] = values[j];
			    }
			    values = tempArray; 
			    values[idx] = data;
			}*/
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void pop(int idx) {
		try{
			values[idx] = null;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void isEmpty() {
		values = null;
	}
	public E[] getArray() {
		return values;
	}
	
	public static void main(String[] args) {
		String[] values = new String[3];
		values[0] = "ABC";
		
		GenericArray<String> genericArray = new GenericArray<>(values);
		
		genericArray.push("DEF", 1, 6);
		genericArray.push("GHI", 2, 6);
		System.out.println( Arrays.toString( genericArray.getArray() ) );
		
		genericArray.pop(0);		
		System.out.println( Arrays.toString( genericArray.getArray() ) );
		
		
		
	}  
}
