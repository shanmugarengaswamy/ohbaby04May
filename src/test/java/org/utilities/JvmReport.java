package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonFile) {
	
		
		// File f = new File("C:\\Users\\Vijay\\eclipse-workspace\\OhBabyStyleCUBR\\target\\reports\\JvmReport");
		File f = new File(System.getProperty("user.dir")+"\\target\\reports\\JvmReport");
		
		Configuration con = new Configuration(f,"OhBaBy Application");
		con.addClassifications("Platform Name", "Windows 10");
		con.addClassifications("Browser Name ", "Chrome");
		con.addClassifications("Browser Version ", "101");
		con.addClassifications("Sprint Name", "31");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	
	
	}

}
