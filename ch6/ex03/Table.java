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
	
	// Entry<K,V> ��Ҹ� �迭����Ʈ�� �߰�
	public void add(HashMap<K, V> entry) {
	    list.add(entry);		
	}
	
	// Ű�� �����ϴ� �� ��ȸ
	public V getKey(String key) {				
		// �迭����Ʈ �����ŭ �ݺ��� ����, �迭����Ʈ�� �� ��� HashMap�� ������ �Ķ���� Key������ Value���� ��ȸ�Ѵ�.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.get(key) != null) {
				break;
			}
		}
		
		return map.get(key);
	}
	
	// Ű�� �����ϴ� �� ����
	public void remove(String key) {		
		// �迭����Ʈ �����ŭ �ݺ��� ����, �迭����Ʈ�� �� ��� HashMap�� ������ �Ķ���� Key������ ���� Key���� ã�� ���� �ش� ��Ҹ� �����Ѵ�.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.containsKey(key)) {
				map.remove(key);
			}
		}
	}
	
	// �迭����Ʈ�� ��ü ��Ҹ� ��ȸ�Ѵ�.
	public ArrayList<HashMap<K,V>> getList() {	
		return list;
	}
}



