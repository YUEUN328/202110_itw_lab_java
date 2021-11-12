package edu.java.modifier05;

public class ModifierMain05 {

	public static void main(String[] args) {
		Member mem = new Member("Oh", "123!abc");
		
		System.out.println(mem.getId());
		System.out.println(mem.getPassword());
		
		mem.setPassword("456!qwe");
		System.out.println(mem.getPassword());
		

	}

}
