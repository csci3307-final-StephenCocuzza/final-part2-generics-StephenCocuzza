/**
 * 
 */
package com.mycompany.ass3.chapter8;


public class MainEntry {

	public static void main(String[] args) {
		HasName namedChild = new Child();
		SpendsMoney moneySpendingChild = new Child();
		Asks4money moneyAskingChild = new Child();
		
		Child child1 = new Child(0, "John Jr", "Smith", 1000000, "pizza");
		Child child2a = new Child(0, child1.getName(), child1.getLastName(), 1000000, "pizza");
		
		Child child2b = new Child(child1);
	}

}