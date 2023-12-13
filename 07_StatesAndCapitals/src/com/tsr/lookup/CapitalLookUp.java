package com.tsr.lookup;

import java.io.IOException;
import java.util.Properties;

public class CapitalLookUp {

	public static void main(String[] args) throws IOException {

		Properties properties = null;
		String state = null;
		if (args.length != 1) {
			throw new RuntimeException("Error Please enter a State Name :");
		}
		state = args[0];

		properties = new Properties();

		properties.load(CapitalLookUp.class.getClassLoader().getResourceAsStream("states-and-capitals.properties"));

		if (properties.size() == 0) {
			throw new RuntimeException("Error : Property file have no values");
		}
		if (!properties.containsKey(state)) {
			throw new RuntimeException("Error : State name " + state + " is not found");
		}
		System.out.println("The Capital State of " + state + " is " + properties.getProperty(state));
	}

}
