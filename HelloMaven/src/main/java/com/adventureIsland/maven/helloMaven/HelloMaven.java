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
	
	public double calculate(double... pars) {
		double result = 0.00;
		for (double par : pars) {
			result += par;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HelloMaven().responseToDefaultOutput("Hello Maven"));
		System.out.println(new HelloMaven().calculate(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(new HelloMaven().calculate(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0));
	}

}
