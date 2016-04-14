package com.focus.androidserverapi.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import focusandroidserverutils.multidbsutils.*;

public class ServerAPI {
	
	private final static String PROPERTY_PORT = "port";
	private final static int DEFAULT_PORT = 7654;
	
	public static void main(final String[] args) throws Exception {
		
		if (args.length > 0) {
			String propertiesFilePath = args[0];
			File propertiesFile = new File(propertiesFilePath);
			PropertiesManager.getInstance().loadProperties(propertiesFile);
		}
		
		final JerseyJettyServer server = new JerseyJettyServer(PropertiesManager.getInstance().getIntProperty(PROPERTY_PORT, DEFAULT_PORT), 
				"com.focus.androidserverapi.rest");
		
		server.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		server.stop();
	}

}
