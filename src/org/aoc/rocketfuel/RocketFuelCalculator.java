package org.aoc.rocketfuel;

import java.util.List;
import java.util.stream.Collectors;

public class RocketFuelCalculator {

	public Integer calculateFuelForMasses(List<Integer> moduleMasses) {
		return moduleMasses.stream()
				.collect(Collectors.summingInt(this::calculateFuelForMass));
	}
	
	private Integer calculateFuelForMass(Integer mass) {
		Integer retval = (int) Math.floor(mass / 3) - 2;
		if (retval < 0) return 0;
		return retval + calculateFuelForMass(retval);
	}

}
