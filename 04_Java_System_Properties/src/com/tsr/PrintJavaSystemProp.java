package com.tsr;

import java.util.Properties;

public class PrintJavaSystemProp {

	public static void main(String[] args) {
		Properties properties = null;
		properties = System.getProperties();
		for(Object prop : properties.keySet()) {
			System.out.println(prop+" = "+properties.getProperty((String)prop));
		}
	}

}
