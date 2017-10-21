package ch6.ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class Table<K,V> {
	private ArrayList<HashMap<K,V>> list;
	private HashMap<K,V> entry;
	private HashMap<K,V> map = null;
	
	public Table() {
		list = new ArrayList<HashMap<K,V>>();
	}
	
	// Entry<K,V> 요소를 배열리스트에 추가
	public void add(HashMap<K, V> entry) {
	    list.add(entry);		
	}
	
	// 키에 대응하는 값 조회
	public V getKey(String key) {				
		// 배열리스트 사이즈만큼 반복문 동작, 배열리스트의 각 요소 HashMap을 꺼내서 파라메터 Key값으로 Value값을 조회한다.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.get(key) != null) {
				break;
			}
		}
		
		return map.get(key);
	}
	
	// 키에 대응하는 값 삭제
	public void remove(String key) {		
		// 배열리스트 사이즈만큼 반복문 동작, 배열리스트의 각 요소 HashMap을 꺼내서 파라메터 Key값으로 같은 Key값을 찾은 다음 해당 요소를 삭제한다.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.containsKey(key)) {
				map.remove(key);
			}
		}
	}
	
	// 배열리스트의 전체 요소를 조회한다.
	public ArrayList<HashMap<K,V>> getList() {	
		return list;
	}
}



