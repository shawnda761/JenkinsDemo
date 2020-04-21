package com.adventureIsland.maven.helloWorld;

public class HelloWorld {
	
	public String responseToDefaultOutput(String input) {
		String result = "The Input is: " + input;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HelloWorld().responseToDefaultOutput("Hello Maven"));
	}

}
