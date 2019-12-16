package org.aoc.rocketfuel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> moduleMasses = new ArrayList<>();
		
		try {			
			File file = new File("./input.txt");
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			
			String line = reader.readLine();
			
			while (line != null) {
				moduleMasses.add(Integer.parseInt(line));
				line = reader.readLine();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		RocketFuelCalculator calc = new RocketFuelCalculator();
		
		Integer answer = calc.calculateFuelForMasses(moduleMasses);
		
		System.out.println("The answer is: " + answer);
	}
}
