package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
			"src/main/resources/features/406DUOpenDUValid.feature", 
			"src/main/resources/features/409DUSearchDataValid.feature",
			"src/main/resources/features/412DUShowNonActiveValid.feature",
			"src/main/resources/features/415DUSearchDataNonActiveUserValid.feature",
			"src/main/resources/features/418DUShowActiveValid.feature",
			"src/main/resources/features/421DUSearchDataActiveUserValid.feature",
			"src/main/resources/features/424DUViewUserValid.feature",
			"src/main/resources/features/427DUEditNonActiveUserValid.feature",
			"src/main/resources/features/430DUEditActiveUserValid.feature",
			"src/main/resources/features/433DUEditPasswordUserValid.feature",
			"src/main/resources/features/436DUShowPage10NonActiveUserValid.feature",
			"src/main/resources/features/439DUShowPage25NonActiveUserValid.feature",
			"src/main/resources/features/442DUShowPage50NonActiveUserValid.feature",
			"src/main/resources/features/445DUShowPage100NonActiveUserValid.feature",
			"src/main/resources/features/448DUShowPage10ActiveUserValid.feature",
			"src/main/resources/features/451DUShowPage25ActiveUserValid.feature",
			"src/main/resources/features/454DUShowPage50ActiveUserValid.feature",
			"src/main/resources/features/457DUShowPage100ActiveUserValid.feature",
			"src/main/resources/features/460DUExportUserValid.feature",
			"src/main/resources/features/496DUSearchDataUserInvalid.feature",
			"src/main/resources/features/499DUButtonDownStatusUserInvalid.feature",
			"src/main/resources/features/552DUEditStatusUserInvalid.feature",
			"src/main/resources/features/555DUTombolXInvalid.feature",
			"src/main/resources/features/558DUEditPasswordUserInvalid.feature",
			"src/main/resources/features/561RPOpenReportValid.feature",
			"src/main/resources/features/564RPSearchDataReportValid.feature",
			"src/main/resources/features/586RPSearchReportInvalid.feature",
			"src/main/resources/features/616RAOpenRAValid.feature",
			"src/main/resources/features/619RASearchDataValid.feature",
			"src/main/resources/features/622RADeleteDataValid.feature",
			"src/main/resources/features/646RASearchRAInvalid.feature",
			"src/main/resources/features/649RATombolXInvalid.feature",
			},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
