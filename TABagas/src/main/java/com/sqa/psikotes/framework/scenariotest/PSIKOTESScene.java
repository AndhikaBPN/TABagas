package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	B1("TSDU001001 Admin open data users page");
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
