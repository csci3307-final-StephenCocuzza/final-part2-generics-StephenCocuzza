package com.mycompany.part2.section2;
import com.mycompany.part2.section2.MyGenInterface; 

public class MyGenClass<K,V> implements MyGenInterface<K,V> {
 private V Value;
 private K Key; 
	public MyGenClass( K _getKey,V _getValue) {
		Value = _getValue;
		Key = _getKey; 
	}
	public V getValue(){
		return Value;
	}
	public K getKey() {
		return Key; 
	}

	

	
}
