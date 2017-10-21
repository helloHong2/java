package ch6.ex02;

import java.util.Arrays;

public class ObjectArray<E> {
	private Object[] values;
	
	public ObjectArray(Object[] values) {
		this.values = values;
	}
	
	public void push(Object data, int idx, int size) {
		try{
			
			if (values.length <= idx) { 
				Object[] tempArray = new Object[size];	// 배열의 크기를 증가시킬 경우, 제네릭 형식의 타입 E[]으로 인스턴스를 생성할 수 없는 것과 달리 Object[]는 사용가능. 
			    int length = values.length;
			    
			    for (int j = 0; j < length; j++) {
			        tempArray[j] = values[j];
			    }
			    values = tempArray;
			    values[idx] = data;
			    
			} else {
				values[idx] = data;
			}
			
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
	public Object[] getArray() {
		return values;
	}
	
	public static void main(String[] args) {
		String[] values = new String[3];
		values[0] = "ABC";
		
		ObjectArray<String> objectArray = new ObjectArray<>(values);
		
		objectArray.push("DEF", 1, 6);
		objectArray.push("GHI", 2, 6);	
		objectArray.push("GHI", 3, 6);
		
		System.out.println( Arrays.toString( objectArray.getArray() ) );
		
		
		
	}  
}
