package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESSceneOutline {
	B1O("TSDU002001 Admin mencari data dengan tombol search"),
	B2O("TSDU002002 Admin mencari data dengan tombol hijau"),
	B3O("TSDU002003 Admin mencari data dengan enter");
	
	private String testName;
	
	private PSIKOTESSceneOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}
}
