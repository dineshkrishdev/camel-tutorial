package com.dineshkrish.example2;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class FileCopyCamel {

	public static void main(String[] args) {
		// creating an instance for camel context
		CamelContext context = new DefaultCamelContext();

		// creating an instance for router
		FileCopyRouter router = new FileCopyRouter();

		try {

			// adding router to context
			context.addRoutes(router);

			// starting the camel context
			context.start();

			// stopping the camel context
			context.stop();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
