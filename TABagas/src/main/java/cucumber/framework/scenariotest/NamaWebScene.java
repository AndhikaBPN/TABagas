package cucumber.framework.scenariotest;

public enum NamaWebScene {
	B1("");
	
	private String testName;
	
	private NamaWebScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
