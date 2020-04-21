package com.adventureIsland.maven.helloMaven;

public class HelloMaven {

	public String responseToDefaultOutput(String input) {
		String result = "The Input is: " + input;
		return result;
	}
	
	public int calculate(int... pars) {
		int result = 0;
		for (int par : pars) {
			result += par;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HelloMaven().responseToDefaultOutput("Hello Maven"));
		System.out.println(new HelloMaven().calculate(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
