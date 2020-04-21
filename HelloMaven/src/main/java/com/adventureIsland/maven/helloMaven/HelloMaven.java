package com.adventureIsland.maven.helloMaven;

public class HelloMaven {

	public String responseToDefaultOutput(String input) {
		String result = "The Input is: " + input;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HelloMaven().responseToDefaultOutput("Hello Maven"));
	}

}
