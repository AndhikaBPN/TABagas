package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	B1("TSDU001001 Admin open data users page"),
	B2("TSDU002001 Admin mencari nama dengan tombol search"),
	B3("TSDU002002 Admin mencari nama dengan tombol hijau"),
	B4("TSDU002003 Admin mencari nama dengan enter"),
	B5("TSDU002004 Admin mencari email dengan tombol search"),
	B6("TSDU002005 Admin mencari email dengan tombol hijau"),
	B7("TSDU002006 Admin mencari email dengan enter"),
	B8("TSDU002007 Admin mencari status dengan tombol search"),
	B9("TSDU002008 Admin mencari status dengan tombol hijau"),
	B10("TSDU002009 Admin mencari status dengan enter");
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
