//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.annotation.BeforeTestCase
//import com.kms.katalon.core.context.TestCaseContext
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//import internal.GlobalVariable
//
//class openBrowser {
//	/**
//	 * Executes before every test case starts.
//	 * @param testCaseContext related information of the executed test case.
//	 */
//	@BeforeTestCase
//	def autoOpenBrowser(TestCaseContext testCaseContext) {
//		WebUI.openBrowser('')
//		WebUI.navigateToUrl(GlobalVariable.URL)
//		WebUI.click(findTestObject('BTN_Make_Appointment'))
//		
//		if (username != 'empty') {
//			WebUI.sendKeys(findTestObject('Login_Repo/Username_field'), username)
//		}
//		
//		if (testCategory == 'P') {
//			WebUI.waitForElementPresent(findTestObject('Login_Repo/Succes_Login_Assertion'), 5)
//		
//		}
//	}
//}